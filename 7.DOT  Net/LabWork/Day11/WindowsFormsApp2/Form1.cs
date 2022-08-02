using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Directory.CreateDirectory(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir");
            MessageBox.Show("Directory Created");

           // DirectoryInfo dir = new DirectoryInfo(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir");
            //dir.
        }

        private void button2_Click(object sender, EventArgs e)
        {
            File.Create(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\file_created.txt");

            //FileInfo file = new FileInfo(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\file_created");
            //file.
            MessageBox.Show("File Created");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            DriveInfo drive = new DriveInfo("F");

            MessageBox.Show(drive.DriveFormat);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            /*string s = "Hello World";
            byte[] arr = Encoding.Default.GetBytes(s);


            FileStream stream = File.Open(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\file_created.txt", FileMode.Create);

           / stream.Write(arr, 0, arr.Length);

            //stream.Length
            //stream.Read(

            stream.Close();
            MessageBox.Show("done");*/
            //-------------------------------
            StreamWriter writer = File.CreateText(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\file_created.txt");

            writer.WriteLine("Hello World");
            writer.WriteLine("Line 2");
            writer.Close();
            MessageBox.Show("done");
        }

        private void button5_Click(object sender, EventArgs e)
        {
            string s;
            StreamReader reader = File.OpenText(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\file_created.txt");
            while ((s = reader.ReadLine()) != null)
            {
                MessageBox.Show(s);
            }
            reader.Close();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            string s = "Hello";
            int i = 100;
            bool b = true;

            FileInfo f = new FileInfo(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\file_created.dat");

            BinaryWriter binary_writer = new BinaryWriter(f.OpenWrite());
            binary_writer.Write(s);
            binary_writer.Write(i);
            binary_writer.Write(b);

            binary_writer.Close();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            string s;
            int i;
            bool b;

            FileInfo f = new FileInfo(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\file_created.dat");

            BinaryReader binary_reader = new BinaryReader(f.OpenRead());

            s = binary_reader.ReadString();
            i = binary_reader.ReadInt32();
            b = binary_reader.ReadBoolean();

            MessageBox.Show(s);
            MessageBox.Show(i.ToString());
            MessageBox.Show(b.ToString());

        }
    }
}
