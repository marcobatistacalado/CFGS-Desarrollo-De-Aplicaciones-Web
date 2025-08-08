namespace ej5_fundamentos_1
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
            lblFechaActual = new Label();
            ckCambiarFormato = new CheckBox();
            grpIncrementar = new GroupBox();
            btnIncrementar = new Button();
            txtIncremento = new TextBox();
            lblIncremento = new Label();
            rbAnos = new RadioButton();
            rbMeses = new RadioButton();
            rbDias = new RadioButton();
            backgroundWorker1 = new System.ComponentModel.BackgroundWorker();
            txtFechaActual = new TextBox();
            grpIncrementar.SuspendLayout();
            SuspendLayout();
            // 
            // lblFechaActual
            // 
            lblFechaActual.AutoSize = true;
            lblFechaActual.Location = new Point(39, 26);
            lblFechaActual.Name = "lblFechaActual";
            lblFechaActual.Size = new Size(75, 15);
            lblFechaActual.TabIndex = 0;
            lblFechaActual.Text = "Fecha Actual";
            // 
            // ckCambiarFormato
            // 
            ckCambiarFormato.AutoSize = true;
            ckCambiarFormato.Location = new Point(39, 92);
            ckCambiarFormato.Name = "ckCambiarFormato";
            ckCambiarFormato.Size = new Size(153, 19);
            ckCambiarFormato.TabIndex = 1;
            ckCambiarFormato.Text = "Cambiar Formato Fecha";
            ckCambiarFormato.UseVisualStyleBackColor = true;
            // 
            // grpIncrementar
            // 
            grpIncrementar.Controls.Add(btnIncrementar);
            grpIncrementar.Controls.Add(txtIncremento);
            grpIncrementar.Controls.Add(lblIncremento);
            grpIncrementar.Controls.Add(rbAnos);
            grpIncrementar.Controls.Add(rbMeses);
            grpIncrementar.Controls.Add(rbDias);
            grpIncrementar.Location = new Point(39, 138);
            grpIncrementar.Name = "grpIncrementar";
            grpIncrementar.Size = new Size(475, 248);
            grpIncrementar.TabIndex = 3;
            grpIncrementar.TabStop = false;
            grpIncrementar.Text = "Incrementar Fecha";
            // 
            // btnIncrementar
            // 
            btnIncrementar.Location = new Point(188, 82);
            btnIncrementar.Name = "btnIncrementar";
            btnIncrementar.Size = new Size(164, 23);
            btnIncrementar.TabIndex = 4;
            btnIncrementar.Text = "Incrementar";
            btnIncrementar.UseVisualStyleBackColor = true;
            btnIncrementar.Click += btnIncrementar_Click;
            // 
            // txtIncremento
            // 
            txtIncremento.Location = new Point(262, 34);
            txtIncremento.Name = "txtIncremento";
            txtIncremento.Size = new Size(100, 23);
            txtIncremento.TabIndex = 4;
            // 
            // lblIncremento
            // 
            lblIncremento.AutoSize = true;
            lblIncremento.Location = new Point(188, 38);
            lblIncremento.Name = "lblIncremento";
            lblIncremento.Size = new Size(68, 15);
            lblIncremento.TabIndex = 4;
            lblIncremento.Text = "Incremento";
            // 
            // rbAnos
            // 
            rbAnos.AutoSize = true;
            rbAnos.Location = new Point(26, 84);
            rbAnos.Name = "rbAnos";
            rbAnos.Size = new Size(52, 19);
            rbAnos.TabIndex = 2;
            rbAnos.TabStop = true;
            rbAnos.Text = "Años";
            rbAnos.UseVisualStyleBackColor = true;
            // 
            // rbMeses
            // 
            rbMeses.AutoSize = true;
            rbMeses.Location = new Point(26, 59);
            rbMeses.Name = "rbMeses";
            rbMeses.Size = new Size(58, 19);
            rbMeses.TabIndex = 1;
            rbMeses.TabStop = true;
            rbMeses.Text = "Meses";
            rbMeses.UseVisualStyleBackColor = true;
            // 
            // rbDias
            // 
            rbDias.AutoSize = true;
            rbDias.Location = new Point(26, 34);
            rbDias.Name = "rbDias";
            rbDias.Size = new Size(47, 19);
            rbDias.TabIndex = 0;
            rbDias.TabStop = true;
            rbDias.Text = "Dias";
            rbDias.UseVisualStyleBackColor = true;
            // 
            // txtFechaActual
            // 
            txtFechaActual.Location = new Point(39, 54);
            txtFechaActual.Name = "txtFechaActual";
            txtFechaActual.Size = new Size(100, 23);
            txtFechaActual.TabIndex = 2;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpIncrementar);
            Controls.Add(txtFechaActual);
            Controls.Add(ckCambiarFormato);
            Controls.Add(lblFechaActual);
            Name = "Form1";
            Text = "Form1";
            grpIncrementar.ResumeLayout(false);
            grpIncrementar.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label lblFechaActual;
        private CheckBox ckCambiarFormato;
        private GroupBox grpIncrementar;
        private Button btnIncrementar;
        private TextBox txtIncremento;
        private Label lblIncremento;
        private RadioButton rbAnos;
        private RadioButton rbMeses;
        private RadioButton rbDias;
        private System.ComponentModel.BackgroundWorker backgroundWorker1;
        private TextBox txtFechaActual;
    }
}
