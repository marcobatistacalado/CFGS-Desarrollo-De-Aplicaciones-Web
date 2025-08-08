using ej1.Models;
using ej1.Repository;
using Microsoft.AspNetCore.Mvc;

namespace ej1.Controllers
{
    public class AlumnosController : Controller
    {
        private readonly RepositoryAlumnos data;
        public AlumnosController(RepositoryAlumnos r)
        {
            this.data = r;
        }
        public IActionResult Index()
        {
            List<Alumno> l = this.data.getAlumnos();
            return View(l);
        }
    }
}
