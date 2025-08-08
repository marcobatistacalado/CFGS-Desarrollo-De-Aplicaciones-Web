using ej1.Modelos;
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
    public partial class ProductosTienda : Form
    {
        public ProductosTienda()
        {
            InitializeComponent();
        }

        private void ProductosTienda_Load(object sender, EventArgs e)
        {
            Program.tienda.mostrarQuesosTienda(listBox1);
        }
    }
}
