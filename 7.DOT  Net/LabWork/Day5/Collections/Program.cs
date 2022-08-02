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
        static void Main(string[] args)
        {
            ArrayList o = new ArrayList();
            ArrayList o2 = new ArrayList();
            o2.Add(47);
            o2.Add("Anil");
            o2.Add(8.99);
            o.Add(10);
             o.Add("Amey");
            o.Add(1.45);
            o.Add(10);
            o.Add(20);
            o.Add(30);
            // int[] arr;
            //o.Remove(10); //value
            //o.RemoveAt(1); //index
            //o.AddRange(o2); //adds in o from o2 beyond last index
            //o.Insert(1, 15); //at index
            //o.InsertRange(1, o2); // adds beyond  given index
            //o.RemoveRange(0, 2); //from given index till given count
            //o.Clear(); //empty the list

            // bool ans = o.Contains("Amey"); //True
            //bool ans = o.Contains(102); //False
            //Console.WriteLine(ans);


            //Console.WriteLine(o.IndexOf("Amey"));
            //Console.WriteLine(o.LastIndexOf(10));
            // Console.WriteLine(o.BinarySearch(30));//req sorted array



            //o.CopyTo(arr);  //not performed error

            //ArrayList o3 = o.GetRange(0, 2);
            // o.SetRange(1, o2); //similar to insertrange

            //not done
           // Console.WriteLine(o[0]);
            //object[] arr = o.ToArray();


            //o.Capacity = no_of_records_in_db
            //read records from db in a loop
            //add one item to an arraylist
            //o.TrimToSize();




            Console.WriteLine("Coiunt : "+o.Count);
            foreach (object item in o)
            {
                Console.WriteLine(item);
            }

            Console.ReadLine();
        }
    }
}
