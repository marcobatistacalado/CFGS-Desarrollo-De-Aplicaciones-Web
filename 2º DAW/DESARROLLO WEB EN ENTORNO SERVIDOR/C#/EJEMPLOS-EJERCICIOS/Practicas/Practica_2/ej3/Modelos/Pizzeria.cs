using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej3.Modelos
{
    public class Pizzeria
    {
        List<Mesa> l_mesas;
        public Pizzeria()
        {
            L_mesas = new List<Mesa>();
        }

        public List<Mesa> L_mesas { get => l_mesas; set => l_mesas = value; }

        public void addMesa(Mesa mesa)
        {
            this.l_mesas.Add(mesa);
        }

        public Mesa getMesa(int posicion)
        {
            return this.L_mesas[posicion];
        }
    }
}
