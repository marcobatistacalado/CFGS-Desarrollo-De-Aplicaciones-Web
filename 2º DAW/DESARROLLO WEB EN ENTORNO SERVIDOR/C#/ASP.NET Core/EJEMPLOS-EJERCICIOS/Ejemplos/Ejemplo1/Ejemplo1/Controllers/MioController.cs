using Microsoft.AspNetCore.Mvc;
using System.Reflection.Metadata.Ecma335;

namespace Ejemplo1.Controllers
{
    public class MioController : Controller
    {
        public IActionResult Saludar()
        {
            return View();
        }
    }
}
