using System.Windows.Forms;
using ej1.Exceptions;
using ej1.Modelos;
namespace ej1
{
    public partial class Form1 : Form
    {

        public string rutaImagen;
        public Form1()
        {
            InitializeComponent();
            this.rutaImagen = "";
        }
        //VALIDAR QUE NO ME PUEDAN INTRODUCIR ALGUN DATO QUE NO QUIERO DEPENDIENDO DEL TIPO DE QUESO
        private void rbNormal_CheckedChanged(object sender, EventArgs e)
        {
            txtOrigen.Enabled = false;
            txtProcedencia.Enabled = false;
        }
        private void rbArtesano_CheckedChanged(object sender, EventArgs e)
        {
            txtOrigen.Enabled = false;
            txtProcedencia.Enabled = true;
        }

        private void rbImportacion_CheckedChanged(object sender, EventArgs e)
        {
            txtProcedencia.Enabled = false;
            txtOrigen.Enabled = true;
        }

        //BOTON ACEPTAR
        private void btnAceptar_Click(object sender, EventArgs e)
        {
            RadioButton tipo = validarSeleccionRadio();
            if (tipo == null)
            {
                MessageBox.Show("Por favor, selecciona un tipo.");
                return;
            }

            try
            {
                validarDatos(); //validar datos y salta una excepcion 
                Queso nuevoQueso = null;
                if (tipo.Text == "Normal")
                {   //importante obtener el value de DateTimePicker
                    nuevoQueso = new Queso(txtMarca.Text.Trim(), txtFabricante.Text.Trim(), txtLote.Text.Trim(), dateCaducidad.Value, double.Parse(txtPeso.Text), rutaImagen);
                }
                else if (tipo.Text == "Artesano")
                {
                    if (txtProcedencia.Text == "")
                    {
                        MessageBox.Show("Introduce la procedencia por favor.");
                        txtProcedencia.Focus();
                    }
                    else
                    {
                        nuevoQueso = new QuesoArtesano(txtMarca.Text.Trim(), txtFabricante.Text.Trim(), txtLote.Text.Trim(), dateCaducidad.Value, double.Parse(txtPeso.Text), txtProcedencia.Text.Trim(), rutaImagen);
                        MessageBox.Show(nuevoQueso.GetType().Name);
                    }

                }
                else if (tipo.Text == "Importación")
                {
                    if (txtOrigen.Text == "")
                    {
                        MessageBox.Show("Introduce el origen por favor.");
                        txtOrigen.Focus();
                    }
                    else
                    {
                        nuevoQueso = new QuesoImportacion(txtMarca.Text.Trim(), txtFabricante.Text.Trim(), txtLote.Text.Trim(), dateCaducidad.Value, double.Parse(txtPeso.Text), txtOrigen.Text.Trim(), rutaImagen);
                    }
                }

                //Comprobar que el queso se ha creado
                if (nuevoQueso != null)
                {
                    Program.tienda.llegadaPartida(nuevoQueso);
                    MessageBox.Show("El queso ha sido registrado correctamente.");
                    borrarCajas(grpDatos);
                }

                Program.tienda.revisionCaducidad();
            }
            catch (Exception ex)
            {
                {
                    MessageBox.Show(ex.Message.ToString());
                }

            }
        }



        private void validarDatos()
        {
            try
            {
                comprobarCajasVacias(grpDatos);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message.ToString());
            }

            DateTime fechaMinima = DateTime.Now; //fecha local, esto en grafico se puede hacer en el metodo load form cambiando el min del control o en el constructor de esta clase.
            DateTime fechaMaxima = dateCaducidad.MaxDate; // Fecha máxima permitida

            // Si el valor seleccionado es igual a la fecha mínima o máxima, se puede considerar que no se ha seleccionado
            if (dateCaducidad.Value.Date <= fechaMinima.Date || dateCaducidad.Value.Date >= fechaMaxima.Date) //ESTO NO SALTA!!!!!!!!!!!!!!
            {
                throw new ExceptionValidacionDatos("Has introducido una fecha anterior/posterior a la permitida");
            }

            if (!int.TryParse(txtPeso.Text, out int peso))
            {
                throw new ExceptionValidacionDatos("El peso debe ser un número entero válido.");
            }

            if (!int.TryParse(txtLote.Text, out int lote))
            {
                throw new ExceptionValidacionDatos("El numero de lote debe ser un número entero válido.");
            }

            if (rutaImagen == "")
            {
                throw new ExceptionValidacionDatos("No has seleccionado una imagen.");
            }
        }

        private void comprobarCajasVacias(GroupBox g)
        {
            // Recorrer todos los controles del GroupBox
            foreach (Control control in g.Controls)
            {
                // Verificar si el control es un TextBox
                if (control is TextBox)
                {
                    if (control.Text == "")
                    {
                        throw new ExceptionCajasVacias("Hay algun campo vacío");
                    }

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

        private RadioButton validarSeleccionRadio()
        {
            foreach (Control c in grpTipo.Controls)
            {
                if (c is RadioButton radioButton)
                {
                    if (radioButton.Checked)
                    {
                        return radioButton; // Retorna verdadero si algún RadioButton está seleccionado.
                    }
                }
            }
            dateCaducidad.MinDate = DateTime.Today;
            return null; // Retorna null si ningún RadioButton está seleccionado.
        }

        private void btnImagen_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.Filter = "Archivos de imagen|*.jpg;*.jpeg;*.png;*.bmp"; // Filtrar tipos de archivo

            if (openFileDialog.ShowDialog() == DialogResult.OK)
            {
                rutaImagen = openFileDialog.FileName;
                // Mostrar la imagen seleccionada en un PictureBox (opcional)
                pcImagen.Image = Image.FromFile(rutaImagen); //NO FUNCIONA
            }
        }
    }
}
