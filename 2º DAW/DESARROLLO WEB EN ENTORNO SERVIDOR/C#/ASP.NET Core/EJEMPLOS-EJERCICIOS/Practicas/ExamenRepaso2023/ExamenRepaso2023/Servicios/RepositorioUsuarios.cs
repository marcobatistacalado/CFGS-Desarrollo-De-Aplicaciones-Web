using ExamenRepaso2023.Interfaces;
using ExamenRepaso2023.Modelos;
using static System.Runtime.InteropServices.JavaScript.JSType;
using System.Security.Cryptography;
using static ExamenRepaso2023.Modelos.Enumerados;

namespace ExamenRepaso2023.Servicios
{
    public class RepositorioUsuarios : IRepositorioUsuarios
    {
        private  List<Usuario> usuarios;
        public RepositorioUsuarios()
        {
            usuarios = new List<Usuario>
            {
                new Profesor
                {
                    NombreCompleto = "Rosa Rodríguez García",
                    Nick = "rrodriguez",
                    Contraseña = "a12345678",
                    Email = "rosa.rodriguez@salesianas.org",
                    Especialidad = EnumeradoEspecialidad.INFORMÁTICA
                },
                new Alumno
                {
                    NombreCompleto = "Laura Medina Pérez",
                    Nick = "lmedina",
                    Contraseña = "l1234",
                    Email = "laura.medina@estudiantes.plaza.org",
                    Ciclo = EnumeradoCiclo.DAW,
                    Curso = 1,
                    Idiomas = new List<string> { "inglés", "francés" }
                }
            };
        }

        public List<Alumno> getAlumnos()
        {
            List<Alumno> alumnos = new List<Alumno>();

            foreach (var usuario in usuarios)
            {
                if (usuario is Alumno alumno)
                {
                    alumnos.Add(alumno);
                }
            }

            return alumnos;
        }

        public Usuario isUsuario(string email)
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

        public Usuario isUsuario(string nick, string contrasenna)
        {
            foreach (var usuario in usuarios)
            {
                if (usuario.Nick == nick && usuario.Contraseña == contrasenna)
                {
                    return usuario;
                }
            }

            return null; 
        }

        public bool isRepetido(string nick, string contrasenna)
        {
            foreach (var usuario in usuarios)
            {
                if (usuario.Nick == nick || usuario.Contraseña == contrasenna)
                {
                    return true; 
                }
            }

            return false;
        }

        public void AgregarAlumno(Alumno alumno)
        {
            usuarios.Add(alumno);
        }
    }
}
