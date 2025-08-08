using EjemploServiciosTipo.Models;
using EjemploServiciosTipo.Servicios;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjemploServiciosTipo.Controllers
{
    public class HomeController : Controller
    {
        private readonly ServicioUnico su;
        private readonly ServicioTransitorio st;
        private readonly ServicioLimitado sdl;

        private readonly ServicioUnico su2;
        private readonly ServicioTransitorio st2;
        private readonly ServicioLimitado sdl2;
        public HomeController(ServicioUnico su, ServicioTransitorio st, ServicioLimitado sdl,
           ServicioUnico su2, ServicioTransitorio st2, ServicioLimitado sdl2)
        {
            this.su = su;
            this.st = st;
            this.sdl = sdl;
            this.su2 = su2;
            this.st2 = st2;
            this.sdl2 = sdl2;

        }

        public IActionResult Index()
        {
            EjemploGUIDViewModel ej = new EjemploGUIDViewModel()
            {
                Delimitado = sdl.ObtenerGuid,
                Transitorio = st.ObtenerGuid,
                Unico = su.ObtenerGuid

            };
            EjemploGUIDViewModel ej2 = new EjemploGUIDViewModel()
            {
                Delimitado = sdl2.ObtenerGuid,
                Transitorio = st2.ObtenerGuid,
                Unico = su2.ObtenerGuid

            };

            List<EjemploGUIDViewModel> l = new List<EjemploGUIDViewModel>
            {
                ej,ej2
            };
            return View(l);
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