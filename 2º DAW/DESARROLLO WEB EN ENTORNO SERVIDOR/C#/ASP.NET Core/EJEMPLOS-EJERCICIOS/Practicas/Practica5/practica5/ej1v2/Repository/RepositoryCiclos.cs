using ej1v2.Models;
using EjemploBBDDEF.Data;

namespace ej1v2.Repository
{
    public class RepositoryCiclos
    {
        private ColegioContext _context;

        public RepositoryCiclos(ColegioContext context)
        {
            _context = context;
        }

        public List<Ciclo> GetCiclos()
        {
            return this._context.ciclos.ToList();
        }

        public Ciclo GetCiclo(string siglas)
        {
            return this._context.ciclos.FirstOrDefault<Ciclo>(c => c.Siglas == siglas);
        }
    }
}
