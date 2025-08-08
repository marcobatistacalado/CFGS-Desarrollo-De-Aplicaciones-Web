using EjemploBBDDEF.Data;
using EjemploBBDDEF.Models;

namespace EjemploBBDDEF.Repository
{
    public class RepositoryCiclo
    {
        private ColegioContext context;

        public RepositoryCiclo(ColegioContext context)
        {
            this.context = context;
        }

        public List<Ciclo> GetCiclos()
        {
            //var sql = from datos in this.context.ciclos
            //          select datos;
            // return sql.ToList();
            
            var x = this.context.ciclos.ToList();
            return x;
     

            //var c=this.context.ciclos.Where<Ciclo>(c => c.Siglas == "DAW");

        }
    }
}
