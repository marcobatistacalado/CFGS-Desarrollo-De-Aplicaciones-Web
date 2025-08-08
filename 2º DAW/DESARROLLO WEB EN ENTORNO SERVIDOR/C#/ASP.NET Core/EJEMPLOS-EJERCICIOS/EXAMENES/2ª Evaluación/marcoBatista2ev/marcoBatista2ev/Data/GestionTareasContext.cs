using marcoBatista2ev.Models;
using Microsoft.EntityFrameworkCore;

namespace marcoBatista2ev.Data
{
    public class GestionTareasContext : DbContext
    {

        public GestionTareasContext(DbContextOptions<GestionTareasContext> options) : base(options) { }
        public DbSet<Usuario> Usuarios { get; set; }

        public DbSet<Tarea> Tareas { get; set; }
    }
}
