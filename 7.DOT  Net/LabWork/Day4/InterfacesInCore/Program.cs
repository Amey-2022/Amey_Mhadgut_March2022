using System;

namespace InterfacesInCore
{
    class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1();
            o.Insert();
            // o.DefMethod();

            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Insert();
            oIDb.DefMethod();

        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();

        static int a;

        //default implementation for interface method
        void DefMethod()
        {
            Console.WriteLine("default implementation for interface method in interface");  
        }
    }

    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }
        public void Delete()
        {
            Console.WriteLine("Class1 - IDb.Delete");
        }

        public void Insert()
        {
            Console.WriteLine("Class1 - IDb.Insert");
        }

        public void Update()
        {
            Console.WriteLine("Class1 - IDb.Update");
        }

        /* public void DefMethod()
         {
             Console.WriteLine("class1 code for def method");
         }*/

        void IDbFunctions.DefMethod()
        {
            Console.WriteLine("class1 code for def method - IDbfunctions");
        }
    }
}
