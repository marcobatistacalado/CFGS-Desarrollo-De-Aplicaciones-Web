namespace ej2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        int partidos = 5;
        private void btnCalcular_Click(object sender, EventArgs e)
        {
            try
            {
                //ganado(3), empatado(1), perdido(0)
                int ganado = int.Parse(txtGanado.Text);
                int empatado = int.Parse(txtEmpatado.Text);
                if(ganado+empatado > partidos)
                {
                    MessageBox.Show("Solo habéis jugado 5 pártidos, algún dato es erróneo'", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                }
                int puntuacion = (ganado*3) + empatado;
                txtPuntuacion.Text = puntuacion.ToString();


            }
            catch (FormatException ex)
            {
                MessageBox.Show("Formato de algún dato incorrecto", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }
    }
}
