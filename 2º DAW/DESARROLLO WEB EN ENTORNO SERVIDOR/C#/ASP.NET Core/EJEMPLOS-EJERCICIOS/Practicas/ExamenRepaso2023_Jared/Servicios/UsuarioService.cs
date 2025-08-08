using Examen23.Models;
using static Examen23.Models.Profesor;
using static System.Runtime.InteropServices.JavaScript.JSType;
using System.Security.Cryptography;
using Examen23.Interfaces;

namespace Examen23.Servicios
{
    public class UsuarioService:IUsuarioService
    {
        private readonly List<UsuarioModel> _usuarios;
        public UsuarioService() {
            _usuarios = new List<UsuarioModel>
            {
                new Profesor
                {
                    Nombre= "Rosa Rodríguez García",
                    Usuario= "rrodriguez",
                    Contrasena= "a12345678",
                    Email= "rosa.rodriguez@salesianas.org",
                    Especialidad = EnumeradoEspecialidad.Informatica
                },
                new Alumno
                {
                    Nombre="Laura Medina Pérez",
                    Usuario="lmedina",
                    Contrasena="l1234",
                    Email="laura.mediana@esudiantes.plaza.org",
                    Ciclo= EnumeradoCiclo.DAW,
                    Curso=1,
                    Idiomas= new List<string> {"Inglés","Francés" }
                }
            };
        }

        public List<Alumno> getAlumnos()
        {
            List<Alumno> _alumnos = new List<Alumno>();
            foreach (var persona in _usuarios)
            {
                if (persona is Alumno)
                {

                    _alumnos.Add((Alumno)persona);
                }
            }

            return _alumnos;
        }

        public UsuarioModel isUsuario(string email)
        {
            foreach (var persona in _usuarios)
            {
                if (persona.Email == email)
                {
                    return persona;
                }
            }
            return null;
        }

        public UsuarioModel isUsuario(string usuario, string pass)
        {
            foreach (var persona in _usuarios)
            {
                if (persona.Usuario==usuario && persona.Contrasena==pass)
                {
                    return persona;
                }
            }
            return null;
        }

        public bool isRepetido(string usuario, string pass)
        {
            foreach (var persona in _usuarios)
            {
                if(persona.Usuario==usuario)
                {
                    return true;
                }
            }
            return false;
        }

        public void addAlumno(Alumno alumno)
        {
            _usuarios.Add(alumno);
        }
    }
}
