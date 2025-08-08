namespace ej5_fundamentos_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnIncrementar_Click(object sender, EventArgs e)
        {
            if (txtFechaActual.Text == "" || txtIncremento.Text == "")
            {
                MessageBox.Show("No has introducido ninguna fecha", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            try
            {
                DateTime fecha = DateTime.Parse(txtFechaActual.Text);
                int incr = int.Parse(txtIncremento.Text);

                if (rbDias.Checked)
                {
                    fecha = fecha.AddDays(incr);
                }
                if (rbMeses.Checked)
                {
                    fecha = fecha.AddMonths(incr);
                }
                if (rbAnos.Checked)
                {
                    fecha = fecha.AddYears(incr);
                }

                txtFechaActual.Text = fecha.ToString();


            }
            catch (System.FormatException ex)
            {
                MessageBox.Show("Fecha introducida incorrecta el formato es: 'yyyy/mm/dd' o incremento erróneo", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            
            }
        }
    }
}
