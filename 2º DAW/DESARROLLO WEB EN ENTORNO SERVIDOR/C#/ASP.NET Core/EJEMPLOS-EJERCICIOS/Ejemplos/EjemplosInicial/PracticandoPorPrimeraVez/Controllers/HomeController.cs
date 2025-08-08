using Microsoft.AspNetCore.Mvc;
using PracticandoPorPrimeraVez.Models;
using System.Diagnostics;

namespace PracticandoPorPrimeraVez.Controllers
{
    public class HomeController : Controller
    {

        public IActionResult TeSaludo()
        {
            return View();
        }

        public IActionResult MeDespido()
        {
            return View();
        }

        public IActionResult TeSaludoaTi()
        {
            string nombre = "Marco";
            int edad = 21;
            return View();
            string mensaje = "";
            if (edad < 50)
            {
                mensaje = "Que joven que eres";
            }
            else
            {
                mensaje = "Que viejo eres";
            }
            ViewData["name"] = nombre; //puedes pasar direcamente lo que quieres no hace falta el codigo c# anterior
            ViewData["age"] = edad;
            ViewData["msg"] = mensaje;
            return View();
        }


    }
}
