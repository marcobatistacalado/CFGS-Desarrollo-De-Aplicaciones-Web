using ej4.Interfaces;
using ej4.Models;
using ej4.Data;

namespace ej4.Repository
{
    public class RepositoryInfoPeliculas : IRepositoryInfoPeliculas
    {
        private VideoclubContext _context;

        public RepositoryInfoPeliculas(VideoclubContext context)
        {
            _context = context;
        }

        public async Task AddInfoPelicula(InfoPelicula info)
        {
            this._context.infopeliculas.Add(info);
            await this._context.SaveChangesAsync();

        }
    }
}
