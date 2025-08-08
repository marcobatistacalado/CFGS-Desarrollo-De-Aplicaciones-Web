namespace HolaMundo
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
            lbl1 = new Label();
            btn1 = new Button();
            label1 = new Label();
            SuspendLayout();
            // 
            // lbl1
            // 
            lbl1.AutoSize = true;
            lbl1.Font = new Font("Yu Gothic", 9F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lbl1.ForeColor = SystemColors.MenuHighlight;
            lbl1.Location = new Point(326, 163);
            lbl1.Name = "lbl1";
            lbl1.Size = new Size(108, 16);
            lbl1.TabIndex = 0;
            lbl1.Text = "HOLA MUNDOOO";
            lbl1.Click += lbl1_Click;
            // 
            // btn1
            // 
            btn1.Location = new Point(262, 196);
            btn1.Name = "btn1";
            btn1.Size = new Size(227, 83);
            btn1.TabIndex = 1;
            btn1.Text = "Pulsar";
            btn1.UseVisualStyleBackColor = true;
            btn1.Click += button1_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Yu Gothic", 9F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.ForeColor = SystemColors.MenuHighlight;
            label1.Location = new Point(512, 93);
            label1.Name = "label1";
            label1.Size = new Size(0, 16);
            label1.TabIndex = 2;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label1);
            Controls.Add(btn1);
            Controls.Add(lbl1);
            Name = "Form1";
            Text = "Mi primer ejemplo";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label lbl1;
        private Button btn1;
        private Label label1;
    }
}
