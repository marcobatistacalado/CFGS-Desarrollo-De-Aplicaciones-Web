using marcoBatista.Interfaces;
using marcoBatista.Models;
using Microsoft.AspNetCore.Mvc;

public class AlumnoController : Controller
{
    private readonly IRepositorioUsuarios repositorioUsuarios;

    public AlumnoController(IRepositorioUsuarios repositorioUsuarios)
    {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    // Acción que recibe el email y devuelve los detalles del alumno
    public IActionResult Alumno(string email)
    {
        // Buscamos al alumno por el email
        var alumno = repositorioUsuarios.IsUsuario(email) as Alumno;

        if (alumno == null)
        {
            ViewBag.Error = "Alumno no encontrado.";
            return RedirectToAction("Login", "Usuarios");
        }

        return View(alumno); // Devuelve la vista pasando el alumno
    }
}
