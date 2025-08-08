using static ExamenRepaso2023.Modelos.Enumerados;

namespace ExamenRepaso2023.Modelos
{
    public class Alumno : Usuario
    {
        public EnumeradoCiclo Ciclo { get; set; }  // Ciclo que estudia el alumno
        public int Curso { get; set; }            // Curso: 1 o 2
        public List<string> Idiomas { get; set; } // Lista de idiomas que conoce
    }

}
