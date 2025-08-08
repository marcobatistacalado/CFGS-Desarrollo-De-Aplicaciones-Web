namespace ej1_real
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
            txtNombre = new TextBox();
            txtApellidos = new TextBox();
            txtEdad = new TextBox();
            txtDNI = new TextBox();
            lblNombre = new Label();
            lblApellidos = new Label();
            lblEdad = new Label();
            lblDNI = new Label();
            txtRes = new TextBox();
            btnIntroducir = new Button();
            btnVisualizar = new Button();
            SuspendLayout();
            // 
            // txtNombre
            // 
            txtNombre.Location = new Point(138, 52);
            txtNombre.Name = "txtNombre";
            txtNombre.Size = new Size(123, 23);
            txtNombre.TabIndex = 1;
            // 
            // txtApellidos
            // 
            txtApellidos.Location = new Point(138, 81);
            txtApellidos.Name = "txtApellidos";
            txtApellidos.Size = new Size(266, 23);
            txtApellidos.TabIndex = 2;
            // 
            // txtEdad
            // 
            txtEdad.Location = new Point(138, 110);
            txtEdad.Name = "txtEdad";
            txtEdad.Size = new Size(100, 23);
            txtEdad.TabIndex = 3;
            // 
            // txtDNI
            // 
            txtDNI.Location = new Point(138, 139);
            txtDNI.Name = "txtDNI";
            txtDNI.Size = new Size(123, 23);
            txtDNI.TabIndex = 4;
            // 
            // lblNombre
            // 
            lblNombre.AutoSize = true;
            lblNombre.Location = new Point(62, 55);
            lblNombre.Name = "lblNombre";
            lblNombre.Size = new Size(51, 15);
            lblNombre.TabIndex = 5;
            lblNombre.Text = "Nombre";
            // 
            // lblApellidos
            // 
            lblApellidos.AutoSize = true;
            lblApellidos.Location = new Point(62, 85);
            lblApellidos.Name = "lblApellidos";
            lblApellidos.Size = new Size(56, 15);
            lblApellidos.TabIndex = 6;
            lblApellidos.Text = "Apellidos";
            // 
            // lblEdad
            // 
            lblEdad.AutoSize = true;
            lblEdad.Location = new Point(62, 115);
            lblEdad.Name = "lblEdad";
            lblEdad.Size = new Size(33, 15);
            lblEdad.TabIndex = 7;
            lblEdad.Text = "Edad";
            // 
            // lblDNI
            // 
            lblDNI.AutoSize = true;
            lblDNI.Location = new Point(62, 145);
            lblDNI.Name = "lblDNI";
            lblDNI.Size = new Size(27, 15);
            lblDNI.TabIndex = 8;
            lblDNI.Text = "DNI";
            // 
            // txtRes
            // 
            txtRes.Location = new Point(138, 248);
            txtRes.Name = "txtRes";
            txtRes.Size = new Size(100, 23);
            txtRes.TabIndex = 9;
            // 
            // btnIntroducir
            // 
            btnIntroducir.Location = new Point(66, 188);
            btnIntroducir.Name = "btnIntroducir";
            btnIntroducir.Size = new Size(97, 40);
            btnIntroducir.TabIndex = 10;
            btnIntroducir.Text = "Introducir";
            btnIntroducir.UseVisualStyleBackColor = true;
            btnIntroducir.Click += btnIntroducir_Click;
            // 
            // btnVisualizar
            // 
            btnVisualizar.Location = new Point(215, 188);
            btnVisualizar.Name = "btnVisualizar";
            btnVisualizar.Size = new Size(91, 40);
            btnVisualizar.TabIndex = 11;
            btnVisualizar.Text = "Visualizar";
            btnVisualizar.UseVisualStyleBackColor = true;
            btnVisualizar.Click += btnVisualizar_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(btnVisualizar);
            Controls.Add(btnIntroducir);
            Controls.Add(txtRes);
            Controls.Add(lblDNI);
            Controls.Add(lblEdad);
            Controls.Add(lblApellidos);
            Controls.Add(lblNombre);
            Controls.Add(txtDNI);
            Controls.Add(txtEdad);
            Controls.Add(txtApellidos);
            Controls.Add(txtNombre);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox txtNombre;
        private TextBox txtApellidos;
        private TextBox txtEdad;
        private TextBox txtDNI;
        private Label lblNombre;
        private Label lblApellidos;
        private Label lblEdad;
        private Label lblDNI;
        private TextBox txtRes;
        private Button btnIntroducir;
        private Button btnVisualizar;
    }
}
