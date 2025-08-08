using ej4.Interfaces;
using ej4.Models;
using ej4.Data;

namespace ej4.Repository
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
