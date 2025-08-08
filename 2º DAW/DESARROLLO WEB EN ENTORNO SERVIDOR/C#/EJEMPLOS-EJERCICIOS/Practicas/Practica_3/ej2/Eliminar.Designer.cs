namespace ej2
{
    partial class Eliminar
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
            comboElegir = new ComboBox();
            lblCodBuscar = new Label();
            lblDireccion = new Label();
            txtCodBuscar = new TextBox();
            txtDireccion = new TextBox();
            btnEliminar = new Button();
            SuspendLayout();
            // 
            // comboElegir
            // 
            comboElegir.FormattingEnabled = true;
            comboElegir.Items.AddRange(new object[] { "Seleccionar elemento", "Direccion", "Codigo" });
            comboElegir.Location = new Point(12, 12);
            comboElegir.Name = "comboElegir";
            comboElegir.Size = new Size(121, 23);
            comboElegir.TabIndex = 0;
            comboElegir.SelectedIndexChanged += comboElegir_SelectedIndexChanged;
            // 
            // lblCodBuscar
            // 
            lblCodBuscar.AutoSize = true;
            lblCodBuscar.Location = new Point(12, 47);
            lblCodBuscar.Name = "lblCodBuscar";
            lblCodBuscar.Size = new Size(49, 15);
            lblCodBuscar.TabIndex = 1;
            lblCodBuscar.Text = "Codigo:";
            lblCodBuscar.Visible = false;
            // 
            // lblDireccion
            // 
            lblDireccion.AutoSize = true;
            lblDireccion.Location = new Point(12, 47);
            lblDireccion.Name = "lblDireccion";
            lblDireccion.Size = new Size(57, 15);
            lblDireccion.TabIndex = 2;
            lblDireccion.Text = "Direccion";
            lblDireccion.Visible = false;
            // 
            // txtCodBuscar
            // 
            txtCodBuscar.Location = new Point(67, 44);
            txtCodBuscar.Name = "txtCodBuscar";
            txtCodBuscar.Size = new Size(100, 23);
            txtCodBuscar.TabIndex = 3;
            txtCodBuscar.Visible = false;
            // 
            // txtDireccion
            // 
            txtDireccion.Location = new Point(67, 44);
            txtDireccion.Name = "txtDireccion";
            txtDireccion.Size = new Size(100, 23);
            txtDireccion.TabIndex = 4;
            txtDireccion.Visible = false;
            // 
            // btnEliminar
            // 
            btnEliminar.Location = new Point(35, 73);
            btnEliminar.Name = "btnEliminar";
            btnEliminar.Size = new Size(75, 23);
            btnEliminar.TabIndex = 5;
            btnEliminar.Text = "Eliminar";
            btnEliminar.UseVisualStyleBackColor = true;
            btnEliminar.Click += btnEliminar_Click;
            // 
            // Eliminar
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(btnEliminar);
            Controls.Add(txtDireccion);
            Controls.Add(txtCodBuscar);
            Controls.Add(lblDireccion);
            Controls.Add(lblCodBuscar);
            Controls.Add(comboElegir);
            Name = "Eliminar";
            Text = "Eliminar";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private ComboBox comboElegir;
        private Label lblCodBuscar;
        private Label lblDireccion;
        private TextBox txtCodBuscar;
        private TextBox txtDireccion;
        private Button btnEliminar;
    }
}