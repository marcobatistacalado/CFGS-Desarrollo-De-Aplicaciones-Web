using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ej1.Exceptions;

namespace ej1.Modelos
{
    public class Tienda
    {
        private Queso[] quesosEnTienda; //usamos un array ya que queremos que el limite sea 50.
        private List<Queso> quesosEnAlmacen;
        private int totalQuesosTienda;

        public Tienda()
        {
            this.QuesosEnTienda = new Queso[2];
            this.QuesosEnAlmacen = new List<Queso>();
            this.totalQuesosTienda = 0;
        }

        public Queso[] QuesosEnTienda { get => quesosEnTienda; set => quesosEnTienda = value; }
        public List<Queso> QuesosEnAlmacen { get => quesosEnAlmacen; set => quesosEnAlmacen = value; }

        public void llegadaPartida(Queso q)
        {
            if (totalQuesosTienda == QuesosEnTienda.Length)
            {
                //meter en almacen el queso
                quesosEnAlmacen.Add(q); //añadir queso
                
            }
            else
            {
                //ALTA QUESOS TIENDA
                quesosEnTienda[totalQuesosTienda] = q;
                totalQuesosTienda++;//incrementar quesos tienda;
            }
        }

        public void revisionCaducidad()
        {
            // Revisa los quesos en tienda
            for (int i = 0; i < totalQuesosTienda; i++)
            {
                Queso q = quesosEnTienda[i];
                if (q.FCaducidad < DateTime.Now)
                {
                    MessageBox.Show("Se ha eliminado el queso caducado: " + q.NLote);

                    // Borrado del queso caducado (como en java: eficiente)
                    i = borrarQuesoTienda(i); //pasarle donde nos encontramos el elemento para no recorrerlo desde el principio

                }
            }
            almacenAtienda();
        }
        public int borrarQuesoTienda(int i)
        {
            for (int j = i; j < totalQuesosTienda - 1; j++)
            {
                quesosEnTienda[j] = quesosEnTienda[j + 1]; // Desplazar los elementos
            }
            quesosEnTienda[totalQuesosTienda - 1] = null;
            totalQuesosTienda--;
            return i--; // Decrementar i para no saltarse el siguiente elemento
        }
        public void almacenAtienda()
        {
            // Intentar rellenar espacios vacíos con quesos del almacén
            for (int i = totalQuesosTienda; i < quesosEnTienda.Length && quesosEnAlmacen.Count > 0; i++)
            {
                Queso quesoAlmacen = quesosEnAlmacen[0]; // Tomar el primer queso del almacén
                quesosEnTienda[i] = quesoAlmacen; // Añadir a la tienda
                quesosEnAlmacen.RemoveAt(0); // Quitar de la lista de almacen
                totalQuesosTienda++; // Incrementar el total de quesos en tienda
            }
        }

        public void venta(string tipoQueso)
        {
            for (int i = 0; i<totalQuesosTienda; i++)
            {
                if (quesosEnTienda[i] is QuesoArtesano && quesosEnTienda[i].Equals(tipoQueso))
                {
                    i = borrarQuesoTienda(i);
                }
                else if (quesosEnTienda[i] is QuesoImportacion && quesosEnTienda[i].Equals(tipoQueso))
                {
                    i = borrarQuesoTienda(i);
                }
                else if (quesosEnTienda[i] is Queso && quesosEnTienda[i].Equals(tipoQueso))
                {
                    i = borrarQuesoTienda(i);
                }

            }

        }

        public void RealizarOferta()
        {
            for (int i = 0; i < totalQuesosTienda; i++)
            {
                if (quesosEnTienda[i] is QuesoArtesano artesano)
                {
                    artesano.precio -= 3; 
                    if (artesano.precio < 0) 
                    {
                        artesano.precio = 0;
                    }
                }
                else if (quesosEnTienda[i] is QuesoImportacion importacion)
                {
                    importacion.precio -= 2; 
                    if (importacion.precio < 0) 
                    {
                        importacion.precio = 0;
                    }
                }
            }
        }

        public void mostrarQuesosTienda(ListBox listBoxTienda)
        {
            listBoxTienda.Items.Clear();
            // Mostrar quesos en la tienda
            for (int i = 0; i < totalQuesosTienda; i++)
            {
                if (quesosEnTienda[i] != null) 
                {
                    listBoxTienda.Items.Add(quesosEnTienda[i].ToString());
                }
            }
        }

        public void mostrarQuesosAlmacen(ListBox listBoxAlmacen)
        {
            listBoxAlmacen.Items.Clear();
            // Mostrar quesos en el almacén
            foreach (Queso queso in quesosEnAlmacen)
            {
                listBoxAlmacen.Items.Add(queso.ToString());
            }
        }





    }
}
