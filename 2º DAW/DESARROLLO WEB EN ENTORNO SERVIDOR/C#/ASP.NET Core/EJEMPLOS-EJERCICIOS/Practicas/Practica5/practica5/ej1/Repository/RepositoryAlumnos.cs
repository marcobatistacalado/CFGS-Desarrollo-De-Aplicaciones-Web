using EjemploBBDDEF.Data;
using ej1.Models;

namespace ej1.Repository
{
    public class RepositoryAlumnos
    {
        private ColegioContext _context;

        public RepositoryAlumnos(ColegioContext context)
        {
            _context = context;
        }

        public List<Alumno> getAlumnos()
        {
            return this._context.alumnos.ToList();
        }
    }
}
