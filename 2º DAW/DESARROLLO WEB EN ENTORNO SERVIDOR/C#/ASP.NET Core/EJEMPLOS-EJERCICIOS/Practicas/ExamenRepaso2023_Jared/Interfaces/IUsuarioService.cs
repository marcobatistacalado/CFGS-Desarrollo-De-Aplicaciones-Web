using Examen23.Models;

namespace Examen23.Interfaces
{
    public interface IUsuarioService
    {
        public List<Alumno> getAlumnos();
        public UsuarioModel isUsuario(string email);
        public UsuarioModel isUsuario(string usuario, string pass);
        public bool isRepetido(string usuario, string pass);
        public void addAlumno(Alumno alumno);
    }
}
