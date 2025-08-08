using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Practica6.Interfaces;
using Practica6.Models;

namespace Practica6.Controllers
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
            // Verifica si el usuario ya tiene una sesión activa (email en la sesión)
            if (!string.IsNullOrEmpty(HttpContext.Session.GetString("email")))
            {
                // Redirige a la página principal según el rol
                string rol = HttpContext.Session.GetString("rol");

                if (rol == "Admin")
                {
                    return RedirectToAction("Index", "Admin");
                }
                else if (rol == "Student")
                {
                    return RedirectToAction("Index", "Student");
                }
            }

            // Si no hay sesión, muestra la página de login
            return View();
        }

        [HttpPost]
        public IActionResult Index(LoginViewModel l)
        {
            if (!ModelState.IsValid)
                return View(l);
            User user = this._dataUsuarios.LogInUser(l.EmailLogin, l.PasswordLogin);
            if (user == null)
            {
                //podemos usar cualquiera de las dos
                ModelState.AddModelError(nameof(l.EmailLogin), $"Usuario o contraseña incorrecto: {l.EmailLogin}");
                ViewData["Error"] = "Credenciales incorrectas";
                return View();
            }
            else
            {
                //meter sesion strings rol y email
                HttpContext.Session.SetString("email", user.Email);
                HttpContext.Session.SetString("rol", user.Rol.ToString());
                HttpContext.Session.SetInt32("id", user.IdUsuario);
                /*
                // Verifica que la sesión se haya guardado
                var email = HttpContext.Session.GetString("email");
                var rol = HttpContext.Session.GetString("rol");
                Console.WriteLine($"Sesión guardada: Email: {email}, Rol: {rol}"); // Aquí se puede verificar en la consola*/

                if (user.Rol == Models.User.Role.Admin)
                {
                    return RedirectToAction("Index", "Admin");
                }
                else if (user.Rol == Models.User.Role.Student)
                {
                    return RedirectToAction("Index", "Student");
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
        (RegisterViewModel u)
        {
            if (!ModelState.IsValid)
                return View(u);

            User usuarioExistente = this._dataUsuarios.FindUser(u.EmailRegister );
            if (usuarioExistente != null)
            {
                //PUEDO USAR LA QUE YO QUIERA
                ModelState.AddModelError(nameof(u.EmailRegister), $"El email usuario ya {u.EmailRegister} ya existe");
                ViewData["Error"] = "Ya estás registrado, debes logearte.";
                return View(u);
            }
            await this._dataUsuarios.RegisterUser(u.NombreRegister, u.EmailRegister, u.DniRegister, u.PasswordRegister, u.RolRegister);
            return RedirectToAction("Index");

        }

        public IActionResult CloseSesion()
        {
            HttpContext.Session.Remove("email"); // Elimina el email de la sesión
            HttpContext.Session.Remove("rol"); // Elimina el rol de la sesión
            HttpContext.Session.Remove("id");
            return RedirectToAction("Index"); // Redirige a la página principal o a donde desees
        }

    }
}
