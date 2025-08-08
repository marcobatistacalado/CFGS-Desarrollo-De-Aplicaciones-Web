using ej4.Interfaces;
using ej4.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Filters;

namespace ej4.Controllers
{
    public class NormalController : Controller
    {
        private readonly IRepositoryPeliculas _dataPeliculas;
        private readonly IRepositoryGeneros _dataGeneros;
        private readonly IRepositoryInfoPeliculas _dataInfoPeliculas;

        public NormalController(IRepositoryPeliculas dataPeliculas, IRepositoryGeneros dataGeneros, IRepositoryInfoPeliculas dataInfoPeliculas)
        {
            this._dataPeliculas = dataPeliculas;
            this._dataGeneros = dataGeneros;
            this._dataInfoPeliculas = dataInfoPeliculas;
        }

        public override void OnActionExecuting(ActionExecutingContext context)
        {
            string rolUsuario = HttpContext.Session.GetString("rol");

            if (rolUsuario != "normal")
            {
                // 🔴 Cerrar sesión
                HttpContext.Session.Clear();

                // 🔴 Agregar mensaje de error temporal con TempData
                TempData["Error"] = "Acceso denegado. Debes iniciar sesión con una cuenta válida.";

                // 🔴 Redirigir al inicio
                context.Result = new RedirectToActionResult("Index", "Home", null);
            }

            base.OnActionExecuting(context);
        }
    
        public IActionResult Index()
          
        {
            List<Pelicula> l_peliculas = this._dataPeliculas.GetPeliculas();
            
            return View(l_peliculas);
        }
        
        
        public IActionResult Details(int id)
        {
            Pelicula pelicula = _dataPeliculas.GetPeliculaById(id);
            return View(pelicula);
        }
    }
}
