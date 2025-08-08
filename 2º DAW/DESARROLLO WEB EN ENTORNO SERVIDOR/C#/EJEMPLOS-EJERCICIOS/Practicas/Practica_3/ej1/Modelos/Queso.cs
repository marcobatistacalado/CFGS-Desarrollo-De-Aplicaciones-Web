using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej1.Modelos
{
    public class Queso
    {
        private string marca, fabricante, nLote;
        private DateTime fCaducidad;
        private double peso;
        public double precio;
        protected string rutaImagen;

        public Queso(string marca, string fabricante, string nLote, DateTime fCaducidad, double peso, string rutaImagen)
        {
            this.marca = marca;
            this.fabricante = fabricante;
            this.nLote = nLote;
            this.fCaducidad = fCaducidad;
            this.peso = peso;
            this.Precio = 6; //lo modificaré en los hijos
        }

        public DateTime FCaducidad { get => fCaducidad; set => fCaducidad = value; }
        public string Marca { get => marca; set => marca = value; }
        public string Fabricante { get => fabricante; set => fabricante = value; }
        public string NLote { get => nLote; set => nLote = value; }
        public double Peso { get => peso; set => peso = value; }
        protected double Precio { get => precio; set => precio = value; }

        public override string ToString()
        {
            return $"{this.GetType().Name},Marca: {marca}, Fabricante: {fabricante}, NLote: {nLote}, Caducidad: {fCaducidad.ToShortDateString()}, Peso: {peso} kg, Precio: {precio} € ";
        }
    }
}
