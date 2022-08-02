using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    class Program
    {
        static void Main(string[] args)
        {
           // Employee o1 = new Employee();
            //Console.WriteLine(o1.EmpNo + " " + o1.Name + " " + o1.Basic + " " + o1.DeptNo + " " + o1.GetNetSalary());

           // Employee o1 = new Employee(2,"Akshay",6000,2);
           // Console.WriteLine(o1.EmpNo + " " + o1.Name + " " + o1.Basic + " " + o1.DeptNo + " " + o1.GetNetSalary());

            //  Employee o1 = new Employee(3, "Akash", 7000);
           // Console.WriteLine(o1.EmpNo + " " + o1.Name + " " + o1.Basic + " " + o1.DeptNo + " " + o1.GetNetSalary());

           // Employee o1 = new Employee(0, "", 6000);
           // Console.WriteLine(o1.EmpNo + " " + o1.Name + " " + o1.Basic + " " + o1.DeptNo + " " + o1.GetNetSalary());


        }
    }


    public class Employee
    {
        private string name;
        private int empNo;
        private decimal basic;
        private short deptNo;
        private decimal da = (decimal) 0.3;
        private decimal hra = (decimal)0.15;


        public Employee(int EmpNo=1, string Name="Amey", decimal Basic=5000,short DeptNo=1)
        {
            this.EmpNo = EmpNo;
            this.Name=Name;
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
                if (value !="")
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
            set
            {
                if (value > 0)
                    empNo = value;
                else
                    Console.WriteLine("Invalid EmpNo Input");
            }

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
