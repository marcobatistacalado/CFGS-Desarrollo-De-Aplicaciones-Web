using Microsoft.AspNetCore.Mvc;
using PortfolioServicios.Models;
using PortfolioServicios.Services;
using PortfolioServicios.Interfaces;
using System.Diagnostics;

namespace PortfolioServicios.Controllers
{
    public class HomeController : Controller
    {

        private readonly IRepositorioPortfolio data;
        public HomeController(IRepositorioPortfolio r)
        {
            this.data= r;
        }

        public IActionResult Index()
        {
            HomeViewModel m = new HomeViewModel
            {
                P = this.data.getPersona(),

                Proyectos = this.data.getProyectos(),
            };
                return View(m);

        }

       

       
       
    }
}