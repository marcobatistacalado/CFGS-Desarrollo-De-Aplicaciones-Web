using EjemploControlesFormulario.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjemploControlesFormulario.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }

        /*
        public IActionResult getDatos(string sexo, string[] aficiones, string ciclo) ESTO COMO VIMOS EN EL OTRO EJEMPLO SE PASA DIRECTAMENTE JUNTO SI CREAMOS UN MODELO CON EL MISMO NAME EN SUS ATRIBUTO
        {
            return View("ShowDatos");
        }*/
    
        public IActionResult getDatos(DatosViewModel d)
        {
            return View("ShowData", d);
        }
    }
}
