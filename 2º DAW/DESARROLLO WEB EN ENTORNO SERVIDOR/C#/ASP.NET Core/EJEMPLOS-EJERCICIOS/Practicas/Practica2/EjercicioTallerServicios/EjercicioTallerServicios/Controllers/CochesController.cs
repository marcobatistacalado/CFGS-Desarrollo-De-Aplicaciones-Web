using EjercicioTallerServicios.Interfaces;
using EjercicioTallerServicios.Models;
using EjercicioTallerServicios.Services;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjercicioTallerServicios.Controllers
{
    public class CochesController : Controller
    {
        private readonly IRepositorioCoches repositorioCoches;
        public CochesController(IRepositorioCoches y)
        {
            this.repositorioCoches = y;
        }
        public IActionResult Coches()
        {
            List<Coche> c = repositorioCoches.getCoches();
            return View(c);
        }

    }
}