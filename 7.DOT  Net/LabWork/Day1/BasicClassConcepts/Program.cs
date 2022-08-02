using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BasicClassConcepts
{
    class Program
    {
        static void Main1(string[] args)
        {
            //System.Console.WriteLine("Hello World");
            Console.WriteLine("Hello World");
            Console.ReadLine(); 

           
        }

        static void Main2(string[] args)
        {
            Class1 o; //o is a reference of type Class1
            o = new Class1(); //new Class1() is an object of Class1
            o.Display();
            Console.ReadLine();
        }

        static void Main3(string[] args)
        {
            Class1 o= new Class1(); 
            o.Display();
            o.Display("Amey");

            o.Add(10, 20, 30); 
            o.Add(10, 20);
            o.Add(10);
            o.Add();
        }

        static void Main4(string[] args)
        {
            Class1 o = new Class1();
            o.Add(10, 20, 30); //positional parameters
            o.Add(c: 30); //named parameters
            o.Add(b: 10, a: 15);//named parameters
            o.Add(c: 17, b: 74);//named parameters
        }


        static void Main(string[] args)
        {
            int a = 100;
            Display();
            //local functions
            //local func can be defined within another func
            //local func can only be called from the outer func
            //local func can access variables defined in outer func
            //local func is implicitly private 
            void LocalFunc()
            {
                Console.WriteLine(++a);
                Console.WriteLine("Local Function");
            }
            Console.WriteLine(a);
            LocalFunc();
        }

        static void Display()
        {
            Console.WriteLine("Display");
        }

    }
    public class Class1
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }

        //func overloading
        public void Display(String s)
        {
            Console.WriteLine("Display " + s);
        }

        //optional arguments with default values
        public void Add(int a=0,int b=0,int c=0) 
        {
            Console.WriteLine("Addition: " + (a + b + c));
        }
    }
}

   

