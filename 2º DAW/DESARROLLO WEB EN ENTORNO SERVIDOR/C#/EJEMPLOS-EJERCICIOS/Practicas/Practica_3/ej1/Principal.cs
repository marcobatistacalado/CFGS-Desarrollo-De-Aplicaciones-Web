using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ej1
{
    public partial class Principal : Form
    {
        public Principal()
        {
            InitializeComponent();
        }

        private void tiendaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cerrarFormularioHijoPrevio();

            ProductosTienda productosTienda = new ProductosTienda();
            productosTienda.MdiParent = this; // Indicar que es hijo del formulario actual (MDI)
            productosTienda.Show(); // Mostrar ProductosTienda
        }

        private void almacenToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cerrarFormularioHijoPrevio();

            ProductosAlmacen productosAlmacen = new ProductosAlmacen();
            productosAlmacen.MdiParent = this; // Indicar que es hijo del formulario actual (MDI)
            productosAlmacen.Show(); // Mostrar ProductosAlmacen
        }

        private void agregarQuesoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cerrarFormularioHijoPrevio();

            Form1 agregarQueso = new Form1();
            agregarQueso.MdiParent = this; // Indicar que es hijo del formulario actual (MDI)
            agregarQueso.Show(); // Mostrar Form1 (Agregar Queso)
        }

        private void cerrarFormularioHijoPrevio()
        {
            // Cerrar cualquier formulario hijo abierto previamente
            foreach (Form childForm in this.MdiChildren)
            {
                childForm.Close();
            }
        }
    }
}
