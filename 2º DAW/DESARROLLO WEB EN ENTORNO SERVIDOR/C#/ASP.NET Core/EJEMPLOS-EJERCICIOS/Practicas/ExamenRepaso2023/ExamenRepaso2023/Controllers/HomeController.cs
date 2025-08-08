using System.Diagnostics;
using ExamenRepaso2023.Interfaces;
using ExamenRepaso2023.Modelos;
using ExamenRepaso2023.Servicios;
using Microsoft.AspNetCore.Mvc;

namespace ExamenRepaso2023.Controllers
{
    public class HomeController : Controller
    {
        private readonly IRepositorioUsuarios repositorioUsuarios;
        public HomeController(IRepositorioUsuarios y)
        {
            this.repositorioUsuarios = y;
        }

        public IActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string nick, string password)
        {
            var usuario = repositorioUsuarios.isUsuario(nick, password);

            if (usuario == null)
            {
                ViewBag.Error = "Usuario o contraseña incorrectos.";
                return View("Index"); 
            }

            if (usuario is Alumno alumno)
            {
                return View("VistaAlumno", alumno); 
            }

            if (usuario is Profesor profesor)
            {
                var alumnos = repositorioUsuarios.getAlumnos();
                return View("VistaProfesor", alumnos);
            }

            return View("Index"); //si no es ninguno tambien le mandamos
        }

        // Acción para mostrar el formulario de registro
        public IActionResult Registro()
        {
            return View();
        }

        // Acción POST para procesar el formulario de registro
        [HttpPost]
        public IActionResult Registro(Alumno nuevoAlumno)
        {
            if (ModelState.IsValid)
            {
                // Verificar si el nick o la contraseña ya están en uso
                if (repositorioUsuarios.isRepetido(nuevoAlumno.Nick, nuevoAlumno.Contraseña))
                {
                    ViewBag.Error = "El usuario o la contraseña ya están en uso.";
                    return View(nuevoAlumno); // Si está repetido, muestra el error en el formulario
                }

                // Si los datos son válidos, agrega el nuevo alumno al repositorio
                repositorioUsuarios.AgregarAlumno(nuevoAlumno);
                return RedirectToAction("Index"); // Redirige al inicio después del registro
            }

            return View(nuevoAlumno); // Si hay errores en el modelo, vuelve al formulario de registro
        }



    }
}
