namespace ej3
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
            components = new System.ComponentModel.Container();
            lsNumeroMesasSin = new ListBox();
            bindingSource1 = new BindingSource(components);
            grpMesas = new GroupBox();
            lsPedidoMesa = new ListBox();
            btnServida = new Button();
            btnNueva = new Button();
            lblPedido = new Label();
            lbPendienteServir = new Label();
            grpTipoMasa = new GroupBox();
            rbExtraGruesa = new RadioButton();
            rbFina = new RadioButton();
            rbNormal = new RadioButton();
            grpIngredientes = new GroupBox();
            ckCebolla = new CheckBox();
            ckPina = new CheckBox();
            ckChorizo = new CheckBox();
            ckAnchoas = new CheckBox();
            grpEnsalada = new GroupBox();
            comboEnsalada = new ComboBox();
            grpRefresco = new GroupBox();
            rbGrande = new RadioButton();
            rbMediano = new RadioButton();
            grpMesa = new GroupBox();
            txtNMesa = new TextBox();
            lbNumeroMesa = new Label();
            ((System.ComponentModel.ISupportInitialize)bindingSource1).BeginInit();
            grpMesas.SuspendLayout();
            grpTipoMasa.SuspendLayout();
            grpIngredientes.SuspendLayout();
            grpEnsalada.SuspendLayout();
            grpRefresco.SuspendLayout();
            grpMesa.SuspendLayout();
            SuspendLayout();
            // 
            // lsNumeroMesasSin
            // 
            lsNumeroMesasSin.FormattingEnabled = true;
            lsNumeroMesasSin.ItemHeight = 15;
            lsNumeroMesasSin.Location = new Point(17, 48);
            lsNumeroMesasSin.Name = "lsNumeroMesasSin";
            lsNumeroMesasSin.Size = new Size(133, 199);
            lsNumeroMesasSin.TabIndex = 0;
            lsNumeroMesasSin.SelectedIndexChanged += lsNumeroMesasSin_SelectedIndexChanged;
            // 
            // grpMesas
            // 
            grpMesas.Controls.Add(lsPedidoMesa);
            grpMesas.Controls.Add(btnServida);
            grpMesas.Controls.Add(btnNueva);
            grpMesas.Controls.Add(lsNumeroMesasSin);
            grpMesas.Controls.Add(lblPedido);
            grpMesas.Controls.Add(lbPendienteServir);
            grpMesas.Location = new Point(12, 12);
            grpMesas.Name = "grpMesas";
            grpMesas.Size = new Size(313, 352);
            grpMesas.TabIndex = 2;
            grpMesas.TabStop = false;
            grpMesas.Text = "Mesas";
            // 
            // lsPedidoMesa
            // 
            lsPedidoMesa.FormattingEnabled = true;
            lsPedidoMesa.ItemHeight = 15;
            lsPedidoMesa.Location = new Point(161, 46);
            lsPedidoMesa.Name = "lsPedidoMesa";
            lsPedidoMesa.Size = new Size(133, 199);
            lsPedidoMesa.TabIndex = 4;
            // 
            // btnServida
            // 
            btnServida.Location = new Point(192, 263);
            btnServida.Name = "btnServida";
            btnServida.Size = new Size(75, 23);
            btnServida.TabIndex = 3;
            btnServida.Text = "Servida";
            btnServida.UseVisualStyleBackColor = true;
            // 
            // btnNueva
            // 
            btnNueva.Location = new Point(47, 263);
            btnNueva.Name = "btnNueva";
            btnNueva.Size = new Size(75, 23);
            btnNueva.TabIndex = 2;
            btnNueva.Text = "Nueva";
            btnNueva.UseVisualStyleBackColor = true;
            btnNueva.Click += btnNueva_Click;
            // 
            // lblPedido
            // 
            lblPedido.AutoSize = true;
            lblPedido.Location = new Point(211, 30);
            lblPedido.Name = "lblPedido";
            lblPedido.Size = new Size(44, 15);
            lblPedido.TabIndex = 1;
            lblPedido.Text = "Pedido";
            // 
            // lbPendienteServir
            // 
            lbPendienteServir.AutoSize = true;
            lbPendienteServir.Location = new Point(25, 30);
            lbPendienteServir.Name = "lbPendienteServir";
            lbPendienteServir.Size = new Size(97, 15);
            lbPendienteServir.TabIndex = 0;
            lbPendienteServir.Text = "Pendientes Servir";
            // 
            // grpTipoMasa
            // 
            grpTipoMasa.Controls.Add(rbExtraGruesa);
            grpTipoMasa.Controls.Add(rbFina);
            grpTipoMasa.Controls.Add(rbNormal);
            grpTipoMasa.Location = new Point(347, 22);
            grpTipoMasa.Name = "grpTipoMasa";
            grpTipoMasa.Size = new Size(116, 133);
            grpTipoMasa.TabIndex = 5;
            grpTipoMasa.TabStop = false;
            grpTipoMasa.Text = "Tipo de Masa";
            // 
            // rbExtraGruesa
            // 
            rbExtraGruesa.AutoSize = true;
            rbExtraGruesa.Location = new Point(11, 86);
            rbExtraGruesa.Name = "rbExtraGruesa";
            rbExtraGruesa.Size = new Size(87, 19);
            rbExtraGruesa.TabIndex = 2;
            rbExtraGruesa.TabStop = true;
            rbExtraGruesa.Text = "ExtraGruesa";
            rbExtraGruesa.UseVisualStyleBackColor = true;
            // 
            // rbFina
            // 
            rbFina.AutoSize = true;
            rbFina.Location = new Point(11, 61);
            rbFina.Name = "rbFina";
            rbFina.Size = new Size(47, 19);
            rbFina.TabIndex = 1;
            rbFina.TabStop = true;
            rbFina.Text = "Fina";
            rbFina.UseVisualStyleBackColor = true;
            // 
            // rbNormal
            // 
            rbNormal.AutoSize = true;
            rbNormal.Location = new Point(11, 36);
            rbNormal.Name = "rbNormal";
            rbNormal.Size = new Size(65, 19);
            rbNormal.TabIndex = 0;
            rbNormal.TabStop = true;
            rbNormal.Text = "Normal";
            rbNormal.UseVisualStyleBackColor = true;
            // 
            // grpIngredientes
            // 
            grpIngredientes.Controls.Add(ckCebolla);
            grpIngredientes.Controls.Add(ckPina);
            grpIngredientes.Controls.Add(ckChorizo);
            grpIngredientes.Controls.Add(ckAnchoas);
            grpIngredientes.Location = new Point(347, 198);
            grpIngredientes.Name = "grpIngredientes";
            grpIngredientes.Size = new Size(265, 100);
            grpIngredientes.TabIndex = 6;
            grpIngredientes.TabStop = false;
            grpIngredientes.Text = "Ingredientes";
            // 
            // ckCebolla
            // 
            ckCebolla.AutoSize = true;
            ckCebolla.Enabled = false;
            ckCebolla.Location = new Point(147, 68);
            ckCebolla.Name = "ckCebolla";
            ckCebolla.Size = new Size(66, 19);
            ckCebolla.TabIndex = 3;
            ckCebolla.Text = "Cebolla";
            ckCebolla.UseVisualStyleBackColor = true;
            // 
            // ckPina
            // 
            ckPina.AutoSize = true;
            ckPina.Enabled = false;
            ckPina.Location = new Point(147, 31);
            ckPina.Name = "ckPina";
            ckPina.Size = new Size(49, 19);
            ckPina.TabIndex = 2;
            ckPina.Text = "Piña";
            ckPina.UseVisualStyleBackColor = true;
            // 
            // ckChorizo
            // 
            ckChorizo.AutoSize = true;
            ckChorizo.Location = new Point(33, 68);
            ckChorizo.Name = "ckChorizo";
            ckChorizo.Size = new Size(67, 19);
            ckChorizo.TabIndex = 1;
            ckChorizo.Text = "Chorizo";
            ckChorizo.UseVisualStyleBackColor = true;
            // 
            // ckAnchoas
            // 
            ckAnchoas.AutoSize = true;
            ckAnchoas.Location = new Point(33, 31);
            ckAnchoas.Name = "ckAnchoas";
            ckAnchoas.Size = new Size(72, 19);
            ckAnchoas.TabIndex = 0;
            ckAnchoas.Text = "Anchoas";
            ckAnchoas.UseVisualStyleBackColor = true;
            // 
            // grpEnsalada
            // 
            grpEnsalada.Controls.Add(comboEnsalada);
            grpEnsalada.Location = new Point(476, 27);
            grpEnsalada.Name = "grpEnsalada";
            grpEnsalada.Size = new Size(136, 58);
            grpEnsalada.TabIndex = 7;
            grpEnsalada.TabStop = false;
            grpEnsalada.Text = "Ensalada";
            // 
            // comboEnsalada
            // 
            comboEnsalada.FormattingEnabled = true;
            comboEnsalada.Items.AddRange(new object[] { "Ninguna", "Tropical", "Campera" });
            comboEnsalada.Location = new Point(6, 22);
            comboEnsalada.Name = "comboEnsalada";
            comboEnsalada.Size = new Size(121, 23);
            comboEnsalada.TabIndex = 0;
            // 
            // grpRefresco
            // 
            grpRefresco.Controls.Add(rbGrande);
            grpRefresco.Controls.Add(rbMediano);
            grpRefresco.Location = new Point(476, 92);
            grpRefresco.Name = "grpRefresco";
            grpRefresco.Size = new Size(136, 76);
            grpRefresco.TabIndex = 8;
            grpRefresco.TabStop = false;
            grpRefresco.Text = "Refresco";
            // 
            // rbGrande
            // 
            rbGrande.AutoSize = true;
            rbGrande.Location = new Point(18, 44);
            rbGrande.Name = "rbGrande";
            rbGrande.Size = new Size(63, 19);
            rbGrande.TabIndex = 1;
            rbGrande.TabStop = true;
            rbGrande.Text = "Grande";
            rbGrande.UseVisualStyleBackColor = true;
            // 
            // rbMediano
            // 
            rbMediano.AutoSize = true;
            rbMediano.Location = new Point(18, 19);
            rbMediano.Name = "rbMediano";
            rbMediano.Size = new Size(72, 19);
            rbMediano.TabIndex = 0;
            rbMediano.TabStop = true;
            rbMediano.Text = "Mediano";
            rbMediano.UseVisualStyleBackColor = true;
            // 
            // grpMesa
            // 
            grpMesa.Controls.Add(txtNMesa);
            grpMesa.Controls.Add(lbNumeroMesa);
            grpMesa.Location = new Point(347, 313);
            grpMesa.Name = "grpMesa";
            grpMesa.Size = new Size(265, 51);
            grpMesa.TabIndex = 9;
            grpMesa.TabStop = false;
            grpMesa.Text = "Mesa";
            // 
            // txtNMesa
            // 
            txtNMesa.Location = new Point(147, 19);
            txtNMesa.Name = "txtNMesa";
            txtNMesa.Size = new Size(100, 23);
            txtNMesa.TabIndex = 1;
            // 
            // lbNumeroMesa
            // 
            lbNumeroMesa.AutoSize = true;
            lbNumeroMesa.Location = new Point(38, 22);
            lbNumeroMesa.Name = "lbNumeroMesa";
            lbNumeroMesa.Size = new Size(82, 15);
            lbNumeroMesa.TabIndex = 0;
            lbNumeroMesa.Text = "Numero Mesa";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpMesa);
            Controls.Add(grpRefresco);
            Controls.Add(grpEnsalada);
            Controls.Add(grpIngredientes);
            Controls.Add(grpTipoMasa);
            Controls.Add(grpMesas);
            Name = "Form1";
            Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)bindingSource1).EndInit();
            grpMesas.ResumeLayout(false);
            grpMesas.PerformLayout();
            grpTipoMasa.ResumeLayout(false);
            grpTipoMasa.PerformLayout();
            grpIngredientes.ResumeLayout(false);
            grpIngredientes.PerformLayout();
            grpEnsalada.ResumeLayout(false);
            grpRefresco.ResumeLayout(false);
            grpRefresco.PerformLayout();
            grpMesa.ResumeLayout(false);
            grpMesa.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private ListBox lsNumeroMesasSin;
        private BindingSource bindingSource1;
        private GroupBox grpMesas;
        private Button btnServida;
        private Button btnNueva;
        private Label lblPedido;
        private Label lbPendienteServir;
        private ListBox lsPedidoMesa;
        private GroupBox grpTipoMasa;
        private RadioButton rbExtraGruesa;
        private RadioButton rbFina;
        private RadioButton rbNormal;
        private GroupBox grpIngredientes;
        private CheckBox ckCebolla;
        private CheckBox ckPina;
        private CheckBox ckChorizo;
        private CheckBox ckAnchoas;
        private GroupBox grpEnsalada;
        private ComboBox comboEnsalada;
        private GroupBox grpRefresco;
        private RadioButton rbGrande;
        private RadioButton rbMediano;
        private GroupBox grpMesa;
        private TextBox txtNMesa;
        private Label lbNumeroMesa;
    }
}
