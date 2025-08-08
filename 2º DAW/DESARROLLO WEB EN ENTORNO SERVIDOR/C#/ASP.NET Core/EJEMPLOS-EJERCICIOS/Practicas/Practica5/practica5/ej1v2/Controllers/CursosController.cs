using ej1v2.Models;
using ej1v2.Repository;
using EjemploBBDDEF.Data;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace ej1v2.Controllers
{
    public class CursosController : Controller
    {
        private readonly RepositoryCiclos dataCiclos;
        private readonly RepositoryCursos dataCursos;
        private readonly RepositoryAlumnos dataAlumnos;

        public CursosController(RepositoryCiclos data1, RepositoryCursos data2, RepositoryAlumnos data3)
        {
            this.dataCiclos = data1;
            this.dataCursos = data2;
            this.dataAlumnos = data3;
        }
        // GET: Cursos
        public ActionResult Index()
        {
            return View();
        }

        // GET: Cursos/Details/5
        public ActionResult Details(string siglas)
        {
            CicloDetailView detailView = new CicloDetailView()
            {
                ciclo = this.dataCiclos.GetCiclo(siglas),
                l_alumnos= this.dataAlumnos.GetAlumnosCiclo(siglas),
                curso=this.dataCursos.GetCursosCiclo(siglas)

            };
            return View(detailView);
        }

        // GET: Cursos/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Cursos/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: Cursos/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: Cursos/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: Cursos/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: Cursos/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
