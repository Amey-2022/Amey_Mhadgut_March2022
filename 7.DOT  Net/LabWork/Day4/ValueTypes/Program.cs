using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//structs
namespace ValueTypes1
{
    class Program
    {
        static void Main1(string[] args)
        {
            int i = new int();
           // int i=0; //unnecessary

            Console.WriteLine(i);
            Console.ReadLine();
        }

        static void Main2(string[] args)
        {
            MyPoint p = new MyPoint(10, 20, 30);
            Console.WriteLine(p.A);
            Console.ReadLine();
        }
    }
    //structs are Value Types - stored on stack. Faster than Heap operations
    //No Inheritance allowed in structs
    //Parameterless constructor not allowed in structs
    public struct MyPoint 
    {
        public int A
        {
            get;set;
        }
        public int X, Y;

        public MyPoint(int X=0, int Y = 0, int A = 0)
        {
            Console.WriteLine("constructor called");
            this.X = X;
            this.Y = Y;
            this.A = A;
        }
    }
}


//enums
namespace ValueTypes2
{
    class Program
    {
        static void Main(string[] args)
        {
           // Display1(1);
            Display2(TimeOfDay.Morning);
           Console.ReadLine();

        }

        static void Display1(int t)
        {
            if (t == 0)
                Console.WriteLine("Good Morning");
            else if (t == 1)
                Console.WriteLine("Good Afternoon");
            else if (t == 2)
                Console.WriteLine("Good Evening");
            else if (t == 3)
                Console.WriteLine("Good Night");
        }

        static void Display2(TimeOfDay t)
        {
            if (t == TimeOfDay.Morning)
                Console.WriteLine("Good Morning");
            else if (t == TimeOfDay.Afternoon)
                Console.WriteLine("Good Afternoon");
            else if (t == TimeOfDay.Evening)
                Console.WriteLine("Good Evening");
            else if (t == TimeOfDay.Night)
                Console.WriteLine("Good Night");
        }
    }

    public enum TimeOfDay //: short
    { 
       // Morning=100,
        Morning,
        Afternoon,
        Evening,
        Night
    }
}