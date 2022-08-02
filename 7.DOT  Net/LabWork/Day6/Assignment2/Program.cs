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
            // creating array of Employee
            Employee[] emp = new Employee[3];

            // Adding data to array

            emp[0] = new Employee("Amey", 10, 50000);
            emp[1] = new Employee("Ram", 20, 45000);
            emp[2] = new Employee("Anthony", 10, 40000);

            List<Employee> list = new List<Employee>();
            //list.AddRange(emp);


            /*foreach (Employee item in list)
            {
                Console.WriteLine(item);
            }*/


            //Iterating array elements and adding to list
            foreach (Employee item in emp)
            {
                list.Add(item);
            }

            // Display list elements
            foreach (Employee item in list)
            {
                Console.WriteLine(item);
            }
        }
    }

    public class Employee
    {
        static int count = 0;
        int empId = ++count;
        string name;
        short deptNo;
        decimal salary;

        public Employee(string name, short deptNo, decimal salary)
        {

            Name = name;
            DeptNo = deptNo;
            Salary = salary;
        }

        public int EmpId
        {
            get
            {
                return empId;
            }
        }
        public string Name
        {
            set
            {
                name = value;
            }
            get
            {
                return name;
            }
        }

        public short DeptNo
        {
            set
            {
                deptNo = value;
            }
            get
            {
                return deptNo;
            }
        }

        public decimal Salary
        {
            set
            {
                if (value > 1000)
                    salary = value;
                else
                    salary = 1000;
            }
            get
            {
                return salary;
            }
        }

        // Overriding toString() Method
        public override string ToString()
        {
            return "[ EmpId : " + empId + " , Name : " + name + " , Salary : " + salary + " , DeptNo : " + deptNo + " ]";
        }

    }
}
