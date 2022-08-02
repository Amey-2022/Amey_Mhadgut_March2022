using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;

namespace RelectionExample
{
    class Program
    {
        static void Main()
        {
            //Assembly asm = Assembly.LoadFile("D:\Trainings\JKJuly22\Day2\Properties\bin\Debug\Properties.exe");
            Assembly asm = Assembly.LoadFile(@"D:\Trainings\JKJuly22\Day2\Properties\bin\Debug\Properties.exe");
            //Assembly asm = Assembly.LoadFile("D:\\Trainings\\JKJuly22\\Day2\\Properties\\bin\\Debug\\Properties.exe");
            Console.WriteLine(asm.FullName);
            Console.WriteLine(asm.GetName().Name);

            Type[] arrTypes = asm.GetTypes();
            
            foreach (Type t in arrTypes)
            {
                Console.WriteLine("   " + t.Name);
                MethodInfo[] arrMethods = t.GetMethods();

            }

            Console.ReadLine();
        }
    }
}
