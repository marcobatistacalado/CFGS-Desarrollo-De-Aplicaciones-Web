using ej4.Models;
using Microsoft.EntityFrameworkCore;

namespace ej4.Data
{
    public class VideoclubContext : DbContext
    {

        public VideoclubContext(DbContextOptions<VideoclubContext> options) : base(options) { }
        public DbSet<Genero> generos { get; set; }

        public DbSet<InfoPelicula> infopeliculas { get; set; }

        public DbSet<Pelicula> peliculas { get; set; }
    }
}
