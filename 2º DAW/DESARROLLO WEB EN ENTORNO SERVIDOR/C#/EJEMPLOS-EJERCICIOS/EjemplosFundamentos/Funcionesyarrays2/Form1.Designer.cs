namespace Funcionesyarrays2
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
            grpNumero = new GroupBox();
            btnAceptar = new Button();
            txtNum = new TextBox();
            lblNum = new Label();
            grpLista = new GroupBox();
            btnVer = new Button();
            btnBorrar = new Button();
            btnCuadrado = new Button();
            txtNum5 = new TextBox();
            txtNum4 = new TextBox();
            txtNum3 = new TextBox();
            txtNum2 = new TextBox();
            txtNum1 = new TextBox();
            grpNumero.SuspendLayout();
            grpLista.SuspendLayout();
            SuspendLayout();
            // 
            // grpNumero
            // 
            grpNumero.Controls.Add(btnAceptar);
            grpNumero.Controls.Add(txtNum);
            grpNumero.Controls.Add(lblNum);
            grpNumero.Location = new Point(22, 27);
            grpNumero.Name = "grpNumero";
            grpNumero.Size = new Size(354, 72);
            grpNumero.TabIndex = 0;
            grpNumero.TabStop = false;
            grpNumero.Text = "Introducir numeros";
            // 
            // btnAceptar
            // 
            btnAceptar.Location = new Point(254, 29);
            btnAceptar.Name = "btnAceptar";
            btnAceptar.Size = new Size(75, 23);
            btnAceptar.TabIndex = 2;
            btnAceptar.Text = "Aceptar";
            btnAceptar.UseVisualStyleBackColor = true;
            btnAceptar.Click += btnAceptar_Click;
            // 
            // txtNum
            // 
            txtNum.Location = new Point(132, 29);
            txtNum.Name = "txtNum";
            txtNum.Size = new Size(100, 23);
            txtNum.TabIndex = 1;
            // 
            // lblNum
            // 
            lblNum.AutoSize = true;
            lblNum.Location = new Point(20, 29);
            lblNum.Name = "lblNum";
            lblNum.Size = new Size(106, 15);
            lblNum.TabIndex = 0;
            lblNum.Text = "Introduce numero:";
            // 
            // grpLista
            // 
            grpLista.Controls.Add(btnVer);
            grpLista.Controls.Add(btnBorrar);
            grpLista.Controls.Add(btnCuadrado);
            grpLista.Controls.Add(txtNum5);
            grpLista.Controls.Add(txtNum4);
            grpLista.Controls.Add(txtNum3);
            grpLista.Controls.Add(txtNum2);
            grpLista.Controls.Add(txtNum1);
            grpLista.Location = new Point(22, 124);
            grpLista.Name = "grpLista";
            grpLista.Size = new Size(354, 171);
            grpLista.TabIndex = 1;
            grpLista.TabStop = false;
            grpLista.Text = "Lista de numeros";
            // 
            // btnVer
            // 
            btnVer.Location = new Point(20, 114);
            btnVer.Name = "btnVer";
            btnVer.Size = new Size(75, 23);
            btnVer.TabIndex = 2;
            btnVer.Text = "Ver";
            btnVer.UseVisualStyleBackColor = true;
            btnVer.Click += btnVer_Click;
            // 
            // btnBorrar
            // 
            btnBorrar.Location = new Point(124, 114);
            btnBorrar.Name = "btnBorrar";
            btnBorrar.Size = new Size(75, 23);
            btnBorrar.TabIndex = 3;
            btnBorrar.Text = "Borrar";
            btnBorrar.UseVisualStyleBackColor = true;
            btnBorrar.Click += btnBorrar_Click;
            // 
            // btnCuadrado
            // 
            btnCuadrado.Location = new Point(228, 114);
            btnCuadrado.Name = "btnCuadrado";
            btnCuadrado.Size = new Size(75, 23);
            btnCuadrado.TabIndex = 4;
            btnCuadrado.Text = "Cuadrado";
            btnCuadrado.UseVisualStyleBackColor = true;
            btnCuadrado.Click += btnCuadrado_Click;
            // 
            // txtNum5
            // 
            txtNum5.Enabled = false;
            txtNum5.Location = new Point(268, 48);
            txtNum5.Name = "txtNum5";
            txtNum5.Size = new Size(36, 23);
            txtNum5.TabIndex = 7;
            // 
            // txtNum4
            // 
            txtNum4.Enabled = false;
            txtNum4.Location = new Point(206, 48);
            txtNum4.Name = "txtNum4";
            txtNum4.Size = new Size(36, 23);
            txtNum4.TabIndex = 6;
            // 
            // txtNum3
            // 
            txtNum3.Enabled = false;
            txtNum3.Location = new Point(144, 48);
            txtNum3.Name = "txtNum3";
            txtNum3.Size = new Size(36, 23);
            txtNum3.TabIndex = 5;
            // 
            // txtNum2
            // 
            txtNum2.Enabled = false;
            txtNum2.Location = new Point(82, 48);
            txtNum2.Name = "txtNum2";
            txtNum2.Size = new Size(36, 23);
            txtNum2.TabIndex = 4;
            // 
            // txtNum1
            // 
            txtNum1.Enabled = false;
            txtNum1.Location = new Point(20, 48);
            txtNum1.Name = "txtNum1";
            txtNum1.Size = new Size(36, 23);
            txtNum1.TabIndex = 3;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpLista);
            Controls.Add(grpNumero);
            Name = "Form1";
            Text = "Form1";
            grpNumero.ResumeLayout(false);
            grpNumero.PerformLayout();
            grpLista.ResumeLayout(false);
            grpLista.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox grpNumero;
        private Label lblNum;
        private Button btnAceptar;
        private TextBox txtNum;
        private GroupBox grpLista;
        private TextBox txtNum1;
        private Button btnVer;
        private Button btnBorrar;
        private Button btnCuadrado;
        private TextBox txtNum5;
        private TextBox txtNum4;
        private TextBox txtNum3;
        private TextBox txtNum2;
    }
}
