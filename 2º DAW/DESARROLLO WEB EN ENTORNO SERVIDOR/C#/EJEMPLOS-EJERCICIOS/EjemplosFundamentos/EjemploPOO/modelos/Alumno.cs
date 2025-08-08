using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjemploPOO.modelos
{

    public class Alumno
    {
        private string dni, nombre, telefono;

        //ENCAPSULAR: click derecho, acciones rapidas y refact., encapsular...
        public string Dni { get => dni; set => dni = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Telefono { get => telefono; set => telefono = value; }
        
        //Constructor: realizar mejor nosotros
        public Alumno(string dni, string nombre, string telefono)
        {
            this.dni = dni;
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }
}
