using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Filters;
using Practica6.Interfaces;
using Practica6.Models;

namespace Practica6.Controllers
{
    public class AdminController : Controller
    {
        private readonly IRepositoryCategorias _dataCategorias;
        private readonly IRepositoryUsuarios _dataUsuarios;
        private readonly IRepositoryApplications _dataApplications;
        private readonly IRepositoryJobOffers _dataJobOffers;
        public AdminController(IRepositoryCategorias dataCategorias, IRepositoryApplications dataApplications, IRepositoryUsuarios dataUsuarios, IRepositoryJobOffers dataJobOffers)
        {
            this._dataCategorias = dataCategorias;
            this._dataApplications = dataApplications;
            this._dataUsuarios = dataUsuarios;
            this._dataJobOffers = dataJobOffers;
        }
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            string rolUsuario = HttpContext.Session.GetString("rol");

            if (rolUsuario != "Admin")
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
            List<Category> l_categorias = this._dataCategorias.GetCategories();
            return View(l_categorias);
        }

        public IActionResult Details(int id)
        {
            ViewData["CategoryId"] = id; // Guardamos el ID de la categoría actual
            List<JobOffer> l_jobOffers = this._dataJobOffers.GetJobOffersByCategory(id);
            return View(l_jobOffers);
        }


        public IActionResult VerAlumnos(int id)
        {
            List <Application> OfertaAlumnos = this._dataApplications.GetAlumnosApplication(id);
            ViewData["Oferta"] = _dataJobOffers.GetOferta(id).Name;
            //tengo todas las apps para esa oferta
            //ahora le paso eso a un metodo que me obtenga los datos de los alumnos
            List <User> l_alumnos = this._dataUsuarios.AlumnosOferta(OfertaAlumnos);
            return View(l_alumnos);
        }

        public async Task<IActionResult> Delete(int id)
        {
            // Obtener la oferta antes de eliminarla para saber su CategoryId
            var oferta = _dataJobOffers.GetOferta(id);

            int categoryId = oferta.CategoryId; // Guardamos el CategoryId antes de eliminar

            await this._dataJobOffers.DeleteOferta(id);

            return RedirectToAction("Details", new { id = categoryId });  // Pasamos el CategoryId a Details
        }

        [HttpGet]
        public IActionResult Create(int categoryId)
        {
            var jobOffer = new JobOffer
            {
                CategoryId = categoryId // Asignamos la categoría automáticamente
            };

            return View(jobOffer);
        }

        [HttpPost]
        public async Task<IActionResult> Create(JobOffer jobOffer)
        {
            if (ModelState.IsValid)
            {
                await _dataJobOffers.AddOferta(jobOffer);
                return RedirectToAction("Details", new { id = jobOffer.CategoryId }); // Volvemos a la categoría
            }

            return View(jobOffer);
        }







    }
}
