using Ejemplo_Validaciones_2.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace Ejemplo_Validaciones_2.Controllers
{
    public class HomeController : Controller
    {


        public IActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Index(Data d)
        {
            if (!ModelState.IsValid)
                return View(d);
            return View("Thanks",d);
        }






        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}