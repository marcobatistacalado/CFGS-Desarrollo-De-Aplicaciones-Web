using EjemploControlesHTML.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using System.Diagnostics;

namespace EjemploControlesHTML.Controllers
{
    public class HomeController : Controller
    {
        
        public IActionResult Index()
        {
            Ejemplo eje = new Ejemplo
            {
                MisAficiones = new List<Aficion>()
                {
                    new Aficion
                    {
                        Nombre="Leer",
                        isChecked=false
                    },
                    new Aficion
                    {
                        Nombre="Viajar",
                        isChecked=false
                    }
                    ,
                    new Aficion
                    {
                        Nombre="Hacer deporte",
                        isChecked=false
                    }
                    }
            };

            return View(eje);
        }

        public IActionResult Details(Ejemplo e)
        {
            e.MisAficiones = e.MisAficiones.Where(x => x.isChecked).ToList();
            return View(e);


            /*OTRA FORMA DE HACERLO SIN LAMBDA
            var aficionesSeleccionadas = new List<Aficion>();

            foreach (var aficion in e.MisAficiones)
            {
                if (aficion.isChecked)
                {
                    aficionesSeleccionadas.Add(aficion);
                }
            }

            e.MisAficiones = aficionesSeleccionadas;
            */
        }


    }
}