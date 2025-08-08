namespace ej3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnValidar_Click(object sender, EventArgs e)
        {
            string dni = txtDni.Text.Trim();
            if (ValidarDNI(dni))
            {
                pcCorrecto.Visible = true;
                pcIncorrecto.Visible = false;
            }
            else
            {
                pcCorrecto.Visible = false;
                pcIncorrecto.Visible = true;
            }
        }

        // Método para validar el DNI
        private bool ValidarDNI(string dni)
        {
            if (dni.Length != 9)
                return false;

            string numeroDNI = dni.Substring(0, 8);
            string letraDNI = dni.Substring(8, 1).ToUpper();

            // Validar que los primeros 8 caracteres sean dígitos
            if (!int.TryParse(numeroDNI, out int numero))
                return false;

            // Calcular la letra correcta del DNI
            string letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int indiceLetra = numero % 23;
            string letraCorrecta = letras[indiceLetra].ToString();

            // Comprobar si la letra es la correcta
            return letraDNI == letraCorrecta;
        }
    }
}
