namespace ej4_fundamentos_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            try
            {
                DateTime fecha = DateTime.Parse(txtFecha.Text);
                /* TE LO HACE BIEN TE LO MUESTRA EN INGLES
                string diaSemana = fecha.DayOfWeek.ToString(); 
                txtDia.Text = diaSemana;
                */
                int diaSemana = (int)fecha.DayOfWeek;
                switch (diaSemana)
                {
                    case 0:
                        txtDia.Text = "Domingo";
                        break;
                    case 1:
                        txtDia.Text = "Lunes";
                        break;
                    case 2:
                        txtDia.Text = "Martes";
                        break;
                    case 3:
                        txtDia.Text = "Miercoles";
                        break;
                    case 4:
                        txtDia.Text = "Jueves";
                        break;
                    case 5:
                        txtDia.Text = "Viernes";
                        break;
                    case 6:
                        txtDia.Text = "Sabado";
                        break;
                }


            }
            catch (System.FormatException ex)
            {
                MessageBox.Show("Fecha introducida incorrecta el formato es: 'yyyy/mm/dd'", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }
    }
}
