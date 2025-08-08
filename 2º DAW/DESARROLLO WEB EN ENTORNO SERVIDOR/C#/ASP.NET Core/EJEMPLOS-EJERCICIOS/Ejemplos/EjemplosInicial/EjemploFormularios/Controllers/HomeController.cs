using EjemploFormularios.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjemploFormularios.Controllers
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

        public ActionResult Contact(ContactViewModel c) /*RUNTIME*/
        {
            TempData["nombre"] = c.Nombre;
            TempData["email"] = c.Email;
            TempData["mensaje"] = c.Mensaje;
            return RedirectToAction("ShowData"); /*REDIRIGIR A OTRO CONTROLADOR PARA QUE CUANDO REFRESQUES EN EL OTRO SE REFRESCA EL OBJETO QUE LE LLEGA AL CONTROLADOR Y NO EL FORMULARIO QUE LE ESTÁ ALLEGANDO A CONTACT*/
            /*REDIRECT: SIEMPRE ES UNA SOLICITUD GET POR LO QUE SE VEN TODOS LOS DATOS EN LA URL: POR ELLO VAMOS A USAR TEMPDATA*/
        }
        public IActionResult ShowData()
        {
            ContactViewModel c = new ContactViewModel()
            {
                Nombre = TempData["nombre"].ToString(),
                Email = TempData["email"].ToString(),
                Mensaje = TempData["mensaje"].ToString()
            };

            /*Estamos poniendolo en la peor situacion lo normal es simplemente un string el necesario de pasar a la vista y entonces no habria q construir el objeto y en el return pondriamos directamente el temp*/

            return View("ShowData", c);
        }
    }
}
