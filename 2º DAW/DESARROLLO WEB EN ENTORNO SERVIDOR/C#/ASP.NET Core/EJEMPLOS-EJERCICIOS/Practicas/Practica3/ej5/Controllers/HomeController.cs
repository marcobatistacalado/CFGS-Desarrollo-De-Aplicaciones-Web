using ej5.Interfaces;
using ej5.Models;
using ej5.Services;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ej5.Controllers
{
    public class HomeController : Controller
    {
        private readonly IRepositorioAlumnos repositorioAlumnos;
        private static int indexar;
        public HomeController (IRepositorioAlumnos r)
        {
            this.repositorioAlumnos = r;
        }
        public IActionResult Index()
        {
            List<Alumno> alumnos = repositorioAlumnos.GetAlumnos();
            return View(alumnos);
        }

        public IActionResult Ver(int id)
        {
            indexar = id - 1;
            Alumno a = repositorioAlumnos.GetAlumno(indexar);
            return View(a);
        }

        public IActionResult Editar(int id)
        {
            indexar = id - 1;
            Alumno a = repositorioAlumnos.GetAlumno(indexar);
            return View(a);
        }

        
        [HttpPost]
        public IActionResult Editar(Alumno a)
        {
            this.repositorioAlumnos.EditAlum(a, indexar);
            return RedirectToAction("Index");
        }

        public IActionResult Borrar(int id)
        {
            this.repositorioAlumnos.DeleteAlumno(id);
            return RedirectToAction("Index");
        }

        public IActionResult Add()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Add(Alumno a)
        {
            this.repositorioAlumnos.AddAlumno(a);
            return RedirectToAction("Index");
        }

        

      
        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
