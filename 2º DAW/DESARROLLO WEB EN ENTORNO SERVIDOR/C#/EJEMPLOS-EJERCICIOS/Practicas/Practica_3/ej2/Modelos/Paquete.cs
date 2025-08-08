using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej2.Modelos
{
    public class Paquete : Envio
    {
        private double peso, volumen;

        public Paquete(string direccion, string codP, string paisD, double peso, double volumen) : base(direccion, codP, paisD)
        {
            this.Peso = peso;
            this.Volumen = volumen;
        }

        public double Peso { get => peso; set => peso = value; }
        public double Volumen { get => volumen; set => volumen = value; }

        // Sobrescribir el método Facturar para paquetes
        public override void Facturar()
        {
            // Facturación para paquetes
            Precio = 0.25 * Peso; // Se pagan 0,25 euros por kilo

            // Suplemento por país de destino
            if (PaisD.ToLower() != "españa")
            {
                Precio += 10; // Suplemento por país fuera de España
            }
            else if (!CodP.StartsWith("28"))
            {
                Precio += 6; // Suplemento fuera de Madrid
            }

            // Suplemento por volumen
            if (Volumen > 50)
            {
                Precio += 7; // Más de 50 cm³
            }
            else if (Volumen > 30)
            {
                Precio += 2; // Más de 30 cm³
            }
            // Mostrar información del envío
            Console.WriteLine($"Envío {N}: Paquete a {Direccion}, {PaisD}. Peso: {peso} kg, Volumen: {volumen} cm³. Precio: {Precio} euros.");
        }

        public override string ToString()
        {
            // Llama al ToString de la clase base (Envio) y concatena la información de peso y volumen
            return base.ToString() + $" , Peso: {peso}kg, Volumen: {volumen}cm³";
        }



    }
}
