using EjemploSesion_2.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using EjemploSesion_2.Extensions;

namespace EjemploSesion_2.Controllers
{
    public class HomeController : Controller
    {
        

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult SessionEjemplo(string accion)
        {

            if (accion == "almacenar")
            {
                Persona p = HttpContext.Session.GetObject<Persona>("Persona");
                if (p == null)
                {
                    Persona persona = new Persona()
                    {
                        Nombre = "Rosa",
                        Email = "rosa.rodriguez@salesians.org",
                        Edad = 34
                    };
                    HttpContext.Session.SetObject("Persona", persona);
                }
            } 
           return View();

        }
    }
}
