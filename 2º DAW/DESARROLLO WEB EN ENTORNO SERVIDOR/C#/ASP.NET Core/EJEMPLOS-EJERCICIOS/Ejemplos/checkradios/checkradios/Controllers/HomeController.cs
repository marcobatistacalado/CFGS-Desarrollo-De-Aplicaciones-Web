using checkradios.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace checkradios.Controllers
{
    public class HomeController : Controller
    {
        //public IActionResult Detalles(string sexo,string [] aficiones) {
        //    return View("Detalles", sexo);
        //}

        public IActionResult Detalles(DetallesViewModel d)
        {
            return View("Detalles2",d);
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
    }
}
