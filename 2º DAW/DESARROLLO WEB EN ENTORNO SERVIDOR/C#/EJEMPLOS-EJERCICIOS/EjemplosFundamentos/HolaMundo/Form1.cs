namespace HolaMundo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void lbl1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lbl1.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (lbl1.Visible == true)
            {
                lbl1.Visible = false;
            }
            else
            {
                lbl1.Visible = true;
            }
        }
    }
}
