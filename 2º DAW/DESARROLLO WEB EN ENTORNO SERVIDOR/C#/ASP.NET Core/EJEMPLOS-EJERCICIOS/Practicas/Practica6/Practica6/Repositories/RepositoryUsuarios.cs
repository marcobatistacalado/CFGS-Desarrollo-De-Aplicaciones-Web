using Practica6.Helper;
using Practica6.Data;
using Practica6.Models;
using Practica6.Interfaces;

namespace Practica6.Repositories
{
    public class RepositoryUsuarios : IRepositoryUsuarios
    {
        private BolsaTrabajoContext _context;

        public RepositoryUsuarios(BolsaTrabajoContext context)
        {
            _context = context;
        }

        private int GetMaxIdUsuario()
        {
            if (this._context.Users.Count() == 0)
            {
                return 1;
            }
            else
            {
                return this._context.Users.Max(z => z.IdUsuario) + 1;
            }
        }

        public async Task RegisterUser(string nombre, string email, string dni, string password, User.Role rol)
        {
            User user = new User();
            user.IdUsuario = this.GetMaxIdUsuario();
            user.Name = nombre;
            user.Email = email;
            user.Dni = dni;
            user.Rol = rol;

            //CADA USUARIO TENDRA UN SALT DIFERENTE
            user.Salt = Cifrado.GenerateSalt();
            //CIFRAMOS EL PASSWORD DEL USUARIO CON SU SALT
            user.Password = Cifrado.EncryptPassword(password, user.Salt);
            this._context.Users.Add(user);
            await this._context.SaveChangesAsync();
        }

        public User LogInUser
       (string email, string password)
        {
            User user = this._context.Users.FirstOrDefault(z => z.Email == email);
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

        public User FindUser(string email)
        {
            return this._context.Users.FirstOrDefault<User>(u => u.Email == email);
        }

        public User FindAlumnoById(int id)
        {
            return this._context.Users.FirstOrDefault<User>(u => u.IdUsuario == id);
        }

        public List<User> AlumnosOferta(List<Application> applicaciones)
        {
            List<User> alumnos = new List<User>();
            foreach (Application app in applicaciones)
            {
                int AlumnoId = app.UserId;
                User alumno = FindAlumnoById(AlumnoId);
                alumnos.Add(alumno);
            }
            return alumnos;
        }


    }
}
