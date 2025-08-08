using marcoBatista2ev.Data;
using marcoBatista2ev.Helper;
using marcoBatista2ev.Interfaces;
using marcoBatista2ev.Models;

namespace marcoBatista2ev.Repositories
{
    public class RepositoryUsuarios : IRepositoryUsuarios
    {
        private GestionTareasContext _context;

        public RepositoryUsuarios(GestionTareasContext context)
        {
            _context = context;
        }

        public Usuario LogInUser
       (string email, string password)
        {
            Usuario user = this._context.Usuarios.FirstOrDefault(z => z.Email == email);
            if (user == null)
                return null;
            else
            {
                //RECUPERAMOS EL PASSWORD CIFRADO DE LA BBDD
                byte[] passUsuario = user.Password;
                //DEBEMOS CIFRAR DE NUEVO EL PASSWORD DE USUARIO
                //JUNTO A SU SALT UTILIZANDO LA MISMA TECNICA
                string salt = user.Salt;
                byte[] temp = Cifrado.EncryptPassword(password, salt);
                //COMPARAMOS LOS DOS ARRAYS
                if (Cifrado.CompareArrays(passUsuario, temp))

                    return user;
                else

                    return null;

            }
        }

        public List<Usuario> GetUsuarios()
        {
            return _context.Usuarios.Where(u => u.Perfil == "U").ToList();
        }

        public Usuario? FindUsuario(string email)
        {
            return _context.Usuarios.FirstOrDefault(u => u.Email == email);
        }
    }
}
