using EjemploBBDDEF.Models;
using EjemploBBDDEF.Repository;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using System.Linq;

namespace EjemploBBDDEF.Controllers
{
    public class HomeController : Controller
    {
        private readonly RepositoryCiclo data;

        public HomeController(RepositoryCiclo data)
        {
            this.data = data;
        }

        public IActionResult Index()
        {
            // List<Ciclo> l = this.data.GetCiclos();
            List<Ciclo> l = this.data.GetCiclosByEspecialidad();
            return View(l);
        }

        public IActionResult Create()
        {
            return View();
        }


        [HttpPost]
        public async Task<IActionResult> Create(Ciclo c)
        {
            if (!ModelState.IsValid)
                return View(c);
            if (this.data.FindCiclo(c.Siglas) != null)
            {
                ModelState.AddModelError(nameof(c.Siglas), $"El ciclo {c.Siglas} ya existe");
                //El $ es para que interprete c.Siglas como variable y no como texto
                //nameof es el nombre del campo al que le aplicamos el error
                //El segundo parámetro es la cadena que queremos que aparezca
                return View();
            }
            await this.data.AddCiclo(c);
            return RedirectToAction("Index");
        }

        public async Task<IActionResult> Delete(int id)
        {
            await this.data.DeleteCiclo(id);
            return RedirectToAction("Index");
        }

        public IActionResult Details(int id)
        {
            Ciclo c = this.data.FindCiclo(id);
            return RedirectToAction("Index", "Alumnos", c.Siglas);
        }

       

    }
}

