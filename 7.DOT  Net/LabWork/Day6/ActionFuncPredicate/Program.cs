using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ActionFuncPredicate
{
    class Program
    {
        static void Main1(string[] args)
        {
            Action o1 = Display;
            o1();

            Action<string> o2 = Display;
            o2("Amey");

            Action<string, int> o3 = Display;
            o3("Amey", 19);
        }

        static void Main()
        {
            Func<int,int,int> o= Add;
            Console.WriteLine(o(14, 15));
            Func<string, decimal,int> o1 = DoSomething;
            Console.WriteLine(o1("adf", 15.14M));
            Func<int, bool> o2 = IsEven;
            Console.WriteLine(o2(29));

            Predicate<int> o3 = IsEven;
            Console.WriteLine(o2(30));
        }




            static void Display()
        {
            Console.WriteLine("display");
        }
        static void Display(string s)
        {
            Console.WriteLine("display " + s);
        }
        static void Display(string s, int i)
        {
            Console.WriteLine("display " + s +" "+ i);
        }
        static int Add(int a, int b)
        {
            return a + b;
        }
        static int DoSomething(string a, decimal b)
        {
            return a.Length;
        }
        static bool IsEven(int a)
        {
            if (a % 2 == 0)
                return true;
            else
                return false;
        }
    }
}
