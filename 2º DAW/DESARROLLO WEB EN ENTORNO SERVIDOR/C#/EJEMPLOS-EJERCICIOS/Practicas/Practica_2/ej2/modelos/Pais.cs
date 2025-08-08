using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej2.modelos
{
    internal class Pais
    {
        private string nombre, saludo;

        public Pais(string nombre, string saludo)
        {
            this.nombre = nombre;
            this.saludo = saludo;
        }

        public Pais(string nombre)
        {
            this.nombre = nombre;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Saludo { get => saludo; set => saludo = value; }

        //geerar equals(object)--acciones rapidas click derecho en internal class Pais
        public override bool Equals(object? obj)
        {
            return obj is Pais pais &&
                   nombre == pais.nombre;
        }
    }
}
