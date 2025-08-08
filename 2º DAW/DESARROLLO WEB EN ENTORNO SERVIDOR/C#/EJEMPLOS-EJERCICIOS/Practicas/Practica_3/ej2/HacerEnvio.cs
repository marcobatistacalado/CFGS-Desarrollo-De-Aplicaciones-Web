using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using ej2.Exceptions;
using ej2.Modelos;

namespace ej2
{
    public partial class HacerEnvio : Form
    {
        public HacerEnvio()
        {
            InitializeComponent();
            
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {
            try { 
                validarDatos();
                Envio en = null;
                if (!ckPaquete.Checked)
                {
                    //Alta carta
                    en = new Envio(txtDireccion.Text.Trim(), txtCodP.Text.Trim(), txtPaisD.Text.Trim());
                }
                else
                {
                    //Alta paquete
                    en = new Paquete(txtDireccion.Text.Trim(), txtCodP.Text.Trim(), txtPaisD.Text.Trim(), double.Parse(txtPeso.Text), double.Parse(txtVolumen.Text));
                }

                if (en == null)
                {
                    MessageBox.Show("No se ha podido dar de alta el envio");
                    return;
                }
                else
                {
                    MessageBox.Show("Envio registrado.");
                    borrarCajas(grpEnvio);
                    Program.correos.EnviosdeEspera(en); //pasar envio a la lista
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void validarDatos()
        {
            if (txtDireccion.Text == ""){
                txtDireccion.Focus();
                throw new ExceptionDatoErroneo("No has introduccido dirección");
            }

            if (txtCodP.Text == "")
            {
                txtCodP.Focus();
                throw new ExceptionDatoErroneo("No has introduccido el Codigo Postal");
                //Aqui se puede añadir validacion
                
            }

            if (txtPaisD.Text == "")
            {
                txtPaisD.Focus();
                throw new ExceptionDatoErroneo("No has introduccido el Pais de Destino");
            }

            if (ckPaquete.Checked)
            {
                if (txtVolumen.Text == "")
                {
                    txtPaisD.Focus();
                    throw new ExceptionDatoErroneo("No has introduccido el Volumen");
                }

                if (double.TryParse(txtVolumen.Text, out double volumen))
                {
                    txtPaisD.Focus();
                    throw new ExceptionDatoErroneo("El dato volumen es double.");
                }

                if (txtPeso.Text == "")
                {
                    txtPeso.Focus();
                    throw new ExceptionDatoErroneo("No has introduccido el Peso");
                }

                if (double.TryParse(txtPeso.Text, out double peso))
                {
                    txtPeso.Focus();
                    throw new ExceptionDatoErroneo("El dato peso es double.");
                }

            }

            }

        private void borrarCajas(GroupBox g)
        {
            foreach (Control control in g.Controls)
            {
                if (control is TextBox)
                {
                    control.Text = "";
                }
            }
        }

        private void ckPaquete_CheckedChanged(object sender, EventArgs e)
        {
            txtVolumen.Enabled = true;
            txtPeso.Enabled = true;
        }
    }
}
