using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


//constructors in inheritance
namespace InheritanceExamples3
{
    class Program
    {
        static void Main(string[] args)
        {
            DerivedClass o = new DerivedClass();

           // DerivedClass o2 = new DerivedClass(123, 456);
            Console.ReadLine();
        }
    }


    public class BaseClass
    {
        public int i;
        public BaseClass()
        {
            Console.WriteLine("base class no param cons");
            i = 10;
        }

        public BaseClass(int i)
        {
            Console.WriteLine("base class int cons");
            this.i = i;
        }
    }

    public class DerivedClass : BaseClass
    {
        public int j;
        public DerivedClass()
        {
            Console.WriteLine("derived class no param cons");
            // i = 10;
            j = 20;
        }

    }

}
