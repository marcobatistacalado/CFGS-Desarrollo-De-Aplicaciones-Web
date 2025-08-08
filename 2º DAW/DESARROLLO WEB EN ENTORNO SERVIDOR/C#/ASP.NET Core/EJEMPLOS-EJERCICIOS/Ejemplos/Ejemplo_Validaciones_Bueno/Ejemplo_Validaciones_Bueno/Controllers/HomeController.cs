using Ejemplo_Validaciones_Bueno.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace Ejemplo_Validaciones_Bueno.Controllers
{
    public class HomeController : Controller
    {

        [HttpGet]
        public IActionResult Index()
        {
            return View();
        }


        [HttpPost]
        public IActionResult Index(ContactModelView c)
        {
            if (!ModelState.IsValid)

                return View(c); //Para no perder los valores ya introducidos aunque ahora mismo no los visualizamos
          
          return RedirectToAction("ShowData");
        }

        public IActionResult ShowData()
        {
            return View("ShowData");
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}