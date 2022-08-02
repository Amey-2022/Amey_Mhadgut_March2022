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
        static void Main1(string[] args)
        {
            object o1;
            int i = 100;
            o1 = i; //BOXING
            int j;
            j = (int)o1;  //UNBOXING

            ArrayList a = new ArrayList();
            a.Add(10);//BOXING

            //Hashtable o = new Hashtable();
            SortedList o = new SortedList();
            o.Add(1, "Amey");
            o.Add(2, "Anil");
            o.Add(34, "Mhadgut");

            o[1] = "new";
            o[4] = "Ram";

            //o.Remove(1);  //key
            //o.RemoveAt(1);  //index

            // bool ans = o.Contains(3);
            // bool ans = o.ContainsKey(5); //same as above
            // bool ans = o.ContainsValue("Ram");
            //Console.WriteLine(ans);
            // Console.WriteLine(o.GetByIndex(1)); //gets value
            //Console.WriteLine(o.GetKey(3));

            // IList olist = o.GetKeyList(); //keys
            // IList olist = o.GetValueList(); //value
            /*foreach (object item in olist)
            {
                Console.WriteLine(item);
            }*/

            // Console.WriteLine(o.IndexOfKey(34));
            //Console.WriteLine(o.IndexOfValue("Anil"));
            //o.Keys;
            //o.Values
            //o.SetByIndex(2, "aa");

            foreach (DictionaryEntry item in o)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value);
            }
        }

        static void Main2()
        {
            Stack s = new Stack();
            s.Push("abc");
            s.Push(15);
            s.Push("sdf");
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue q = new Queue();
            q.Enqueue(75);
            q.Enqueue("abx");
            q.Enqueue(72);
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue());
        }

        static void Main3(string[] args)
        {
            List<int> o = new List<int>();
            o.Add(10);

            foreach (int item in o)
            {
                Console.WriteLine(item);
            }
        }

        static void Main4()
        {
            SortedList<int, string> o = new SortedList<int, string>();
            o.Add(1, "Amey");
            o.Add(2, "Anil");
            o.Add(34, "Mhadgut");

            foreach (KeyValuePair<int, string> item in o)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value);
            }
        }

        static void Main5()
        {
            Stack<string> s = new Stack<string>();
            s.Push("abc");
            s.Push("dfg");
            s.Push("sdf");
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue<int> q = new Queue<int>();
            q.Enqueue(75);
            q.Enqueue(25);
            q.Enqueue(72);
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue());
        }

        static void Main()
        {
            List<Employee> empList = new List<Employee>();
            empList.Add(new Employee { EmpNo = 1,Name="Amey"});
            empList.Add(new Employee { EmpNo = 25, Name = "Raj" });
            empList.Add(new Employee { EmpNo = 3, Name = "Nikit" });

            foreach (Employee item in empList)
            {
                Console.WriteLine(item.EmpNo);
                Console.WriteLine(item.Name);
            }
        }
    public class Employee
        {
            public int EmpNo { get; set; } 
            public string Name { get; set; }
        }
    }
}
