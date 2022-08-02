using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//implicit variables
namespace ImplicitVariables
{
    class Program
    {
        static void Main1()
        {
            //int a = 100;
            var a = 100; //implicit variable
                         //var a =(long) 100; //implicit variable
                         //a= "aaa"; //error

            //used only for local variables
            //cant be used for class level vars,fn params and return types
            var b = "abc";

            //var b; //error
            Console.WriteLine(a.GetType());
            Console.WriteLine(a);
        }
    }
}

namespace AnonymousTypes
{
    class Program
    {
        static void Main2()
        {
            //Class1 obj = new Class1{a=1, b="aaa",c = true};

            var obj = new { a = 1, b = "aaa", c = true };
            var obj2 = new { a = 2, b = "bbb"};
            var obj3 = new { a = 1, b = "aaa", c = false };
            Console.WriteLine(obj.b);
            Console.WriteLine(obj.GetType());
            Console.WriteLine(obj2.GetType());
            Console.WriteLine(obj3.GetType());

            Console.ReadLine(); ;
        }
    }
}

//partial classes
namespace LanguageFeatures5  //same namespace
{
    //PARTIAL CLASSES

    //partial classes must be in the same assembly
    //partial classes must be in the same namespace
    //partial classes must have the same name
    public partial class Class1 //same name
    {
        public int i;
    }
    public partial class Class1 //same name
    {
        public int j;
    }
    public class Program
    {
        public static void Main1()
        {
            Class1 o = new Class1();
            //o.
        }
    }
}

namespace LanguageFeatures5 //same namespace
{
    public partial class Class1 //same name
    {
        public int k;
    }
}

//partial methods
namespace PartialMethods
{
    public class MainClass
    {
        public static void Main1()
        {
            Class1 o = new Class1();

            Console.WriteLine(o.Check());

            Console.ReadLine();
        }
    }

    //Partial methods can only be defined within a partial class.
    //Partial methods must return void.
    //Partial methods can be static or instance level.
    //Partial methods cannnot have out params
    //Partial methods are always implicitly private.

    public partial class Class1  //same name
    {
        private bool isValid = true;
        partial void Validate();
        public bool Check()
        {
            //.....
            Validate();
            return isValid;
        }
    }

    public partial class Class1  //same name
    {
        partial void Validate()
        {
            //perform some validation code here
            isValid = false;
        }
    }

}

namespace ExtensionMethods
{
    class Program
    {
        static void Main1()
        {
            string s = "abc";
            s.Display();
            s.ExtMethodForBaseClass();

            int i = 10;
            i = i.Add(5);
            i.Show();
            Console.ReadLine();
        }
        static void Main2()
        {
            string s = "abc";
            MyExtMethodClass.Display(s);  //same as done in main1
            int i = 10;
            i = MyExtMethodClass.Add(i, 5);
            MyExtMethodClass.Show(i);
            Console.ReadLine();
        }
        static void Main()
        {
            ClsMaths o = new ClsMaths();
            Console.WriteLine(o.Subtract(10,5));
           
            Console.ReadLine();
        }
    }
    //create a static class
    public static class MyExtMethodClass
    {
        //create a static method in the class
        //first parameter should be the type for which you are writing the ext method
        //precede the 1st parameter with the 'this' keyword
        public static void Display(this string s)
        {
            Console.WriteLine(s);
        }
        public static void Show(this int i)
        {
            Console.WriteLine(i);
        }
        public static int Add(this int i, int j)
        {
            return i + j;
        }
        //if you define an extension method for a baseclass, 
        // it is also available to all derived classes that extends that baseclass
        public static void ExtMethodForBaseClass(this object s)
        {
            //Array.Sort();
            Console.WriteLine(s);
        }
        //if you define an extension method for an interface, 
        // it is also available to all classes that implement that interface
        public static int Subtract(this IMathOperations i, int a, int b)
        {
            return a - b;
        }
    }
    public interface IMathOperations
    {
        int Add(int a, int b);
        int Multiply(int a, int b);
    }
    public class ClsMaths : IMathOperations
    {
        public int Add(int a, int b)
        {
            return a + b;
        }

        public int Multiply(int a, int b)
        {
            return a * b;
        }
    }
}
