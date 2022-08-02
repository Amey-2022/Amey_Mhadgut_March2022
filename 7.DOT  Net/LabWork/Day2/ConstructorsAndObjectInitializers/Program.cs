using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConstructorsAndObjectInitializers
{
    class Program
    {
        static void Main1(string[] args)
        {
            Class2 o1 =new Class2();
            Console.WriteLine("P4: "+o1.P4);
            Console.WriteLine("P1: " + o1.P1);

            Class2 o2 = new Class2(12,"Amey",15,75,98);
            Console.WriteLine("X: " + o2.X);
            Console.WriteLine("P1: " + o2.P1);
            Console.WriteLine("P2: " + o2.P2);
            Console.WriteLine("P3: " + o2.P3);
            Console.WriteLine("P4: " + o2.P4);

            //object initializer
            Class2 o3 = new Class2() { X = 10, P2 = 20, P3 = 40, P4 = 20 };
            Console.WriteLine("P4: " + o3.P4);
        }

        static void Main(string[] args)
        {

            Class3 o1 = new Class3();
            o1.X = 10;
            o1.P2 = 20;
            o1.P3 = 30;
            o1.P4 = 40;



            //object initializer
            Class3 o2 = new Class3() { X = 10, P2 = 20, P3 = 32, P4 = 40 };
            Console.WriteLine(o2.P3);
            Class3 o3 = new Class3() { X = 10, P2 = 20 };
            Console.WriteLine(o1.P2);
            Class3 o4 = new Class3 { X = 10, P2 = 20, P3 = 30, P4 = 40 };
            Console.WriteLine(o1.P4);

            Console.WriteLine("default value experiment");
            Class3 o5 = new Class3(X: 112, P1: "Amey",P3:15);
            Console.WriteLine(o5.X);
            Console.WriteLine(o5.P1);
            Console.WriteLine(o5.P4);
            Console.WriteLine(o5.P3);
            o1 = null;
            o2 = null;
            o3 = null;
            o4 = null;
           // GC.Collect();
        }
    }


    public class Class2 {
        public Class2() {
            X = 10;
            //P1 = "x"; //its readonly
            //p1 = "xyz";
            P2 = 15;
            P3 = 45;
            P4 = 95;
            Console.WriteLine("no param cons called");
        }

        public Class2(int X,string P1, int P2, int P3, int P4) {
            this.X = X;
            this.p1 = P1;
            this.P2 = P2;
            this.P3 = P3;
            this.P4 = P4;
            Console.WriteLine("param cons called");
        }


        private int x;
        public int X
        {
            set
            {
                //value is the rhs of o.X = 10;
                if (value < 100)
                    x = value;
                else
                    Console.WriteLine("invalid value for x");
            }
            get
            {
                return x;
            }
        }
        private string p1 = "abc";
        public string P1 //readonly property
        {
            get
            {
                return p1;
            }
        }

        private int p2;
        public int P2
        {
            set
            {
                p2 = value;
            }
            get
            {
                return p2;
            }
        }
        public int P3;

        public int P4 { get; set; }

    }

    public class Class3 
    {
        public Class3()
        {
            X = 10;
            //P1 = "x"; //its readonly
            //p1 = "xyz";
            P2 = 15;
            P3 = 45;
            P4 = 95;
            Console.WriteLine("no param cons called");
        }

        public Class3(int X=0, string P1=null, int P2=0, int P3=0, int P4=0)
        {
            this.X = X;
            this.p1 = P1;
            this.P2 = P2;
            this.P3 = P3;
            this.P4 = P4;
            Console.WriteLine("param cons called");
        }

        private int x;
        public int X
        {
            set
            {
                //value is the rhs of o.X = 10;
                if (value < 100)
                    x = value;
                else
                    Console.WriteLine("invalid value for x");
            }
            get
            {
                return x;
            }
        }
        private string p1 = "abc";
        public string P1 //readonly property
        {
            get
            {
                return p1;
            }
        }

        private int p2;
        public int P2
        {
            set
            {
                p2 = value;
            }
            get
            {
                return p2;
            }
        }
        public int P3;

        public int P4 { get; set; }


        ~Class3() //DO NOT EVER WRITE THIS IN .NET
        {
            Console.WriteLine("destructor");
        }
    }
}
