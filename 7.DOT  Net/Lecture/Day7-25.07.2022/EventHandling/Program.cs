using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EventHandling1
{
    class Program
    {
        //static void Main()
        //{
        //    Class1 o = new Class1();
        //    //add an event handler for the event
        //    //if the InvalidP1 event occurs, call o_InvalidP1()
        //    o.InvalidP1 += o_InvalidP1;
        //    o.P1 = 200;

        //    Console.ReadLine();
        //}
        //static void o_InvalidP1()
        //{
        //    Console.WriteLine("event handler code");
        //}

        static void Main1()
        {
            Class1 o = new Class1();
            o.InvalidP1 += O_InvalidP1;
            o.InvalidP1 += Handler2;
            o.P1 = 200;
            Console.WriteLine();

            o.InvalidP1 -= Handler2;
            o.P1 = 200;
            Console.WriteLine();

            o.InvalidP1 -= O_InvalidP1;
            o.P1 = 200;
            Console.WriteLine();
            Console.ReadLine();
        }

        private static void Handler2()
        {
            Console.WriteLine("event handler code --- handler 2");
        }

        private static void O_InvalidP1()
        {
            Console.WriteLine("event handler code");
        }
    }
    //step 1 : create a delegate class having the same signature as the event handler
    public delegate void InvalidP1EventHandler();
    public class Class1
    {
        //step2 : declare an event (delegate object) of the delegate type
        public event InvalidP1EventHandler InvalidP1;
        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //step 3: raise the event
                    if(InvalidP1!=null)
                        InvalidP1();
                }
            }
        }
    }
}

namespace EventHandling2
{
    class Program
    {
        

        static void Main()
        {
            Class1 o = new Class1();
            o.InvalidP1 += O_InvalidP1;
            o.P1 = 200;
            Console.ReadLine();
        }

        private static void O_InvalidP1(int InvalidValue)
        {
            Console.WriteLine("invalid value : " + InvalidValue);
        }
    }
    //step 1 : create a delegate class having the same signature as the event handler
    public delegate void InvalidP1EventHandler(int InvalidValue);
    public class Class1
    {
        //step2 : declare an event (delegate object) of the delegate type
        public event InvalidP1EventHandler InvalidP1;
        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //step 3: raise the event
                    if (InvalidP1 != null)
                        InvalidP1(value);
                }
            }
        }
    }
}

