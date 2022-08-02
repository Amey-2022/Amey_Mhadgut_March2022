using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment
{
    class Program
    {
        static void Main(string[] args)
        {
            Manager m1 = new Manager("Manager", 27000, 5, "Inventory");
            Console.WriteLine("EmpNo : "+m1.EmpNo);
            Console.WriteLine("Name :"+m1.Name);
            Console.WriteLine("Designation :"+m1.Designation);
            Console.WriteLine("DeptNo: "+m1.DeptNo);
            Console.WriteLine("Basic : "+m1.Basic);
            Console.WriteLine("NetSal : "+m1.GetNetSalary());
            Console.WriteLine("*********************************************");
            Manager m2 = new Manager("Manager2", 29000, 4, "Prod");
            Console.WriteLine("EmpNo : " + m2.EmpNo);
            Console.WriteLine("Name :" + m2.Name);
            Console.WriteLine("Designation :" + m2.Designation);
            Console.WriteLine("DeptNo: " + m2.DeptNo);
            Console.WriteLine("Basic : " + m2.Basic);
            Console.WriteLine("NetSal : " + m2.GetNetSalary());

            Console.WriteLine("*********************************************");
            Console.WriteLine("*********************************************");
            GeneralManager gm1 = new GeneralManager("GManager", 47000, 6, "Inventory","Bonus");
            Console.WriteLine("EmpNo : " + gm1.EmpNo);
            Console.WriteLine("Name :" + gm1.Name);
            Console.WriteLine("Designation :" + gm1.Designation);
            Console.WriteLine("DeptNo: " + gm1.DeptNo);
            Console.WriteLine("Basic : " + gm1.Basic);
            Console.WriteLine("NetSal : " + gm1.GetNetSalary());
            Console.WriteLine("*********************************************");
            GeneralManager gm2 = new GeneralManager("GManager2", 69000, 7, "Prod","Trip");
            Console.WriteLine("EmpNo : " + gm2.EmpNo);
            Console.WriteLine("Name :" + gm2.Name);
            Console.WriteLine("Designation :" + gm2.Designation);
            Console.WriteLine("DeptNo: " + gm2.DeptNo);
            Console.WriteLine("Basic : " + gm2.Basic);
            Console.WriteLine("NetSal : " + gm2.GetNetSalary());

            Console.WriteLine("*********************************************");
            Console.WriteLine("*********************************************");
            CEO c1 = new CEO("CEO1", 127000, 5);
            Console.WriteLine("EmpNo : " + c1.EmpNo);
            Console.WriteLine("Name :" + c1.Name);
            Console.WriteLine("DeptNo: " + c1.DeptNo);
            Console.WriteLine("Basic : " + c1.Basic);
            Console.WriteLine("NetSal : " + c1.GetNetSalary());
            Console.WriteLine("*********************************************");
            CEO c2 = new CEO("CEO2", 159000, 4);
            Console.WriteLine("EmpNo : " + c2.EmpNo);
            Console.WriteLine("Name :" + c2.Name);
            Console.WriteLine("DeptNo: " + c2.DeptNo);
            Console.WriteLine("Basic : " + c2.Basic);
            Console.WriteLine("NetSal : " + c2.GetNetSalary());




        }
    }


    public abstract class Employee
    {
        private string name;
        static int count = 0;
        private int empNo = ++count;
        protected decimal basic;
        private short deptNo;

        public Employee(string Name = "", decimal Basic = 0, short DeptNo = 1)
        {
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
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

        public abstract decimal Basic
        {

            get;set;
         
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

        public abstract decimal GetNetSalary();

    }

    public class Manager : Employee
    {
        private string designation;
        public Manager(string Name="",decimal Basic=0,short DeptNo=0,string Designation="") : base(Name, Basic, DeptNo)
        {
            this.Designation = Designation;
        }

        public string Designation
        {
            set 
            {
                if (value != "")
                {
                    designation = value;
                }
                else
                {
                    System.Console.WriteLine("Cant be kept empty please enter valid designation");
                }
            }

            get 
            {
                return designation;
            }
        }

        public override decimal Basic
        {
            set
            {
                if (value >= 25000 && value <= 50000)
                {
                    basic = value;
                }
                else
                {
                    System.Console.WriteLine("Invalid Input");

                }
            }
            get
            {
                return basic;
            }
               
        }

        public override decimal GetNetSalary()
        {
            decimal da =(decimal) 0.3 * basic;
            decimal hra = (decimal)0.15 * basic;
            decimal netSalary = this.basic + da + hra;
            return netSalary;
        }
    }

    public class GeneralManager : Manager
    {
        private string perks;
        public GeneralManager(string Name = "", decimal Basic = 0, short DeptNo = 0, string Designation = "",string Perks="") : base(Name, Basic, DeptNo,Designation)
        {
            this.Perks = Perks; 
        }

        public string Perks
        {
            set
            {
                if (value != "")
                {
                    perks = value;
                }
                else
                {
                    System.Console.WriteLine("Cant be kept empty please enter valid perks");
                }
            }

            get
            {
                return perks;
            }
        }

        public override decimal Basic
        {
            set
            {
                if (value >= 40000 && value <= 80000)
                {
                    basic = value;
                }
                else
                {
                    System.Console.WriteLine("Invalid Input");

                }
            }
            get
            {
                return basic;
            }

        }

        public override decimal GetNetSalary()
        {
            decimal da = (decimal)0.3 * basic;
            decimal hra = (decimal)0.15 * basic;
            decimal netSalary = this.basic + da + hra;
            return netSalary;
        }

    }


    public class CEO : Employee
    {
        public CEO(string Name = "", decimal Basic = 0, short DeptNo = 0) : base(Name, Basic, DeptNo)
        { 
            
        }

        public override decimal Basic
        {
            set
            {
                if (value >= 100000 && value <= 200000)
                {
                    basic = value;
                }
                else
                {
                    System.Console.WriteLine("Invalid Input");

                }
            }
            get
            {
                return basic;
            }

        }

        public override decimal GetNetSalary()
        {
            decimal da = (decimal)0.3 * basic;
            decimal hra = (decimal)0.15 * basic;
            decimal netSalary = this.basic + da + hra;
            return netSalary;
        }
    }

}
