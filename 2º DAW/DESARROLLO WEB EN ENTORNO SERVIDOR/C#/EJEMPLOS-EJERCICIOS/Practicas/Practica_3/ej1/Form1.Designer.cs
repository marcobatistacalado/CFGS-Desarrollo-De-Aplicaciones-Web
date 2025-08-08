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
            grpTipo = new GroupBox();
            rbImportacion = new RadioButton();
            rbArtesano = new RadioButton();
            rbNormal = new RadioButton();
            grpDatos = new GroupBox();
            dateCaducidad = new DateTimePicker();
            lbPeso = new Label();
            lbCaducidad = new Label();
            lbLote = new Label();
            txtMarca = new TextBox();
            lbMarca = new Label();
            lbFabricante = new Label();
            txtFabricante = new TextBox();
            txtLote = new TextBox();
            txtPeso = new TextBox();
            backgroundWorker1 = new System.ComponentModel.BackgroundWorker();
            grpOtros = new GroupBox();
            txtProcedencia = new TextBox();
            txtOrigen = new TextBox();
            lbProcedencia = new Label();
            lbOrigen = new Label();
            btnAceptar = new Button();
            openFileDialog1 = new OpenFileDialog();
            openFileDialog2 = new OpenFileDialog();
            openFileDialog3 = new OpenFileDialog();
            btnImagen = new Button();
            pcImagen = new PictureBox();
            grpTipo.SuspendLayout();
            grpDatos.SuspendLayout();
            grpOtros.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pcImagen).BeginInit();
            SuspendLayout();
            // 
            // grpTipo
            // 
            grpTipo.Controls.Add(rbImportacion);
            grpTipo.Controls.Add(rbArtesano);
            grpTipo.Controls.Add(rbNormal);
            grpTipo.Location = new Point(31, 29);
            grpTipo.Name = "grpTipo";
            grpTipo.Size = new Size(181, 100);
            grpTipo.TabIndex = 0;
            grpTipo.TabStop = false;
            grpTipo.Text = "Tipo de Queso";
            // 
            // rbImportacion
            // 
            rbImportacion.AutoSize = true;
            rbImportacion.Location = new Point(25, 75);
            rbImportacion.Name = "rbImportacion";
            rbImportacion.Size = new Size(90, 19);
            rbImportacion.TabIndex = 3;
            rbImportacion.TabStop = true;
            rbImportacion.Text = "Importación";
            rbImportacion.UseVisualStyleBackColor = true;
            rbImportacion.CheckedChanged += rbImportacion_CheckedChanged;
            // 
            // rbArtesano
            // 
            rbArtesano.AutoSize = true;
            rbArtesano.Location = new Point(25, 50);
            rbArtesano.Name = "rbArtesano";
            rbArtesano.Size = new Size(72, 19);
            rbArtesano.TabIndex = 2;
            rbArtesano.TabStop = true;
            rbArtesano.Text = "Artesano";
            rbArtesano.UseVisualStyleBackColor = true;
            rbArtesano.CheckedChanged += rbArtesano_CheckedChanged;
            // 
            // rbNormal
            // 
            rbNormal.AutoSize = true;
            rbNormal.Location = new Point(25, 22);
            rbNormal.Name = "rbNormal";
            rbNormal.Size = new Size(65, 19);
            rbNormal.TabIndex = 1;
            rbNormal.TabStop = true;
            rbNormal.Text = "Normal";
            rbNormal.UseVisualStyleBackColor = true;
            rbNormal.CheckedChanged += rbNormal_CheckedChanged;
            // 
            // grpDatos
            // 
            grpDatos.Controls.Add(dateCaducidad);
            grpDatos.Controls.Add(lbPeso);
            grpDatos.Controls.Add(lbCaducidad);
            grpDatos.Controls.Add(lbLote);
            grpDatos.Controls.Add(txtMarca);
            grpDatos.Controls.Add(lbMarca);
            grpDatos.Controls.Add(lbFabricante);
            grpDatos.Controls.Add(txtFabricante);
            grpDatos.Controls.Add(txtLote);
            grpDatos.Controls.Add(txtPeso);
            grpDatos.Location = new Point(218, 29);
            grpDatos.Name = "grpDatos";
            grpDatos.Size = new Size(325, 241);
            grpDatos.TabIndex = 5;
            grpDatos.TabStop = false;
            grpDatos.Text = "Datos";
            // 
            // dateCaducidad
            // 
            dateCaducidad.Location = new Point(106, 189);
            dateCaducidad.MinDate = new DateTime(2024, 10, 7, 0, 0, 0, 0); //AQUI??
            dateCaducidad.Name = "dateCaducidad";
            dateCaducidad.Size = new Size(151, 23);
            dateCaducidad.TabIndex = 13;
            dateCaducidad.Value = new DateTime(2024, 10, 7, 0, 0, 0, 0);
            // 
            // lbPeso
            // 
            lbPeso.AutoSize = true;
            lbPeso.Location = new Point(27, 157);
            lbPeso.Name = "lbPeso";
            lbPeso.Size = new Size(32, 15);
            lbPeso.TabIndex = 7;
            lbPeso.Text = "Peso";
            // 
            // lbCaducidad
            // 
            lbCaducidad.AutoSize = true;
            lbCaducidad.Location = new Point(27, 195);
            lbCaducidad.Name = "lbCaducidad";
            lbCaducidad.Size = new Size(64, 15);
            lbCaducidad.TabIndex = 8;
            lbCaducidad.Text = "Caducidad";
            // 
            // lbLote
            // 
            lbLote.AutoSize = true;
            lbLote.Location = new Point(27, 119);
            lbLote.Name = "lbLote";
            lbLote.Size = new Size(30, 15);
            lbLote.TabIndex = 6;
            lbLote.Text = "Lote";
            // 
            // txtMarca
            // 
            txtMarca.Location = new Point(106, 37);
            txtMarca.Name = "txtMarca";
            txtMarca.Size = new Size(151, 23);
            txtMarca.TabIndex = 9;
            // 
            // lbMarca
            // 
            lbMarca.AutoSize = true;
            lbMarca.Location = new Point(27, 43);
            lbMarca.Name = "lbMarca";
            lbMarca.Size = new Size(40, 15);
            lbMarca.TabIndex = 4;
            lbMarca.Text = "Marca";
            // 
            // lbFabricante
            // 
            lbFabricante.AutoSize = true;
            lbFabricante.Location = new Point(27, 81);
            lbFabricante.Name = "lbFabricante";
            lbFabricante.Size = new Size(62, 15);
            lbFabricante.TabIndex = 5;
            lbFabricante.Text = "Fabricante";
            // 
            // txtFabricante
            // 
            txtFabricante.Location = new Point(106, 75);
            txtFabricante.Name = "txtFabricante";
            txtFabricante.Size = new Size(151, 23);
            txtFabricante.TabIndex = 10;
            // 
            // txtLote
            // 
            txtLote.Location = new Point(106, 113);
            txtLote.Name = "txtLote";
            txtLote.Size = new Size(151, 23);
            txtLote.TabIndex = 11;
            // 
            // txtPeso
            // 
            txtPeso.Location = new Point(106, 151);
            txtPeso.Name = "txtPeso";
            txtPeso.Size = new Size(151, 23);
            txtPeso.TabIndex = 12;
            // 
            // grpOtros
            // 
            grpOtros.Controls.Add(txtProcedencia);
            grpOtros.Controls.Add(txtOrigen);
            grpOtros.Controls.Add(lbProcedencia);
            grpOtros.Controls.Add(lbOrigen);
            grpOtros.Location = new Point(218, 276);
            grpOtros.Name = "grpOtros";
            grpOtros.Size = new Size(325, 110);
            grpOtros.TabIndex = 6;
            grpOtros.TabStop = false;
            // 
            // txtProcedencia
            // 
            txtProcedencia.Enabled = false;
            txtProcedencia.Location = new Point(137, 62);
            txtProcedencia.Name = "txtProcedencia";
            txtProcedencia.Size = new Size(151, 23);
            txtProcedencia.TabIndex = 16;
            // 
            // txtOrigen
            // 
            txtOrigen.Enabled = false;
            txtOrigen.Location = new Point(137, 33);
            txtOrigen.Name = "txtOrigen";
            txtOrigen.Size = new Size(151, 23);
            txtOrigen.TabIndex = 14;
            // 
            // lbProcedencia
            // 
            lbProcedencia.AutoSize = true;
            lbProcedencia.Location = new Point(27, 64);
            lbProcedencia.Name = "lbProcedencia";
            lbProcedencia.Size = new Size(72, 15);
            lbProcedencia.TabIndex = 15;
            lbProcedencia.Text = "Procedencia";
            // 
            // lbOrigen
            // 
            lbOrigen.AutoSize = true;
            lbOrigen.Location = new Point(27, 36);
            lbOrigen.Name = "lbOrigen";
            lbOrigen.Size = new Size(43, 15);
            lbOrigen.TabIndex = 14;
            lbOrigen.Text = "Origen";
            // 
            // btnAceptar
            // 
            btnAceptar.Location = new Point(337, 392);
            btnAceptar.Name = "btnAceptar";
            btnAceptar.Size = new Size(75, 23);
            btnAceptar.TabIndex = 17;
            btnAceptar.Text = "Aceptar";
            btnAceptar.UseVisualStyleBackColor = true;
            btnAceptar.Click += btnAceptar_Click;
            // 
            // openFileDialog1
            // 
            openFileDialog1.FileName = "openFileDialog1";
            // 
            // openFileDialog2
            // 
            openFileDialog2.FileName = "openFileDialog2";
            // 
            // openFileDialog3
            // 
            openFileDialog3.FileName = "openFileDialog3";
            // 
            // btnImagen
            // 
            btnImagen.Location = new Point(43, 135);
            btnImagen.Name = "btnImagen";
            btnImagen.Size = new Size(146, 35);
            btnImagen.TabIndex = 18;
            btnImagen.Text = "Seleccionar Imagen";
            btnImagen.UseVisualStyleBackColor = true;
            btnImagen.Click += btnImagen_Click;
            // 
            // pcImagen
            // 
            pcImagen.Location = new Point(31, 176);
            pcImagen.Name = "pcImagen";
            pcImagen.Size = new Size(181, 168);
            pcImagen.TabIndex = 19;
            pcImagen.TabStop = false;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(586, 430);
            Controls.Add(pcImagen);
            Controls.Add(btnImagen);
            Controls.Add(btnAceptar);
            Controls.Add(grpOtros);
            Controls.Add(grpDatos);
            Controls.Add(grpTipo);
            Name = "Form1";
            Text = "Form1";
            grpTipo.ResumeLayout(false);
            grpTipo.PerformLayout();
            grpDatos.ResumeLayout(false);
            grpDatos.PerformLayout();
            grpOtros.ResumeLayout(false);
            grpOtros.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pcImagen).EndInit();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox grpTipo;
        private RadioButton rbImportacion;
        private RadioButton rbArtesano;
        private RadioButton rbNormal;
        private GroupBox grpDatos;
        private DateTimePicker dateCaducidad;
        private Label lbPeso;
        private Label lbCaducidad;
        private Label lbLote;
        private TextBox txtMarca;
        private Label lbMarca;
        private Label lbFabricante;
        private TextBox txtFabricante;
        private TextBox txtLote;
        private TextBox txtPeso;
        private System.ComponentModel.BackgroundWorker backgroundWorker1;
        private GroupBox grpOtros;
        private TextBox txtProcedencia;
        private TextBox txtOrigen;
        private Label lbProcedencia;
        private Label lbOrigen;
        private Button btnAceptar;
        private OpenFileDialog openFileDialog1;
        private OpenFileDialog openFileDialog2;
        private OpenFileDialog openFileDialog3;
        private Button btnImagen;
        private PictureBox pcImagen;
    }
}
