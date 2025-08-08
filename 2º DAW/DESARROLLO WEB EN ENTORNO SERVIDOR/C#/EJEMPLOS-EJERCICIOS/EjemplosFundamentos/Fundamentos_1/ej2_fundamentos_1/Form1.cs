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
                lblResultado.BackColor = Color.FromArgb(rojo, verde, azul);
            }
        }
    }
}
