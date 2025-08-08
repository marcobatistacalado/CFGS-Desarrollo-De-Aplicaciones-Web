namespace ej2
{
    partial class HacerEnvio
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            lbDireccion = new Label();
            lbCodP = new Label();
            lbPaisD = new Label();
            lbPeso = new Label();
            lbVolumen = new Label();
            txtPeso = new TextBox();
            txtVolumen = new TextBox();
            txtDireccion = new TextBox();
            txtCodP = new TextBox();
            txtPaisD = new TextBox();
            ckPaquete = new CheckBox();
            btnEnviar = new Button();
            groupBox1 = new GroupBox();
            grpEnvio = new GroupBox();
            groupBox1.SuspendLayout();
            grpEnvio.SuspendLayout();
            SuspendLayout();
            // 
            // lbDireccion
            // 
            lbDireccion.AutoSize = true;
            lbDireccion.Location = new Point(40, 31);
            lbDireccion.Name = "lbDireccion";
            lbDireccion.Size = new Size(60, 15);
            lbDireccion.TabIndex = 1;
            lbDireccion.Text = "Direccion:";
            // 
            // lbCodP
            // 
            lbCodP.AutoSize = true;
            lbCodP.Location = new Point(40, 57);
            lbCodP.Name = "lbCodP";
            lbCodP.Size = new Size(59, 15);
            lbCodP.TabIndex = 2;
            lbCodP.Text = "Codigo P:";
            // 
            // lbPaisD
            // 
            lbPaisD.AutoSize = true;
            lbPaisD.Location = new Point(40, 83);
            lbPaisD.Name = "lbPaisD";
            lbPaisD.Size = new Size(42, 15);
            lbPaisD.TabIndex = 3;
            lbPaisD.Text = "Pais D:";
            // 
            // lbPeso
            // 
            lbPeso.AutoSize = true;
            lbPeso.Location = new Point(13, 25);
            lbPeso.Name = "lbPeso";
            lbPeso.Size = new Size(35, 15);
            lbPeso.TabIndex = 5;
            lbPeso.Text = "Peso:";
            // 
            // lbVolumen
            // 
            lbVolumen.AutoSize = true;
            lbVolumen.Location = new Point(13, 51);
            lbVolumen.Name = "lbVolumen";
            lbVolumen.Size = new Size(57, 15);
            lbVolumen.TabIndex = 6;
            lbVolumen.Text = "Volumen:";
            // 
            // txtPeso
            // 
            txtPeso.Enabled = false;
            txtPeso.Location = new Point(76, 22);
            txtPeso.Name = "txtPeso";
            txtPeso.Size = new Size(100, 23);
            txtPeso.TabIndex = 7;
            // 
            // txtVolumen
            // 
            txtVolumen.Enabled = false;
            txtVolumen.Location = new Point(76, 51);
            txtVolumen.Name = "txtVolumen";
            txtVolumen.Size = new Size(100, 23);
            txtVolumen.TabIndex = 8;
            // 
            // txtDireccion
            // 
            txtDireccion.Location = new Point(106, 23);
            txtDireccion.Name = "txtDireccion";
            txtDireccion.Size = new Size(100, 23);
            txtDireccion.TabIndex = 10;
            // 
            // txtCodP
            // 
            txtCodP.Location = new Point(106, 52);
            txtCodP.Name = "txtCodP";
            txtCodP.Size = new Size(100, 23);
            txtCodP.TabIndex = 11;
            // 
            // txtPaisD
            // 
            txtPaisD.Location = new Point(106, 81);
            txtPaisD.Name = "txtPaisD";
            txtPaisD.Size = new Size(100, 23);
            txtPaisD.TabIndex = 12;
            // 
            // ckPaquete
            // 
            ckPaquete.AutoSize = true;
            ckPaquete.Location = new Point(44, 121);
            ckPaquete.Name = "ckPaquete";
            ckPaquete.Size = new Size(69, 19);
            ckPaquete.TabIndex = 13;
            ckPaquete.Text = "Paquete";
            ckPaquete.UseVisualStyleBackColor = true;
            ckPaquete.CheckedChanged += ckPaquete_CheckedChanged;
            // 
            // btnEnviar
            // 
            btnEnviar.Location = new Point(92, 280);
            btnEnviar.Name = "btnEnviar";
            btnEnviar.Size = new Size(75, 23);
            btnEnviar.TabIndex = 14;
            btnEnviar.Text = "Enviar";
            btnEnviar.UseVisualStyleBackColor = true;
            btnEnviar.Click += btnEnviar_Click;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(txtPeso);
            groupBox1.Controls.Add(lbPeso);
            groupBox1.Controls.Add(lbVolumen);
            groupBox1.Controls.Add(txtVolumen);
            groupBox1.Location = new Point(40, 162);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(200, 100);
            groupBox1.TabIndex = 15;
            groupBox1.TabStop = false;
            groupBox1.Text = "Paquete";
            // 
            // grpEnvio
            // 
            grpEnvio.Controls.Add(txtCodP);
            grpEnvio.Controls.Add(groupBox1);
            grpEnvio.Controls.Add(lbDireccion);
            grpEnvio.Controls.Add(btnEnviar);
            grpEnvio.Controls.Add(lbCodP);
            grpEnvio.Controls.Add(ckPaquete);
            grpEnvio.Controls.Add(lbPaisD);
            grpEnvio.Controls.Add(txtPaisD);
            grpEnvio.Controls.Add(txtDireccion);
            grpEnvio.Location = new Point(12, 12);
            grpEnvio.Name = "grpEnvio";
            grpEnvio.Size = new Size(274, 317);
            grpEnvio.TabIndex = 16;
            grpEnvio.TabStop = false;
            grpEnvio.Text = "Envio";
            // 
            // HacerEnvio
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(298, 347);
            Controls.Add(grpEnvio);
            Name = "HacerEnvio";
            Text = "HacerEnvio";
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            grpEnvio.ResumeLayout(false);
            grpEnvio.PerformLayout();
            ResumeLayout(false);
        }

        #endregion
        private Label lbDireccion;
        private Label lbCodP;
        private Label lbPaisD;
        private Label lbPeso;
        private Label lbVolumen;
        private TextBox txtPeso;
        private TextBox txtVolumen;
        private TextBox txtDireccion;
        private TextBox txtCodP;
        private TextBox txtPaisD;
        private CheckBox ckPaquete;
        private Button btnEnviar;
        private GroupBox groupBox1;
        private GroupBox grpEnvio;
    }
}