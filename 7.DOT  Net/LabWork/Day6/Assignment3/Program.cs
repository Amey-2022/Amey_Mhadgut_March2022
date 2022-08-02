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

            List<Employee> list = new List<Employee>();
            list.Add(new Employee("Amey", 10, 50000));
            list.Add(new Employee("Ram", 20, 40000));
            list.Add(new Employee("Anthony", 30, 30000));

            Employee[] emp = list.ToArray();

            foreach (Employee item in emp)
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
