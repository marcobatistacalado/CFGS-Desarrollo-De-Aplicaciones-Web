using marcoBatista.Interfaces;
using marcoBatista.Models;
using Microsoft.AspNetCore.Mvc;

namespace marcoBatista.Controllers
{
    public class UsuariosController : Controller
    {
        private readonly IRepositorioUsuarios repositorioUsuarios;

        public UsuariosController(IRepositorioUsuarios x)
        {
            this.repositorioUsuarios = x;
        }

        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string nick, string contrasenna)
        {
            if (!ModelState.IsValid)
            {
                return View("Login");
            }

            var usuario = repositorioUsuarios.IsUsuario(nick, contrasenna);

            if (usuario == null)
            {
                ViewBag.Error = "Usuario no encontrado / contraseña incorrecta";
                return RedirectToAction("Login");
            }

            if (usuario is Alumno alumno)
            {
                // En este caso, redirigimos a la vista "Details" del controlador "Alumno" pasando el email.
                return RedirectToAction("Alumno", "Alumno", new { email = alumno.Email }); //primero la vista y luego el controlador
            }
            else if (usuario is Profesor)
            {
                return RedirectToAction("ListaAlumnos", "Profesor"); //primero la vista y luego el controlador
            }

            ViewBag.Error = "Tipo de usuario desconocido.";
            return View("Login");
        }

        public IActionResult Registro()
        {
            return View("Registro");
        }

        [HttpPost]
        public IActionResult Registro(Alumno nuevoAlumno)
        {
            if (!ModelState.IsValid)
            {
                // Si el modelo no es válido, volvemos a la vista de registro con los errores
                return View("Registro", nuevoAlumno);
            }
            if (repositorioUsuarios.IsRepetido(nuevoAlumno.Nick, nuevoAlumno.Contrasenna))
            {
                ViewBag.Error = "usuario/contraseña ya existen";//mensaje de error
                return View("Registro");
            }

            // if (!string.IsNullOrWhiteSpace(nuevo.IdiomasString))

            //El formulario recibe un string de idiomas separado por coma. Esta lo guarda en Idiomas como una lista despues del split
            //nuevo.Idiomas = nuevo.IdiomasString.Split(",").Select(x => x.Trim()).ToList();

            nuevoAlumno.lIdiomas = nuevoAlumno.Idiomas.Split(",").ToList();
            repositorioUsuarios.AltaUsuario(nuevoAlumno);
            return RedirectToAction("Login"); //prg 
        }

        


    }
}
