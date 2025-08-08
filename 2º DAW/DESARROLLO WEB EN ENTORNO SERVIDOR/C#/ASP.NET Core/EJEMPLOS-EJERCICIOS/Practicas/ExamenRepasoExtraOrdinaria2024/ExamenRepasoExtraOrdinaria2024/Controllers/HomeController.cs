using System.Diagnostics;
using ExamenRepasoExtraOrdinaria2024.Interfaces;
using ExamenRepasoExtraOrdinaria2024.Models;
using Microsoft.AspNetCore.Mvc;

namespace ExamenRepasoExtraOrdinaria2024.Controllers
{
    public class HomeController : Controller
    {

        private readonly IRepositorySocios  _dataSocios;

        public HomeController(IRepositorySocios dataSocios)
        {
            this._dataSocios = dataSocios;
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
            Socio socio = this._dataSocios.LogInUser(l.Dni, l.PasswordLogin);
            if (socio == null)
            {
                ViewData["Error"] = "Credenciales incorrectas";
                return View();
            }
            else
            {
                return RedirectToAction("Index", "Socio");
            }
            return View();
        }

        public IActionResult Registro()
        {
            return View();
        }
        [HttpPost]
        public async Task<IActionResult> Registro(RegisterViewModel u)
        {
            if (!ModelState.IsValid)
                return View(u);

            Socio socioExistente = this._dataSocios.FindSocio(u.DniRegister);
            if (socioExistente != null)
            {
                ViewData["Error"] = "Ya estás registrado, debes loguearte.";
                return View(u);
            }

            bool plazaAsignada = await this._dataSocios.RegisterUser(u.DniRegister, u.NombreRegister, u.ClaveRegister, u.TelefonoRegister, u.MatriculaRegister);

            if (!plazaAsignada)
            {
                ViewData["Error"] = "Registro completado, pero no hay plazas disponibles.";
            }

            return RedirectToAction("Index");
        }

    }
}
