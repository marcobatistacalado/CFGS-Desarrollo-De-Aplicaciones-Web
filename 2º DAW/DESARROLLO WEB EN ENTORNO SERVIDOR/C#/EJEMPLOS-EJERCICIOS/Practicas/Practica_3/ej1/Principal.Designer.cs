namespace ej1
{
    partial class Principal
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Principal));
            menuStrip1 = new MenuStrip();
            tiendaToolStripMenuItem = new ToolStripMenuItem();
            almacenToolStripMenuItem = new ToolStripMenuItem();
            agregarQuesoToolStripMenuItem = new ToolStripMenuItem();
            menuStrip1.SuspendLayout();
            SuspendLayout();
            // 
            // menuStrip1
            // 
            menuStrip1.Items.AddRange(new ToolStripItem[] { tiendaToolStripMenuItem, almacenToolStripMenuItem, agregarQuesoToolStripMenuItem });
            menuStrip1.Location = new Point(0, 0);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Size = new Size(1511, 24);
            menuStrip1.TabIndex = 0;
            menuStrip1.Text = "menuStrip1";
            // 
            // tiendaToolStripMenuItem
            // 
            tiendaToolStripMenuItem.Name = "tiendaToolStripMenuItem";
            tiendaToolStripMenuItem.Size = new Size(54, 20);
            tiendaToolStripMenuItem.Text = "Tienda";
            tiendaToolStripMenuItem.Click += tiendaToolStripMenuItem_Click;
            // 
            // almacenToolStripMenuItem
            // 
            almacenToolStripMenuItem.Name = "almacenToolStripMenuItem";
            almacenToolStripMenuItem.Size = new Size(66, 20);
            almacenToolStripMenuItem.Text = "Almacen";
            almacenToolStripMenuItem.Click += almacenToolStripMenuItem_Click;
            // 
            // agregarQuesoToolStripMenuItem
            // 
            agregarQuesoToolStripMenuItem.Name = "agregarQuesoToolStripMenuItem";
            agregarQuesoToolStripMenuItem.Size = new Size(98, 20);
            agregarQuesoToolStripMenuItem.Text = "Agregar Queso";
            agregarQuesoToolStripMenuItem.Click += agregarQuesoToolStripMenuItem_Click;
            // 
            // Principal
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackgroundImage = (Image)resources.GetObject("$this.BackgroundImage");
            BackgroundImageLayout = ImageLayout.Stretch;
            ClientSize = new Size(1511, 950);
            Controls.Add(menuStrip1);
            IsMdiContainer = true;
            MainMenuStrip = menuStrip1;
            MdiChildrenMinimizedAnchorBottom = false;
            Name = "Principal";
            Text = "Principal";
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip menuStrip1;
        private ToolStripMenuItem tiendaToolStripMenuItem;
        private ToolStripMenuItem almacenToolStripMenuItem;
        private ToolStripMenuItem agregarQuesoToolStripMenuItem;
    }
}