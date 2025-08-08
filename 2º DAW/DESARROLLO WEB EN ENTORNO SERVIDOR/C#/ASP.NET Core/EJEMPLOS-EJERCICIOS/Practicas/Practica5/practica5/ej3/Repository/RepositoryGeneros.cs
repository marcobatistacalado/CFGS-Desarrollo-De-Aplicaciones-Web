using ej3.Interfaces;
using ej3.Models;
using ej3.Data;

namespace ej3.Repository
{
    public class RepositoryGeneros : IRepositoryGeneros
    {
            private VideoclubContext _context;

            public RepositoryGeneros(VideoclubContext context)
            {
                _context = context;
            }

            public List<Genero> GetGeneros()
            {
                return this._context.generos.ToList();
            }
       
    }
}
