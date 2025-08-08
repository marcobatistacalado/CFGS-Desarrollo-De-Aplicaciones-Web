using Practica6.Models;
using Microsoft.EntityFrameworkCore;

namespace Practica6.Data
{
    public class BolsaTrabajoContext : DbContext
    {

        public BolsaTrabajoContext(DbContextOptions<BolsaTrabajoContext> options) : base(options) { }
        public DbSet<User> Users { get; set; }

        public DbSet<JobOffer> JobOffers { get; set; }

        public DbSet<Category> Categories { get; set; }
        public DbSet<Application> Applications { get; set; }
    }
}
