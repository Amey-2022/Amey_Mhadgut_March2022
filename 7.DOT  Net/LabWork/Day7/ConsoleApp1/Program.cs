using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {

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
                    
                }
            }
        }
    }
}
