namespace ej4_fundamentos_1
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
            lblFecha = new Label();
            lblResultado = new Label();
            txtFecha = new TextBox();
            txtDia = new TextBox();
            groupBox1 = new GroupBox();
            btnBuscar = new Button();
            groupBox1.SuspendLayout();
            SuspendLayout();
            // 
            // lblFecha
            // 
            lblFecha.AutoSize = true;
            lblFecha.Location = new Point(35, 47);
            lblFecha.Name = "lblFecha";
            lblFecha.Size = new Size(41, 15);
            lblFecha.TabIndex = 0;
            lblFecha.Text = "Fecha:";
            // 
            // lblResultado
            // 
            lblResultado.AutoSize = true;
            lblResultado.Location = new Point(35, 80);
            lblResultado.Name = "lblResultado";
            lblResultado.Size = new Size(27, 15);
            lblResultado.TabIndex = 1;
            lblResultado.Text = "Día:";
            // 
            // txtFecha
            // 
            txtFecha.Location = new Point(102, 44);
            txtFecha.Name = "txtFecha";
            txtFecha.Size = new Size(100, 23);
            txtFecha.TabIndex = 2;
            // 
            // txtDia
            // 
            txtDia.Location = new Point(102, 77);
            txtDia.Name = "txtDia";
            txtDia.Size = new Size(100, 23);
            txtDia.TabIndex = 3;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(btnBuscar);
            groupBox1.Controls.Add(txtFecha);
            groupBox1.Controls.Add(lblFecha);
            groupBox1.Controls.Add(txtDia);
            groupBox1.Controls.Add(lblResultado);
            groupBox1.Location = new Point(34, 26);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(229, 177);
            groupBox1.TabIndex = 4;
            groupBox1.TabStop = false;
            groupBox1.Text = "Saber dia de la semana";
            // 
            // btnBuscar
            // 
            btnBuscar.Location = new Point(63, 117);
            btnBuscar.Name = "btnBuscar";
            btnBuscar.Size = new Size(75, 23);
            btnBuscar.TabIndex = 5;
            btnBuscar.Text = "Buscar";
            btnBuscar.UseVisualStyleBackColor = true;
            btnBuscar.Click += btnBuscar_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(groupBox1);
            Name = "Form1";
            Text = "Form1";
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private Label lblFecha;
        private Label lblResultado;
        private TextBox txtFecha;
        private TextBox txtDia;
        private GroupBox groupBox1;
        private Button btnBuscar;
    }
}
