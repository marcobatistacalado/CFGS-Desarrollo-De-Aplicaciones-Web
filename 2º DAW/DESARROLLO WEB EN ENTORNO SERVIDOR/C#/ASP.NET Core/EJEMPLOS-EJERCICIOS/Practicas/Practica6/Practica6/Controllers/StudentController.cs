using Microsoft.AspNetCore.Mvc;
using Practica6.Interfaces;
using Practica6.Models;
using System.Threading.Tasks;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc.Filters;

namespace Practica6.Controllers
{
    public class StudentController : Controller
    {
        private readonly IRepositoryCategorias _dataCategorias;
        private readonly IRepositoryApplications _dataApplications;
        private readonly IRepositoryJobOffers _dataJobOffers;

        public StudentController(IRepositoryCategorias dataCategorias, IRepositoryApplications dataApplications, IRepositoryJobOffers jobOffers)
        {
            this._dataCategorias = dataCategorias;
            this._dataApplications = dataApplications;
            this._dataJobOffers = jobOffers;
        }
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            string rolUsuario = HttpContext.Session.GetString("rol");

            if (rolUsuario != "Student")
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
            List<JobOffer> l_jobOffers = this._dataJobOffers.GetJobOffersByCategory(id);
            return View(l_jobOffers);
        }

        public async Task<IActionResult> Application(int idJobOffer)
        {
            int? idUser = HttpContext.Session.GetInt32("id");

            // Verificar si el usuario está autenticado
            if (!idUser.HasValue)
            {
                TempData["Error"] = "Debes iniciar sesión para postularte a una oferta.";
                return RedirectToAction("Index", "Home");
            }

            // Verificar si el usuario ya aplicó a la oferta
            bool alreadyApplied = _dataApplications.ExistsApplication(idUser.Value, idJobOffer);
            if (alreadyApplied)
            {
                TempData["Message"] = "Ya te has postulado para esta oferta de trabajo.";
                // Obtener la categoría de la oferta de trabajo para redirigir correctamente
                int categoryId = _dataJobOffers.GetCategoryIdByJobOffer(idJobOffer);
                return RedirectToAction("Details", new { id = categoryId });
            }

            // Crear la nueva aplicación
            Application a = new Application
            {
                UserId = idUser.Value,  // Convertir el nullable int a int
                JobOfferId = idJobOffer
            };

            await _dataApplications.AddAplicattion(a);

            TempData["Success"] = "Te has postulado con éxito.";
            return RedirectToAction("Index");
        }

    }
}
