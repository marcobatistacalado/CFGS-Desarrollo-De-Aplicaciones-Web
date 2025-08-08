using EjemploByMe1.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using static System.Net.Mime.MediaTypeNames;

namespace EjemploByMe1.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            Profesor p = new Profesor()
            {
                Nombre = "Rosa Rodríguez",
                Edad = 34,
                Imagen = "/images/rosa.png"
            };
            return View("Index", p);
        }

        
    }
}
