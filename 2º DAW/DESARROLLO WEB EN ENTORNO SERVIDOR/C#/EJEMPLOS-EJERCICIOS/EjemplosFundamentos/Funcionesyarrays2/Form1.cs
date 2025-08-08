namespace Funcionesyarrays2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private int contador = 0;
        private int[] lista = new int[5];
        private void btnAceptar_Click(object sender, EventArgs e)
        {
            if (txtNum.Text != "")
            {
                lista[contador] = Convert.ToInt32(txtNum.Text);
                contador++;
                txtNum.Text = "";
                //txtNum.Clear();  Limpiar
                txtNum.Focus(); //para que se posicione de nuevo
                if (contador == 5)
                {
                    btnAceptar.Enabled = false;
                    btnVer.Enabled = true;

                }

            }
        }

        private void btnVer_Click(object sender, EventArgs e)
        {
            int i = 0;
            //lista = lista.Reverse(); //ya que sale dado la vuelta
            foreach (Control c in grpLista.Controls)
            {
                if (c.GetType().Name == "TextBox")
                {
                    c.Text = Convert.ToString(lista[i]);
                    i++;
                }
            }
        }

        private void btnBorrar_Click(object sender, EventArgs e)
        {
            clean_Cajas(grpLista);
            btnVer.Enabled = false;
            //limpiar el array
            int i = 0;
            for (int x = 0; i<lista.Length; i++)
            {
                lista[i] = 0;
            }

        }
        private void clean_Cajas(GroupBox grp)
        {
            foreach (Control c in grp.Controls)
            {
                if (c.GetType().Name == "TextBox")
                {
                    c.Text = "";
                    //((TextBox).Clear();
                }
            }
        }

        private void btnCuadrado_Click(object sender, EventArgs e)
        {
            int i = 0;

            foreach (Control c in grpLista.Controls)
            {
                if (c.GetType().Name == "TextBox")
                {
                    c.Text = Convert.ToString(Math.Pow(lista[i],2));
                    i++;
                }
            }
        }
    }
}
