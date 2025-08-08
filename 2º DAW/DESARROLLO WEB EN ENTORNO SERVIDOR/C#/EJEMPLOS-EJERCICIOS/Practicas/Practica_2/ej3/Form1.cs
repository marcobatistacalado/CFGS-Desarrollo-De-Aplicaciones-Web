using ej3.Modelos;
using System.Numerics;
namespace ej3
{
    public partial class Form1 : Form
    {
        Pizzeria miLocal = new Pizzeria();

        public Form1()
        {
            InitializeComponent();
        }

        private void btnNueva_Click(object sender, EventArgs e)
        {
            if (txtNMesa.Text == "")
            {
                MessageBox.Show("No has introducido numero de mesa");
                return;
            }
            string masa = get_Item(grpTipoMasa);
            if (masa == "")
            {
                MessageBox.Show("No has introducido tipo de masa");
                return;
            }
            string refresco = get_Item(grpRefresco);
            if (refresco == "")
            {
                MessageBox.Show("No has introducido refresco");
                return;
            }
            string ensalada = comboEnsalada.Text;
            string[] ingredientes = get_Ingredientes(grpIngredientes);
            //falta comprobar que han elegido al menos uno


            /*Pedido p=new Pedido(masa,ensalada,refresco,ingredientes);
            Mesa m = new Mesa(Convert.ToInt32(txtNMesa.Text), p);*/

            Mesa m = new Mesa(Convert.ToInt32(txtNMesa.Text), new Pedido(masa, ensalada, refresco, ingredientes));
            miLocal.addMesa(m);
            lsNumeroMesasSin.Items.Add(m.NumMesa);

        }

        private string get_Item(GroupBox g)
        {
            foreach (RadioButton c in g.Controls)
            {
                if (c.Checked)
                    return c.Text;
            }
            // throw ErrorDatosException("Falta elegir item");
            return "";
        }

        private string[] get_Ingredientes(GroupBox g)
        {//Pasar por referencia una variable para tener a la vuelta el número de ingredientes
            int i = 0;
            string[] ingredientes = new string[4];
            //esto si sabemos que en un groupBox solo hay de un tipo no hace falta usar Controls y luego preguntar el type
            foreach (CheckBox item in grpIngredientes.Controls)
            {
                if (item.Checked)
                {
                    ingredientes[i] = item.Text;
                    i++;
                }
            }

            //comprobar que han elegido ingredientes y lanzar excepción en caso contrario
            return ingredientes;
        }

        private void lsNumeroMesasSin_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (lsNumeroMesasSin.SelectedIndex != -1)
            {
               /* Mesa m=miLocal.getMesa(lsNumeroMesasSin.SelectedIndex);
                Pedido p = m.P;*/
                Pedido p= miLocal.getMesa(lsNumeroMesasSin.SelectedIndex).P;
                lsPedidoMesa.Items.Add(p.TipoMasa);
                lsPedidoMesa.Items.Add(p.Ensalada);
                //Terminar el resto

            }
        }
    }
}
