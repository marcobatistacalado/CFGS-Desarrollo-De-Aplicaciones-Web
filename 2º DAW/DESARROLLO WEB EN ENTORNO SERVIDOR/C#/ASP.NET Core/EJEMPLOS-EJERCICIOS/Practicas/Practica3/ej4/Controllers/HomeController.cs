using ej4.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ej4.Controllers
{
    public class HomeController : Controller
    {
       
        public IActionResult Index()
        {
            Evento e = new Evento()
            {
                Fecha = new DateTime(2024,12,24),
                Lugar = "SalesianasNSP"
            };
            return View(e);
        }

        public IActionResult PedirDatos()
        {
            return View();
        }

        public IActionResult DatosUsuario(Usuario u)
        {
            return View(u);
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
