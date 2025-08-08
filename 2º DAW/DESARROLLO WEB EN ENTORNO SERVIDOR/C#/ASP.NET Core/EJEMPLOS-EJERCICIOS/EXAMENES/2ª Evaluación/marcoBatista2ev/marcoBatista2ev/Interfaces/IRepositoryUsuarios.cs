using marcoBatista2ev.Models;

namespace marcoBatista2ev.Interfaces
{
    public interface IRepositoryUsuarios
    {
        Usuario LogInUser(string email, string password);
        public List<Usuario> GetUsuarios();
        public Usuario? FindUsuario(string email);
    }
}
