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
        static void Main1()
        {
            //Display();
            //step 2: create an object of the delegate class, passing it function name as a parameter
            Del1 objDel = new Del1(Display);
            //step 3 : call the function via the delegate object
            objDel();
            Console.ReadLine();
        }
        static void Main2()
        {
            Del1 objDel = Display;
            objDel();
            Console.ReadLine();
        }
        static void Main3()
        {
            Del1 objDel = Display;
            objDel();
            Console.WriteLine();

            objDel = Show;
            objDel();
            Console.ReadLine();
        }
        static void Main4()
        {
            
            Del1 objDel = Display;
            objDel();
            Console.WriteLine();

            objDel += Show;
            objDel();
            Console.WriteLine();

            objDel += Display;
            objDel();
            Console.WriteLine();

            objDel -= Display;
            objDel();
            Console.WriteLine();

            Console.ReadLine();
        }
        static void Main5()
        {
            Del1 objDel =(Del1) Delegate.Combine(new Del1(Display), new Del1(Show));
            objDel();
            Console.WriteLine();

            objDel = (Del1)Delegate.Combine(objDel, new Del1(Display));
            objDel();
            Console.WriteLine();

            //objDel = (Del1)Delegate.Remove(objDel, new Del1(Display));
            objDel = (Del1)Delegate.RemoveAll(objDel, new Del1(Display));
            objDel();
            Console.WriteLine();
            Console.ReadLine();
        }
        static void Main6()
        {
            DelAdd objDelAdd = Add;
            int ans;
            ans = objDelAdd(20, 10);
            Console.WriteLine(ans);

            Console.WriteLine(objDelAdd(20,20));

            //TO DO - call multicast delegate with a func returning a value
            Console.ReadLine();
        }
        static void Main()
        {
            Del1 o1 = Class1.Display;
            o1();

            Class1 ocls1 = new Class1();
            o1 = ocls1.Show;
            o1();
            Console.ReadLine();
        }
        static void Display()
        {
            Console.WriteLine("display");
        }
        static void Show()
        {
            Console.WriteLine("show");
        }
        static int Add(int a,int b)
        {
            return a+b;
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
