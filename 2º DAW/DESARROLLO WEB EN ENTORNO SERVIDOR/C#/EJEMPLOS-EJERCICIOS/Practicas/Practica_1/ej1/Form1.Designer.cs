namespace ej1
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
            lblHoras = new Label();
            lblSalarioHora = new Label();
            lblSalarioMensual = new Label();
            txtHoras = new TextBox();
            txtSalarioHora = new TextBox();
            txtSalarioMensual = new TextBox();
            btnCalcular = new Button();
            grpCalcularSalario = new GroupBox();
            grpCalcularSalario.SuspendLayout();
            SuspendLayout();
            // 
            // lblHoras
            // 
            lblHoras.AutoSize = true;
            lblHoras.Location = new Point(20, 32);
            lblHoras.Name = "lblHoras";
            lblHoras.Size = new Size(41, 15);
            lblHoras.TabIndex = 0;
            lblHoras.Text = "Horas:";
            // 
            // lblSalarioHora
            // 
            lblSalarioHora.AutoSize = true;
            lblSalarioHora.Location = new Point(20, 68);
            lblSalarioHora.Name = "lblSalarioHora";
            lblSalarioHora.Size = new Size(76, 15);
            lblSalarioHora.TabIndex = 1;
            lblSalarioHora.Text = "Salario/Hora:";
            // 
            // lblSalarioMensual
            // 
            lblSalarioMensual.AutoSize = true;
            lblSalarioMensual.Location = new Point(20, 104);
            lblSalarioMensual.Name = "lblSalarioMensual";
            lblSalarioMensual.Size = new Size(93, 15);
            lblSalarioMensual.TabIndex = 2;
            lblSalarioMensual.Text = "Salario Mensual:";
            // 
            // txtHoras
            // 
            txtHoras.Location = new Point(130, 29);
            txtHoras.Name = "txtHoras";
            txtHoras.Size = new Size(100, 23);
            txtHoras.TabIndex = 3;
            // 
            // txtSalarioHora
            // 
            txtSalarioHora.Location = new Point(130, 65);
            txtSalarioHora.Name = "txtSalarioHora";
            txtSalarioHora.Size = new Size(100, 23);
            txtSalarioHora.TabIndex = 4;
            // 
            // txtSalarioMensual
            // 
            txtSalarioMensual.Location = new Point(130, 101);
            txtSalarioMensual.Name = "txtSalarioMensual";
            txtSalarioMensual.Size = new Size(100, 23);
            txtSalarioMensual.TabIndex = 5;
            // 
            // btnCalcular
            // 
            btnCalcular.Location = new Point(95, 149);
            btnCalcular.Name = "btnCalcular";
            btnCalcular.Size = new Size(75, 23);
            btnCalcular.TabIndex = 6;
            btnCalcular.Text = "Calcular";
            btnCalcular.UseVisualStyleBackColor = true;
            btnCalcular.Click += btnCalcular_Click;
            // 
            // grpCalcularSalario
            // 
            grpCalcularSalario.Controls.Add(lblHoras);
            grpCalcularSalario.Controls.Add(btnCalcular);
            grpCalcularSalario.Controls.Add(lblSalarioHora);
            grpCalcularSalario.Controls.Add(txtSalarioMensual);
            grpCalcularSalario.Controls.Add(lblSalarioMensual);
            grpCalcularSalario.Controls.Add(txtSalarioHora);
            grpCalcularSalario.Controls.Add(txtHoras);
            grpCalcularSalario.Location = new Point(24, 12);
            grpCalcularSalario.Name = "grpCalcularSalario";
            grpCalcularSalario.Size = new Size(319, 201);
            grpCalcularSalario.TabIndex = 7;
            grpCalcularSalario.TabStop = false;
            grpCalcularSalario.Text = "Calcular Salario:";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpCalcularSalario);
            Name = "Form1";
            Text = "Form1";
            grpCalcularSalario.ResumeLayout(false);
            grpCalcularSalario.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private Label lblHoras;
        private Label lblSalarioHora;
        private Label lblSalarioMensual;
        private TextBox txtHoras;
        private TextBox txtSalarioHora;
        private TextBox txtSalarioMensual;
        private Button btnCalcular;
        private GroupBox grpCalcularSalario;
    }
}
