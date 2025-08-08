using EjemploPOO.modelos; //importar donde tengo la clase.
namespace EjemploPOO; //paquete en el que trabajo.

public partial class Form1 : Form
{
    //Declarar array de objetos del tipo Alumno
    Alumno[] listaClase;
    public int numAlumnos;
    public Form1()
    {
        InitializeComponent();
        listaClase = new Alumno[2];
        numAlumnos = 0;
    }

    private void btnAnadir_Click_1(object sender, EventArgs e)
    {
        if (txtDNI.Text == "" || txtNombre.Text == "" || txtTelefono.Text == "")
        {
            MessageBox.Show("Campos obligatorios", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            //queda mas bonito que tenga etiquetas previas ocultas como : "*" y se desoculten

        }
        else
        {
            //Excepción que controla que te salgas de la cantidad tope del array.
            try
            {
                //Crear alumno (FALTA VALIDAR DICHOS CAMPOS)
                listaClase[numAlumnos] = new Alumno(txtDNI.Text, txtNombre.Text, txtTelefono.Text);
                numAlumnos++;
            }
            catch (System.IndexOutOfRangeException ex)
            {
                btnAnadir.Enabled = false;
                MessageBox.Show("No se pueden añadir más alumnos", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }

            //Limpiar cajas
            cleanCajas(grpAlumno);
            txtNombre.Focus();
        }

    }

    public void cleanCajas(GroupBox grp)
    {
        foreach (Control c in grp.Controls)
        {
            if (c.GetType().Name == "TextBox")
            {
                c.Text = "";
            }
        }
    }

    private void btnBuscar_Click(object sender, EventArgs e)
    {
        if (btnBuscar.Text == "Buscar")
        {
            //lo primero una limpieza de cajas por si acaso, estuvieran añadiendo algun alumno:
            cleanCajas(grpAlumno);
            txtNombre.Focus();

            /*Solo dejamos el boton y el dni a buscar*/
            txtNombre.Enabled = false;
            txtTelefono.Enabled = false;
            btnAnadir.Enabled = false;
            btnEditarT.Enabled = false;
            txtDNI.Focus();

            /*Modificamos el botón y le llamamos aceptar*/
            btnBuscar.Text = "Aceptar"; //de aqui pasará al else al realizar el evento
        }
        else
        {
            if (btnBuscar.Text == "Aceptar")
            {
                Alumno a = buscarAlumno(txtDNI.Text);
                if (a == null)
                {
                    MessageBox.Show("Alumno no encontrado.", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                }
                else
                {
                    btnBuscar.Text = "Terminar"; //aqui solo se permite realizar una busqueda y terminar

                    //bloquear los demas botones para que el cliente solo pueda hacer esta accion seguida.
                    btnEditarT.Enabled = false;
                    btnAnadir.Enabled = false;

                    //bloqueamos todos los campos antes de escribirlos
                    txtDNI.Enabled = false;
                    txtNombre.Enabled = false;
                    txtTelefono.Enabled = false;

                    //mostrar la busqueda
                    txtNombre.Text = a.Nombre;
                    txtTelefono.Text = a.Telefono;

                    //desbloqueo el boton editar y eliminar
                    btnEditarT.Enabled = true;
                    btnEliminar.Enabled = true;

                }
            }
            else
            {
                if (btnBuscar.Text == "Terminar")
                {
                    //Editamos el telefono solo si el editar vuelve a estar bloqueado
                    if (btnEditarT.Enabled == false)
                    {
                        Alumno a = buscarAlumno(txtDNI.Text);
                        a.Telefono = txtTelefono.Text;
                    }

                    btnBuscar.Text = "Buscar"; //dejamos como boton principal otra vez

                    //Limpiar cajas
                    cleanCajas(grpAlumno);
                    txtNombre.Focus();

                    //desbloqueamos cajas
                    txtDNI.Enabled = true;
                    txtNombre.Enabled = true;
                    txtTelefono.Enabled = true;

                    //desbloqueamos botones
                    btnEditarT.Enabled = true;
                    btnAnadir.Enabled = true;

                    //Limpiar cajas
                    cleanCajas(grpAlumno);
                    txtNombre.Focus();

                }
            }
        }
    }

    private void btnEditarT_Click(object sender, EventArgs e)
    {
        if (btnEditarT.Text == "Editar")
        {
            //desbloqueamos y posicionamos
            txtTelefono.Enabled = true;
            txtTelefono.Focus();

            btnEditarT.Enabled = false;//bloqueamos boton
        }


    }

    public Alumno buscarAlumno(string dni)
    {
        //Como es un array y no un vector recorre absolutamente todas las casillas aunque esten a NULL.
        foreach (Alumno a in listaClase)
        {
            try
            {
                if (a.Dni == dni)
                {
                    return a;
                }
            }
            catch (System.NullReferenceException e)
            {
                return null;
            }
        }
        return null;
    }

    //metodo que borra un alumno
    public void borrarAlumno(string dni, int buscar)
    {
        for (int j = buscar; j < numAlumnos - 1; j++)
        {
            listaClase[j] = listaClase[j + 1];
        }
        listaClase[numAlumnos - 1] = null; //si es de objetos pues null.
        numAlumnos--;
    }

    public int buscarPosicionAlumno(string dni)
    {
        for (int i = 0; i < numAlumnos; i++)
        {
            if (listaClase[i] != null && listaClase[i].Dni == dni)
            {
                return i;
            }
        }
        return -1; // Si no se encuentra el alumno
    }
    private void btnEliminar_Click(object sender, EventArgs e)
    {
        // Verificar que haya un DNI en la caja de texto para buscar al alumno
        if (txtDNI.Text == "")
        {
            MessageBox.Show("Por favor, introduce un DNI para eliminar.", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            return;
        }

        // Buscar la posición del alumno en el array
        int posicion = buscarPosicionAlumno(txtDNI.Text);

        // Si se encuentra el alumno
        if (posicion != -1)
        {
            // Confirmar eliminación
            DialogResult result = MessageBox.Show("¿Estás seguro de que deseas eliminar al alumno?", "Confirmar eliminación", MessageBoxButtons.YesNo, MessageBoxIcon.Question);

            if (result == DialogResult.Yes)
            {
                // Llamar al método para eliminar el alumno
                borrarAlumno(txtDNI.Text, posicion);

                // Mostrar mensaje de éxito
                MessageBox.Show("Alumno eliminado correctamente.", "Eliminado", MessageBoxButtons.OK, MessageBoxIcon.Information);

                // Limpiar las cajas de texto
                cleanCajas(grpAlumno);

                // Resetear el botón eliminar
                btnEliminar.Enabled = false;

                // Desbloquear los demás botones
                btnAnadir.Enabled = true;
                btnBuscar.Enabled = true;
                btnEditarT.Enabled = false;

                // Resetear campos de texto
                txtDNI.Enabled = true;
                txtNombre.Enabled = true;
                txtTelefono.Enabled = true;

                // Enfocar en el campo de DNI para nuevas acciones
                txtDNI.Focus();
            }
        }
        else
        {
            MessageBox.Show("No se encontró ningún alumno con ese DNI.", "No encontrado", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
        }
    }

}
