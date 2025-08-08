using PortfolioServicios.Models;
using PortfolioServicios.Interfaces;

namespace PortfolioServicios.Services
{
    public class RepositorioPortfolio : IRepositorioPortfolio
    {
        public Persona getPersona()
        {
           return new Persona
            {
                Nombre = "Rosa Rodríguez",
                Edad = 34,
                Imagen = "img/yo.jpg" //alt gr + 4 espacio
            };
        }

        public List<Proyecto> getProyectos()
        {
             return new List<Proyecto>() {
                new Proyecto
                {
                Titulo = "Amazon",
                Descripcion = "E-Commerce realizado en ASP.NET Core",
                Link = "https://amazon.com",
                ImagenURL = "/img/amazon.png"
                },
                new Proyecto
                {
                Titulo = "New York Times",
                Descripcion = "Página de noticias en React",
                Link = "https://nytimes.com",
                ImagenURL = "/img/nyt.png"
                },
                new Proyecto
                {
                Titulo = "Reddit",
                Descripcion = "Red social para compartir en comunidades",
                Link = "https://reddit.com",
                ImagenURL = "/img/reddit.png"
                },

            };
        }
    }
}
