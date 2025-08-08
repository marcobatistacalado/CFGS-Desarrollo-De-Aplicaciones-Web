using static ExamenRepaso_2.Models.Enumerados;

namespace ExamenRepaso_2.Models
{
    public class Alumno : Usuario
    {
        public EnumeradoCiclo Ciclo { get; set; }
        public int Curso { get; set; } // 1 o 2
        public List<string> Idiomas { get; set; }
    }
}
