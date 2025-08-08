using marcoBatista.Interfaces;
using marcoBatista.Models;
using Microsoft.AspNetCore.Mvc;

public class ProfesorController : Controller
{
    private readonly IRepositorioUsuarios repositorioUsuarios;

    public ProfesorController(IRepositorioUsuarios repositorioUsuarios)
    {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    // Acción para ver la lista de alumnos
    public IActionResult ListaAlumnos()
    {
        var alumnos = repositorioUsuarios.GetAlumnos(); // Obtiene la lista de alumnos
        return View(alumnos); // Devuelve la vista con la lista de alumnos
    }

    // Acción para agregar un nuevo alumno
    public IActionResult AgregarAlumno()
    {
        return View(); // Devuelve la vista para agregar un alumno
    }

    [HttpPost]
    public IActionResult AgregarAlumno(Alumno nuevoAlumno)
    {
        if (!ModelState.IsValid)
        {
            return View(nuevoAlumno); // Si el modelo no es válido, regresa con errores
        }

        if (repositorioUsuarios.IsRepetido(nuevoAlumno.Nick, nuevoAlumno.Contrasenna))
        {
            ViewBag.Error = "El usuario o contraseña ya existen.";
            return View(); // Si el usuario ya existe, regresa con error
        }

        // Convierte el string de idiomas en una lista
        nuevoAlumno.lIdiomas = nuevoAlumno.Idiomas.Split(",").Select(x => x.Trim()).ToList();

        repositorioUsuarios.AltaUsuario(nuevoAlumno); // Añade el nuevo alumno al repositorio
        return RedirectToAction("ListaAlumnos"); // Redirige al índice (lista de alumnos)
    }

    // Acción para editar un alumno
    public IActionResult EditarAlumno(string email)
    {
        var alumno = repositorioUsuarios.IsUsuario(email) as Alumno;

        if (alumno == null)
        {
            ViewBag.Error = "Alumno no encontrado.";
            return RedirectToAction("ListaAlumnos"); // Redirige al índice si no se encuentra al alumno
        }

        return View(alumno); // Muestra la vista de edición con los datos del alumno
    }

    [HttpPost]
    public IActionResult EditarAlumno(string email, string nuevoCurso, string nuevoEmail)
    {
        var alumno = repositorioUsuarios.IsUsuario(email) as Alumno;

        if (alumno == null)
        {
            ViewBag.Error = "Alumno no encontrado.";
            return RedirectToAction("ListaAlumnos"); // Redirige al índice si no se encuentra al alumno
        }

        // Actualiza los datos
        if (!string.IsNullOrEmpty(nuevoCurso))
        {
            if (int.TryParse(nuevoCurso, out int curso) && (curso == 1 || curso == 2))
            {
                alumno.Curso = curso;
            }
            else
            {
                ViewBag.Error = "Curso inválido.";
                return View(alumno); // Regresa a la vista de edición si el curso es inválido
            }
        }

        if (!string.IsNullOrEmpty(nuevoEmail))
        {
            alumno.Email = nuevoEmail;
        }

        repositorioUsuarios.ActualizarAlumno(alumno); // Actualiza el alumno en el repositorio
        return RedirectToAction("ListaAlumnos"); // Redirige al índice (lista de alumnos)
    }
}
