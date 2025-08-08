namespace EjemploControlesWin
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
            grpIdiomas = new GroupBox();
            groupBox1 = new GroupBox();
            radioButton4 = new RadioButton();
            radioButton3 = new RadioButton();
            radioButton2 = new RadioButton();
            radioButton1 = new RadioButton();
            ckbAleman = new CheckBox();
            ckBFrances = new CheckBox();
            ckbIngles = new CheckBox();
            grpIdiomas.SuspendLayout();
            groupBox1.SuspendLayout();
            SuspendLayout();
            // 
            // grpIdiomas
            // 
            grpIdiomas.Controls.Add(groupBox1);
            grpIdiomas.Controls.Add(radioButton2);
            grpIdiomas.Controls.Add(radioButton1);
            grpIdiomas.Controls.Add(ckbAleman);
            grpIdiomas.Controls.Add(ckBFrances);
            grpIdiomas.Controls.Add(ckbIngles);
            grpIdiomas.Location = new Point(31, 30);
            grpIdiomas.Name = "grpIdiomas";
            grpIdiomas.Size = new Size(389, 308);
            grpIdiomas.TabIndex = 0;
            grpIdiomas.TabStop = false;
            grpIdiomas.Text = "Idiomas";
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(radioButton4);
            groupBox1.Controls.Add(radioButton3);
            groupBox1.Location = new Point(166, 55);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(200, 100);
            groupBox1.TabIndex = 4;
            groupBox1.TabStop = false;
            groupBox1.Text = "groupBox1";
            // 
            // radioButton4
            // 
            radioButton4.AutoSize = true;
            radioButton4.Location = new Point(21, 49);
            radioButton4.Name = "radioButton4";
            radioButton4.Size = new Size(94, 19);
            radioButton4.TabIndex = 5;
            radioButton4.TabStop = true;
            radioButton4.Text = "radioButton4";
            radioButton4.UseVisualStyleBackColor = true;
            // 
            // radioButton3
            // 
            radioButton3.AutoSize = true;
            radioButton3.Location = new Point(21, 25);
            radioButton3.Name = "radioButton3";
            radioButton3.Size = new Size(94, 19);
            radioButton3.TabIndex = 5;
            radioButton3.TabStop = true;
            radioButton3.Text = "radioButton3";
            radioButton3.UseVisualStyleBackColor = true;
            // 
            // radioButton2
            // 
            radioButton2.AutoSize = true;
            radioButton2.Location = new Point(46, 236);
            radioButton2.Name = "radioButton2";
            radioButton2.Size = new Size(94, 19);
            radioButton2.TabIndex = 3;
            radioButton2.TabStop = true;
            radioButton2.Text = "radioButton2";
            radioButton2.UseVisualStyleBackColor = true;
            // 
            // radioButton1
            // 
            radioButton1.AutoSize = true;
            radioButton1.Location = new Point(46, 211);
            radioButton1.Name = "radioButton1";
            radioButton1.Size = new Size(94, 19);
            radioButton1.TabIndex = 1;
            radioButton1.TabStop = true;
            radioButton1.Text = "radioButton1";
            radioButton1.UseVisualStyleBackColor = true;
            // 
            // ckbAleman
            // 
            ckbAleman.AutoSize = true;
            ckbAleman.Location = new Point(46, 105);
            ckbAleman.Name = "ckbAleman";
            ckbAleman.Size = new Size(67, 19);
            ckbAleman.TabIndex = 2;
            ckbAleman.Text = "Aleman";
            ckbAleman.UseVisualStyleBackColor = true;
            // 
            // ckBFrances
            // 
            ckBFrances.AutoSize = true;
            ckBFrances.Location = new Point(46, 80);
            ckBFrances.Name = "ckBFrances";
            ckBFrances.Size = new Size(66, 19);
            ckBFrances.TabIndex = 1;
            ckBFrances.Text = "Frances";
            ckBFrances.UseVisualStyleBackColor = true;
            // 
            // ckbIngles
            // 
            ckbIngles.AutoSize = true;
            ckbIngles.Location = new Point(46, 55);
            ckbIngles.Name = "ckbIngles";
            ckbIngles.Size = new Size(57, 19);
            ckbIngles.TabIndex = 0;
            ckbIngles.Text = "Inglés";
            ckbIngles.UseVisualStyleBackColor = true;
            ckbIngles.CheckedChanged += ckbIngles_CheckedChanged;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(647, 441);
            Controls.Add(grpIdiomas);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            grpIdiomas.ResumeLayout(false);
            grpIdiomas.PerformLayout();
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox grpIdiomas;
        private CheckBox ckbIngles;
        private RadioButton radioButton2;
        private RadioButton radioButton1;
        private CheckBox ckbAleman;
        private CheckBox ckBFrances;
        private GroupBox groupBox1;
        private RadioButton radioButton4;
        private RadioButton radioButton3;
    }
}
