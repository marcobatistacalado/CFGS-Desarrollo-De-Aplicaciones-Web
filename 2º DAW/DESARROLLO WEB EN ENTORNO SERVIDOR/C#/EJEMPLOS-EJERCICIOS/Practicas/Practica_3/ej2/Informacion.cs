using ej2.Modelos;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ej2
{
    public partial class Informacion : Form
    {
        public Informacion()
        {
            InitializeComponent();
        }

        private void Informacion_Load(object sender, EventArgs e)
        {
            // Limpiar el ListBox antes de llenarlo
            listBox1.Items.Clear();
            //listBox1.DisplayMember = "CodP";  -->esto se usa cuando queremos hacer lista grafica pero solo se muestra una de las propiedades pero el objeto esta compleot. Util si no tenemos lista en back.

            // Obtener los envíos en espera y agregarlos al ListBox
            foreach (Envio envio in Program.correos.ObtenerEnviosEspera())
            {
                listBox1.Items.Add(envio.ToString()); // Asegúrate de que la clase Envio tenga un ToString adecuado.
            }

            // Limpiar el ListBox antes de llenarlo
            listBox2.Items.Clear();

            // Obtener los envíos facturados y agregarlos al ListBox
            foreach (Envio envio in Program.correos.ObtenerEnviosFacturados())
            {
                listBox2.Items.Add(envio.ToString()); // Asegúrate de que la clase Envio tenga un ToString adecuado.
            }
        }
    }
}
