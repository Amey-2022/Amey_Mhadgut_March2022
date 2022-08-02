using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IDisposableExample
{
    class Program
    {
        static void Main1()
        {
            Class1 o = new Class1();
            o.Display();
            o.Dispose();
            Console.ReadLine();
        }
        static void Main()
        {
            using (Class1 o = new Class1())
            {
                o.Display();
            }
            Console.ReadLine();
        }
    }
    public class Class1 : IDisposable
    {
        public Class1()
        {
            //open file here
            //open db here
            Console.WriteLine("class1 constructor");
        }
        public void Display()
        {
            Console.WriteLine("Display called");
        }
        public void Dispose()
        {
            //close file
            //close db
            Console.WriteLine("Dispose code called. Write code here instead of Destructor");
        }
    }
}
