using EjemploBBDDEF.Models;
using Microsoft.EntityFrameworkCore;

namespace EjemploBBDDEF.Data
{
    public class ColegioContext: DbContext
    {

        public ColegioContext(DbContextOptions<ColegioContext> options) : base(options) { }
        public DbSet<Ciclo> ciclos { get; set; }

        public DbSet<Alumno> alumnos { get; set; }

        public DbSet<Curso> cursos { get; set; }
    }
}
