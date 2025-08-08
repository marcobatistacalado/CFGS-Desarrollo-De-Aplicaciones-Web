using ExamenRepasoExtraOrdinaria2024.Models;

namespace ExamenRepasoExtraOrdinaria2024.Interfaces
{
    public interface IRepositorySocios
    {
        public Socio LogInUser(string dni, string password);
        public Task<bool> RegisterUser(string dni, string nombre, string password, string telefono, string matricula);
        public Socio FindSocio(string dni);
    }
}
