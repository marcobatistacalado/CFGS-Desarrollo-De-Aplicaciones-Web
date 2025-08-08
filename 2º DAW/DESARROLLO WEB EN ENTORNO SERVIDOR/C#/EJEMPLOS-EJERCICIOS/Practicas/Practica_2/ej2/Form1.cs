using ej2.modelos;
using ejemploColecciones.excepciones;
namespace ej2
{
    public partial class Form1 : Form
    {
        private List<Pais> l_Paises = new List<Pais>(8);
        private int pos_Actual;
        public Form1()
        {
            InitializeComponent();
        }

        private void btnMas_Click(object sender, EventArgs e)
        {
            try
            {
                validar_datos();
                l_Paises.Add(new Pais(txtPais.Text, txtSaludo.Text));
                listBPaises.Items.Add(txtPais.Text); //items: colection; add: añadir lo que sea
            }
            catch (ExceptionFueraArray ex)
            {
                // Manejar la excepción personalizada
                MessageBox.Show(ex.Message);
                
            }

        }

        private void listBPaises_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (listBPaises.SelectedIndex == -1) //esto para que no salte cuando no haya ninguno ya que todos se eliminan
            {
                return;
            }
            //version larga
            pos_Actual = buscarPais(listBPaises.Text);

            //version corta
            //int posicion = listBPaises.SelectedIndex; //si la lista grafica es la misma que la de mi array

            if (pos_Actual == -1) 
            {
                MessageBox.Show("No está");
            }
            else
            {
                //Escribir en las cajas los dos atributos del objeto.
                txtPais.Text = l_Paises[pos_Actual].Nombre;
                txtSaludo.Text = l_Paises[pos_Actual].Saludo;
            }
        }

        private void btnMenos_Click(object sender, EventArgs e)
        {
            l_Paises.RemoveAt(pos_Actual);
            listBPaises.Items.RemoveAt(pos_Actual);
            txtPais.Clear();
            txtSaludo.Clear();


        }

        private void btnModificar_Click(object sender, EventArgs e)
        {
            l_Paises[pos_Actual].Saludo = txtSaludo.Text;
            l_Paises[pos_Actual].Nombre = txtPais.Text; //mi lista
            listBPaises.Items[pos_Actual] = txtPais.Text; //lista esa del programa
        }
        private int buscarPais(string nombre)
        {
            //version larga con equals...
            int posicion = l_Paises.IndexOf(new Pais(nombre)); //esto devuelve la posicion
            return posicion;
        }

        private void validar_datos()
        {
            if (txtPais.Text=="" || txtSaludo.Text=="")
                throw new ExceptionFueraArray("Campo dejado en blanco");
            if (buscarPais(txtPais.Text) != -1)
                throw new ExceptionFueraArray("País existente en la lista");
        }
    }
}
