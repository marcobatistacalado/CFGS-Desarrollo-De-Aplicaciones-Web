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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            menuStrip1 = new MenuStrip();
            envíoToolStripMenuItem = new ToolStripMenuItem();
            facturarToolStripMenuItem = new ToolStripMenuItem();
            infoToolStripMenuItem = new ToolStripMenuItem();
            eliminarEnvioPendienteToolStripMenuItem = new ToolStripMenuItem();
            menuStrip1.SuspendLayout();
            SuspendLayout();
            // 
            // menuStrip1
            // 
            menuStrip1.Items.AddRange(new ToolStripItem[] { envíoToolStripMenuItem, facturarToolStripMenuItem, infoToolStripMenuItem, eliminarEnvioPendienteToolStripMenuItem });
            menuStrip1.Location = new Point(0, 0);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Size = new Size(800, 24);
            menuStrip1.TabIndex = 0;
            menuStrip1.Text = "menuStrip1";
            // 
            // envíoToolStripMenuItem
            // 
            envíoToolStripMenuItem.Name = "envíoToolStripMenuItem";
            envíoToolStripMenuItem.Size = new Size(48, 20);
            envíoToolStripMenuItem.Text = "Envío";
            envíoToolStripMenuItem.Click += envíoToolStripMenuItem_Click;
            // 
            // facturarToolStripMenuItem
            // 
            facturarToolStripMenuItem.Name = "facturarToolStripMenuItem";
            facturarToolStripMenuItem.Size = new Size(62, 20);
            facturarToolStripMenuItem.Text = "Facturar";
            facturarToolStripMenuItem.Click += facturarToolStripMenuItem_Click;
            // 
            // infoToolStripMenuItem
            // 
            infoToolStripMenuItem.Name = "infoToolStripMenuItem";
            infoToolStripMenuItem.Size = new Size(40, 20);
            infoToolStripMenuItem.Text = "Info";
            infoToolStripMenuItem.Click += infoToolStripMenuItem_Click;
            // 
            // eliminarEnvioPendienteToolStripMenuItem
            // 
            eliminarEnvioPendienteToolStripMenuItem.Name = "eliminarEnvioPendienteToolStripMenuItem";
            eliminarEnvioPendienteToolStripMenuItem.Size = new Size(153, 20);
            eliminarEnvioPendienteToolStripMenuItem.Text = "Eliminar envio  pendiente";
            eliminarEnvioPendienteToolStripMenuItem.Click += eliminarEnvioPendienteToolStripMenuItem_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackgroundImage = (Image)resources.GetObject("$this.BackgroundImage");
            BackgroundImageLayout = ImageLayout.Stretch;
            ClientSize = new Size(800, 450);
            Controls.Add(menuStrip1);
            IsMdiContainer = true;
            MainMenuStrip = menuStrip1;
            Name = "Form1";
            Text = "Form1";
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip menuStrip1;
        private ToolStripMenuItem envíoToolStripMenuItem;
        private ToolStripMenuItem facturarToolStripMenuItem;
        private ToolStripMenuItem infoToolStripMenuItem;
        private ToolStripMenuItem eliminarEnvioPendienteToolStripMenuItem;
    }
}
