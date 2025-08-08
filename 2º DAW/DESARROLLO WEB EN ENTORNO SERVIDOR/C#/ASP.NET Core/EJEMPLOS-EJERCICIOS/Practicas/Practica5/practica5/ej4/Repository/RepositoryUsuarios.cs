using ej4.Interfaces;
using ej4.Data;
using ej4.Helper;
using ej4.Models;

namespace ej4.Repositories
{
    public class RepositoryUsuarios : IRepositoryUsuarios
    {
        private VideoclubContext _context;

        public RepositoryUsuarios(VideoclubContext context)
        {
            _context = context;
        }
        private int GetMaxIdUsuario()
        {
            if (this._context.users.Count() == 0)
            {
                return 1;
            }
            else
            {
                return this._context.users.Max(z => z.IdUsuario) + 1;
            }
        }
        public async Task RegisterUser(string nombre
        , string email, string password, string rol)
        {
            Usuario user = new Usuario();
            user.IdUsuario = this.GetMaxIdUsuario();
            user.Nombre = nombre;
            user.Email = email;
            user.Rol = rol;
            
            //CADA USUARIO TENDRA UN SALT DIFERENTE
            user.Salt =Cifrado.GenerateSalt();
            //CIFRAMOS EL PASSWORD DEL USUARIO CON SU SALT
            user.Password =Cifrado.EncryptPassword(password, user.Salt);
            this._context.users.Add(user);
            await this._context.SaveChangesAsync();
        }
        public Usuario LogInUser
        (string email, string password)
        {
            Usuario user =this._context.users.FirstOrDefault(z => z.Email == email);
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

    }

}

