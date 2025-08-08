using Practica6.Data;
using Practica6.Interfaces;
using Practica6.Models;

namespace Practica6.Repositories
{
    public class RepositoryCategorias : IRepositoryCategorias
    {
        private BolsaTrabajoContext _context;

        public RepositoryCategorias(BolsaTrabajoContext context)
        {
            _context = context;
        }

        public List<Category> GetCategories()
        {
            return this._context.Categories.ToList();
        }

        

    }
}
