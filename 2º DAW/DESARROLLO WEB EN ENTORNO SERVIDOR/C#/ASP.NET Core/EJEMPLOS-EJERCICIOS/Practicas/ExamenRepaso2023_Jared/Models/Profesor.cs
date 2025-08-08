namespace Examen23.Models
{
    public class Profesor:UsuarioModel
    {
        public EnumeradoEspecialidad Especialidad { get; set; }
    }

    public enum EnumeradoEspecialidad
    {
        Informatica,
        Administración,
        Marketing
    }
}
