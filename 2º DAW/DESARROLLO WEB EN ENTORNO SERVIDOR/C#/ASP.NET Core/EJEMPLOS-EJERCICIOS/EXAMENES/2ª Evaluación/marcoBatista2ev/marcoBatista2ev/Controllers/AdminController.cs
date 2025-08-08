using marcoBatista2ev.Interfaces;
using marcoBatista2ev.Models;
using Microsoft.AspNetCore.Mvc;

namespace marcoBatista2ev.Controllers
{
    public class AdminController : Controller
    {
        private readonly IRepositoryUsuarios _dataUsuarios;
        private readonly IRepositoryTareas _dataTareas;

        public AdminController(IRepositoryUsuarios dataUsuarios, IRepositoryTareas dataTareas)
        {
            this._dataUsuarios = dataUsuarios;
            this._dataTareas = dataTareas;
        }
        public IActionResult Index()
        {
            List<Usuario> l_usuarios = this._dataUsuarios.GetUsuarios();
            return View(l_usuarios);
        }

        public IActionResult ListaTareas(string id)
        {
            List<Tarea> l_tareas = this._dataTareas.GetTareas(id);
            return View(l_tareas);
        }

        public async Task<IActionResult> DeleteTarea(int id)
        {
            var tarea = _dataTareas.GetTareaById(id);

            string idTareas = tarea.Email; 

            await this._dataTareas.DeleteTarea(id);

            return RedirectToAction("ListaTareas", new { id = idTareas }); 
        }
        [HttpGet]
        public IActionResult CreateTarea()
        {
            var tarea = new Tarea()
            {
                Estado = "Pendiente"
            };
            return View(tarea);
        }

        [HttpPost]
        public async Task<IActionResult> CreateTarea(Tarea tarea)
        {
            if (!ModelState.IsValid)
            {
                ViewData["Error"] = "Creación no válida. Contacta con admin.";
                return View(tarea);
            }

            Usuario usuario = _dataUsuarios.FindUsuario(tarea.Email);
            if (usuario != null)
            {
                if (usuario.Perfil == "A")
                {
                    ViewData["Error"] = "Usuario administrador no realiza tareas.";
                    return View(tarea);
                }
                else
                {
                    //aqui añadimos
                    await _dataTareas.AddTarea(tarea);
                    TempData["Success"] = "Tarea Creada";
                    return RedirectToAction("Index"); // Volvemos al inicio
                }
            }
            else
            {
                ViewData["Error"] = "Usuario no encontrado para asignar tarea.";
            }
            return View(tarea);
        }
    }
}
