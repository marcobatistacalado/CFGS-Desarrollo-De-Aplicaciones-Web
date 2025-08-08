using ej1v2.Models;
using EjemploBBDDEF.Data;

namespace ej1v2.Repository
{
    public class RepositoryCursos
    {
        private ColegioContext _context;

        public RepositoryCursos(ColegioContext context)
        {
            _context = context;
        }

        public List<Curso> GetCursosCiclo(string siglas)
        {
            return this._context.cursos.Where(x => x.CicloCurso == siglas).ToList();
        }
    }
}
