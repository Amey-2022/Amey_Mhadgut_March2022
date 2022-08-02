using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClientForSharedAssembly
{
    class Program
    {
        static void Main(string[] args)
        {
            ClassLibrary1.Class1 o = new ClassLibrary1.Class1();
            Console.WriteLine(o.Hello());

            TestAccessSpecifiers.BaseClass o2 = new TestAccessSpecifiers.BaseClass();
            Console.WriteLine(o2.PUBLIC);
            Console.ReadLine();
        }
    }
}
