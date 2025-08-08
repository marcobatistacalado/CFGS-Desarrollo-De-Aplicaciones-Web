using ej2.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ej2.Controllers
{
    public class HomeController : Controller
    {
        /*
         Crea un formulario donde se recoja el nombre de un usuario junto con un máximo
        de 5 aficiones mediante checkbox. Aplicación que recoja esta información y muestre
        un mensaje de forma que si el usuario:

        - No ha elegido ninguna afición: "Nombre, eres un soso".
        - Sólo ha elegido una: "Nombre deberías buscar más aficiones aparte de
        “afición”.
        - Si ha elegido las 5: "Nombre, creo que tienes demasiadas aficiones".
        En todos los casos mostrar el nombre de las aficiones
         */

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult MostrarResultados(Persona p)
        {
            return View(p);
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
