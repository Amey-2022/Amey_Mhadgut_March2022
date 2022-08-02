using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Text;
using System.Threading.Tasks;

//call a function async using delegate (o.BeginInvoke(....))
namespace AsyncCodeWithDelegates1
{
    class Program
    {
        static void Main1()
        {
            Console.WriteLine("before");
            Action o = Display;
            //o(); //sync call
            o.BeginInvoke(null, null); //async call
            Console.WriteLine("after");

            Console.ReadLine();
        }
        static void Display()
        {
            System.Threading.Thread.Sleep(3000);
            Console.WriteLine("display");
        }
    }
}

//call a function async using delegate (o.BeginInvoke(....))
//function has parameters - o.BeginInvoke(func parameters, ...)
namespace AsyncCodeWithDelegates2
{
    class Program
    {
        static void Main2()
        {
            Console.WriteLine("before");
            Action<string> o = Display;
            //o(); //sync call
            o.BeginInvoke("hello",null, null); //async call
            Console.WriteLine("after");

            Console.ReadLine();
        }
        static void Display(string s)
        {
            System.Threading.Thread.Sleep(3000);
            Console.WriteLine("display" + s);
        }
    }
}
//call a function async using delegate (o.BeginInvoke(....))
//function has parameters - o.BeginInvoke(func parameters, ...)
//use a callback function (o.BeginInvoke( CallbackFunction...)
namespace AsyncCodeWithDelegates3
{
    class Program
    {
        static void Mai3()
        {
            Console.WriteLine("before");
            Func<string,string> o = Display;
            o.BeginInvoke("hello", CallbackFunction , null); //async call
            Console.WriteLine("after");

            Console.ReadLine();
        }
        static string Display(string s)
        {
            System.Threading.Thread.Sleep(3000);
            Console.WriteLine("display" + s);
            return s.ToUpper();
        }
        static void CallbackFunction(IAsyncResult ar)
        {
            Console.WriteLine("callback func called");
        }
    }
}

//call a function async using delegate (o.BeginInvoke(....))
//function has parameters - o.BeginInvoke(func parameters, ...)
//use a callback function (o.BeginInvoke( CallbackFunction...)
//make delegate object(o) as class level variable to access it from callbackfunc
//o.EndInvoke(ar) ---- returns the value
namespace AsyncCodeWithDelegates4
{
    class Program
    {
        static Func<string, string> o;
        static void Main4()
        {
            Console.WriteLine("before");
            o = Display;
            IAsyncResult ar = o.BeginInvoke("hello", CallbackFunction, null); //async call
            Console.WriteLine("after");
            Console.ReadLine();
        }
        static string Display(string s)
        {
            System.Threading.Thread.Sleep(3000);
            Console.WriteLine("display" + s);
            return s.ToUpper();
        }
        static void CallbackFunction(IAsyncResult ar)
        {
            Console.WriteLine("callback func called");
            string retval;
            retval = o.EndInvoke(ar);
            Console.WriteLine("return value :" + retval);

        }
    }
}

//call a function async using delegate (o.BeginInvoke(....))
//function has parameters - o.BeginInvoke(func parameters, ...)
//use a callback function (o.BeginInvoke( CallbackFunction...)
//make the callback function as an anon method to access delegate object declared in Main()
namespace AsyncCodeWithDelegates5
{
    class Program
    {
        static void Main5()
        {
            Console.WriteLine("before");
            Func<string, string> o = Display;
            o.BeginInvoke("hello", delegate(IAsyncResult ar)
            {
                Console.WriteLine("callback func called");
                string retval;
                retval = o.EndInvoke(ar);
                Console.WriteLine("return value :" + retval);
            }, null); //async call
            Console.WriteLine("after");

            Console.ReadLine();
        }
        static string Display(string s)
        {
            System.Threading.Thread.Sleep(3000);
            Console.WriteLine("display" + s);
            return s.ToUpper();
        }
      
    }
}


//call a function async using delegate (o.BeginInvoke(....))
//function has parameters - o.BeginInvoke(func parameters, ...)
//use a callback function (o.BeginInvoke( CallbackFunction...)
//pass o as the last parameter in o.BeginInvoke(....o)
//receive in callback function as ar.AsyncState
namespace AsyncCodeWithDelegates6
{
    class Program
    {
        static void Main6()
        {
            Console.WriteLine("before");
            Func<string, string> o = Display;
            //o.BeginInvoke("hello", CallbackFunction, "extra info");
            o.BeginInvoke("hello", CallbackFunction, o);

            Console.WriteLine("after");

            Console.ReadLine();
        }
        static string Display(string s)
        {
            System.Threading.Thread.Sleep(3000);
            Console.WriteLine("display" + s);
            return s.ToUpper();
        }
        static void CallbackFunction(IAsyncResult ar)
        {
            Console.WriteLine("callback func called");
            //string last_param = ar.AsyncState.ToString();
            //Console.WriteLine(last_param);
            Func<string, string> o = (Func<string, string>)ar.AsyncState;
            string retval;
            retval = o.EndInvoke(ar);
            Console.WriteLine("return value :" + retval);


        }
    }
}

//call a function async using delegate (o.BeginInvoke(....))
//function has parameters - o.BeginInvoke(func parameters, ...)
//use a callback function (o.BeginInvoke( CallbackFunction...)
//use AsyncResult.AsyncDelegate to get a reference to o in the callback function
namespace AsyncCodeWithDelegates7
{
    class Program
    {
        static void Main()
        {
            Console.WriteLine("before");
            Func<string, string> o = Display;
            o.BeginInvoke("hello", CallbackFunction, null);
            Console.WriteLine("after");

            Console.ReadLine();
        }
        static string Display(string s)
        {
            System.Threading.Thread.Sleep(3000);
            Console.WriteLine("display" + s);
            return s.ToUpper();
        }
        static void CallbackFunction(IAsyncResult ar)
        {
            Console.WriteLine("callback func called");
            AsyncResult objAr =(AsyncResult) ar;
            Func<string, string> o = (Func<string, string>) objAr.AsyncDelegate;
            string retval;
            retval = o.EndInvoke(ar);
            Console.WriteLine("return value :" + retval);
        }
    }
}
