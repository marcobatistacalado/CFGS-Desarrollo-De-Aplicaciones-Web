using EjemploBBDDEF.Models;
using EjemploBBDDEF.Repository;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjemploBBDDEF.Controllers
{
    public class HomeController : Controller
    {
        private readonly RepositoryCiclo data;

        public HomeController(RepositoryCiclo data)
        {
            this.data = data;
        }

        public IActionResult Index()
        {
            List<Ciclo> l=this.data.GetCiclos();
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
