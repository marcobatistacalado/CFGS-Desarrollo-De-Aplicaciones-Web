using ExamenRepaso_2.Models;

namespace ExamenRepaso_2.Interfaces
{
    public interface IUsuarioService
    {
        public List<Alumno> GetAlumnos();
        public Usuario IsUsuario(string email);
        public Usuario IsUsuario(string usuario, string contrasenna);
        public bool IsRepetido(string usuario, string contrasenna);

        public void AltaUsuario(Usuario nuevoUsuario);
    }
}
