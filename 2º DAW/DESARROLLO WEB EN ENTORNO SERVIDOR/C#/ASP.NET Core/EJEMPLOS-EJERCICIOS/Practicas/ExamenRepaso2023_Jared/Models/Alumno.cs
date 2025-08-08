namespace Examen23.Models
{
    public class Alumno:UsuarioModel
    {
        public EnumeradoCiclo Ciclo { get; set; }
        public int Curso { get; set; }
        public List<string> Idiomas { get; set; }
    }

    public enum EnumeradoCiclo
    {
        DAW,
        ASIR,
        Finanzas,
        Marketing
    }

}
