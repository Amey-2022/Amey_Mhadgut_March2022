using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StaticMembers
{
    class Program
    {
        static void Main(string[] args)
        {
            Class1 o1 = new Class1();
            Console.WriteLine(Class1.static_i);
            Class1.static_i = 2000;
            Class1.static_Display();

            Console.WriteLine("***************");
            Class1.P2 = 125;
            o1.i = 145;
            o1.Display();
            Console.WriteLine(Class1.P2);
            Console.WriteLine("***************");

            Class1 o2 = new Class1();
            o2.i = 200;
            o2.Display();

        }
    }

    public class Class1
    {
        static Class1()
        {
            Console.WriteLine("Static Constructor Called");
            static_i = 1010;
        }

        public int i;
        //static variable - why? - single(shared) copy for the class
        public static int static_i;

        public void Display()
        {
            Console.WriteLine(i);
            Console.WriteLine(static_i);
            Console.WriteLine("Display");
        }

        //static function? --can be called directly classname.methodname without creating an object
        public static void static_Display()
        {
            //Console.WriteLine(i);
            Console.WriteLine(static_i);
            Console.WriteLine("static Display method");
        }

        private static int p2;
        public static int P2
        {
            set
            {
                p2= value;
            }
            get 
            {
                return p2;
            }
        }
        
    }
}


//why static variable? --> single copy
//why property? --> validations

//why static property? --> single copy with validations
//why constructor? -->  to initialize data members
//why static constructor? --> to initialize static members

//when is the static constructor called? --> when the class is loaded
//when is the class loaded? --> when the first object is created
//OR when a static member is accessed for the first time

//static cons is implicitly called
//static cons cant have parameters
//static cons cannot be overloaded
//static cons does not have any access specifier(implicitly private)


//TO DO
//static class
//can only have static members
//cannot create an object of the static class
//cannot be used as a base class