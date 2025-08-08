using ej1.Models;
using EjemploBBDDEF.Data;

namespace ej1.Repository
{
    public class RepositoryCiclos
    {
        private ColegioContext _context;

        public RepositoryCiclos(ColegioContext context)
        {
            _context = context;
        }

        public List<Ciclo> getCiclos()
        {
            return this._context.ciclos.ToList();
        }
    }
}
