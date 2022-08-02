using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    class Program
    {
        static void Main()
        {
            DerivedClass o = new DerivedClass();
            //o.i
        }
    }
    public class BaseClass
    {
        public int i;
    }
    public class DerivedClass :BaseClass
    {
        public int j;
    }

}

//access specifiers
namespace InheritanceExamples2
{
    class Program
    {
        static void Main1()
        {
            //BaseClass o = new BaseClass();
            //o. 

            TestAccessSpecifiers.BaseClass o2 = new TestAccessSpecifiers.BaseClass();
            //o2.
        }
    }
    //public -> everywhere
    //private -> same class
    //protected -> same class, derived class
    //internal -> same class, same assembly(same project)
    //protected internal -> same class, derived class, same assembly
    //private protected - same class, derived class which is in the same assembly
    public class BaseClass
    {
        public int PUBLIC;
        private int PRIVATE;
        protected int PROTECTED;
        internal int INTERNAL;
        protected internal int PROTECTED_INTERNAL;
        private protected int PRIVATE_PROTECTED;
        int x; 
    }
    public class DerivedClass  : TestAccessSpecifiers.BaseClass   //: BaseClass
    {

        void DoNothing()
        {
            //this.
        }
    }
}