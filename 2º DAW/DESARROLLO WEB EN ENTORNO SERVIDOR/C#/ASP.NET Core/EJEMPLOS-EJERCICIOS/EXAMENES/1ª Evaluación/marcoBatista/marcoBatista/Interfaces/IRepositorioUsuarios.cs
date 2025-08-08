using marcoBatista.Models;

namespace marcoBatista.Interfaces
{
    public interface IRepositorioUsuarios
    {
        public List<Alumno> GetAlumnos();
        public Usuario IsUsuario(string email);
        public Usuario IsUsuario(string usuario, string contrasenna);
        public bool IsRepetido(string usuario, string contrasenna);

        public void AltaUsuario(Usuario nuevoUsuario);
        public void CambioContrasenna(String id, string contrasenna);
        public void ActualizarAlumno(Alumno alumno);
    }
}
