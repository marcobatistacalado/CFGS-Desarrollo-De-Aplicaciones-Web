using Microsoft.AspNetCore.Mvc;

namespace ExamenRepasoExtraOrdinaria2024.Controllers
{
    public class SocioController : Controller
    {
        public IActionResult Index()
        {
            return View("Socio");
        }
    }
}
