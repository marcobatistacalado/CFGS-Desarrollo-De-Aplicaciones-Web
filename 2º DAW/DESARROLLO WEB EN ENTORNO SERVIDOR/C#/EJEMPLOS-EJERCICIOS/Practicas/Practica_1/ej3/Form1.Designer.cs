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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            txtDni = new TextBox();
            lblDni = new Label();
            grpValidacion = new GroupBox();
            btnValidar = new Button();
            pcCorrecto = new PictureBox();
            imageList1 = new ImageList(components);
            pcIncorrecto = new PictureBox();
            grpValidacion.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pcCorrecto).BeginInit();
            ((System.ComponentModel.ISupportInitialize)pcIncorrecto).BeginInit();
            SuspendLayout();
            // 
            // txtDni
            // 
            txtDni.Location = new Point(55, 22);
            txtDni.Name = "txtDni";
            txtDni.Size = new Size(100, 23);
            txtDni.TabIndex = 0;
            // 
            // lblDni
            // 
            lblDni.AutoSize = true;
            lblDni.Location = new Point(19, 30);
            lblDni.Name = "lblDni";
            lblDni.Size = new Size(30, 15);
            lblDni.TabIndex = 1;
            lblDni.Text = "DNI:";
            // 
            // grpValidacion
            // 
            grpValidacion.Controls.Add(btnValidar);
            grpValidacion.Controls.Add(txtDni);
            grpValidacion.Controls.Add(lblDni);
            grpValidacion.Location = new Point(37, 33);
            grpValidacion.Name = "grpValidacion";
            grpValidacion.Size = new Size(200, 100);
            grpValidacion.TabIndex = 2;
            grpValidacion.TabStop = false;
            grpValidacion.Text = "Validar DNi:";
            // 
            // btnValidar
            // 
            btnValidar.Location = new Point(55, 61);
            btnValidar.Name = "btnValidar";
            btnValidar.Size = new Size(75, 23);
            btnValidar.TabIndex = 3;
            btnValidar.Text = "Validar";
            btnValidar.UseVisualStyleBackColor = true;
            btnValidar.Click += btnValidar_Click;
            // 
            // pcCorrecto
            // 
            pcCorrecto.Image = (Image)resources.GetObject("pcCorrecto.Image");
            pcCorrecto.Location = new Point(254, 33);
            pcCorrecto.Name = "pcCorrecto";
            pcCorrecto.Size = new Size(123, 100);
            pcCorrecto.SizeMode = PictureBoxSizeMode.Zoom;
            pcCorrecto.TabIndex = 4;
            pcCorrecto.TabStop = false;
            pcCorrecto.Visible = false;
            // 
            // imageList1
            // 
            imageList1.ColorDepth = ColorDepth.Depth32Bit;
            imageList1.ImageSize = new Size(16, 16);
            imageList1.TransparentColor = Color.Transparent;
            // 
            // pcIncorrecto
            // 
            pcIncorrecto.Image = (Image)resources.GetObject("pcIncorrecto.Image");
            pcIncorrecto.Location = new Point(254, 46);
            pcIncorrecto.Name = "pcIncorrecto";
            pcIncorrecto.Size = new Size(123, 87);
            pcIncorrecto.SizeMode = PictureBoxSizeMode.Zoom;
            pcIncorrecto.TabIndex = 5;
            pcIncorrecto.TabStop = false;
            pcIncorrecto.Visible = false;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(pcIncorrecto);
            Controls.Add(pcCorrecto);
            Controls.Add(grpValidacion);
            Name = "Form1";
            Text = "Form1";
            grpValidacion.ResumeLayout(false);
            grpValidacion.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pcCorrecto).EndInit();
            ((System.ComponentModel.ISupportInitialize)pcIncorrecto).EndInit();
            ResumeLayout(false);
        }

        #endregion

        private TextBox txtDni;
        private Label lblDni;
        private GroupBox grpValidacion;
        private Button btnValidar;
        private PictureBox pcCorrecto;
        private ImageList imageList1;
        private PictureBox pcIncorrecto;
    }
}
