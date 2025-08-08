using ExamenRepaso_2.Interfaces;
using ExamenRepaso_2.Models;
using Microsoft.AspNetCore.Mvc;

namespace ExamenRepaso_2.Controllers
{
    public class UsuariosController : Controller
    {
        private readonly IUsuarioService _usuarioService;
        //inyeccion
        public UsuariosController(IUsuarioService usuarioService)
        {
            _usuarioService = usuarioService;
        }

        public IActionResult Login()
        {
            return View(); // Muestra la vista de Login sin datos
        }


        [HttpPost]
        public IActionResult Login(string nick, string contrasenna)
        {
            var usuario = _usuarioService.IsUsuario(nick, contrasenna);

            if (usuario == null)
            {
                ViewBag.Error = "Usuario no encontrado o contraseña incorrecta.";
                return View("Login"); // Regresa a la vista de Login si no encuentra el usuario
            }

            if (usuario is Alumno alumno)
            {
                return View("Alumno", alumno); // Vista con detalles del alumno
            }
            else if (usuario is Profesor)
            {
                var alumnos = _usuarioService.GetAlumnos();
                return View("Profesor", alumnos); // Vista que muestra datos de todos los alumnos
            }

            ViewBag.Error = "Tipo de usuario desconocido.";
            return View("Login");
        }

        public IActionResult Registro()
        {
            return View("Registro"); // Muestra la vista de registro
        }

        [HttpPost]
        public IActionResult Registro(Alumno nuevoAlumno)
        {
            if (_usuarioService.IsRepetido(nuevoAlumno.Nick, nuevoAlumno.Contrasenna))
            {
                ViewBag.Error = "El usuario o la contraseña ya existen."; //mostrar mensaje de error en otro caso
                return View("Registro");
            }
            _usuarioService.AltaUsuario(nuevoAlumno);
            return RedirectToAction("Login"); //al registrarte usamos PRG!!!! para mandarle a una vista get
        }
    }

}
