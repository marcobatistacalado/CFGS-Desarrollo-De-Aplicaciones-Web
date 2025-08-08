using ej5.Interfaces;
using ej5.Models;

namespace ej5.Services
{
    
    public class RepositorioAlumnos : IRepositorioAlumnos

    {
        private readonly List<Alumno> alumnos;
        public RepositorioAlumnos()
        {

            var alumno1 = new Alumno
            {
                Dni = "12345678J",
                Nombre = "Jerome",
                Apellidos = "Gamboa Cuison",
                Telefono = "612345678",
                Curso = "2ºDAW",
                Edad = 22
            };

            var alumno2 = new Alumno
            {
                Dni = "23456789K",
                Nombre = "Laura",
                Apellidos = "Martínez Pérez",
                Telefono = "623456789",
                Curso = "1ºDAW",
                Edad = 20
            };

            var alumno3 = new Alumno
            {
                Dni = "34567890L",
                Nombre = "Carlos",
                Apellidos = "Rodríguez Fernández",
                Telefono = "634567890",
                Curso = "3ºDAW",
                Edad = 23
            };

            alumnos = new List<Alumno> { alumno1, alumno2, alumno3 };

        }
        public List<Alumno> GetAlumnos()
        {
            return alumnos;
        }

        public Alumno GetAlumno(int id)
        {
            return alumnos[id];
        }

        public void EditAlum(Alumno a, int id)
        {
            alumnos[id] = a;
        }

        public void DeleteAlumno(int id)
        {
            alumnos.RemoveAt(id-1);
        }

        public void AddAlumno(Alumno a)
        {
            alumnos.Add(a);
        }

    }

   
}
