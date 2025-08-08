using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjemploPOO.modelos
{
    public class Erasmus:Alumno
    {
        private string pais;
        //base --> es como el super(pasar los elementos que hereda)
        public Erasmus(string dni, string nombre, string telefono, string pais) : base(dni,nombre,telefono)
        {
            this.Pais = pais;
        }

        public string Pais { get => pais; set => pais = value; }
    }
}
