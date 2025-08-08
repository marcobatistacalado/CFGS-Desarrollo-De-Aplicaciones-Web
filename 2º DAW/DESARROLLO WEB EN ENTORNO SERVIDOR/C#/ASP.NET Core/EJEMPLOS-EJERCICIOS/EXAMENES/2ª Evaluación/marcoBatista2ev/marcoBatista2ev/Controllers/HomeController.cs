using System.Diagnostics;
using marcoBatista2ev.Interfaces;
using marcoBatista2ev.Models;
using Microsoft.AspNetCore.Mvc;

namespace marcoBatista2ev.Controllers
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
            Usuario usuario = this._dataUsuarios.LogInUser(l.EmailLogin, l.PasswordLogin);
            if (usuario == null)
            {
                ViewData["Error"] = "Credenciales incorrectas";
                return View();
            }
            else
            {
                HttpContext.Session.SetString("email", usuario.Email);

                if (usuario.Perfil == "A")
                {
                    return RedirectToAction("Index", "Admin");
                }
                else if (usuario.Perfil == "U")
                {
                    return RedirectToAction("Index", "Usuario");
                }
            }
            ViewData["Error"] = "Perfil desconocido";
            return View();
        }

        public IActionResult CloseSesion()
        {
            HttpContext.Session.Remove("email"); 
            return RedirectToAction("Index"); 
        }
    }
}
