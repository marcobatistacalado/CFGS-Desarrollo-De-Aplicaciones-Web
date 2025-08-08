using ej2.Modelos;

namespace ej2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void envíoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cerrarFormulariosAbiertos();

            HacerEnvio hacerEnvio = new HacerEnvio();
            hacerEnvio.MdiParent = this; // Indicar que es hijo del formulario actual (MDI)
            hacerEnvio.Show(); // Mostrar ProductosAlmacen

        }

        private void facturarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cerrarFormulariosAbiertos();
            Program.correos.Facturación();

        }
        private void infoToolStripMenuItem_Click(object sender, EventArgs e)
        {

            cerrarFormulariosAbiertos();
            Informacion info = new Informacion();
            info.MdiParent = this; // Indicar que es hijo del formulario actual (MDI)
            info.Show(); // Mostrar ProductosAlmacen
        }
        private void eliminarEnvioPendienteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cerrarFormulariosAbiertos();
            Eliminar eliminar = new Eliminar();
            eliminar.MdiParent = this; // Indicar que es hijo del formulario actual (MDI)
            eliminar.Show(); // Mostrar ProductosAlmacen

        }


        private void cerrarFormulariosAbiertos()
        {
            // Cerrar cualquier formulario hijo abierto previamente 
            foreach (Form childForm in this.MdiChildren)
            {
                childForm.Close();
            }
        }

        
    }
}
