using Practica6.Models;

namespace Practica6.Interfaces
{
    public interface IRepositoryUsuarios
    {
        Task RegisterUser(string nombre, string email, string dni, string password, User.Role rol);
        User LogInUser(string email, string password);
        User FindUser(string email);
        public List<User> AlumnosOferta(List<Application> applicaciones);
        public User FindAlumnoById(int id);
    }
}
