using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Collections
{
    class Program
    {
        static void Main()
        {
            ArrayList o = new ArrayList();
            o.Add("Vikram");
            o.Add(10);
            o.Add(1.23);
            //o.Remove(10);
            //o.RemoveAt(0);
            //o.AddRange(o2);
            //o.Insert(0, "abc");
            //o.InsertRange(0,o2)
            //o.RemoveRange(0, 2);
            //o.Clear()
            bool ans = o.Contains(10);
            //o.IndexOf
            //o.LastIndexOf
            //o.BinarySearch

            //o.CopyTo(arr)
            //ArrayList o3 = o.GetRange(0, 2); 

            //o.SetRange(0, o2)

            Console.WriteLine(o[0]);
            //object[] arr = o.ToArray();


            //o.Capacity = no_of_records_in_db
            //read records from db in a loop
                 //add one item to an arraylist
            //o.TrimToSize()




            Console.WriteLine(o.Count);
            foreach (object item in o)
            {
                Console.WriteLine(item);
            }

            Console.ReadLine();
        }
    }
}
