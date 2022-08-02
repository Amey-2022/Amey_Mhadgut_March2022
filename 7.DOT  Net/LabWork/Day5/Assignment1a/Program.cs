using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1a
{
    class Program
    {
        static void Main(string[] args)
        {
            // creating array of Employee
            Employee[] emp = new Employee[3];

            // Adding data to array

            emp[0] = new Employee("Amey", 50000,10);
            emp[1] = new Employee("Ram", 45000,20);
            emp[2] = new Employee("Anthony", 40000,30);

            List<Employee> list = new List<Employee>();
            list.AddRange(emp);

            foreach (Employee item in list)
            {
                Console.WriteLine(item);
            }
        }
    }

    // Employee Class with certain validations
    public class Employee
    {
        static int count = 0;
        private int empNo = ++count;
        private string name;
        private decimal salary;
        private short deptNo;

        public Employee(string Name = "", decimal Salary = 0, short DeptNo = 0)
        {
            this.Name = Name;
            this.Salary = Salary;
            this.DeptNo = DeptNo;
        }

        public int EmpNo
        {
            get
            { return empNo; }
        }
        public string Name
        {
            set
            {
                if (value != "")
                    name = value;
                else
                    Console.WriteLine("Blank/Invalid Name");
            }
            get
            {
                return name;
            }
        }

        public decimal Salary
        {
            set
            {
                if (value >= 10000 && value <= 100000)
                    salary = value;
                else
                    salary = 10000;
            }
            get
            {
                return salary;
            }
        }

        public short DeptNo
        {
            set
            {
                if (value != 0)
                    deptNo = value;
                else
                    Console.WriteLine("0/Invalid DeptNo");
            }
            get
            {
                return deptNo;
            }
        }

        public override string ToString()
        {
            return "[ EmpNo : " + empNo + " Ename : " + name + " Salary : " + salary + " DeptNo : " + deptNo + " ]";
        }
    }
}
