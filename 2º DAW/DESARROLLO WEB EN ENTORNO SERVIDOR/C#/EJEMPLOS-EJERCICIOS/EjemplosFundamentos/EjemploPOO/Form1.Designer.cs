namespace EjemploPOO
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            listBox1 = new ListBox();
            grpAlumno = new GroupBox();
            lblTelefono = new Label();
            txtTelefono = new TextBox();
            lblNombre = new Label();
            txtNombre = new TextBox();
            lblDNI = new Label();
            txtDNI = new TextBox();
            grpOpciones = new GroupBox();
            btnEliminar = new Button();
            btnEditarT = new Button();
            btnBuscar = new Button();
            btnAnadir = new Button();
            grpAlumno.SuspendLayout();
            grpOpciones.SuspendLayout();
            SuspendLayout();
            // 
            // listBox1
            // 
            listBox1.FormattingEnabled = true;
            listBox1.ItemHeight = 15;
            listBox1.Location = new Point(476, 29);
            listBox1.Name = "listBox1";
            listBox1.Size = new Size(154, 214);
            listBox1.TabIndex = 0;
            // 
            // grpAlumno
            // 
            grpAlumno.Controls.Add(lblTelefono);
            grpAlumno.Controls.Add(txtTelefono);
            grpAlumno.Controls.Add(lblNombre);
            grpAlumno.Controls.Add(txtNombre);
            grpAlumno.Controls.Add(lblDNI);
            grpAlumno.Controls.Add(txtDNI);
            grpAlumno.Location = new Point(27, 29);
            grpAlumno.Name = "grpAlumno";
            grpAlumno.Size = new Size(390, 127);
            grpAlumno.TabIndex = 1;
            grpAlumno.TabStop = false;
            grpAlumno.Text = "Datos Alumno";
            // 
            // lblTelefono
            // 
            lblTelefono.AutoSize = true;
            lblTelefono.Location = new Point(31, 63);
            lblTelefono.Name = "lblTelefono";
            lblTelefono.Size = new Size(55, 15);
            lblTelefono.TabIndex = 5;
            lblTelefono.Text = "Telefono:";
            // 
            // txtTelefono
            // 
            txtTelefono.Location = new Point(91, 60);
            txtTelefono.Name = "txtTelefono";
            txtTelefono.Size = new Size(100, 23);
            txtTelefono.TabIndex = 4;
            // 
            // lblNombre
            // 
            lblNombre.AutoSize = true;
            lblNombre.Location = new Point(31, 34);
            lblNombre.Name = "lblNombre";
            lblNombre.Size = new Size(54, 15);
            lblNombre.TabIndex = 3;
            lblNombre.Text = "Nombre:";
            // 
            // txtNombre
            // 
            txtNombre.Location = new Point(91, 31);
            txtNombre.Name = "txtNombre";
            txtNombre.Size = new Size(222, 23);
            txtNombre.TabIndex = 2;
            // 
            // lblDNI
            // 
            lblDNI.AutoSize = true;
            lblDNI.Location = new Point(31, 89);
            lblDNI.Name = "lblDNI";
            lblDNI.Size = new Size(30, 15);
            lblDNI.TabIndex = 1;
            lblDNI.Text = "DNI:";
            // 
            // txtDNI
            // 
            txtDNI.Location = new Point(91, 89);
            txtDNI.Name = "txtDNI";
            txtDNI.Size = new Size(100, 23);
            txtDNI.TabIndex = 0;
            // 
            // grpOpciones
            // 
            grpOpciones.Controls.Add(btnEliminar);
            grpOpciones.Controls.Add(btnEditarT);
            grpOpciones.Controls.Add(btnBuscar);
            grpOpciones.Controls.Add(btnAnadir);
            grpOpciones.Location = new Point(27, 171);
            grpOpciones.Name = "grpOpciones";
            grpOpciones.Size = new Size(390, 72);
            grpOpciones.TabIndex = 2;
            grpOpciones.TabStop = false;
            grpOpciones.Text = "Opciones:";
            // 
            // btnEliminar
            // 
            btnEliminar.Enabled = false;
            btnEliminar.Location = new Point(279, 22);
            btnEliminar.Name = "btnEliminar";
            btnEliminar.Size = new Size(85, 33);
            btnEliminar.TabIndex = 6;
            btnEliminar.Text = "Eliminar";
            btnEliminar.UseVisualStyleBackColor = true;
            btnEliminar.Click += btnEliminar_Click;
            // 
            // btnEditarT
            // 
            btnEditarT.Enabled = false;
            btnEditarT.Location = new Point(188, 22);
            btnEditarT.Name = "btnEditarT";
            btnEditarT.Size = new Size(85, 33);
            btnEditarT.TabIndex = 5;
            btnEditarT.Text = "Editar";
            btnEditarT.UseVisualStyleBackColor = true;
            btnEditarT.Click += btnEditarT_Click;
            // 
            // btnBuscar
            // 
            btnBuscar.Location = new Point(97, 22);
            btnBuscar.Name = "btnBuscar";
            btnBuscar.Size = new Size(85, 33);
            btnBuscar.TabIndex = 4;
            btnBuscar.Text = "Buscar";
            btnBuscar.UseVisualStyleBackColor = true;
            btnBuscar.Click += btnBuscar_Click;
            // 
            // btnAnadir
            // 
            btnAnadir.Location = new Point(6, 22);
            btnAnadir.Name = "btnAnadir";
            btnAnadir.Size = new Size(85, 33);
            btnAnadir.TabIndex = 3;
            btnAnadir.Text = "Añadir";
            btnAnadir.UseVisualStyleBackColor = true;
            btnAnadir.Click += btnAnadir_Click_1;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpOpciones);
            Controls.Add(grpAlumno);
            Controls.Add(listBox1);
            Name = "Form1";
            Text = "Form1";
            grpAlumno.ResumeLayout(false);
            grpAlumno.PerformLayout();
            grpOpciones.ResumeLayout(false);
            ResumeLayout(false);
        }

        #endregion

        private ListBox listBox1;
        private GroupBox grpAlumno;
        private Label lblTelefono;
        private TextBox txtTelefono;
        private Label lblNombre;
        private TextBox txtNombre;
        private Label lblDNI;
        private TextBox txtDNI;
        private GroupBox grpOpciones;
        private Button btnAnadir;
        private Button btnBuscar;
        private Button btnEditarT;
        private Button btnEliminar;
    }
}
