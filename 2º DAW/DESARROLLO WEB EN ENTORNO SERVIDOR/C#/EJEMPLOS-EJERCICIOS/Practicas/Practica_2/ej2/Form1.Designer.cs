namespace ej2
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
            grpListaPaises = new GroupBox();
            listBPaises = new ListBox();
            grpIntroduceDatos = new GroupBox();
            btnModificar = new Button();
            btnMenos = new Button();
            btnMas = new Button();
            txtSaludo = new TextBox();
            lblSaludo = new Label();
            txtPais = new TextBox();
            lblPais = new Label();
            grpListaPaises.SuspendLayout();
            grpIntroduceDatos.SuspendLayout();
            SuspendLayout();
            // 
            // grpListaPaises
            // 
            grpListaPaises.Controls.Add(listBPaises);
            grpListaPaises.Location = new Point(406, 41);
            grpListaPaises.Name = "grpListaPaises";
            grpListaPaises.Size = new Size(283, 201);
            grpListaPaises.TabIndex = 0;
            grpListaPaises.TabStop = false;
            grpListaPaises.Text = "Lista Paises";
            // 
            // listBPaises
            // 
            listBPaises.FormattingEnabled = true;
            listBPaises.ItemHeight = 15;
            listBPaises.Location = new Point(17, 22);
            listBPaises.Name = "listBPaises";
            listBPaises.Size = new Size(120, 94);
            listBPaises.TabIndex = 1;
            listBPaises.SelectedIndexChanged += listBPaises_SelectedIndexChanged;
            // 
            // grpIntroduceDatos
            // 
            grpIntroduceDatos.Controls.Add(btnModificar);
            grpIntroduceDatos.Controls.Add(btnMenos);
            grpIntroduceDatos.Controls.Add(btnMas);
            grpIntroduceDatos.Controls.Add(txtSaludo);
            grpIntroduceDatos.Controls.Add(lblSaludo);
            grpIntroduceDatos.Controls.Add(txtPais);
            grpIntroduceDatos.Controls.Add(lblPais);
            grpIntroduceDatos.Location = new Point(44, 41);
            grpIntroduceDatos.Name = "grpIntroduceDatos";
            grpIntroduceDatos.Size = new Size(283, 210);
            grpIntroduceDatos.TabIndex = 2;
            grpIntroduceDatos.TabStop = false;
            grpIntroduceDatos.Text = "Introduce datos:";
            // 
            // btnModificar
            // 
            btnModificar.Location = new Point(181, 114);
            btnModificar.Name = "btnModificar";
            btnModificar.Size = new Size(43, 37);
            btnModificar.TabIndex = 5;
            btnModificar.Text = "x";
            btnModificar.UseVisualStyleBackColor = true;
            btnModificar.Click += btnModificar_Click;
            // 
            // btnMenos
            // 
            btnMenos.Location = new Point(112, 114);
            btnMenos.Name = "btnMenos";
            btnMenos.Size = new Size(43, 37);
            btnMenos.TabIndex = 4;
            btnMenos.Text = "-";
            btnMenos.UseVisualStyleBackColor = true;
            btnMenos.Click += btnMenos_Click;
            // 
            // btnMas
            // 
            btnMas.Location = new Point(43, 114);
            btnMas.Name = "btnMas";
            btnMas.Size = new Size(43, 37);
            btnMas.TabIndex = 2;
            btnMas.Text = "+";
            btnMas.UseVisualStyleBackColor = true;
            btnMas.Click += btnMas_Click;
            // 
            // txtSaludo
            // 
            txtSaludo.Location = new Point(82, 60);
            txtSaludo.Name = "txtSaludo";
            txtSaludo.Size = new Size(100, 23);
            txtSaludo.TabIndex = 3;
            // 
            // lblSaludo
            // 
            lblSaludo.AutoSize = true;
            lblSaludo.Location = new Point(26, 63);
            lblSaludo.Name = "lblSaludo";
            lblSaludo.Size = new Size(43, 15);
            lblSaludo.TabIndex = 2;
            lblSaludo.Text = "Saludo";
            // 
            // txtPais
            // 
            txtPais.Location = new Point(82, 22);
            txtPais.Name = "txtPais";
            txtPais.Size = new Size(100, 23);
            txtPais.TabIndex = 1;
            // 
            // lblPais
            // 
            lblPais.AutoSize = true;
            lblPais.Location = new Point(26, 25);
            lblPais.Name = "lblPais";
            lblPais.Size = new Size(28, 15);
            lblPais.TabIndex = 0;
            lblPais.Text = "Pais";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpIntroduceDatos);
            Controls.Add(grpListaPaises);
            Name = "Form1";
            Text = "Form1";
            grpListaPaises.ResumeLayout(false);
            grpIntroduceDatos.ResumeLayout(false);
            grpIntroduceDatos.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox grpListaPaises;
        private ListBox listBPaises;
        private GroupBox grpIntroduceDatos;
        private TextBox txtSaludo;
        private Label lblSaludo;
        private TextBox txtPais;
        private Label lblPais;
        private Button btnMas;
        private Button btnModificar;
        private Button btnMenos;
    }
}
