using ExamenRepaso_2.Interfaces;
using ExamenRepaso_2.Models;
using static ExamenRepaso_2.Models.Enumerados;

namespace ExamenRepaso_2.Services
{

    // Implementación del servicio
    public class UsuarioService : IUsuarioService
    {
        private List<Usuario> _usuarios;

        public UsuarioService()
        {
            _usuarios = new List<Usuario>()
            {
                new Profesor
                {
                    Nick = "rrodriguez",
                    Contrasenna = "a12345678",
                    NombreCompleto = "Rosa Rodríguez García",
                    Email = "rosa.rodriguez@salesianas.org",
                    Especialidad = EnumeradoEspecialidad.INFORMÁTICA
                },
                new Alumno
                {
                    Nick = "lmedina",
                    Contrasenna = "l1234",
                    NombreCompleto = "Laura Medina Pérez",
                    Email = "laura.mediana@esudiantes.plaza.org",
                    Ciclo = EnumeradoCiclo.DAW,
                    Curso = 1,
                    Idiomas = new List<string> { "inglés", "francés" }
                }


            };
        }

        public List<Alumno> GetAlumnos()
        {
            var alumnos = new List<Alumno>();
            foreach (var usuario in _usuarios)
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
            foreach (var usuario in _usuarios)
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
            foreach (var user in _usuarios)
            {
                if (user.Nick == usuario && user.Contrasenna == contrasenna)
                {
                    return user;
                }
            }
            return null;
        }

        public bool IsRepetido(string usuario, string contrasenna)
        {
            foreach (var user in _usuarios)
            {
                if (user.Nick == usuario || user.Contrasenna == contrasenna)
                {
                    return true;
                }
            }
            return false;
        }
        public void AltaUsuario(Usuario nuevoUsuario)
        {
            _usuarios.Add(nuevoUsuario);
        }

    }

}
