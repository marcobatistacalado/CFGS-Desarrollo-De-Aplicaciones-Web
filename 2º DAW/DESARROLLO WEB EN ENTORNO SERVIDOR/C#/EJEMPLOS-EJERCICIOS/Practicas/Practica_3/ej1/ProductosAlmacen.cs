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
    public partial class ProductosAlmacen : Form
    {
        public ProductosAlmacen()
        {
            InitializeComponent();
        }

        private void ProductosAlmacen_Load(object sender, EventArgs e)
        {
            Program.tienda.mostrarQuesosAlmacen(listBox1);
        }
    }
}
