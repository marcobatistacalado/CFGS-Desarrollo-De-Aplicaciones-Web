using ej2_real.Excepciones; //meter para usar la excepcion
using ej2_real.Modelos; //meter clases
namespace ej2_real
{



    public partial class Form1 : Form
    {
        private List<Pais> listaPaises = new List<Pais>(8);
        public Form1()
        {
            InitializeComponent();
        }

        private void btnNuevo_Click(object sender, EventArgs e)
        {
            try
            {
                comprobarCajasVacias(grpBPais);
                //añadir objeto a listbox
                lstBSeleccionar.Items.Add(new Pais(txtPais.Text, txtSaludo.Text));
                listaPaises.Add(new Pais(txtPais.Text, txtSaludo.Text));
                borrarCajas(grpBPais);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
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

        private void lstBSeleccionar_SelectedIndexChanged(object sender, EventArgs e)
        {
            //metodo corto: que tu array sea igual que a la gráfica
            int pos = lstBSeleccionar.SelectedIndex;
            if (pos == -1)
            {
                MessageBox.Show("No has seleccionado");
            }
            else
            {
                txtPais.Text = listaPaises[pos].Nombre;
                txtSaludo.Text = listaPaises[pos].Saludo;

            }
            //metodo largo: buscar el pais con un constructor por Nombre que sea igual que el nombre de la lista grafica
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            try
            {
                comprobarCajasVacias(grpBuscar);
                List<Pais> paisesBuscados = buscarPais(txtBuscar.Text);
                if (paisesBuscados == null)
                {
                    MessageBox.Show("No se encuentra paises");
                }
                else
                {
                    foreach (Pais p in paisesBuscados)
                    {
                        lstBPaisLetra.Items.Add(p);
                    }
                    
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        private List<Pais> buscarPais(string letra) //error
        {
            List<Pais> paises = new List<Pais>(); //inicializar
            foreach (Pais p in listaPaises)
            {
                if (p.Nombre.Substring(0, 1).ToUpper() == letra.ToUpper())
                {
                    paises.Add(p);
                }
            }
            if (paises.Count == 0)
            {
                return null;
            }
            else
            {
                return paises;
            }
            
        }
    }
}
