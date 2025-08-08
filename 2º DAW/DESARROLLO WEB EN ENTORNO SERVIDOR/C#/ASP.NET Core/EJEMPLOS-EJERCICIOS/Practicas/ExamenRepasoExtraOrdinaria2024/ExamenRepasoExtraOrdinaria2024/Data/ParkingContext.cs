using ExamenRepasoExtraOrdinaria2024.Models;
using Microsoft.EntityFrameworkCore;
using static System.Net.Mime.MediaTypeNames;

namespace ExamenRepasoExtraOrdinaria2024.Data
{
    public class ParkingContext : DbContext
    {

        public ParkingContext(DbContextOptions<ParkingContext> options) : base(options) { }
        public DbSet<Socio> Socios { get; set; }

        public DbSet<Plaza> Plazas { get; set; }
    }
}
