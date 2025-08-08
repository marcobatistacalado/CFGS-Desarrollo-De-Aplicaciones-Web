using ExamenRepaso2023.Modelos;

namespace ExamenRepaso2023.Interfaces
{
    public interface IRepositorioUsuarios
    {
        public List<Alumno> getAlumnos(); /*retorna una lista con los usuarios que son Alumnos*/
        public Usuario isUsuario(String email); /*retorna el usuario cuyo email pasamos por
        parámetro*/
        public Usuario isUsuario(String usuario, String contrasenna); /*retorna el usuario cuyos
        nick y contraseña coinciden con los recibidos*/
        public Boolean isRepetido(string usuario, string contrasenna); /*nos dice si ese
        usuario y/o contraseña ya existen en nuestra lista*/

        public void AgregarAlumno(Alumno alumno);
    }
}
