using ej4.Interfaces;
using ej4.Models;
using ej4.Repositories;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Filters;

namespace ej4.Controllers
{
    public class AdministradorController : Controller
    {

        private readonly IRepositoryPeliculas _dataPeliculas;
        private readonly IRepositoryGeneros _dataGeneros;
        private readonly IRepositoryInfoPeliculas _dataInfoPeliculas;

        public AdministradorController(IRepositoryPeliculas dataPeliculas, IRepositoryGeneros dataGeneros, IRepositoryInfoPeliculas dataInfoPeliculas)
        {
            this._dataPeliculas = dataPeliculas;
            this._dataGeneros = dataGeneros;
            this._dataInfoPeliculas = dataInfoPeliculas;
        }

        public override void OnActionExecuting(ActionExecutingContext context)
        {
            string rolUsuario = HttpContext.Session.GetString("rol");

            if (rolUsuario != "admin")
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

        [HttpGet]
        public IActionResult Create()
        {
            PeliculaInfoView model = new PeliculaInfoView
            {
                Pelicula = new Pelicula(),
                Info = new InfoPelicula(),
                Generos = _dataGeneros.GetGeneros(),

            };
            return View(model);
        }

        [HttpPost]
        public async Task<IActionResult> Create(PeliculaInfoView model)
        {
            if (!ModelState.IsValid)
            {
                model.Generos = this._dataGeneros.GetGeneros(); //IMPORTANTE: volver a montar el modelo la parte del select no vuelve en POST pq yo no lo he montado asi.
                return View(model);
            }
            if (this._dataPeliculas.FindPelicula(model.Pelicula.Titulo.ToString()) != null)
            {
                ModelState.AddModelError(nameof(model.Pelicula.Titulo), $"La pelicula {model.Pelicula.Titulo} ya existe");
                //El $ es para que interprete c.Siglas como variable y no como texto
                //nameof es el nombre del campo al que le aplicamos el error
                //El segundo parámetro es la cadena que queremos que aparezca
                model.Generos = this._dataGeneros.GetGeneros(); //IMPORTANTE: volver a montar el modelo la parte del select no vuelve en POST pq yo no lo he montado asi.
                return View(model);
            }
            //1. Insertar pelicula en BBDD
            await this._dataPeliculas.AddPelicula(model.Pelicula);

            // 2. Recuperar el ID generado automáticamente
            int idPelicula = model.Pelicula.IdPelicula;

            // 3. Asignar el ID a la InfoPelicula
            model.Info.IdPelicula = idPelicula;

            // 4. Insertar la información de la película en la BD
            await this._dataInfoPeliculas.AddInfoPelicula(model.Info);
            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            Pelicula peliculaEditar = _dataPeliculas.GetPeliculaById(id);
            return View(peliculaEditar);
        }

        [HttpPost]
        public async Task<IActionResult> Edit(Pelicula peliculaEditada)
        {
            if (!ModelState.IsValid)
            {
                return View(peliculaEditada);
            }
            Pelicula peliculaExistente = _dataPeliculas.GetPeliculaById(peliculaEditada.IdPelicula);

            // Se actualiza solo el campo precio
            peliculaExistente.Precio = peliculaEditada.Precio;

            // Guardamos los cambios solo para el precio
            await this._dataPeliculas.UpdatePelicula(peliculaExistente);

            return RedirectToAction("Index");
        }

        public IActionResult Details(int id)
        {
            Pelicula pelicula = _dataPeliculas.GetPeliculaById(id);
            return View(pelicula);
        }

        public async Task<IActionResult> Delete(int id)
        {
            await this._dataPeliculas.DeletePelicula(id);
            return RedirectToAction("Index");
        }


    
}
}
