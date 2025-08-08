using marcoBatista2ev.Interfaces;
using marcoBatista2ev.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace marcoBatista2ev.Controllers
{
    public class UsuarioController : Controller
    {
        private readonly IRepositoryUsuarios _dataUsuarios;
        private readonly IRepositoryTareas _dataTareas;

        public UsuarioController(IRepositoryUsuarios dataUsuarios, IRepositoryTareas dataTareas)
        {
            this._dataUsuarios = dataUsuarios;
            this._dataTareas = dataTareas;
        }
        public IActionResult Index()
        {
            string email = HttpContext.Session.GetString("email");
            List<Tarea> l_tareas = this._dataTareas.GetTareasByEmail(email);
            return View(l_tareas);
        }

        public async Task<IActionResult> ActualizarEstado(int id)
        {
            //var tarea = _dataTareas.GetTareaById(id);

            await this._dataTareas.UpdateEstadoTarea(id);

            return RedirectToAction("Index");
        }
    }
}
