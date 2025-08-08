using ej1.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ej1.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            Persona p = new Persona()
            {
                Nombre = "Rosa Rodríguez",
                Edad = 36,
                Perfil = "Web development",
                Foto = "/images/rosa.png"
            };
            List<Proyecto> pro = new List<Proyecto>
            {
                new Proyecto
                {
                    Titulo = "Sistema de Gestión de Inventarios",
                    Descripcion = "Aplicación web para el control de inventarios de una empresa.",
                    Stack = new List<string> { "ASP.NET Core", "Entity Framework", "SQL Server", "Bootstrap" }
                },
                new Proyecto
                {
                    Titulo = "Plataforma de E-commerce",
                    Descripcion = "Marketplace para la compra y venta de productos.",
                    Stack = new List<string> { "ASP.NET Core", "React", "MongoDB", "Docker" }
                },
                new Proyecto
                {
                    Titulo = "Blog Personal",
                    Descripcion = "Aplicación de blog con autenticación de usuarios y editor de texto enriquecido.",
                    Stack = new List<string> { "ASP.NET Core", "Razor Pages", "SQLite", "Tailwind CSS" }
                },
                new Proyecto
                {
                    Titulo = "Aplicación de Gestión de Proyectos",
                    Descripcion = "Aplicación para la planificación y seguimiento de proyectos colaborativos.",
                    Stack = new List<string> { "ASP.NET Core", "Vue.js", "MySQL", "SignalR" }
                },
                new Proyecto
                {
                    Titulo = "Sistema de Reservas de Hotel",
                    Descripcion = "Sistema de reservas y administración de habitaciones en hoteles.",
                    Stack = new List<string> { "ASP.NET Core", "Angular", "PostgreSQL", "Azure" }
                }
            };
            Portfolio portfolio = new Portfolio()
            {
                Persona = p,
                Proyectos = pro
            };

            return View("Index", portfolio);
        }
    }
}
