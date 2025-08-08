using PortfolioServicios.Models;

namespace PortfolioServicios.Interfaces
{
    public interface IRepositorioPortfolio
    {
        public Persona getPersona();
        public List<Proyecto> getProyectos();
    }
}
