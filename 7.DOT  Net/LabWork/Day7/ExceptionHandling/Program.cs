using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace ExceptionHandling
{
    public class Class1
    {
        private int p1;
        public int P1
        {
            set 
            {
                p1 = value;
            }
            get { return p1; }
        }
    }
    class Program
    {
        static void Main0(string[] args)
        {
            Class1 obj = new Class1();
            obj = null;
            int x = Convert.ToInt32(Console.ReadLine());
            obj.P1 = 100 / x;
            Console.WriteLine(obj.P1);
            Console.ReadLine();
        }

        static void Main1() //simple try block with catch
        {
            Class1 obj = new Class1();
            try
            {
                obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exceptions");
            }
            catch
            {
                Console.WriteLine("Exception occurred");
            }
            Console.ReadLine();
        }

        static void Main2()//try with multiple catch blocks
        {
            Class1 obj = new Class1();
            try
            {
                obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exceptions");
            }
            catch (DivideByZeroException)
            {
                Console.WriteLine("DBException occurred");
            }
            catch (NullReferenceException e)
            {
                Console.WriteLine("NRException occurred");
            }
            catch (FormatException e) 
            {
                Console.WriteLine("FormatException occurred");
            }
            Console.ReadLine();
        }
       
        static void Main3()// catching base class exceptions
        {
            Class1 obj = new Class1();
            try
            {
                obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exceptions");
            }

            //catch (SystemException ex) cant be before base class excp always after base class exception
            catch (FormatException ex)
            {
                Console.WriteLine("FormatException occurred");
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("NRException occurred");
            }
            //catch (DivideByZeroException ex)
           // catch (ArithmeticException ex) 
           /* catch (SystemException ex) //base class exception has to caught after derived class exceptions
            {
                Console.WriteLine("DBException occurred");
            }*/
            catch (Exception ex) //catches all unhandled exceptions
            {
                Console.WriteLine(ex.TargetSite);
                Console.WriteLine(ex.Source);
                Console.WriteLine(ex.Message);
                Console.WriteLine(ex.StackTrace);
            }
            Console.ReadLine();
        }

        static void Main4()// finally block
        {
            Class1 obj = new Class1();
            try
            {
               // obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exceptions");
            }

            catch (FormatException ex)
            {
                Console.WriteLine("FormatException occurred");
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("NRException occurred");
            }
            //catch (DivideByZeroException ex) 
            //catch (ArithmeticException ex) 
            catch (SystemException ex) //base class exception has to caught after derived class exceptions
            {
                Console.WriteLine("DBException occurred");
            }
            catch (Exception ex) //catches all unhandled exceptions
            {
                Console.WriteLine(ex.Message);
            }
            //finally runs when Exception does not occur, 
            //or Exception occurs and is handled or 
            //Exception occurs and is NOT handled 
            finally
            {
                Console.WriteLine("finally");
            }
            Console.ReadLine();
        }
        //exaple for explaning finally block
        static int X(int x = 0)
        {
            try
            {
                if (x == 0)
                    x = 0;
                if (x == 1)
                    x = x * 10;
                if (x == 2)
                    x = x * 20;
                else
                    x = -1;
            }
            catch { }
            finally
            {
                //store x into db -A   //code in finally will always work as excep occurs or not
            }
            //store x into db -B  //code here will only work if no excep else it will not...

            return x;
        }

        static void Main5()// nested try block = try within try or try in catch
        {
            Class1 obj = new Class1();
            try
            {
                //obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exceptions");
            }

            catch (FormatException ex)
            {
                try
                {
                    Console.WriteLine("FormatException occurred. Enter only numbers");
                    int x = Convert.ToInt32(Console.ReadLine());
                    obj.P1 = 100 / x;
                    Console.WriteLine(obj.P1);
                }
                catch
                {
                    Console.WriteLine("nested try catch example");
                }
                finally
                {
                    Console.WriteLine("nested try finally example");
                }
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("NRException occurred");
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine("DBException occurred");
            }
            catch (Exception ex) //catches all unhandled exceptions
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Console.WriteLine("outer finally");

            }
            Console.ReadLine();
        }

    }
}



//user defined exception

namespace ExceptionHandling2
{
    class Program
    {
        static void Main()
        {
            Class1 obj = new Class1();
            try
            {
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exceptions");
            }
            catch (FormatException ex)
            {
                Console.WriteLine("FormatException occurred");
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("NRException occurred");
            }
            catch (InvalidP1Exception ex) 
            {
                Console.WriteLine(ex.Message);
            }
            catch (SystemException ex)  //all exceptions thrown by .net base classes
            {
                Console.WriteLine(ex.Message);
            }

            catch (ApplicationException ex) //all user defined exceptions
            {
                Console.WriteLine(ex.Message);
            }
            catch (Exception ex) //all other exceptions
            {
                Console.WriteLine(ex.Message);
            }


            Console.ReadLine();


        }
    }

    public class Class1
    {
        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //Console.WriteLine("invalid P1");   //DONT EVER DO THIS
                    //Exception ex = new Exception();
                    //throw ex;
                    //Exception ex = new Exception("invalid P1");
                    //throw ex;
                   // throw new Exception("invalid P1");
                    throw new InvalidP1Exception("invalid P1");
                }
            }
        }
    }

    
    public class InvalidP1Exception : ApplicationException
    {       
        public InvalidP1Exception(string message) : base(message)
        {

        }
    }
}
