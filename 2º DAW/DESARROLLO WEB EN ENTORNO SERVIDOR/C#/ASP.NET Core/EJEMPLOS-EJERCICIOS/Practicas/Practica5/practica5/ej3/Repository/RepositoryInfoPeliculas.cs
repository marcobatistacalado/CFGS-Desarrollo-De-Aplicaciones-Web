using ej3.Interfaces;
using ej3.Models;
using ej3.Data;

namespace ej3.Repository
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
