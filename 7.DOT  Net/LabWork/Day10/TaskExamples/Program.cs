using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;


//calling a method with void return type using taskobj.Start
namespace Example1
{
    class Program
    {
        static void Main1(string[] args)
        {
            Task t1 = new Task(Func1);
            //Action objAction1 = Func1;
            //Task t1 = new Task(objAction1);


            //Task t3 = new Task(new Action(Func1));
            //Task t1 = new Task(Func1);

            Action objAction2 = Func2;
            Task t2 = new Task(objAction2);

            t1.Start();
            t2.Start();

            Console.ReadLine();
        }
        static void Func1()
        {
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine("first Func called from {0},{1}", Thread.CurrentThread.ManagedThreadId, i); //thread managed by LCR
            }
        }

        static void Func2()
        {
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine("second Func called from {0},{1}", Thread.CurrentThread.ManagedThreadId, i); //thread managed by LCR
            }
        }
    }
}

//calling a method with void return type using Task.Run and Task.Factory.StartNew
namespace Example2
{
    class Program
    {
        static void Main2()
        {
            //Action objAction1 = Func1;
            //Task t1 = Task.Run(objAction1);
            Task t1 = Task.Run(Func1);

            //Action objAction2 = Func2;
            //Task t2 = Task.Run(objAction2);
            Task t2 = Task.Factory.StartNew(Func2);

            Console.ReadLine();
        }

        static void Func1()
        {
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine("Ex.2 first Func called from {0},{1}", Thread.CurrentThread.ManagedThreadId, i);
            }
        }
        static void Func2()
        {
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine("Ex.2 second Func called from {0},{1}", Thread.CurrentThread.ManagedThreadId, i);
            }
        }
    }
}

//calling a method with void return type and parameters 
namespace Example3
{
    class Program
    {
        static void Main3()
        {
            // Action<object> objAction1 = Func1;
            // Task t1 = new Task(objAction1,"aaa");
            Task t1 = new Task(Func1,"aaa1");

            //Task.Run - cannot be used with parameters. 
            //use anonymous methods instead to access variables declared in calling code

            string s = "string aaa";
            Task.Run(delegate () { Console.WriteLine(s); });

            // Action<object> objAction2 = Func2;
            // Task t2 = new Task(objAction2,"aaa");
            Task t2 = Task.Factory.StartNew(Func2, "bbb2");  //starts here itself
            
            t1.Start();
            Console.ReadLine();
        }

         static void Func1(object obj)
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("first Func1 called {0},{1}",i, obj.ToString());
            }
        }

         static void Func2(object obj)
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("second Func2 called {0},{1}", i, obj.ToString());
            }

        }
    }
}

//calling methods with return type 
namespace Example4
{
    class Program
    {
        static void Main()
        {
            //Task<int> t1 = new Task<int>(new Func<int>(Func1));
            /* Func<int> objFinc1 = Func1;
             Task<int> t1 = new Task<int>(objFinc1);*/
            // Task<int> t1 = new Task<int>(Func1);
            Task<int> t1 = Task<int>.Run(Func1);  //todo

            //t1.Start();

            /* Func<int> objFinc2 = Func2;
            Task<int> t2 = new Task<int>(objFinc2);*/
           // Task<int> t2 = new Task<int>(Func2,"abc");
            Task<int> t2 = Task.Factory.StartNew(Func2,"amey"); //todo
          //  t2.Start();

            //to do
            //try calling func with return value with Task.Run and Task.Factory.StartNew

            if (!t1.IsCompleted)
                t1.Wait();
            Console.WriteLine(t1.Result);

            if (!t2.IsCompleted)
                t1.Wait();
            Console.WriteLine(t2.Result);

            Console.ReadLine();

        }

        static int Func1()
        {
            int i;
            for (i = 0; i < 10; i++)
            {
                Console.WriteLine("first Func called {0}", i);
            }
            return i;
        }
        static int Func2(object obj)
        {
            int i;
            for (i = 0; i < 20; i++)
            {
                Console.WriteLine("second Func called {0},{1}", i, obj.ToString());
            }
            return i;
        }
    }
}