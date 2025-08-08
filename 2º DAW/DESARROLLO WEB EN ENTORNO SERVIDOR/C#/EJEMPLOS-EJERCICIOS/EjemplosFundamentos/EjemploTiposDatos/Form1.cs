namespace EjemploTiposDatos
{
    public partial class FrmPrincipal : Form
    {
        public FrmPrincipal()
        {
            InitializeComponent();
        }

        private void FrmPrincipal_Load(object sender, EventArgs e)
        {
            foreach (Control c in grpDatos.Controls)
            {
                if (c.GetType().Name == "TextBox")
                {
                    c.ForeColor = Color.Red;
                }
            }
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            int edad;
            string nombre;
            string dni;
            char letra;

            edad = Convert.ToInt32(txtEdad.Text);
            nombre = txtNombre.Text;
            dni = txtDni.Text;
            letra = Convert.ToChar(txtDni.Text.Substring(8, 1));


            String mensaje;
            if (edad < 18)
            {
                mensaje = "Eres menor de edad";
            }
            else
            {
                mensaje = "Eres mayor de edad";
            }
            textError.Text = mensaje;

            if (letra < 'A' || letra > 'Z')
            {
                    textError.Text += "   El último carácter no es una letra.";
            }

        }

     
    }
}
