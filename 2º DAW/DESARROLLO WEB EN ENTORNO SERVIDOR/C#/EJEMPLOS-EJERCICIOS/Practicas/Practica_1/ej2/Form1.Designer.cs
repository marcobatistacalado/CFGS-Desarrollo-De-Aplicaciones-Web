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
            groupBox1 = new GroupBox();
            btnCalcular = new Button();
            lblPuntuacion = new Label();
            txtPuntuacion = new TextBox();
            txtEmpatado = new TextBox();
            txtGanado = new TextBox();
            lblEmpatado = new Label();
            lblGanado = new Label();
            groupBox1.SuspendLayout();
            SuspendLayout();
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(btnCalcular);
            groupBox1.Controls.Add(lblPuntuacion);
            groupBox1.Controls.Add(txtPuntuacion);
            groupBox1.Controls.Add(txtEmpatado);
            groupBox1.Controls.Add(txtGanado);
            groupBox1.Controls.Add(lblEmpatado);
            groupBox1.Controls.Add(lblGanado);
            groupBox1.Location = new Point(24, 29);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(446, 247);
            groupBox1.TabIndex = 0;
            groupBox1.TabStop = false;
            groupBox1.Text = "groupBox1";
            // 
            // btnCalcular
            // 
            btnCalcular.Location = new Point(180, 122);
            btnCalcular.Name = "btnCalcular";
            btnCalcular.Size = new Size(75, 23);
            btnCalcular.TabIndex = 4;
            btnCalcular.Text = "Calcular";
            btnCalcular.UseVisualStyleBackColor = true;
            btnCalcular.Click += btnCalcular_Click;
            // 
            // lblPuntuacion
            // 
            lblPuntuacion.AutoSize = true;
            lblPuntuacion.Location = new Point(290, 42);
            lblPuntuacion.Name = "lblPuntuacion";
            lblPuntuacion.Size = new Size(71, 15);
            lblPuntuacion.TabIndex = 1;
            lblPuntuacion.Text = "Puntuacion:";
            // 
            // txtPuntuacion
            // 
            txtPuntuacion.Enabled = false;
            txtPuntuacion.Location = new Point(277, 63);
            txtPuntuacion.Name = "txtPuntuacion";
            txtPuntuacion.Size = new Size(100, 23);
            txtPuntuacion.TabIndex = 2;
            // 
            // txtEmpatado
            // 
            txtEmpatado.Location = new Point(118, 77);
            txtEmpatado.Name = "txtEmpatado";
            txtEmpatado.Size = new Size(100, 23);
            txtEmpatado.TabIndex = 3;
            // 
            // txtGanado
            // 
            txtGanado.Location = new Point(118, 34);
            txtGanado.Name = "txtGanado";
            txtGanado.Size = new Size(100, 23);
            txtGanado.TabIndex = 2;
            // 
            // lblEmpatado
            // 
            lblEmpatado.AutoSize = true;
            lblEmpatado.Location = new Point(43, 80);
            lblEmpatado.Name = "lblEmpatado";
            lblEmpatado.Size = new Size(69, 15);
            lblEmpatado.TabIndex = 1;
            lblEmpatado.Text = "Empatados:";
            // 
            // lblGanado
            // 
            lblGanado.AutoSize = true;
            lblGanado.Location = new Point(43, 37);
            lblGanado.Name = "lblGanado";
            lblGanado.Size = new Size(56, 15);
            lblGanado.TabIndex = 0;
            lblGanado.Text = "Ganados:";
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

        private GroupBox groupBox1;
        private TextBox txtEmpatado;
        private TextBox txtGanado;
        private Label lblEmpatado;
        private Label lblGanado;
        private Button btnCalcular;
        private Label lblPuntuacion;
        private TextBox txtPuntuacion;
    }
}
