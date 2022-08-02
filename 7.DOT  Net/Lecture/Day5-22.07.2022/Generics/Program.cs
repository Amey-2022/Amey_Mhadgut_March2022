using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Generics
{
    class Program
    {
        static void Main1()
        {
            //IntegerStack o1 = new IntegerStack(3);
            //StringStack o2 = new StringStack(3);
            MyStack<int> o1 = new MyStack<int>(3);
            o1.Push(10);
            o1.Push(20);
            o1.Push(30);
            Console.WriteLine(o1.Pop());
            Console.WriteLine(o1.Pop());
            Console.WriteLine(o1.Pop());

            MyStack<string> o2 = new MyStack<string>(3);
            o2.Push("aa");
            o2.Push("ba");
            o2.Push("pa");
            Console.WriteLine(o2.Pop());
            Console.WriteLine(o2.Pop());
            Console.WriteLine(o2.Pop());
            Console.ReadLine();
        }
        static void Main()
        {

            int? a = 100;
            //Nullable<int> b = 100;

        }
    }
    class IntegerStack
    {
        int[] arr;
        public IntegerStack(int Size)
        {
            arr = new int[Size];
        }
        int Pos = -1;
        public void Push(int i)
        {
            if (Pos == (arr.Length - 1))
                throw new Exception("Stack full");
            arr[++Pos] = i;
        }
        public int Pop()
        {
            if (Pos == -1)
                throw new Exception("Stack Empty");
            return arr[Pos--];
        }
    }

    class StringStack
    {
        string[] arr;
        public StringStack(int Size)
        {
            arr = new string[Size];
        }
        int Pos = -1;
        public void Push(string i)
        {
            if (Pos == (arr.Length - 1))
                throw new Exception("Stack full");
            arr[++Pos] = i;
        }
        public string Pop()
        {
            if (Pos == -1)
                throw new Exception("Stack Empty");
            return arr[Pos--];
        }
    }
    class MyStack<T>
    //where T : class  //T must be a reference type
    //where T : struct  //T must be a value type
    //where T : InterfaceName  //T must be a class that implements the specified interface
    //where T : ClassName  //T must be the class specified or its derived class
    //where T : new() //T must have a no param constructor
    //where T : ClassName,InterfaceName,new()

    {
        T[] arr;
        public MyStack(int Size)
        {
            //T obj = new T();

            arr = new T[Size];
        }
        int Pos = -1;
        public void Push(T i)
        {
            if (Pos == (arr.Length - 1))
                throw new Exception("Stack full");
            arr[++Pos] = i;
        }
        public T Pop()
        {
            if (Pos == -1)
                throw new Exception("Stack Empty");
            return arr[Pos--];
        }
    }
}
