namespace ej1_fundamentos_1
{
    partial class formSuma
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
            lbNum1 = new Label();
            grpSuma = new GroupBox();
            lblResultado = new Label();
            btnSumar = new Button();
            txtResultado = new TextBox();
            txtNum2 = new TextBox();
            lblNum2 = new Label();
            txtNum1 = new TextBox();
            grpSuma.SuspendLayout();
            SuspendLayout();
            // 
            // lbNum1
            // 
            lbNum1.AutoSize = true;
            lbNum1.Location = new Point(25, 35);
            lbNum1.Name = "lbNum1";
            lbNum1.Size = new Size(63, 15);
            lbNum1.TabIndex = 0;
            lbNum1.Text = "Número 1:";
            // 
            // grpSuma
            // 
            grpSuma.Controls.Add(lblResultado);
            grpSuma.Controls.Add(btnSumar);
            grpSuma.Controls.Add(txtResultado);
            grpSuma.Controls.Add(txtNum2);
            grpSuma.Controls.Add(lblNum2);
            grpSuma.Controls.Add(txtNum1);
            grpSuma.Controls.Add(lbNum1);
            grpSuma.Location = new Point(43, 33);
            grpSuma.Name = "grpSuma";
            grpSuma.Size = new Size(381, 127);
            grpSuma.TabIndex = 1;
            grpSuma.TabStop = false;
            grpSuma.Text = "Realizar una suma:";
            // 
            // lblResultado
            // 
            lblResultado.AutoSize = true;
            lblResultado.Location = new Point(25, 94);
            lblResultado.Name = "lblResultado";
            lblResultado.Size = new Size(62, 15);
            lblResultado.TabIndex = 5;
            lblResultado.Text = "Resultado:";
            // 
            // btnSumar
            // 
            btnSumar.Location = new Point(238, 56);
            btnSumar.Name = "btnSumar";
            btnSumar.Size = new Size(120, 33);
            btnSumar.TabIndex = 2;
            btnSumar.Text = "Sumar";
            btnSumar.UseVisualStyleBackColor = true;
            btnSumar.Click += btnSumar_Click;
            // 
            // txtResultado
            // 
            txtResultado.Location = new Point(94, 91);
            txtResultado.Name = "txtResultado";
            txtResultado.Size = new Size(264, 23);
            txtResultado.TabIndex = 2;
            // 
            // txtNum2
            // 
            txtNum2.Location = new Point(94, 62);
            txtNum2.Name = "txtNum2";
            txtNum2.Size = new Size(100, 23);
            txtNum2.TabIndex = 4;
            // 
            // lblNum2
            // 
            lblNum2.AutoSize = true;
            lblNum2.Location = new Point(25, 65);
            lblNum2.Name = "lblNum2";
            lblNum2.Size = new Size(63, 15);
            lblNum2.TabIndex = 3;
            lblNum2.Text = "Número 2:";
            // 
            // txtNum1
            // 
            txtNum1.Location = new Point(94, 32);
            txtNum1.Name = "txtNum1";
            txtNum1.Size = new Size(100, 23);
            txtNum1.TabIndex = 2;
            // 
            // formSuma
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpSuma);
            Name = "formSuma";
            Text = "Suma:";
            grpSuma.ResumeLayout(false);
            grpSuma.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private Label lbNum1;
        private GroupBox grpSuma;
        private TextBox txtNum2;
        private Label lblNum2;
        private TextBox txtNum1;
        private Label lblResultado;
        private Button btnSumar;
        private TextBox txtResultado;
    }
}
