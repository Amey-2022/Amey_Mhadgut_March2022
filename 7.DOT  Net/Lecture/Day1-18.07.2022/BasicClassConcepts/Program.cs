
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BasicClassConcepts
{
    class Program
    {
        static void Main1()
        {
            //System.Console.WriteLine("Hello World");
            Console.WriteLine("Hello World");
            Console.ReadLine();
        }
        static void Main2()
        {
            Class1 o; //o is a reference of type Class1
            o = new Class1();  //new Class1() is an object of Class1
            o.Display();



            Console.ReadLine();
        }
        static void Main3()
        {
            Class1 o = new Class1(); 
            o.Display();
            o.Display("Vik");

            int ans = o.Add(10, 20, 30);
            Console.WriteLine(ans);

            ans = o.Add(10, 20);
            Console.WriteLine(ans);

            ans = o.Add(10);
            Console.WriteLine(ans);

            ans = o.Add();
            Console.WriteLine(ans);


            Console.ReadLine();
        }
        static void Main4()
        {
            Class1 o = new Class1();
          
            int ans = o.Add(10, 20, 30); //positional parameters
            Console.WriteLine(ans);

            ans = o.Add(c: 30);  //named parameters
            ans = o.Add(c: 30, b: 20);  //named parameters
            ans = o.Add(b: 20, a:10);  //named parameters

            Console.ReadLine();
        }

        static void Main()
        {
            int a = 100;
            //Display();
            //local functions
            //local func can be defined within another func
            //local func can only be called from the outer func
            //local func can access variables defined in outer func
            //local func is implicitly private 
            void LocalFunc()
            {
                Console.WriteLine(++a);
                Console.WriteLine("Local function");
            }
            Console.WriteLine(a);
            LocalFunc();

        }

        static void Display()
        {
            Console.WriteLine("display");
        }
    }
    public class Class1
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }
        //func overloading
        public void Display(string s)
        {
            Console.WriteLine("Display " + s);
        }

        //optional arguments with default values
        public int Add(int a=0, int b=0, int c=0)
        {
            return a + b + c;
        }
       
    }
   
}
namespace n1
{
    public class Class1 { }
    public class Class2 { }
    namespace n1a
    {
        public class Class3 { }
    }

}
