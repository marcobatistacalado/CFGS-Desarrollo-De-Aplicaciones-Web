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
            // var sql = from datos in this.context.ciclos
            //select datos;
            //var c=this.context.ciclos.Where<Ciclo>(c => c.Siglas == "DAW");
            var x = this.context.ciclos.ToList();
            return x;


            // return sql.ToList();
        }

        public List<Ciclo> GetCiclosByEspecialidad()
            {
             return this.context.ciclos.OrderBy(c => c.Especialidad).ToList();
               

        }

        public Ciclo FindCiclo(string siglas)
        {
            return this.context.ciclos.FirstOrDefault<Ciclo>(c => c.Siglas == siglas);

        }

        public Ciclo FindCiclo(int id)
        {
            //var sql = from datos in this.context.ciclos
            //          where datos.IdCiclo == id
            //          select datos;
            //return sql.FirstOrDefault<Ciclo>();
            return this.context.ciclos.FirstOrDefault<Ciclo>(c => c.IdCiclo == id);    

        }

        public async Task AddCiclo(Ciclo c)
        {
            this.context.ciclos.Add(c);
            await this.context.SaveChangesAsync();

        }


        public async Task DeleteCiclo(int id)
        {
            var c = this.context.ciclos.FirstOrDefault<Ciclo>(c => c.IdCiclo == id);
            this.context.ciclos.Remove(c);
            await this.context.SaveChangesAsync();
        }
    }
}
