using ej4.Interfaces;
using ej4.Models;
using ej4.Repository;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ej4.Controllers
{
    public class HomeController : Controller
    {
        private readonly IRepositoryUsuarios _dataUsuarios;

        public HomeController(IRepositoryUsuarios dataUsuarios)
        {
            this._dataUsuarios = dataUsuarios;
        }
        public IActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Index(LoginViewModel l)
        {
            if (!ModelState.IsValid)
                return View(l);
            Usuario user = this._dataUsuarios.LogInUser(l.Email, l.Password);
            if (user == null)
            {
                ViewData["Error"] = "Credenciales incorrectas";
                return View();
            }
            else
            {
                //meter sesion strings rol y email
                HttpContext.Session.SetString("email", user.Email);
                HttpContext.Session.SetString("rol", user.Rol);

                if (user.Rol == "admin")
                {
                    return RedirectToAction("Index", "Administrador");
                }
                else if (user.Rol == "normal")
                {
                    return RedirectToAction("Index", "Normal");
                }
            }
            // Si el rol no coincide con los valores esperados, devuelve la vista con un error.
            ViewData["Error"] = "Rol desconocido";
            return View();
        }
        public IActionResult Register()
        {
            return View();
        }
        [HttpPost]
        public async Task<IActionResult> Register
        (UsuarioViewModel u)
        {
            if (!ModelState.IsValid)
                return View(u);
               
            await this._dataUsuarios.RegisterUser(u.Nombre, u.Email, u.Password, u.Rol);
            return RedirectToAction("Index");
        }

        public IActionResult CloseSesion()
        {
            HttpContext.Session.Clear();
            return RedirectToAction("Index");
        }
    }
}
