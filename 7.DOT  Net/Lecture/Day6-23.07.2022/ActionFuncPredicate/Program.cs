using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ActionFuncPredicate
{
    class Program
    {
        static void Main1()
        {
            Action o1 = Display;
            o1();
            
            Action<string> o2 = Display;
            o2("aaa");

            Action<string, int> o3 = Display;
            o3("a", 10);
            Console.ReadLine();
        }
        static void Main()
        {
            Func<int, int, int> o1 = Add;
            Console.WriteLine(o1(10,20));
            Func<string, decimal, int> o2 = DoSomething;
            Console.WriteLine(o2("a",1.23M));
            Func<int, bool> o3 = IsEven;
            Console.WriteLine(o3(10));

            Predicate<int> o4 = IsEven;
            Console.WriteLine(o4(10));

            Console.ReadLine();
        }
        static void Display()
        {
            Console.WriteLine("display");
        }
        static void Display(string s)
        {
            Console.WriteLine("display" + s);
        }
        static void Display(string s, int i)
        {
            Console.WriteLine("display" + s + i);
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
