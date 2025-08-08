using ej5.Models;
using Microsoft.AspNetCore.Mvc;

namespace ej5.Interfaces
{
    public interface IRepositorioAlumnos
    {
        public List<Alumno> GetAlumnos();
        public Alumno GetAlumno(int id);
        public void EditAlum(Alumno a, int id);
        public void DeleteAlumno(int id);

        public void AddAlumno(Alumno a);
    }
}
