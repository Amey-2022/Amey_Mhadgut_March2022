using System;

namespace Assignment1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Array size");
            int size = Convert.ToInt32(Console.ReadLine());
            Employee[] arr = new Employee[size];
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = CreateEmpDetails();               
                Console.WriteLine();
            }
            //display emp details using toString
            Console.WriteLine("Employee Details : ");
            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
            //highest sal call
            HighestSalary(arr);

            //search by empno method call 
            Console.WriteLine("Enter Id to search Employee details");
            int id= Convert.ToInt32(Console.ReadLine());         
            SerarchById(arr,id);
        }

    public static Employee CreateEmpDetails()
    {
        Console.Write("Enter Name of Employee : ");
        string ename = Console.ReadLine();
        Console.Write("Enter Salary of Employee : ");
        decimal salary = decimal.Parse(Console.ReadLine());
        Console.Write("Enter Deptno : ");
        short deptNo = short.Parse(Console.ReadLine());
        Employee e = new Employee(ename, salary, deptNo);
        return e;
    }
         static void HighestSalary(Employee[] arr)
        {
            decimal sal = 0;
            Employee e = null;
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i].Salary > sal)
                {
                    sal = arr[i].Salary;
                    e = arr[i];
                }
            }
            Console.WriteLine();
            Console.WriteLine("Employee with Highest Salary is");
            Console.WriteLine(e);
        }

        static void SerarchById(Employee[] arr, int EmpNo)
        {
            if (EmpNo > 0)
            {
                for (int i = 0; i < arr.Length; i++)
                {
                    if (arr[i].EmpNo == EmpNo)
                        Console.WriteLine(arr[i]);
                }
            }
            else
                Console.WriteLine("Invalid Entry");
        }



}
   



    public class Employee
    {
        static int count=0;
        private int empNo=++count;
        private string name;
        private decimal salary;
        private short deptNo;

        public Employee(string Name="",decimal Salary=0,short DeptNo=0)
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
