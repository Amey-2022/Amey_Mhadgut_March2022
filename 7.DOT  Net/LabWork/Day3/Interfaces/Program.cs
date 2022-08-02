using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces1
{
    class Program
    {
        static void Main1(string[] args)
        {
            Class1 o = new Class1();
            o.Display();
            //method 1
            o.Insert();

            // method 2
            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Insert();

            //method 3
            ((IDbFunctions)o).Insert();

            //method 4
            (o as IDbFunctions).Insert();
        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
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
    }
}


namespace Interfaces2
{
    class Program
    {
        static void Main2(string[] args)
        {
            Class1 o = new Class1();

            (o as IDbFunctions).Delete();

            IFileFunctions oIFile;
            oIFile = o;
            oIFile.Delete();

            Console.ReadLine();
        }
    }



    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }
    public interface IFileFunctions
    {
        void Open();
        void Close();
        void Delete();
    }

    public class Class1 : IDbFunctions, IFileFunctions
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }
        void IDbFunctions.Delete()
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

        void IFileFunctions.Delete()
        {
            Console.WriteLine("Class1 - IFile.Delete");
        }

        public void Open()
        {
            Console.WriteLine("Class1 - IFile.Open");
        }

        public void Close()
        {
            Console.WriteLine("Class1 - IFile.Close");
        }
    }
}


namespace Interfaces3
{
    class Program
    {

        //polymorphic code
        static void Main1(string[] args)
        {
            Class1 obj1 = new Class1();
            Class2 obj2 = new Class2();

            IDbFunctions oIDb;
            oIDb = obj1;
            oIDb.Insert();

            oIDb = obj2;
            oIDb.Insert();

            Console.ReadLine();
        }

        static void Main()
        {
            Class1 o1 = new Class1();
            Class2 o2 = new Class2();
            InsertMethod(o1);
            InsertMethod(o2);
            Console.ReadLine();
        }
        static void InsertMethod(IDbFunctions oIDb) //can receive an object of any class that implements IDbFunctions
        {
            oIDb.Insert();
        }
    }



    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();

    }

    public class Class1 : IDbFunctions
    {
        public void Delete()
        {
            Console.WriteLine("Class1 - IDb.Delete");
        }

        public void Display()
        {
            Console.WriteLine("Display");
        }

        public void Insert()
        {
            Console.WriteLine("Class1 - IDb.Insert");
        }

        public void Update()
        {
            Console.WriteLine("Class1 - IDb.Update");
        }
    }

    public class Class2 : IDbFunctions
    {
        public void Delete()
        {
            Console.WriteLine("Class2 - IDb.Delete");
        }

        public void Display()
        {
            Console.WriteLine("Display");
        }

        public void Insert()
        {
            Console.WriteLine("Class2 - IDb.Insert");
        }

        public void Update()
        {
            Console.WriteLine("Class2 - IDb.Update");
        }
    }
}


//advantages of interfaces

//contract - class MUST implement all the interface methods
//similar code in entire project for all developers
//polymorphic code
//design patterns 

//to do - try inheritance in interfaces