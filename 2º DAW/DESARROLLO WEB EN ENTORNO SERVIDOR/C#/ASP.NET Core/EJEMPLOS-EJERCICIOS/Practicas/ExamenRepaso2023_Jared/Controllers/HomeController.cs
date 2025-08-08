using Examen23.Interfaces;
using Examen23.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace Examen23.Controllers
{
    public class HomeController : Controller
    {
       private readonly IUsuarioService usuarioService;

        public HomeController(IUsuarioService usuarioService)
       {
            this.usuarioService = usuarioService;
       }

        public IActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Index(string Usuario, string Contrasena)
        {
            UsuarioModel usuario = usuarioService.isUsuario(Usuario, Contrasena);
            List<Alumno> alumnos = new List<Alumno>();
            if (usuario == null)
            {
                return View();
            }
            if(usuario is Alumno alumno)
            {
                return View("AlumnoDetalles",alumno);
            }
            if (usuario is Profesor)
            {
                alumnos = usuarioService.getAlumnos();
                return View("ProfesorVista", alumnos);
            }
            return View();
        }

        public IActionResult Registro()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Registro(Alumno nuevo)
        {
            if (!ModelState.IsValid) {
                ModelState.AddModelError("", "Datos incorrectos.");
                return View(nuevo);
            }

            if (usuarioService.isRepetido(nuevo.Nombre, nuevo.Contrasena))
            {
                ModelState.AddModelError("", "El usuario o la contraseña ya existen.");
                return View(nuevo);
            }

            return RedirectToAction("Registrar", nuevo);
        }

        public IActionResult Registrar(Alumno nuevo)
        {
            usuarioService.addAlumno(nuevo);
            return RedirectToAction("Index");
        }
    }
}
