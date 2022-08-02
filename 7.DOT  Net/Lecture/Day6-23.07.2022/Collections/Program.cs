using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Collections
{
    class Program
    {
        static void Main1()
        {
            object o1;
            int i = 100;
            o1 = i; //BOXING
            int j;
            j = (int)o1;  //UNBOXING


            ArrayList a = new ArrayList();
            a.Add(10); //BOXING


            //Hashtable o = new Hashtable();
            SortedList o = new SortedList();
            o.Add(1, "Vikram");
            o.Add(2, "Harsh");
            o.Add(3, "Ananya");

            o[1] = "new";
            o[4] = "Shweta";

            //o.Remove(1);  //key
            //o.RemoveAt(1);  //index

            bool ans = o.Contains(30);
            //o.ContainsKey same as above

            //o.ContainsValue

            //Console.WriteLine( o.GetByIndex(0))// //gets value
            //o.GetKey
            //IList olist = o.GetKeyList();
            //IList olist = o.GetValueList();
            //o.IndexOfKey
            //o.IndexOfValue
            //o.Keys
            //o.Values
            //o.SetByIndex(0, "aa");

            

            foreach (DictionaryEntry item in o)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value);
            }

            Console.ReadLine();
        }
        static void Main2()
        {
            Stack s = new Stack();
            s.Push("aaa");
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue q = new Queue();
            q.Enqueue("aa");
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue());

        }
        static void Main3()
        {
            List<int> o = new List<int>();
            o.Add(10);
            
            foreach (int item in o)
            {

            }

        }
        static void Main4()
        {
            SortedList<int, string> o = new SortedList<int, string>();
            o.Add(1, "Vikram");
            o.Add(2, "Harsh");
            o.Add(3, "Ananya");

            foreach (KeyValuePair<int,string> item in o)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value);
            }

        }
        static void Main5()
        {
            Stack<string> s = new Stack<string>();
            s.Push("aaa");
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue<string> q = new Queue<string>();
            q.Enqueue("aa");
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue());

        }
        static void Main()
        {
            List<Employee> lstEmps = new List<Employee>();
            lstEmps.Add(new Employee { EmpNo = 1, Name = "Vikram" });
            lstEmps.Add(new Employee { EmpNo = 2, Name = "Harsh" });
            lstEmps.Add(new Employee { EmpNo = 3, Name = "Ananya" });

            foreach (Employee item in lstEmps)
            {
                Console.WriteLine(item.EmpNo);
                Console.WriteLine(item.Name);

            }

        }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}
