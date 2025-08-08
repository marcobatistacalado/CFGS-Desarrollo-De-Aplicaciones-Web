namespace ej2_fundamentos_1
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
            grpPos = new GroupBox();
            btnPos = new Button();
            txtY = new TextBox();
            txtX = new TextBox();
            lblPosY = new Label();
            lblPosX = new Label();
            grpColor = new GroupBox();
            btnColor = new Button();
            txtAzul = new TextBox();
            txtVerde = new TextBox();
            txtRojo = new TextBox();
            lblAzul = new Label();
            lblVerde = new Label();
            lblRojo = new Label();
            contextMenuStrip1 = new ContextMenuStrip(components);
            lblResultado = new Label();
            grpContenedor = new GroupBox();
            grpPos.SuspendLayout();
            grpColor.SuspendLayout();
            grpContenedor.SuspendLayout();
            SuspendLayout();
            // 
            // grpPos
            // 
            grpPos.Controls.Add(btnPos);
            grpPos.Controls.Add(txtY);
            grpPos.Controls.Add(txtX);
            grpPos.Controls.Add(lblPosY);
            grpPos.Controls.Add(lblPosX);
            grpPos.Location = new Point(27, 29);
            grpPos.Name = "grpPos";
            grpPos.Size = new Size(281, 182);
            grpPos.TabIndex = 0;
            grpPos.TabStop = false;
            grpPos.Text = "Posición";
            // 
            // btnPos
            // 
            btnPos.Location = new Point(45, 127);
            btnPos.Name = "btnPos";
            btnPos.Size = new Size(159, 39);
            btnPos.TabIndex = 8;
            btnPos.Text = "Cambiar Posición";
            btnPos.UseVisualStyleBackColor = true;
            btnPos.Click += btnPos_Click;
            // 
            // txtY
            // 
            txtY.Location = new Point(104, 69);
            txtY.Name = "txtY";
            txtY.Size = new Size(100, 23);
            txtY.TabIndex = 6;
            // 
            // txtX
            // 
            txtX.Location = new Point(104, 25);
            txtX.Name = "txtX";
            txtX.Size = new Size(100, 23);
            txtX.TabIndex = 5;
            // 
            // lblPosY
            // 
            lblPosY.AutoSize = true;
            lblPosY.Location = new Point(21, 72);
            lblPosY.Name = "lblPosY";
            lblPosY.Size = new Size(62, 15);
            lblPosY.TabIndex = 1;
            lblPosY.Text = "Posición Y";
            // 
            // lblPosX
            // 
            lblPosX.AutoSize = true;
            lblPosX.Location = new Point(21, 28);
            lblPosX.Name = "lblPosX";
            lblPosX.Size = new Size(62, 15);
            lblPosX.TabIndex = 0;
            lblPosX.Text = "Posición X";
            // 
            // grpColor
            // 
            grpColor.Controls.Add(btnColor);
            grpColor.Controls.Add(txtAzul);
            grpColor.Controls.Add(txtVerde);
            grpColor.Controls.Add(txtRojo);
            grpColor.Controls.Add(lblAzul);
            grpColor.Controls.Add(lblVerde);
            grpColor.Controls.Add(lblRojo);
            grpColor.Location = new Point(331, 29);
            grpColor.Name = "grpColor";
            grpColor.Size = new Size(281, 182);
            grpColor.TabIndex = 1;
            grpColor.TabStop = false;
            grpColor.Text = "Color";
            // 
            // btnColor
            // 
            btnColor.Location = new Point(49, 127);
            btnColor.Name = "btnColor";
            btnColor.Size = new Size(159, 39);
            btnColor.TabIndex = 7;
            btnColor.Text = "Cambiar Color";
            btnColor.UseVisualStyleBackColor = true;
            btnColor.Click += btnColor_Click;
            // 
            // txtAzul
            // 
            txtAzul.Location = new Point(77, 98);
            txtAzul.Name = "txtAzul";
            txtAzul.Size = new Size(100, 23);
            txtAzul.TabIndex = 6;
            // 
            // txtVerde
            // 
            txtVerde.Location = new Point(77, 63);
            txtVerde.Name = "txtVerde";
            txtVerde.Size = new Size(100, 23);
            txtVerde.TabIndex = 7;
            // 
            // txtRojo
            // 
            txtRojo.Location = new Point(77, 25);
            txtRojo.Name = "txtRojo";
            txtRojo.Size = new Size(100, 23);
            txtRojo.TabIndex = 6;
            // 
            // lblAzul
            // 
            lblAzul.AutoSize = true;
            lblAzul.Location = new Point(24, 98);
            lblAzul.Name = "lblAzul";
            lblAzul.Size = new Size(30, 15);
            lblAzul.TabIndex = 4;
            lblAzul.Text = "Azul";
            // 
            // lblVerde
            // 
            lblVerde.AutoSize = true;
            lblVerde.Location = new Point(23, 63);
            lblVerde.Name = "lblVerde";
            lblVerde.Size = new Size(36, 15);
            lblVerde.TabIndex = 3;
            lblVerde.Text = "Verde";
            // 
            // lblRojo
            // 
            lblRojo.AutoSize = true;
            lblRojo.Location = new Point(23, 28);
            lblRojo.Name = "lblRojo";
            lblRojo.Size = new Size(31, 15);
            lblRojo.TabIndex = 2;
            lblRojo.Text = "Rojo";
            // 
            // contextMenuStrip1
            // 
            contextMenuStrip1.Name = "contextMenuStrip1";
            contextMenuStrip1.Size = new Size(61, 4);
            // 
            // lblResultado
            // 
            lblResultado.AutoSize = true;
            lblResultado.BackColor = SystemColors.MenuHighlight;
            lblResultado.Font = new Font("Segoe UI", 15F);
            lblResultado.Location = new Point(145, 76);
            lblResultado.Name = "lblResultado";
            lblResultado.Size = new Size(291, 28);
            lblResultado.TabIndex = 8;
            lblResultado.Text = "CAMBIO DE COLOR Y POSICIÓN";
            // 
            // grpContenedor
            // 
            grpContenedor.Controls.Add(lblResultado);
            grpContenedor.Location = new Point(111, 240);
            grpContenedor.Name = "grpContenedor";
            grpContenedor.Size = new Size(591, 166);
            grpContenedor.TabIndex = 9;
            grpContenedor.TabStop = false;
            grpContenedor.Text = "Contenedor";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(grpContenedor);
            Controls.Add(grpColor);
            Controls.Add(grpPos);
            Name = "Form1";
            Text = "Form1";
            grpPos.ResumeLayout(false);
            grpPos.PerformLayout();
            grpColor.ResumeLayout(false);
            grpColor.PerformLayout();
            grpContenedor.ResumeLayout(false);
            grpContenedor.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox grpPos;
        private Label lblPosX;
        private GroupBox grpColor;
        private Label lblPosY;
        private Label lblRojo;
        private Label lblVerde;
        private Label lblAzul;
        private TextBox txtY;
        private TextBox txtX;
        private TextBox txtAzul;
        private TextBox txtVerde;
        private TextBox txtRojo;
        private ContextMenuStrip contextMenuStrip1;
        private Button btnPos;
        private Button btnColor;
        private Label lblResultado;
        private GroupBox grpContenedor;
    }
}
