using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegates
{
    //step 1 : create a delegate class having the same signature as the funcion to call
    public delegate void Del1();
    //Object
    //Delegate
    //MulticastDelegate
    //Del1 

    public delegate int DelAdd(int a, int b);
    class Program
    {
        static void Main1(string[] args)
        {
            // Display();
            //step 2: create an object of the delegate class, passing it function name as a parameter
            Del1 objDel = new Del1(Display);
            objDel();
        }
        static void Main2(string[] args)
        {
            Del1 objDel = Display;
            objDel();
        }
        static void Main3(string[] args)
        {
            Del1 objDel = Display;
            objDel();

            objDel = Show;
            objDel();
        }
        static void Main4(string[] args)
        {
            Del1 objDel = Display;
            objDel();

            objDel += Show;
            objDel();

            objDel += Display;
            objDel();

            objDel -= Display;
            objDel();
            Console.WriteLine();
        }

        static void Main5(string[] args)
        {
            Del1 objDel = (Del1)Delegate.Combine(new Del1(Display),new Del1(Show));
            objDel();

             objDel = (Del1)Delegate.Combine(objDel, new Del1(Show));
            objDel();

            //objDel = (Del1)Delegate.Remove(objDel, new Del1(Display));
            objDel = (Del1)Delegate.RemoveAll(objDel, new Del1(Show));
            objDel();

        }
        static void Main6(string[] args)
        {
            DelAdd objDelAdd = Add;
            int ans = objDelAdd(20, 45);
            Console.WriteLine(ans);
            Console.WriteLine(objDelAdd(45,75));

            //TO DO - call multicast delegate with a func returning a value
        }
        static void Main(string[] args)
        {
            Del1 o1 = Class1.Display;
            o1();

            Class1 cs1 = new Class1();
            o1 = cs1.Show;
            o1();

        }
            static void Display()
        {
            Console.WriteLine("display");
        }
        static void Show()
        {
            Console.WriteLine("show");
        }
        static int Add(int a, int b)
        {
            return a + b;
        }
    }

    public class Class1
    {
        public static void Display()
        {
            Console.WriteLine("display");
        }
        public void Show()
        {
            Console.WriteLine("show");
        }
    }
}
