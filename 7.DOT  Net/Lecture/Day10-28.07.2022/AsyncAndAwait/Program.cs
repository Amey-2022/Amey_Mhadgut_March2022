using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace AsyncAwait
{
    class Program
    {

        static async Task Main1()
        {
            Console.WriteLine("Before");
            string message = await DoWorkAsync();  //waiting call
            Console.WriteLine(message);
            Console.WriteLine("After");
            Console.ReadLine();
        }
        //to call a method with await, method needs to return a Task<T>
        static async Task<string> DoWorkAsync()
        {
            return await Task.Run(() =>
            {
                Thread.Sleep(5000);
                return "Done with work!";
            });
        }

        static async Task Main()
        {
            Console.WriteLine("Before");

            Task<Task<string>> t1 = new Task<Task<string>>(DoWorkAsync);
            t1.Start();
            Console.WriteLine("After");

            string message = await t1.Result;
            Console.WriteLine(message);
            Console.ReadLine();
        }

    }
}
