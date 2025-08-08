using Microsoft.AspNetCore.Mvc;
using SesiónEjemplo_3.Extensions;
using SesiónEjemplo_3.Models;
using System.Diagnostics;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace SesiónEjemplo_3.Controllers
{
    public class HomeController : Controller
    {
        

        public IActionResult Index()
        {
            return View();
        }

        
        public IActionResult SetNombreSesion(string nombre)
        {
            string usuario = HttpContext.Session.GetString("nombre");
            if (usuario == null)
                if (nombre != null)
                    HttpContext.Session.SetString("nombre", nombre);
                else
                    return RedirectToAction("Index");
            return View();
        }

        public IActionResult AddNumeroSesion(int numero)
        {
            List<int> numeros = HttpContext.Session.GetObject<List<int>>("numeros");
            if (numeros==null)
                numeros= new List<int>();
           
            numeros.Add(numero);
            HttpContext.Session.SetObject("numeros", numeros);
            
            return View("AddNumeroSesion");
        }

     public IActionResult CloseSesion()
        {
           HttpContext.Session.Clear();
           return RedirectToAction("Index"); 
        }   public IActionResult CloseSesion()
        {
           HttpContext.Session.Clear();
           return RedirectToAction("Index"); 
        }
    }
}
