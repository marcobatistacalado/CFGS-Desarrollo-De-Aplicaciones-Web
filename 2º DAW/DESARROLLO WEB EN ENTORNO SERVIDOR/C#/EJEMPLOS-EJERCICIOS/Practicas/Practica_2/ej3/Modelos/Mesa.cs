using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej3.Modelos
{
    public class Mesa
    {
        private int numMesa;
        private Pedido p;

        public Mesa(int numMesa, Pedido pedido)
        {
            this.NumMesa = numMesa;
            this.p = pedido;
        }

        public int NumMesa { get => numMesa; set => numMesa = value; }
        public Pedido P { get => p; set => p = value; }
    }
}
