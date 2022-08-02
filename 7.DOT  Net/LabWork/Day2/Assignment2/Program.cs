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
            Employee o1 = new Employee();
            Console.Write(o1.EmpNo + " ");

            Employee o2 = new Employee("Ram",7000);
            Console.Write(o2.EmpNo + " ");

            Employee o3 = new Employee();
            Console.Write(o3.EmpNo+"\n");

            Console.Write(o3.EmpNo+" ");
            Console.Write(o2.EmpNo+" ");
            Console.Write(o1.EmpNo+"\n");

            Console.WriteLine(o1.EmpNo + " " + o1.Name + " " + o1.Basic + " " + o1.DeptNo + " " + o1.GetNetSalary());
            Console.WriteLine(o2.EmpNo + " " + o2.Name + " " + o2.Basic + " " + o2.DeptNo + " " + o2.GetNetSalary());
        }
    }


    public class Employee
    {
        private string name;
        static int count=0;
        private int empNo=++count;
        private decimal basic;
        private short deptNo;
        private decimal da = (decimal)0.3;
        private decimal hra = (decimal)0.15;


        public Employee(string Name = "Amey", decimal Basic = 5000, short DeptNo = 1)
        {
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }

        public decimal GetNetSalary()
        {
            da = da * this.basic;
            hra = hra * this.basic;
            decimal netSalary = this.basic + da + hra;
            return netSalary;
        }

        public string Name
        {
            set
            {
                if (value != "")
                    name = value;
                else
                    Console.WriteLine("Invalid Name Input");
            }

            get
            {
                return name;
            }
        }

       
        public int EmpNo
        {
            get
            {
                return empNo;
            }
        }

        public decimal Basic
        {
            set
            {
                if (value >= 5000 && value <= 50000)
                    basic = value;
                else
                    Console.WriteLine("Invalid basic Input");
            }

            get
            {
                return basic;
            }
        }


        public short DeptNo
        {
            set
            {
                if (value > 0)
                    deptNo = value;
                else
                    Console.WriteLine("Invalid EmpNo Input");
            }

            get
            {
                return deptNo;
            }
        }


    }
}
