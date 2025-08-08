using EjemploCifrado.Models;
using EjemploCifrado.Repositories;

using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjemploCifrado.Controllers
{
    public class HomeController : Controller
    {
        private RepositoryUsuarios repo;
        public HomeController(RepositoryUsuarios repo)
        {
            this.repo = repo;
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
            Usuario user = this.repo.LogInUser(l.Email, l.Password);
            if (user == null)
            {
                ViewData["Error"] = "Credenciales incorrectas";
                return View();
            }
            else
            {
                return View("LogIn", l.Email);
            }
        }
        public IActionResult Register()
        {
            return View();
        }
        [HttpPost]
        public async Task<IActionResult> Register
        (UsuarioViewModel u)
        {
          
            await this.repo.RegisterUser(u.Nombre, u.Email, u.Password);
            ViewData["MENSAJE"] = "Usuario registrado correctamente";
            return View();
        }
       
       
    }

}

