using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


//constructors in inheritance
namespace InheritanceExamples3
{

    class Program
    {
        static void Main1()
        {
            //DerivedClass o = new DerivedClass();

            DerivedClass o2 = new DerivedClass(123, 456);
            Console.ReadLine();
        }
    }
    public class BaseClass
    {
        public int i;
        public BaseClass()
        {
            Console.WriteLine("base class no param cons");
            i = 10;
        }
        public BaseClass(int i)
        {
            Console.WriteLine("base class int cons");
            this.i = i;
        }
    }
    public class DerivedClass : BaseClass
    {
        public int j;
        public DerivedClass()
        {
            Console.WriteLine("derived class no param cons");
            //i = 10;
            j = 20;
        }
        public DerivedClass(int i, int j) : base(i)
        {
            Console.WriteLine("derived class int,int cons");
            //this.i = i;
            this.j = j;
        }
    }
}

namespace InheritanceExamples4
{

    class Program
    {
        static void Main1()
        {
            DerivedClass o = new DerivedClass();
            o.Display1();
            o.Display1("a");

            o.Display2();

            o.Display3();
            Console.ReadLine();
        }

        //late binding
        static void Main2()
        {
            BaseClass o;
            o = new BaseClass();
            o.Display2(); //non virtual, early bound
            o.Display3(); //virtual, late bound

            Console.WriteLine();
            o = new DerivedClass();
            o.Display2(); //non virtual, early bound
            o.Display3(); //virtual, late bound

            Console.WriteLine();
            o = new SubDerivedClass();
            o.Display2(); //non virtual, early bound
            o.Display3(); //virtual, late bound

            Console.WriteLine();
            o = new SubSubDerivedClass();
            o.Display2(); //non virtual, early bound
            o.Display3(); //virtual, late bound

            Console.ReadLine();
        }
    }
    public class BaseClass
    {
        public void Display1()
        {
            Console.WriteLine("Base Display1");
        }
        public void Display2()
        {
            Console.WriteLine("Base Display2");
        }
        public  virtual void Display3()
        {
            Console.WriteLine("Base Display3");
        }
    }
    public class DerivedClass : BaseClass
    {
        //overloading the method in the derived class
        public void Display1(string s)
        {
            Console.WriteLine("Derived Display1");
        }
        //hiding the base method in the derived class
        public new void Display2()
        {
            Console.WriteLine("Derived Display2");
        }
        //overriding the base method in the derived class
        public override void Display3()
        {
            Console.WriteLine("Derived Display3");
        }
    }
    public class SubDerivedClass : DerivedClass
    {
        //overriding the base method in the derived class
        public sealed override void Display3()
        {
            Console.WriteLine("SubDerived Display3");
        }
    }
    public class SubSubDerivedClass : SubDerivedClass
    {
        //overriding the base method in the derived class
        public  void Display3()
        {
            Console.WriteLine("SubSubDerived Display3");
        }
    }
}
/*
 * 1. Derived class can overload the base class method
same name, diff parameters
Derived o = new Derived();
o.BaseMethod
o.DerivedMethod
Both methods are available from a derived class object

2. Derived class can hide the base class method
same name, same parameters
Derived o = new Derived();
o.DerivedMethod
Only derived class method is available from a derived class object
Any method can be hidden*

3. Derived class can override the base class method
same name, same parameters
Derived o = new Derived();
o.DerivedMethod
Only derived class method is available from a derived class object
Only a virtual method can be overridden***

Virtual methods -
Late bound - Run time binding - Run time polymorphism
 */

namespace InheritanceExamples5
{
    class Program
    {
        static void Main()
        {
            //AbstractClass obj1 = new AbstractClass();
            DerivedClass obj = new DerivedClass();
            obj.Display();
            Console.ReadLine();
        }
    }

    public abstract class AbstractClass
    {
        public void Display()
        {
            Console.WriteLine("display from abs");
        }
    }
    public class DerivedClass : AbstractClass
    {
        public void Show()
        {
            Console.WriteLine("show");
        }
    }
    public abstract class AbstractClass2
    {
        public abstract void Display();
        public abstract void Show();

    }
    public class Class2 : AbstractClass2
    {
        public override void Display()
        {
            Console.WriteLine("display");
        }
        public override void Show()
        {
            Console.WriteLine("show");
        }
    }
}

/*
 *                          ABSTRACT CLASS      SEALED CLASS
 * Instantiate the class        NO                  YES
 * Inherit from the class       YES                 NO
 */

// TO DO - create a selaed class