using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej2.Modelos
{ 
    public class Envio
    {
        private static int n = 1;
        private int numE;
        private double precio;
        private string direccion, codP, paisD;

        public Envio(string direccion, string codP, string paisD)
        {
            this.numE = n;
            n++; //secuencial
            this.direccion = direccion;
            this.CodP = codP;
            this.PaisD = paisD;
        }

        public int N { get => n; set => n = value; }
        public double Precio { get => precio; set => precio = value; }
        public string Direccion { get => direccion; set => direccion = value; }
        public string CodP { get => codP; set => codP = value; }
        public string PaisD { get => paisD; set => paisD = value; }

        
        // Método para facturar una carta
        public virtual void Facturar()
        {
            if (PaisD.ToLower() != "españa")
            {
                // País de destino no es España
                Precio = 5;
            }
            else
            {
                // Si es dentro de España, revisar el código postal
                if (CodP.StartsWith("28"))
                {
                    Precio = 1; // Madrid
                }
                else
                {
                    Precio = 3; // Resto de España
                }
            }
            // Mostrar información del envío
            MessageBox.Show($"Envío {N}: Carta a {Direccion}, {PaisD}. Precio: {Precio} euros.");
        }
        public override string ToString()
        {
            return $"Envio N°: {numE}\n" +
                   $"Dirección: {Direccion}\n" +
                   $"Código Postal: {CodP}\n" +
                   $"País de Destino: {PaisD}\n" +
                   $"Precio: {Precio:C}";
        }

    }
}
