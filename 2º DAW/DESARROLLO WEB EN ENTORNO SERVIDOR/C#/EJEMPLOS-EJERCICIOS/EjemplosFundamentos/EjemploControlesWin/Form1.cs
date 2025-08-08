namespace EjemploControlesWin
{
    public partial class Form1 : Form
    {
        String ingles, frances, aleman;
        public Form1()
        {
            InitializeComponent();
        }

        private void ckbIngles_CheckedChanged(object sender, EventArgs e)
        {
            //guardarme la selección
            if (ckbIngles.Checked)
            {
                ingles = "Inglés";
            }
            else
            {
                ingles = "";
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            ckbIngles.Checked = true; //poner por defecto.
        }
    }
}
