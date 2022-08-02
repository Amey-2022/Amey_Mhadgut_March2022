using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Runtime.Serialization.Formatters.Soap;
using System.Xml.Serialization;
using System.Runtime.Serialization.Json;

namespace WindowsFormsApp3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            BinaryFormatter bf = new BinaryFormatter();
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.dat", FileMode.Create);
            bf.Serialize(s, o);
            s.Close();
            MessageBox.Show("File Created");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            BinaryFormatter bf = new BinaryFormatter();
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.dat", FileMode.Open);
           
            Class1 o = (Class1) bf.Deserialize(s);
            s.Close();
            MessageBox.Show(o.i.ToString());
            MessageBox.Show(o.P1);
            MessageBox.Show(o.P2.ToString());

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            SoapFormatter sf = new SoapFormatter();
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.soap", FileMode.Create);
            sf.Serialize(s, o);
            s.Close();
            MessageBox.Show("File Created");
        }

        private void button4_Click(object sender, EventArgs e)
        {
            SoapFormatter sf = new SoapFormatter();
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.soap", FileMode.Open);
           
            Class1 o = (Class1)sf.Deserialize(s);
            s.Close();
            MessageBox.Show(o.i.ToString());
            MessageBox.Show(o.P1);
            MessageBox.Show(o.P2.ToString());
        }

        private void button5_Click(object sender, EventArgs e)
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            XmlSerializer xs = new XmlSerializer(typeof(Class1));
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.xml", FileMode.Create);
            xs.Serialize(s, o);
            s.Close();
            MessageBox.Show("File Created");
        }

        private void button6_Click(object sender, EventArgs e)
        {
            XmlSerializer xs = new XmlSerializer(typeof(Class1));
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.xml", FileMode.Open);

            Class1 o = (Class1)xs.Deserialize(s);
            s.Close();
            MessageBox.Show(o.i.ToString());
            MessageBox.Show(o.P1);
            MessageBox.Show(o.P2.ToString());
        }

        private void button7_Click(object sender, EventArgs e)
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            DataContractJsonSerializer js = new DataContractJsonSerializer(typeof(Class1));
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.json", FileMode.Create);
            js.WriteObject(s,o);
            s.Close();
            MessageBox.Show("File Created");

        }

        private void button8_Click(object sender, EventArgs e)
        {
            DataContractJsonSerializer js = new DataContractJsonSerializer(typeof(Class1));
            Stream s = new FileStream(@"G:\CDACM2022\SRC-Module-7\LabWork\Day11\Created_Dir\o.json", FileMode.Open);
            Class1 o = (Class1)js.ReadObject(s);
            s.Close();
            MessageBox.Show(o.i.ToString());
            MessageBox.Show(o.P1);
            MessageBox.Show(o.P2.ToString());
        }
    }
}
