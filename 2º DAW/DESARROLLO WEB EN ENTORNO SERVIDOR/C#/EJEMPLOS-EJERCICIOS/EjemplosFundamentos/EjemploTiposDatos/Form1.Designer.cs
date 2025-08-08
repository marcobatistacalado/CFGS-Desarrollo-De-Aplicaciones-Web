namespace EjemploTiposDatos
{
    partial class FrmPrincipal
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
            grpDatos = new GroupBox();
            btnAceptar = new Button();
            txtEdad = new TextBox();
            lblEdad = new Label();
            txtDni = new TextBox();
            lblDni = new Label();
            txtNombre = new TextBox();
            lblNombre = new Label();
            textError = new TextBox();
            grpDatos.SuspendLayout();
            SuspendLayout();
            // 
            // grpDatos
            // 
            grpDatos.Controls.Add(textError);
            grpDatos.Controls.Add(btnAceptar);
            grpDatos.Controls.Add(txtEdad);
            grpDatos.Controls.Add(lblEdad);
            grpDatos.Controls.Add(txtDni);
            grpDatos.Controls.Add(lblDni);
            grpDatos.Controls.Add(txtNombre);
            grpDatos.Controls.Add(lblNombre);
            grpDatos.Location = new Point(28, 52);
            grpDatos.Name = "grpDatos";
            grpDatos.Size = new Size(273, 229);
            grpDatos.TabIndex = 0;
            grpDatos.TabStop = false;
            grpDatos.Text = "Tus Datos";
            // 
            // btnAceptar
            // 
            btnAceptar.Location = new Point(85, 134);
            btnAceptar.Name = "btnAceptar";
            btnAceptar.Size = new Size(75, 23);
            btnAceptar.TabIndex = 1;
            btnAceptar.Text = "Aceptar";
            btnAceptar.UseVisualStyleBackColor = true;
            btnAceptar.Click += btnAceptar_Click;
            // 
            // txtEdad
            // 
            txtEdad.Location = new Point(85, 86);
            txtEdad.Name = "txtEdad";
            txtEdad.Size = new Size(100, 23);
            txtEdad.TabIndex = 6;
            // 
            // lblEdad
            // 
            lblEdad.AutoSize = true;
            lblEdad.Location = new Point(22, 89);
            lblEdad.Name = "lblEdad";
            lblEdad.Size = new Size(36, 15);
            lblEdad.TabIndex = 5;
            lblEdad.Text = "Edad:";
            // 
            // txtDni
            // 
            txtDni.Location = new Point(85, 57);
            txtDni.Name = "txtDni";
            txtDni.Size = new Size(100, 23);
            txtDni.TabIndex = 4;
            // 
            // lblDni
            // 
            lblDni.AutoSize = true;
            lblDni.Location = new Point(22, 60);
            lblDni.Name = "lblDni";
            lblDni.Size = new Size(30, 15);
            lblDni.TabIndex = 3;
            lblDni.Text = "DNI:";
            // 
            // txtNombre
            // 
            txtNombre.Location = new Point(85, 28);
            txtNombre.Name = "txtNombre";
            txtNombre.Size = new Size(100, 23);
            txtNombre.TabIndex = 2;
            // 
            // lblNombre
            // 
            lblNombre.AutoSize = true;
            lblNombre.Location = new Point(22, 31);
            lblNombre.Name = "lblNombre";
            lblNombre.Size = new Size(57, 15);
            lblNombre.TabIndex = 1;
            lblNombre.Text = "Nombre: ";
            // 
            // textError
            // 
            textError.Location = new Point(22, 183);
            textError.Name = "textError";
            textError.Size = new Size(229, 23);
            textError.TabIndex = 7;
            // 
            // FrmPrincipal
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpDatos);
            Name = "FrmPrincipal";
            Text = "Ejemplo Tipos de Datos";
            Load += FrmPrincipal_Load;
            grpDatos.ResumeLayout(false);
            grpDatos.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox grpDatos;
        private TextBox txtNombre;
        private Label lblNombre;
        private TextBox txtDni;
        private Label lblDni;
        private Button btnAceptar;
        private TextBox txtEdad;
        private Label lblEdad;
        private TextBox textError;
    }
}
