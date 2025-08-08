using EjemploCifrado.Models;
using Microsoft.EntityFrameworkCore;

namespace EjemploCifrado.Data
{
    public class DBContexto: DbContext
    {
        public DBContexto(DbContextOptions<DBContexto> options) : base(options) { }

        public DbSet<Usuario> usuarios { get; set; }   
    }
}
