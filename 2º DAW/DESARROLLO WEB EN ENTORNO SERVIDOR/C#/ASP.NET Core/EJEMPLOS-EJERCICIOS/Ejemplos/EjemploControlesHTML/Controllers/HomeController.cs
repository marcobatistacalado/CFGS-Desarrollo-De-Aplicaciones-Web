using EjemploControlesHTML.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using System.Diagnostics;

namespace EjemploControlesHTML.Controllers
{
    public class HomeController : Controller
    {
        
        public IActionResult Index()
        {
            EjemploSelectList ejem = new EjemploSelectList
            {
                Anyos = Enumerable.Range(2020, DateTime.Now.Year-2019)
                .Select(an => new SelectListItem
                {
                    Value = an.ToString(),
                    Text = an.ToString()
                }).ToList()
            };
            return View(ejem);
        }

        public IActionResult Details(EjemploSelectList e)
        {
            return View(e);
        }


    }
}