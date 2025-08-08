using EjemploSesión_1.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjemploSesión_1.Controllers
{
    public class HomeController : Controller
    {
       

        public IActionResult Index()
        {
            return View();
        }

        
    }
}
