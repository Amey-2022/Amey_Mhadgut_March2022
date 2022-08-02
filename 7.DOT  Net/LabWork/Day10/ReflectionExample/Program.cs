using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;


namespace ReflectionExample
{
    class Program
    {
        static void Main(string[] args)
        {
            //Assembly asm = Assembly.LoadFile("G:\CDACM2022\SRC-Module-7\LabWork\Day2\Assignment1\bin\Debug\Assignment1.exe");
            Assembly asm = Assembly.LoadFile(@"G:\CDACM2022\SRC-Module-7\LabWork\Day2\Assignment1\bin\Debug\Assignment1.exe");
            // Assembly asm = Assembly.LoadFile("G:\\CDACM2022\\SRC-Module-7\\LabWork\\Day2\\Assignment1\\bin\\Debug\\Assignment1.exe");
            Console.WriteLine(asm.FullName);
            Console.WriteLine();
            Console.WriteLine(asm.GetName().Name);
            Console.WriteLine();

            Type[] arrTypes = asm.GetTypes();

            foreach (Type t in arrTypes)
            {
                ConstructorInfo[] arrc = t.GetConstructors();
                foreach (var item in arrc)
                {
                    Console.WriteLine(item.Name);
                    
                }
                Console.WriteLine();
                Console.WriteLine("    "+t.Name);
                Console.WriteLine();
                MethodInfo[] arrMethods = t.GetMethods();
                Console.WriteLine();
               
                foreach (var item in arrMethods)
                {
                    Console.WriteLine(item.Name);                                                       
                }

                Console.WriteLine();
                PropertyInfo[] arrp = t.GetProperties();
                foreach (var item in arrp)
                {
                    Console.Write(item.Name+ " ");
                    Console.WriteLine(item.PropertyType);
                }
            }

            Console.ReadLine();
        }
    }
}
