﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    class Program
    {
        static void Main(string[] args)
        {
            DerivedClass o = new DerivedClass();
            //o.i=100;
            Console.WriteLine(o.i);


            /*  DerivedClass1 o1 = new DerivedClass1();
              o1.*/

           /* TestAccessSpecifiers.BaseClass o2 = new TestAccessSpecifiers.BaseClass();
            o2.*/
        }
    }

    public class BaseClass
    {
        public int i;
    }
    public class DerivedClass : BaseClass
    {
        public int j;
    }

    public class BaseClass1
    {
        public int PUBLIC;
        private int PRIVATE;
        protected int PROTECTED;
        internal int INTERNAL;
        protected internal int PROTECTED_INTERNAL;
        private protected int PRIVATE_PROTECTED;
    }
    public class DerivedClass1 : TestAccessSpecifiers.BaseClass   //BaseClass1
    {
        public void DoNothing() 
        {
            //this.
        }
    }






}
