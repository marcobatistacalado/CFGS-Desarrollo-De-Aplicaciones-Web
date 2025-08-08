using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej2.Modelos
{
    public class Oficina
    {
        private List<Envio> enviosEspera;
        private List<Envio> enviosFacturados;

        public Oficina()
        {
            enviosEspera = new List<Envio>();
            enviosFacturados = new List<Envio>();
        }

        public void EnviosdeEspera(Envio en)
        {
            enviosEspera.Add(en);
        }

        public void Facturación()
        {
            foreach (Envio i in enviosEspera)
            {
                i.Facturar();
                enviosFacturados.Add(i); //hacer copia en el anterior
            }
            enviosEspera.Clear();//limpiar la lista de espera
        }

        public List<Envio> ObtenerEnviosEspera()
        {
            return enviosEspera;
        }

        public List<Envio> ObtenerEnviosFacturados()
        {
            return enviosFacturados;
        }

        // Método para eliminar un envío pendiente de facturar por dirección o código
        public bool EliminarEnvio(string criterio, bool buscarPorCodigo)
        {
            Envio envioAEliminar = null;

            // Buscar por código
            if (buscarPorCodigo)
            {
                foreach (Envio envio in enviosEspera)
                {
                    if (envio.N == int.Parse(criterio)) // Compara el número de envío (secuencial)
                    {
                        envioAEliminar = envio;
                        break;
                    }
                }
            }
            // Buscar por dirección
            else
            {
                foreach (Envio envio in enviosEspera)
                {
                    if (envio.Direccion == criterio) // Compara la dirección del envío
                    {
                        envioAEliminar = envio;
                        break;
                    }
                }
            }

            if (envioAEliminar != null)
            {
                enviosEspera.Remove(envioAEliminar); // Elimina el envío de la lista de espera
                return true; // Retorna true si se encontró y eliminó el envío
            }
            else
            {
                return false; // Retorna false si no se encontró el envío
            }
        }


    }
}
