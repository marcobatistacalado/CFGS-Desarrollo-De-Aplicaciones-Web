using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej1.Modelos
{
    public class QuesoImportacion : Queso
    {
        public string PaisOrigen { get; set; } // Propiedad específica para quesos de importación

        public QuesoImportacion(string marca, string fabricante, string nLote, DateTime fCaducidad, double peso, string rutaImagen, string paisOrigen)
            : base(marca, fabricante, nLote, fCaducidad, peso, rutaImagen) // Llama al constructor de Queso
        {
            PaisOrigen = paisOrigen;
            Precio = 9;
        }

        public override string ToString()
        {
            return base.ToString() + $", Origen: {PaisOrigen}";
        }
    }

}
