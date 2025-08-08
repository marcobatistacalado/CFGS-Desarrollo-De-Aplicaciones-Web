using EjemploBBDDEF.Data;
using ej1v2.Models;

namespace ej1v2.Repository
{
    public class RepositoryAlumnos
    {
        private ColegioContext _context;

        public RepositoryAlumnos(ColegioContext context)
        {
            _context = context;
        }

        public List<Alumno> GetAlumnos()
        {
            return this._context.alumnos.ToList();
        }

        public List<Alumno> GetAlumnosCiclo(string siglas)
        {
            return this._context.alumnos.Where(x=>x.CicloAlumno==siglas).ToList();
        }
    }
}
