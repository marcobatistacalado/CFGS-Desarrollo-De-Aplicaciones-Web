using static System.Runtime.InteropServices.JavaScript.JSType;

namespace ej2_fundamentos_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnPos_Click(object sender, EventArgs e)
        {
            if (txtX.Text == "" || txtY.Text == "") //comprobar que no está vacio
            {
                //ALERTA
                MessageBox.Show("No has introducido una de las posiciónes", "Error: Posición", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            else
            {
                int x, y;
                x = Convert.ToInt32(txtX.Text);
                y = Convert.ToInt32(txtY.Text);
                lblResultado.Location = new Point(x, y);
            }

        }

        private void btnColor_Click(object sender, EventArgs e)
        {
            if (txtRojo.Text == "" || txtAzul.Text == "" || txtVerde.Text == "")
            {  //comprobar que no está vacio
                MessageBox.Show("No has introducido uno de los colores", "Error: Color", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            else
            {
                
                //habría que comprobar que son digitos pero me da pereza.
                int rojo = Convert.ToInt32(txtRojo.Text);
                int verde = Convert.ToInt32(txtVerde.Text); ;
                int azul = Convert.ToInt32(txtAzul.Text);
                int cont = 0;
                if (rojo < 0 || rojo > 255) {
                    MessageBox.Show("Color rojo fuera de rango", "Error: Color", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    cont++;
                }
                if (verde < 0 || verde > 255)
                {
                    MessageBox.Show("Color verde fuera de rango", "Error: Color", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    cont++;
                }
                if (azul < 0 || azul > 255)
                {
                    MessageBox.Show("Color azul fuera de rango", "Error: Color", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    cont++;
                }
                if (cont == 0)
                {
                    lblResultado.BackColor = Color.FromArgb(rojo, verde, azul);
                }
               
            }
        }
       
        
    }
}
