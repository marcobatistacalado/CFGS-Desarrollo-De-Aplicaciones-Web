using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej1.Modelos
{
    public class Persona
    {
        private string nombre, apellidos, dni;
        private int edad;

        public Persona(string nombre, string apellidos, string dni, int edad)
        {
            this.Nombre = nombre;
            this.Apellidos = apellidos;
            this.Dni = dni;
            this.Edad = edad;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellidos { get => apellidos; set => apellidos = value; }
        public string Dni { get => dni; set => dni = value; }
        public int Edad { get => edad; set => edad = value; }
    }
}
