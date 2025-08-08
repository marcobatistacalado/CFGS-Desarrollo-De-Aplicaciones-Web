namespace ej1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            if (txtHoras.Text == "" || txtSalarioHora.Text == "")
            {
                MessageBox.Show("No has introducido las horas o el salario por horas", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }

            try
            {
                double horas = double.Parse(txtHoras.Text);
                double salarioHora = double.Parse(txtSalarioHora.Text);
                double salarioMensual = horas * salarioHora;
                txtSalarioMensual.Text = salarioMensual.ToString();

            }catch(FormatException ex)
            {
                MessageBox.Show("Alguno de los datos introducidos tiene un formato incorrecto", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }
    }
}
