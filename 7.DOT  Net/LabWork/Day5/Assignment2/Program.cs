using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter no. of batches in CDAC : ");
            int batches = int.Parse(Console.ReadLine());

            int[][] cdac = new int[batches][];

            for (int i = 0; i < cdac.GetLength(0); i++)
            {
                Console.Write($"Enter the no. of students in batch {i+1} :");
                int students= int.Parse(Console.ReadLine());
                cdac[i] = new int[students];
            }
            for (int i = 0; i < cdac.GetLength(0); i++)
            {
                Console.WriteLine($"Batch {i+1}");
                for (int j = 0; j < cdac[i].Length; j++)
                {
                    Console.Write($"Enter marks of student  {j + 1} :");
                    cdac[i][j] = int.Parse(Console.ReadLine());
                }
            }
            Console.WriteLine();
            Console.WriteLine();
            for (int i = 0; i < cdac.GetLength(0); i++)
            {
                Console.WriteLine($"Batch {i + 1}");
                for (int j = 0; j < cdac[i].Length; j++)
                {
                    Console.WriteLine($"Marks of student {j+1} : {cdac[i][j]}");
                }
            }
        }
    }
}
