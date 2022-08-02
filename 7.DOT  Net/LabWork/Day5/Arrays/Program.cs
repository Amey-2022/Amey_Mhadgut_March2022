using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Arrays
{
    class Program
    {
        static void Main1(string[] args)
        {
            int[] arr = new int[3];

            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write("Enter arr[{0}] :", i);
                arr[i] = int.Parse(Console.ReadLine());
                //arr[i] = Convert.ToInt32(Console.ReadLine());
            }

            for (int i = 0; i < arr.Length; i++)
            {
                //Console.WriteLine("arr[{0}] : {1} " ,i, arr[i]); //placeholders
                Console.WriteLine($"The value of arr[{i}] is {arr[i]}"); //string interpolation
            }

            foreach (int item in arr)
            {
                Console.WriteLine(item);
            }
        }


        static void Main2(string[] args)
        {

            int[] arr = new int[5] { 15, 45, 98, 75, 102 };
            int[] arr2 = new int[3] { 10, 20, 30 };
            /* for (int i = 0; i < arr.Length; i++)
             {
                 Console.Write("Enter arr[{0}] :", i);
                 arr[i] = int.Parse(Console.ReadLine());
             }*/

            //int pos = Array.IndexOf(arr,10);
            //int pos = Array.LastIndexOf(arr, 10);
            // int pos = Array.BinarySearch(arr, 10);
            //Console.WriteLine(pos);

            //Array.Clear(arr,0,arr.Length);
            // Array.Copy(arr2, arr, arr2.Length);
            //Array.ConstrainedCopy(arr,3, arr2,0, 2);
            Array.Sort(arr);
            foreach (int item in arr)
            {
                Console.WriteLine(item);
            }
        }

        static void Main3(string[] args)
        {
            int[,] arr = new int[3, 2];
            //arr[0,0] arr[0,1]
            //arr[1,0] arr[1,1]
            //arr[2,0] arr[2,1]

            Console.WriteLine(arr.Length); //6
            Console.WriteLine(arr.Rank); //number of dimensions - 2

            Console.WriteLine(arr.GetLength(0)); //3 
            Console.WriteLine(arr.GetLength(1)); //2

            Console.WriteLine(arr.GetUpperBound(0));  //2
            Console.WriteLine(arr.GetUpperBound(1));  //1

            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.Write("Enter arr[{0},{1}] : ", i, j);
                    arr[i, j] = int.Parse(Console.ReadLine());
                }
            }

            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.WriteLine($"The value of arr[{i},{j}] is {arr[i, j]} ");  //string interpolation

                }
            }

            foreach (int item in arr)
            {
                Console.WriteLine(item);
            }
        }

        //jagged
        static void Main4(string[] args)
        {   //jagged
            int[][] arr = new int[4][];
            arr[0] = new int[3]; // arr[0][0] arr[0][1] arr[0][2]
            arr[1] = new int[4]; // arr[1][0] arr[1][1] arr[1][2] arr[1][3]
            arr[2] = new int[2]; //  arr[2][0] - arr [2][1]
            arr[3] = new int[3]; //  arr[3][0] arr[3][1] arr[3][2]

            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.Write("enter value for subscript [{0}] [{1}] : ", i,j);
                    arr[i][j] = Convert.ToInt32(Console.ReadLine());
                }
                Console.WriteLine();
                Console.WriteLine();
            }
            Console.WriteLine();
            Console.WriteLine();
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.WriteLine("value for subscript {0},{1} is {2}  ", i, j, arr[i][j]);

                }
            }
            Console.ReadLine();
        }

        //Emp Problem Hint From sir
        static void Main()
        {
            Employee[] arrEmps = new Employee[4];
            for (int i = 0; i < arrEmps.Length; i++)
            {
                arrEmps[i] = new Employee();
                //other code
            }
        }
    }

    //cdac has 5 students. each student has 3 marks 
    //int [5,3] arr = new int[5,3];

    //cdac has 2 batches. each batch has 5 students. each student has 3 marks 
    //int [2,5,3] arr = new int[2,5,3];

    //cdac has 3 centres. each centre has 2 batches. each batch has 5 students. each student has 3 marks 
    //int [3,2,5,3] arr = new int[3,2,5,3];

    //cdac is in 4 cities. each city has 3 centres. each centre has 2 batches. each batch has 5 students. each student has 3 marks 
    //int [4,3,2,5,3] arr = new int[4,3,2,5,3];

    //----------------------------------------------
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}
