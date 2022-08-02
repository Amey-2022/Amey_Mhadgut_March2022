using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Anon Methods 
namespace AnonMethodsAndLambdas1
{
    class Program
    {
        static void Main1()
        {
            //Action o1 = Display;
            int x = 100;
            Action o1 = delegate()
            {
                Console.WriteLine(x);
                Console.WriteLine("anon method called");
            };
            o1();

            Func<int, int, int> o2 = delegate(int a, int b)
            {
                return a + b;
            };
            Console.WriteLine(o2(10,20));
            Predicate<int> o3 = delegate (int a)
            {
                if (a % 2 == 0)
                    return true;
                else
                    return false;
            };
            Console.WriteLine(o3(10));

            Console.ReadLine();
        }
      
    }
}
namespace AnonMethodsAndLambdas2
{
    class Program
    {
        static void Main()
        {
            Func<int, int> o1 = MakeDouble;
            Console.WriteLine(o1(10));

            Func<int, int> o2 = a => a * 2;
            Console.WriteLine(o2(10));


            Console.ReadLine();
        }

        static int MakeDouble(int a)
        {
            return a * 2;
        }
    }
}
