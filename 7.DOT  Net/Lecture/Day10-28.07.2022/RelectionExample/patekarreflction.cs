using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Reflection;
using System.Threading.Tasks;

namespace ReflectionExample
{
    class Program
    {
        static void Main(string[] args)
        {
            //Assembly.GetAssembly();
            //Assembly.GetExecutingAssembly();
            //Assembly.GetCallingAssembly();
            //Assembly.GetEntryAssembly();
            //Assembly asm = Assembly.LoadFile("C:\\windows (D)\\CDAC juhu\\Module Programs\\DotNet\\JKJuly22\\Day2\\Day02\\Properties1\\bin\\Debug");
            Assembly asm = Assembly.LoadFile(@"C:\windows (D)\CDAC juhu\Module Programs\DotNet\JKJuly22\Day2\Day02\Properties1\bin\Debug\Properties1.exe");
            
            Console.WriteLine(asm.FullName);

            Console.WriteLine(asm.GetName().Name);
            /*Console.WriteLine(asm.Location);
            Console.WriteLine(asm.CodeBase);
            Console.WriteLine(asm.DefinedTypes);
            Console.WriteLine(asm.EntryPoint);
            Console.WriteLine(asm.Modules);
            Console.WriteLine(asm.GlobalAssemblyCache);*/

            Type[] arrTypes = asm.GetTypes();
            foreach (Type t in arrTypes)
            {
                Console.WriteLine("    "+t.Name);
                MethodInfo[] arrMethods = t.GetMethods();
                foreach (MethodInfo method in arrMethods)
                {
                    Console.WriteLine("            "+method.Name);
                    ParameterInfo[] param= method.GetParameters();
                    foreach (ParameterInfo parameter in param)
                    {
                        Console.WriteLine("                       "+parameter.Name);
                    }
              
                }

                ConstructorInfo[] con = t.GetConstructors();
                foreach (ConstructorInfo constructor in con)
                {
                    Console.WriteLine("    " + constructor.Name);
                }
            }

            Console.WriteLine("\n");
            Assembly a= Assembly.GetExecutingAssembly();
            Console.WriteLine(a.FullName);
        }
    }
}