using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment3
{
    class Program
    {
        static void Main(string[] args)
        {
            Student[] stu = new Student[3];
            for (int i = 0; i < stu.Length; i++)
            {
                Console.Write("Enter student Name: ");
                string name = Console.ReadLine();
                Console.Write("Enter student RollNo  :");
                int rollNo = int.Parse(Console.ReadLine());
                Console.Write("Enter student Marks  :");
                decimal marks = decimal.Parse(Console.ReadLine());

                stu[i] = new Student(name, rollNo, marks);
            }
            for (int i = 0; i < stu.Length; i++)
            {
                Console.WriteLine(stu[i]);
            }


        }
    }

    public class Student
    {
        string name;
        int? rollNo;
        decimal? marks;

        public Student(string sname, int rollNo, decimal marks)
        {
            Name = sname;
            RollNo = rollNo;
            Marks = marks;
        }

        public string Name
        {
            set
            {
                if (value != "")
                    name = value;
                else
                {
                    name = null;
                    Console.WriteLine("Name cant be Empty");
                }
                   
            }
            get { return name; }
        }
        public int RollNo
        {
            set 
            {
                if (value > 0)
                    rollNo = value;
                else 
                {
                    rollNo = null;
                    Console.WriteLine("Roll No Cant be zero(0)");
                }
                    
            }
            get { return (int)rollNo; }
        }

        public decimal Marks
        {
            set 
            {
                if (value >= 0 && value <= 100)
                    marks = value;
                else
                    Console.WriteLine("Marks must be within limit 0 to 100");
            }
            get { return (int)marks; }
        }

        public override string ToString()
        {
            return "| Roll No :" + rollNo + " | Name: " + name + " | Marks: " + marks;
        }
    }
}
