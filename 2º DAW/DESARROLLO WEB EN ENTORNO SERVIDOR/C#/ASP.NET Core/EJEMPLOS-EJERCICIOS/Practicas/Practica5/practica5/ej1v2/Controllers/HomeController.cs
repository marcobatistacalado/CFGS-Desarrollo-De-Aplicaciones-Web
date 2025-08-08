using ej1v2.Models;
using ej1v2.Repository;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ej1v2.Controllers
{
    public class HomeController : Controller
    {

        private readonly RepositoryCiclos data;

        public HomeController(RepositoryCiclos data)
        {
            this.data = data;
        }

        public IActionResult Index()
        {
            List<Ciclo> l = this.data.GetCiclos();
            return View(l);
        }

    }
}
