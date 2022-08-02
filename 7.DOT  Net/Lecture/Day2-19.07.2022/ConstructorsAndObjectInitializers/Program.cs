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
            Class2 o1 = new Class2();
            Console.WriteLine(o1.P4);

            Class2 o2 = new Class2(10, "a", 12, 13, 14);
            Console.WriteLine(o2.P4);

            Console.ReadLine();
        }
        static void Main(string[] args)
        {
            Class3 o1 = new Class3();
            o1.X = 10;
            o1.P2 = 20;
            o1.P3 = 30;
            o1.P4 = 40;

            //object initializer
            Class3 o2 = new Class3() { X = 10, P2 = 20, P3 = 30, P4 = 40 };
            Class3 o3 = new Class3() { X = 10, P2 = 20 };
            Class3 o4 = new Class3{ X = 10, P2 = 20, P3 = 30, P4 = 40 };

            Console.WriteLine(o1.P4);
            o1 = null;
            o2 = null;
            o3 = null;
            o4 = null;
            //GC.Collect();
            Console.ReadLine();
        }
    }
    public class Class2
    {
        public Class2()
        {
            X = 10;
            //P1 = "x";
            p1 = "xyz";
            P2 = 20;
            P3 = 30;
            P4 = 40;
            Console.WriteLine("no param cons called");
        }
        public Class2(int X, string P1, int P2, int P3, int P4)
        {
            this.X = X;
            //P1 = "x";
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
            //P1 = "x";
            p1 = "xyz";
            P2 = 20;
            P3 = 30;
            P4 = 40;
            Console.WriteLine("no param cons called");
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

        ~Class3()  //DO NOT EVER WRITE THIS IN .NET
        {
            Console.WriteLine("destructor");
        }

    }
}
