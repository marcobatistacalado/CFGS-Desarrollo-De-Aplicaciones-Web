using Microsoft.AspNetCore.Mvc;
using Portfolio_3.Models;
using System.Diagnostics;

namespace Portfolio_3.Controllers
{
    public class HomeController : Controller
    {


        public IActionResult Index()
        {
            Persona p = new Persona
            {
                Nombre = "Rosa Rodríguez",
                Edad = 34,
                Imagen = "img/yo.jpg" //alt gr + 4 espacio
            };

            List<Proyecto> lista =new List<Proyecto>() {
                new Proyecto
                {
                Titulo = "Amazon",
                Descripcion = "E-Commerce realizado en ASP.NET Core",
                Link = "https://amazon.com",
                ImagenURL = "/img/amazon.png"
                },
                new Proyecto
                {
                Titulo = "New York Times",
                Descripcion = "Página de noticias en React",
                Link = "https://nytimes.com",
                ImagenURL = "/img/nyt.png"
                },
                new Proyecto
                {
                Titulo = "Reddit",
                Descripcion = "Red social para compartir en comunidades",
                Link = "https://reddit.com",
                ImagenURL = "/img/reddit.png"
                },
                
            };

            HomeViewModel m = new HomeViewModel
            {
                P = p,
                Proyectos = lista
            };
                return View(m);

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