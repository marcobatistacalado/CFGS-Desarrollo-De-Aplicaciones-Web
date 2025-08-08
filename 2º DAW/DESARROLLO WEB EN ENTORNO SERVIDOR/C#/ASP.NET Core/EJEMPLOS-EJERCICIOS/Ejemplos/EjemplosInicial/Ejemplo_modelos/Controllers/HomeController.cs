using Ejemplo_modelos.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace Ejemplo_modelos.Controllers
{
    public class HomeController : Controller
    {
        Alumno  miAlumno;

        public HomeController()
        {
           miAlumno = new Alumno()
            {
                Nombre = "Rosa Rodríguez",
                DNI = "11111111A",
                Nota = 9
            };
        }
        public IActionResult Index()
        {
            string nombre = "ROSA";
            return View("Index",nombre);
        }

        public IActionResult VerAlumno()
        {
           
            return View("Detalles",miAlumno);
        }
        public IActionResult VerAlumnoPlantilla()
        {
            return View("VerAlumnoPlantilla",miAlumno);
        }

        public IActionResult verTodos() {
            Curso miCurso = new Curso()
            {
                Nombre ="DAW2",
                miLista = new List<Alumno>() {
                new Alumno(){
                    Nombre="AAAA",
                    DNI="1111",
                    Nota=9
                },
                new Alumno(){
                    Nombre="BBBB",
                    DNI="2222",
                    Nota=3
                }
             }
            };
            return View("Todos", miCurso);
        }

        public IActionResult soloLista()
        {
            List<Alumno> miLista = new List<Alumno>() {
                new Alumno(){
                    Nombre="AAAA",
                    DNI="1111",
                    Nota=9
                },
                new Alumno(){
                    Nombre="BBBB",
                    DNI="2222",
                    Nota=3
                }
             };
            return View("SoloLista", miLista);
            
        }

     

        public IActionResult Privacy()
        {
            return View();
        }

       
    }
}
