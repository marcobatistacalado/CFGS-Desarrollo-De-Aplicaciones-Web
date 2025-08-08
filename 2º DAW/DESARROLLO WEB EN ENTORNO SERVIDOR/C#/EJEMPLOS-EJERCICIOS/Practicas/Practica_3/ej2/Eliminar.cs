using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using ej2.Exceptions;
using ej2.Modelos;

namespace ej2
{
    public partial class Eliminar : Form
    {
        public Eliminar()
        {
            InitializeComponent();
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            try {
                validarDatos();
                if (comboElegir.SelectedIndex == 1)
                {
                    // Eliminar por dirección
                    bool eliminadoPorDireccion = Program.correos.EliminarEnvio(txtDireccion.Text, false); // Busca y elimina por dirección
                    if (eliminadoPorDireccion)
                    {
                        MessageBox.Show("Eliminado con exito");
                    }
                    else
                    {
                        MessageBox.Show("No ha podido ser eliminado");
                    }
                }
                else if(comboElegir.SelectedIndex == 2)
                {
                    // Eliminar por número de envío
                    bool eliminadoPorCodigo = Program.correos.EliminarEnvio(txtCodBuscar.Text, true); // Busca y elimina por número de envío
                    if (eliminadoPorCodigo)
                    {
                        MessageBox.Show("Eliminado con exito");
                    }
                    else
                    {
                        MessageBox.Show("No ha podido ser eliminado");
                    }
                }
                   
                }catch (Exception ex) {
                MessageBox.Show(ex.Message);
            }
        }

        private void validarDatos()
        {
            if (comboElegir.SelectedIndex == -1)
            {
                throw new ExceptionDatoErroneo("No has seleccionado ninguna opcion");
            }
            if (comboElegir.SelectedIndex == 2)
            {
                if (txtCodBuscar.Text == "")
                {
                    txtCodBuscar.Focus();
                    throw new ExceptionDatoErroneo("No has introducido el codigo");
                }
                if (!int.TryParse(txtCodBuscar.Text, out int codigo))
                {
                    throw new ExceptionDatoErroneo("El codigo no es tipo int");
                }
            }
            if (comboElegir.SelectedIndex == 1)
            {
                if (txtDireccion.Text == "")
                {
                    txtDireccion.Focus();
                    throw new ExceptionDatoErroneo("No has introducido la direccion");
                }
            }
        }

        private void comboElegir_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboElegir.SelectedIndex == 0)
            {
                MessageBox.Show("No has seleccionado ninguna opcion");
                txtCodBuscar.Visible = false;
                lblCodBuscar.Visible = false;
                txtDireccion.Visible = false;
                lblDireccion.Visible = false;
            }
            if (comboElegir.SelectedIndex == 1)
            {
                txtCodBuscar.Visible = false;
                lblCodBuscar.Visible = false;
                txtDireccion.Visible = true;
                lblDireccion.Visible = true;
            }else if (comboElegir.SelectedIndex == 2)
            {
                txtDireccion.Visible = false;
                lblDireccion.Visible = false;
                txtCodBuscar.Visible = true;    
                lblCodBuscar.Visible = true;    
            }
        }
    }
}
