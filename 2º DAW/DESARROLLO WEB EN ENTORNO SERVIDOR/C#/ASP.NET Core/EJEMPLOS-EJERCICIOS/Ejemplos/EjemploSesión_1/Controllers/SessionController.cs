using Microsoft.AspNetCore.Mvc;

namespace EjemploSesión_1.Controllers
{
    public class SessionController : Controller
    {
       
        public IActionResult Index()
        {
           
            return View("SessionSimple");

           
        }

        public IActionResult SessionSimple(string accion)
        {
            if (accion != null)
            {
                if (accion.ToLower() == "almacenar")
                {
                    HttpContext.Session.SetString("nombre", "Rosa");
                    HttpContext.Session.SetString("hora",
                    DateTime.Now.ToLongTimeString());
                    HttpContext.Session.SetString("color", "Verde");
                    ViewData["MENSAJE"] = "Los datos han sido almacenados en Session";
                }
                else if (accion.ToLower() == "mostrar")
                {
                    ViewData["USUARIO"] =
                    HttpContext.Session.GetString("nombre");
                    ViewData["HORA"] =
                    HttpContext.Session.GetString("hora");
                    
                }
            }
            return View();
        }
    }

}

