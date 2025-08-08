using ej1.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ej1.Controllers
{
    public class HomeController : Controller
    {
        /*
            Formulario que solicite el nombre de una persona y su edad, mostrar en otra página
            si es mayor de edad. El mensaje en la segunda página incluirá el nombre introducido.
         */
        [HttpGet]
        public IActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public IActionResult RecibirDatos(Persona p)
        {
            if (p.Edad >= 18)
            {
                p.mayor = true;
            }
            return View(p);
        }

      

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
