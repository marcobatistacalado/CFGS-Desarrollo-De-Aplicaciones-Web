namespace ej1_fundamentos_1
{
    public partial class formSuma : Form
    {
        public formSuma()
        {
            InitializeComponent();
        }

        private void btnSumar_Click(object sender, EventArgs e)
        {
            int n1, n2, res;
            if (txtNum1.Text == "" || txtNum2.Text == "")
            {
                //ALERTA
                MessageBox.Show("No has introducido uno de los dos números", "Titulo", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            else
            {
                Boolean correcto = true;
                //COMPROBAR QUE ES UN DIGITO
                for (int i = 0; i < txtNum1.Text.Length; i++)
                {
                    if (!char.IsDigit(txtNum1.Text[i]))
                    {
                        correcto = false;
                        MessageBox.Show("El primero número introducido no tiene el formato correcto.", "Titulo", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                        break;
                    }
                }
                if (correcto == true)
                {
                    for (int i = 0; i < txtNum2.Text.Length; i++)
                    {
                        if (!char.IsDigit(txtNum2.Text[i]))
                        {
                            correcto = false;
                            MessageBox.Show("El segundo número introducido no tiene el formato correcto.", "Titulo", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                            break;
                        }
                    }
                    if (correcto == true)
                    {
                        //CONVERSIÓN
                        n1 = Convert.ToInt32(txtNum1.Text);
                        n2 = Convert.ToInt32(txtNum2.Text);
                        res = n1 + n2;
                        txtResultado.Text = Convert.ToString(res);
                    }
                }

                
            }

        }
    }
}
