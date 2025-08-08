using ej1.Models;
using ej1.Repository;
using Microsoft.AspNetCore.Mvc;

namespace ej1.Controllers
{
    public class HomeController : Controller
    {
        private readonly RepositoryCiclos data;
        public HomeController(RepositoryCiclos r)
        {
            this.data = r;
        }
        public IActionResult Index()
        {
            List<Ciclo> l = this.data.getCiclos();
            return View(l);
        }
    }
}
