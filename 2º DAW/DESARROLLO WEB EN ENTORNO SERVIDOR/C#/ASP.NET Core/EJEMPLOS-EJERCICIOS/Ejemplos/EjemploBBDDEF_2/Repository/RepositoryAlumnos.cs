using EjemploBBDDEF.Data;
using EjemploBBDDEF.Models;

namespace EjemploBBDDEF.Repository
{
    public class RepositoryAlumnos
    {
        private ColegioContext _context;

        public RepositoryAlumnos(ColegioContext context)
        {
            _context = context;
        }

        public List<Alumno> getAlumnosCiclo(string siglas)
        {
            return this._context.alumnos.Where<Alumno>(a => a.CicloAlumno == siglas).ToList();
        }

        public List<Alumno> getAlumnosCicloByCurso(string siglas)
        {
            return this._context.alumnos.Where<Alumno>(a => a.CicloAlumno == siglas).OrderBy(a=>a.CursoAlumno).ToList();
        }
        public async Task<int> addAlumnos(Alumno a)
        {
            this._context.alumnos.Add(a);
            return await this._context.SaveChangesAsync();
        }

        public Alumno findAlumno(string dni)
        {
            return this._context.alumnos.FirstOrDefault<Alumno>(a => a.DNI == dni);
        }
    }
}
