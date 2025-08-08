using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static System.Windows.Forms.VisualStyles.VisualStyleElement.ToolTip;

namespace ej1.Modelos
{
    public class QuesoArtesano : Queso
    {

        public string DenominacionOrigen { get; set; } // Propiedad específica para quesos artesanos

        public QuesoArtesano(string marca, string fabricante, string nLote, DateTime fCaducidad, double peso, string rutaImagen, string denominacionOrigen)
            : base(marca, fabricante, nLote, fCaducidad, peso, rutaImagen) // Llama al constructor de Queso
        {
            DenominacionOrigen = denominacionOrigen;
            Precio = 15;
        }
        public override string ToString()
        {
            return base.ToString()+ $", Procedencia: {DenominacionOrigen}";
        }
    }

}
