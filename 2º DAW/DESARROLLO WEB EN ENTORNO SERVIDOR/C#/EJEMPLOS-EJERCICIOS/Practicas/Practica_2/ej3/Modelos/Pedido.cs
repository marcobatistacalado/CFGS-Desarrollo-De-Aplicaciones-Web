using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej3.Modelos
{
    public class Pedido
    {
        private string tipoMasa, ensalada=null, refresco;
        private string [] ingredientes = new string[4];

        public Pedido(string tipoMasa, string ensalada, string refresco, string[] ingredientes)
        {
            this.TipoMasa = tipoMasa;
            this.Ensalada = ensalada;
            this.refresco = refresco;
            this.Ingredientes = ingredientes;
        }

        
       
        public string[] Ingredientes { get => ingredientes; set => ingredientes = value; }
        public string Ensalada { get => ensalada; set => ensalada = value; }
        public string TipoMasa { get => tipoMasa;set => tipoMasa = value; }

        public string Refresco { get => refresco; set => refresco = value; }

    }
}
