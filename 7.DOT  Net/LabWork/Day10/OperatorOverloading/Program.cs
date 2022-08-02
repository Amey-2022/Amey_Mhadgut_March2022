using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperatorOverloading
{
    class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1();
            Class1 o2 = new Class1() { i = 20 };

            o.i = 10;
            o = o + 5;

            o = o2 - o; 
                             
            Console.WriteLine(o.i);
            Console.ReadLine();
        }
    }
    public class Class1
    {
        public int i;

        public static Class1 operator+(Class1 o, int i)
        {
            Class1 retval = new Class1();
            retval.i = o.i + i;
            return retval;
        }
        public static Class1 operator-(Class1 o1, Class1 o2)
        {
            Class1 retval = new Class1();
            retval.i = o1.i - o2.i;
            return retval;
        }
    }
}


//https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/operators/operator-overloading
