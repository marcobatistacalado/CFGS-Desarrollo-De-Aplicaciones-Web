namespace ej1_real;
using ej1.Modelos;
public partial class Form1 : Form
{
    List<Persona> personas = new List<Persona>(5);
    int pos_Actual = 0;

    public Form1()
    {
        InitializeComponent();
    }

    private void btnIntroducir_Click(object sender, EventArgs e)
    {
        if (txtNombre.Text == "" || txtApellidos.Text == "" || txtEdad.Text == "" || txtDNI.Text == "")
        {
            MessageBox.Show("Todos los campos deben de estar llenos");
            return;
        }
        int edad = validarEdad(txtEdad.Text);
        //LO SUYO SERÍA HACER ESTO CON UNA EXCEPCION
        if (edad == 0)
        {
            MessageBox.Show("Debes ser una edad mayor que 0 y menor que 70");
            return;
        }
        string dni = validarDNI(txtDNI.Text);
        switch (dni)
        {
            case "1":
                MessageBox.Show("El string debe contener 9 caracteres");
                return;
            case "2":
                MessageBox.Show("Los 8 primeros caracteres deben ser digitos");
                return;
            case "3":
                MessageBox.Show("La letra no coincide segun el algoritmo de DNI español");
                return;
            default:
                break;
        }
        //añadir al array
        personas.Add(new Persona(txtNombre.Text, txtApellidos.Text, dni, edad));
        MessageBox.Show("USUARIO AÑADIDO");
        //vaciar celdas
        txtNombre.Text = "";
        txtApellidos.Text = "";
        txtEdad.Text = "";
        txtDNI.Text = "";

    }

    private void btnVisualizar_Click(object sender, EventArgs e)
    {
        if (personas.Count() == 0)
        {
            MessageBox.Show("No se puede mostrar ninguna persona");
        }
        else
        {
            
            btnVisualizar.Text = "Siguiente";
            btnIntroducir.Enabled = false;
            if (pos_Actual > personas.Count()-1)
            {
                pos_Actual = 0;
                btnVisualizar.Text = "Visualizar";
                btnIntroducir.Enabled = true;
                txtRes.Text = "";
            }
            else
            {
                txtNombre.Text = personas[pos_Actual].Nombre;
                txtApellidos.Text = personas[pos_Actual].Apellidos;
                txtEdad.Text = personas[pos_Actual].Edad.ToString();
                txtDNI.Text = personas[pos_Actual].Dni;
                pos_Actual++;
            }

        }
        txtRes.Text = pos_Actual + "/" + personas.Count();
        
    }



    private int validarEdad(string edad)
    {
        int e;
        try
        {
            e = int.Parse(edad);
            if (e < 0 || e > 70)
            {
                return 0;
            }
        }
        catch (FormatException ex)
        {
            return 0;
        }
        return e;
    }

    private string validarDNI(string dni)
    {
        if (dni.Length != 9)
        {
            return "1"; //la cadena no cumple el length
        }
        string digitos = dni.Substring(0, 8);
        //se puede usar try y mostrar una excepcion pero con esto nos devuelve si true/false.
        if (!int.TryParse(digitos, out int numero))
        {
            return "2"; //no son digitos la cadena
        }
        else
        {
            // Calcular la letra del DNI
            char letra = dni[8]; // Obtener la letra
            char letraCalculada = CalcularLetraDNI(int.Parse(digitos));
            if (char.ToUpper(letra) != letraCalculada)
            {
                return "3"; //letra introducida no coincide con lo que deberia.
            }
            else
            {
                return digitos + letraCalculada;
            }
        }

    }
    private char CalcularLetraDNI(int numeroDNI)
    {
        // Definir el array de letras según el algoritmo del DNI
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                          'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C' };

        // Calcular el índice de la letra
        int indice = numeroDNI % 23;
        return letras[indice]; // Retornar la letra correspondiente
    }

}
