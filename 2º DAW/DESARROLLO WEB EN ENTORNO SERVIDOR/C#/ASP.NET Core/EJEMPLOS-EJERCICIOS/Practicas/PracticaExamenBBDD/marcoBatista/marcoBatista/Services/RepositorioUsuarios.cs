using marcoBatista.Interfaces;
using marcoBatista.Models;
using static marcoBatista.Models.Enumerados;
namespace marcoBatista.Services
{
    public class RepositorioUsuarios : IRepositorioUsuarios
    {
        private List<Usuario> usuarios;

        public RepositorioUsuarios()
        {
            usuarios = new List<Usuario>()
            {
                new Profesor
                {
                    NombreCompleto = "Rosa Rodríguez García",
                    Nick = "rrodriguez",
                    Contrasenna = "a12345678",
                    Email = "rosa.rodriguez@salesianas.org",
                    Especialidad = EnumeradoEspecialidad.INFORMÁTICA
                },
                new Alumno
                {
                    NombreCompleto = "Laura Medina Pérez",
                    Nick = "lmedina",
                    Contrasenna = "l1234",
                    Email = "laura.medina@estudiantes.plaza.org",
                    Ciclo = EnumeradoCiclo.DAW,
                    Curso = 1,
                    lIdiomas = new List<string> { "inglés", "francés" },
                    Idiomas = null
                }


            };
        }

        public List<Alumno> GetAlumnos()
        {
            var alumnos = new List<Alumno>();
            foreach (var usuario in usuarios)
            {
                if (usuario is Alumno alumno)
                {
                    alumnos.Add(alumno);
                }
            }
            return alumnos;
        }

        public Usuario IsUsuario(string email)
        {
            foreach (var usuario in usuarios)
            {
                if (usuario.Email == email)
                {
                    return usuario;
                }
            }
            return null;
        }

        public Usuario IsUsuario(string usuario, string contrasenna)
        {
            foreach (var u in usuarios)
            {
                if (u.Nick == usuario && u.Contrasenna == contrasenna)
                {
                    return u;
                }
            }
            return null;
        }
        // yyyyy / ooo --> ||
        public bool IsRepetido(string usuario, string contrasenna)
        {
            foreach (var u in usuarios)
            {
                if (u.Nick == usuario || u.Contrasenna == contrasenna)
                {
                    return true;
                }
            }
            return false;
        }
        public void AltaUsuario(Usuario nuevoUsuario)
        {
            usuarios.Add(nuevoUsuario);
        }

        public void CambioContrasenna(string id, string contrasenna)
        {
            int cont = 0;
            foreach(var u in usuarios)
            {
                if (u.Email == id)
                {
                    break;
                }
                cont++;
            }
            usuarios[cont].Contrasenna = contrasenna;
        }

        public void ActualizarAlumno(Alumno alumno)
        {
            //var existente = usuarios.FirstOrDefault(u => u.Email == usuario.Email);
            for (int i = 0; i < usuarios.Count; i++)
            {
                if (usuarios[i].Email == alumno.Email) // Comparamos por el email
                {
                    usuarios[i] = alumno; // Reemplazamos el usuario encontrado
                    return; // Salimos del método después de actualizar
                }
            }

            // Si no se encontró el usuario, podemos decidir si lanzamos una excepción
            // o simplemente no hacemos nada.
            // throw new Exception("Usuario no encontrado.");
        }

        /*PUEDO USAR LINQ (FUNCIONES LAMBDA)
         public void ActualizarAlumno(Alumno alumno)
         {
                var existente = usuarios.FirstOrDefault(u => u.Email == alumno.Email);
                if (existente != null)
                {
                    int index = usuarios.IndexOf(existente);
                    usuarios[index] = alumno;
                }
                else
                {
                    // Si no se encuentra el alumno, puedes lanzar una excepción o realizar otra acción
                    throw new Exception("Alumno no encontrado.");
                }
            }

         
         */


    }
}
