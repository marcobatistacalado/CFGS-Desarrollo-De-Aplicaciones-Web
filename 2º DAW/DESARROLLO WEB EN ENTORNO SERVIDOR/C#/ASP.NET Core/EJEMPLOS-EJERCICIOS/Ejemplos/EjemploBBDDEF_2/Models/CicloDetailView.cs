namespace EjemploBBDDEF.Models
{
    public class CicloDetailView
    {
        public Ciclo ciclo { get; set; }
        public List<Curso> Cursos { get; set; }

        public List<Alumno> Alumnos { get; set; }
    }
}
