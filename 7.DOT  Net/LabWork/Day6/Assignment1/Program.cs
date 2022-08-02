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
            int count = 0;
            IDictionary<int, Employee> empDict = new Dictionary<int, Employee>();

            string ans;

            do
            {
                count++;
                Console.WriteLine("Enter Employee Datas : ");

                Console.Write("Enter Employee Name : ");
                string name = Console.ReadLine();
                Console.Write("Enter Employee DeptNo : ");
                short deptNo = short.Parse(Console.ReadLine());
                Console.Write("Enter Employee Salary : ");
                decimal salary = decimal.Parse(Console.ReadLine());

                Employee emp = new Employee(name, deptNo, salary);

                empDict.Add(count, emp);

                Console.WriteLine("Employee added Successfully!!!");
                Console.WriteLine();

                Console.WriteLine("Want to add more Employee [Yes/No] : ");
                ans = Console.ReadLine();

            } while (ans == "Y" || ans == "y" || ans == "Yes" || ans == "yes");

            foreach (KeyValuePair<int, Employee> item in empDict)
            {
                Console.WriteLine($"Emp {item.Key} : {item.Value}");
            }

            Console.WriteLine();
            Console.WriteLine("Employee with Highest Salary is:");
            ICollection<Employee> list = empDict.Values;
            HighestSalary(list);
        }

        static void HighestSalary(ICollection<Employee> list)
        {
            decimal sal = 0;
            Employee e = null;
            foreach (Employee emp in list)
            {   
                if(emp.Salary>sal)
                {
                    sal = emp.Salary;
                    e = emp;
                }
            }
            Console.WriteLine(e);
        }
    }

    public class Employee
    {
        static int count=0;
        int empId=++count;
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
