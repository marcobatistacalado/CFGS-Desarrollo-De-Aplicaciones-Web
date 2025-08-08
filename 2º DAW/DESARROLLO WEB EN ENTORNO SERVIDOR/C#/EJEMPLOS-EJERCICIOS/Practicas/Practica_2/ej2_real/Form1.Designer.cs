namespace ej2_real
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
            lstBSeleccionar = new ListBox();
            lstBPaisLetra = new ListBox();
            grpBPais = new GroupBox();
            txtSaludo = new TextBox();
            txtPais = new TextBox();
            lblSaludo = new Label();
            lblPais = new Label();
            grpBuscar = new GroupBox();
            txtBuscar = new TextBox();
            lblLetra = new Label();
            btnBuscar = new Button();
            btnNuevo = new Button();
            grpBPais.SuspendLayout();
            grpBuscar.SuspendLayout();
            SuspendLayout();
            // 
            // lstBSeleccionar
            // 
            lstBSeleccionar.FormattingEnabled = true;
            lstBSeleccionar.ItemHeight = 15;
            lstBSeleccionar.Location = new Point(29, 31);
            lstBSeleccionar.Name = "lstBSeleccionar";
            lstBSeleccionar.Size = new Size(151, 199);
            lstBSeleccionar.TabIndex = 0;
            lstBSeleccionar.SelectedIndexChanged += lstBSeleccionar_SelectedIndexChanged;
            // 
            // lstBPaisLetra
            // 
            lstBPaisLetra.FormattingEnabled = true;
            lstBPaisLetra.ItemHeight = 15;
            lstBPaisLetra.Location = new Point(457, 31);
            lstBPaisLetra.Name = "lstBPaisLetra";
            lstBPaisLetra.Size = new Size(151, 199);
            lstBPaisLetra.TabIndex = 1;
            // 
            // grpBPais
            // 
            grpBPais.Controls.Add(txtSaludo);
            grpBPais.Controls.Add(txtPais);
            grpBPais.Controls.Add(lblSaludo);
            grpBPais.Controls.Add(lblPais);
            grpBPais.Location = new Point(218, 31);
            grpBPais.Name = "grpBPais";
            grpBPais.Size = new Size(206, 109);
            grpBPais.TabIndex = 2;
            grpBPais.TabStop = false;
            grpBPais.Text = "País";
            // 
            // txtSaludo
            // 
            txtSaludo.Location = new Point(80, 66);
            txtSaludo.Name = "txtSaludo";
            txtSaludo.Size = new Size(100, 23);
            txtSaludo.TabIndex = 7;
            // 
            // txtPais
            // 
            txtPais.Location = new Point(80, 29);
            txtPais.Name = "txtPais";
            txtPais.Size = new Size(100, 23);
            txtPais.TabIndex = 5;
            // 
            // lblSaludo
            // 
            lblSaludo.AutoSize = true;
            lblSaludo.Location = new Point(18, 69);
            lblSaludo.Name = "lblSaludo";
            lblSaludo.Size = new Size(43, 15);
            lblSaludo.TabIndex = 6;
            lblSaludo.Text = "Saludo";
            // 
            // lblPais
            // 
            lblPais.AutoSize = true;
            lblPais.Location = new Point(18, 32);
            lblPais.Name = "lblPais";
            lblPais.Size = new Size(28, 15);
            lblPais.TabIndex = 5;
            lblPais.Text = "País";
            // 
            // grpBuscar
            // 
            grpBuscar.Controls.Add(txtBuscar);
            grpBuscar.Controls.Add(lblLetra);
            grpBuscar.Controls.Add(btnBuscar);
            grpBuscar.Location = new Point(218, 159);
            grpBuscar.Name = "grpBuscar";
            grpBuscar.Size = new Size(206, 95);
            grpBuscar.TabIndex = 3;
            grpBuscar.TabStop = false;
            grpBuscar.Text = "Buscar";
            // 
            // txtBuscar
            // 
            txtBuscar.Location = new Point(70, 39);
            txtBuscar.Name = "txtBuscar";
            txtBuscar.Size = new Size(26, 23);
            txtBuscar.TabIndex = 8;
            // 
            // lblLetra
            // 
            lblLetra.AutoSize = true;
            lblLetra.Location = new Point(18, 42);
            lblLetra.Name = "lblLetra";
            lblLetra.Size = new Size(33, 15);
            lblLetra.TabIndex = 7;
            lblLetra.Text = "Letra";
            // 
            // btnBuscar
            // 
            btnBuscar.Location = new Point(122, 22);
            btnBuscar.Name = "btnBuscar";
            btnBuscar.Size = new Size(78, 55);
            btnBuscar.TabIndex = 5;
            btnBuscar.Text = "Buscar";
            btnBuscar.UseVisualStyleBackColor = true;
            btnBuscar.Click += btnBuscar_Click;
            // 
            // btnNuevo
            // 
            btnNuevo.Location = new Point(49, 250);
            btnNuevo.Name = "btnNuevo";
            btnNuevo.Size = new Size(107, 57);
            btnNuevo.TabIndex = 4;
            btnNuevo.Text = "Nuevo País";
            btnNuevo.UseVisualStyleBackColor = true;
            btnNuevo.Click += btnNuevo_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(btnNuevo);
            Controls.Add(grpBuscar);
            Controls.Add(grpBPais);
            Controls.Add(lstBPaisLetra);
            Controls.Add(lstBSeleccionar);
            Name = "Form1";
            Text = "Bienvenida Internacional";
            grpBPais.ResumeLayout(false);
            grpBPais.PerformLayout();
            grpBuscar.ResumeLayout(false);
            grpBuscar.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private ListBox lstBSeleccionar;
        private ListBox lstBPaisLetra;
        private GroupBox grpBPais;
        private TextBox txtSaludo;
        private TextBox txtPais;
        private Label lblSaludo;
        private Label lblPais;
        private GroupBox grpBuscar;
        private Label lblLetra;
        private Button btnBuscar;
        private Button btnNuevo;
        private TextBox txtBuscar;
    }
}
