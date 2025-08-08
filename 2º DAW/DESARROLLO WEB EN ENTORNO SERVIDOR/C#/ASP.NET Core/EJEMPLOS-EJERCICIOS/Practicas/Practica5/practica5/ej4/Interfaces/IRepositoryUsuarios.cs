using ej4.Models;
using System.Threading.Tasks;

namespace ej4.Interfaces
{
    public interface IRepositoryUsuarios
    {
        Task RegisterUser(string nombre, string email, string password, string rol);
        Usuario LogInUser(string email, string password);
    }
}
