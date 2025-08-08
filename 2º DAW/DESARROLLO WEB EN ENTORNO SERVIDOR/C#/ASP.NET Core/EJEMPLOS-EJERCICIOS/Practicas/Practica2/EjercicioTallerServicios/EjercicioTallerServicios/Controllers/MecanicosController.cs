using EjercicioTallerServicios.Interfaces;
using EjercicioTallerServicios.Models;
using EjercicioTallerServicios.Services;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjercicioTallerServicios.Controllers
{
    public class MecanicosController : Controller
    {
        private readonly IRepositorioMecanicos repositorioMecanicos;
        public MecanicosController(IRepositorioMecanicos z)
        {
            this.repositorioMecanicos = z;
        }
        public IActionResult Mecanicos()
        {
            List<Mecanico> m = repositorioMecanicos.getMecanicos();
            return View(m);
        }

    }
}