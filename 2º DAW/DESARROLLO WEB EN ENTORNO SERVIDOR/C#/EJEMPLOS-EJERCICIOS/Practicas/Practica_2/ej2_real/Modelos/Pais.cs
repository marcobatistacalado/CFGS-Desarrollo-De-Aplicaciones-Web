using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej2_real.Modelos
{
    public class Pais
    {
        private string nombre, saludo;

        public Pais(string nombre, string saludo)
        {
            this.Nombre = nombre;
            this.Saludo = saludo;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Saludo { get => saludo; set => saludo = value; }

        //Sobreescribir el metodo tostring.
        public override string ToString()
        {
            return Nombre;
        }
    }
}
