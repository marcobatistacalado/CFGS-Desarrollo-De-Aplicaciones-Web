using EjercicioTallerServicios.Interfaces;
using EjercicioTallerServicios.Models;
using EjercicioTallerServicios.Services;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EjercicioTallerServicios.Controllers
{
    public class TalleresController : Controller
    {
        private readonly IRepositorioTalleres repositorioTalleres;
        public TalleresController(IRepositorioTalleres x)
        {
            this.repositorioTalleres = x;
        }

        public IActionResult Taller()
        {

            Talleres t = repositorioTalleres.getTaller();
            return View(t);
        }
    }
}