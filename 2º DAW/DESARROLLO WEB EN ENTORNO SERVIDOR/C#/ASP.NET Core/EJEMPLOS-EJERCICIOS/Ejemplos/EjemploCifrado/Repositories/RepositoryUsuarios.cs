using EjemploCifrado.Data;
using EjemploCifrado.Helper;
using EjemploCifrado.Models;

namespace EjemploCifrado.Repositories
{
    public class RepositoryUsuarios
    {
        private DBContexto context;
        public RepositoryUsuarios(DBContexto context)
        {
            this.context = context;
        }
        private int GetMaxIdUsuario()
        {
            if (this.context.usuarios.Count() == 0)
            {
                return 1;
            }
            else
            {
                return this.context.usuarios.Max(z => z.IdUsuario) + 1;
            }
        }
        public async Task RegisterUser(string nombre
        , string email, string password)
        {
            Usuario user = new Usuario();
            user.IdUsuario = this.GetMaxIdUsuario();
            user.Nombre = nombre;
            user.Email = email;
            
            //CADA USUARIO TENDRA UN SALT DIFERENTE
            user.Salt =Cifrado.GenerateSalt();
            //CIFRAMOS EL PASSWORD DEL USUARIO CON SU SALT
            user.Password =Cifrado.EncryptPassword(password, user.Salt);
            this.context.usuarios.Add(user);
            await this.context.SaveChangesAsync();
        }
        public Usuario LogInUser
        (string email, string password)
        {
            Usuario user =this.context.usuarios.FirstOrDefault(z => z.Email == email);
            if (user == null)
                return null;
            else
            {
                //RECUPERAMOS EL PASSWORD CIFRADO DE LA BBDD
                byte[] passUsuario = user.Password;
                //DEBEMOS CIFRAR DE NUEVO EL PASSWORD DE USUARIO
                //JUNTO A SU SALT UTILIZANDO LA MISMA TECNICA
                string salt = user.Salt;
                byte[] temp =
                Cifrado.EncryptPassword(password, salt);
                //COMPARAMOS LOS DOS ARRAYS
               if (Cifrado.CompareArrays(passUsuario, temp))
                
                    return user;
               else
                
                    return null;
                
            }
        }
    }

}

