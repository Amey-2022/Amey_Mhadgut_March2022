using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQExamples
{
    class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vikas", Basic = 11000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }

        static void Main1()
        {
            AddRecs();
            //var emps = from single_object in collection select something
            var emps = from emp in lstEmp select emp;

            foreach (var item in emps)
            {
                //Console.WriteLine(item.Name);
                Console.WriteLine(item);   //(item.ToString)
            }
            Console.ReadLine();
        }

        static void Main2()
        {
            AddRecs();
            //var emps = from single_object in collection select something
            var emps = from emp in lstEmp select emp.EmpNo;

            foreach (var item in emps)
            {
                //Console.WriteLine(item.);
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        static void Main3()
        {
            AddRecs();
            //var emps = from single_object in collection select something
            var emps = from emp in lstEmp select new { emp.EmpNo, emp.Name };

            foreach (var item in emps)
            {
                //Console.WriteLine(item.); //either of 2 available
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        static void Main4()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       where emp.Basic > 10000
                       select emp;
            var emps1= from emp in lstEmp
                       where emp.Basic > 10000 && emp.Basic < 12000
                       select emp;
            var emps2 = from emp in lstEmp
                        where emp.Name.StartsWith("V")
                        select emp;

            foreach (var emp in emps2)
            {
                //Console.WriteLine(emp);
                Console.WriteLine(emp.Name);
                //Console.WriteLine(emp.Gender);
            }

            Console.ReadLine();
        }

        static void Main5()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       where emp.Basic > 11000
                       orderby emp.Name 
                       select emp;
            var emps1 = from emp in lstEmp
                        orderby emp.Name descending
                        select emp;
            var emps2 = from emp in lstEmp
                       orderby emp.DeptNo, emp.Name descending
                       select emp;

            foreach (var emp in emps2)
            {
                Console.WriteLine(emp);
            }
            Console.ReadLine();
        }

        static void Main6()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       join dept in lstDept
                       on emp.DeptNo equals dept.DeptNo
                       select emp;
            var emps1 = from emp in lstEmp
                       join dept in lstDept
                       on emp.DeptNo equals dept.DeptNo
                      // orderby emp.DeptNo descending
                       select dept;
            var emps2 = from emp in lstEmp
                        join dept in lstDept
                        on emp.DeptNo equals dept.DeptNo
                        // orderby emp.DeptNo descending
                        select new { emp,dept};
            var emps3 = from emp in lstEmp
                        join dept in lstDept
                        on emp.DeptNo equals dept.DeptNo
                        // orderby emp.DeptNo descending
                        select new { emp.Name, dept.DeptName };

            foreach (var emp in emps3)
            {
                Console.WriteLine(emp);
            }
        }

        //simple group
        static void Main7()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       group emp by emp.DeptNo;

            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Key); //deptno
                foreach (var e in emp)  //e is an Employee, emp is a grouping of Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }
            Console.ReadLine();
        }

        static void Main8()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       group emp by emp.DeptNo into group1
                       select group1;


            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Key); //deptno
                foreach (var e in emp)  //e is an Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }

            Console.ReadLine();

        }

        static void Main9()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       group emp by emp.DeptNo into group1
                       select new { group1, Count = group1.Count(), Max = group1.Max(x => x.Basic),
                       Min = group1.Min(x => x.Basic) };

            foreach (var emp in emps)
            {
                Console.WriteLine(emp.group1.Key); //DeptNo
                Console.WriteLine(emp.Count); //count
                Console.WriteLine(emp.Min); //min
                Console.WriteLine(emp.Max); //max
                //emp.group1.Key;  //DeptNo
                 
                foreach (var e in emp.group1)  //e is an Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }
            Console.ReadLine();
        }
    }

    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
        public override string ToString()
        {
            string s =  DeptNo.ToString() + "," + DeptName.ToString();
            return s;
        }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
}



namespace LINQExample2
{
    class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vikas", Basic = 11000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }
        static Employee GetEmployees(Employee o)
        {
            return o;
        }
        static string GetEmployees2(Employee o)
        {
            return o.Name;
        }
        static void Main1()
        {
            AddRecs();
            //var emps = from emp in lstEmp select emp;
            var emps = lstEmp.Select(GetEmployees);

            //var emps = from emp in lstEmp select emp.Name;
            var emps2 = lstEmp.Select(GetEmployees2);
            var emps2a = lstEmp.Select(delegate (Employee o)

            {
                return o.Basic;
            });
            var emps2b = lstEmp.Select(e => e.Basic);
            var emps2c = lstEmp.Select(e => e);
            var emps2d = lstEmp.Select(e => new { e.EmpNo, e.Name, e.Basic });

            foreach (var item in emps2d)
            {
                //Console.WriteLine(item.Name);
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        static void Main2()
        {
            AddRecs();
            var emps = lstEmp.Where(e => e.Basic > 10000 && e.Basic < 12000);
            var emps1 = lstEmp.Where(e => e.Basic > 10000);
            var emps2 = lstEmp.Where(e => e.Basic > 10000).Select(e => e);
            var emps3 = lstEmp.Select(e => e).Where(e => e.Basic > 11000); //where filters from result obtain from first select query

            //var emps = lstEmp.Where(e => e.Basic > 10000);
            var emps4 = lstEmp.Where(e => e.Basic > 10000).Select(e => e.Name);
            //var emps5 = lstEmp.Select(e => e.Name).Where(e => e.Basic > 10000); //erro

            foreach (var item in emps4)
            {
                // Console.WriteLine(item.Name);
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        static void Main3()
        {
            AddRecs();

            //var emps = from emp in lstEmp
            //           orderby emp.Name
            //           select emp;
            var emps = lstEmp.OrderBy(e => e.Name);
            var emps1 = lstEmp.OrderByDescending(e => e.Name);

            //var emps = from emp in lstEmp
            //           orderby emp.DeptNo, emp.Name 
            //           select emp;
            var emps2 = lstEmp.OrderBy(e => e.DeptNo).ThenBy(e => e.Name);
            //var emps = from emp in lstEmp
            //           orderby emp.DeptNo, emp.Name descending
            //           select emp;
            var emps3 = lstEmp.OrderBy(e => e.DeptNo).ThenByDescending(e => e.Name);

            foreach (var item in emps3)
            {
                Console.WriteLine(item);
            }
        }

        static void Main4()
        {
            AddRecs();
            //var emps = from emp in lstEmp
            //           join dept in lstDept
            //                 on emp.DeptNo equals dept.DeptNo
            //           select emp;

            //var emps = from  in 
            //           join  in 
            //                 on  equals 
            //           select emp;

            //var emps = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => emp);
            var emps = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => emp);
            var emps1 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => dept);
            var emps2 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => emp.DeptNo);
            var emps3 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => dept.DeptNo);
            var emps4 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp, dept });
            var emps5 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp.EmpNo, emp.Name, dept.DeptNo, dept.DeptName });

            foreach (var item in emps5)
            {
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        static void Main5()
        {
            AddRecs();
            //deferred execution
            var emps = from emp in lstEmp select emp;
            Console.WriteLine();
            lstEmp.RemoveAt(0); //query executes after this line during for each loop
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
            Console.WriteLine();
            lstEmp.Add(new Employee { EmpNo = 9, Name = "New", Basic = 11000, DeptNo = 40, Gender = "F" });
            foreach (var emp in emps)//query executes after this line during for each loop
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
        }

        static void Main6()
        {
            AddRecs();
            var emps = from emp in lstEmp select emp;
            //immediate execution
            emps = emps.ToList();    //.ToArray .ToDictionary  //executes query this line itself

            Console.WriteLine();
            lstEmp.RemoveAt(0);  //not cosider for diplay in loop
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
            Console.WriteLine();
            lstEmp.Add(new Employee { EmpNo = 9, Name = "New", Basic = 11000, DeptNo = 40, Gender = "F" });   //not cosider for diplay in loop
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();


        }

        static void Main7()
        {
            AddRecs();
            //   Employee emp = lstEmp.Single(e => e.EmpNo == 1); //one record = okay
            // Employee emp = lstEmp.Single(e => e.EmpNo == 10);  //no records = error
            //Employee emp = lstEmp.Single(e => e.Basic > 5000); //multiple records - error

            // Employee emp = lstEmp.SingleOrDefault(e => e.EmpNo == 1); //one record = okay
            //Employee emp = lstEmp.SingleOrDefault(e => e.EmpNo == 10); //no records=null
            Employee emp = lstEmp.SingleOrDefault(e => e.Basic > 5000);//multiple records - error

            if (emp != null)
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            else
                Console.WriteLine("not found");
            Console.ReadLine();
        }
        //plinq example
        static void Main()
        {
            //AddRecs();
            AddRecs2();
            //plinq example

            Stopwatch stopwatch = new Stopwatch();

            stopwatch.Start();
            var emps = lstEmp.Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
            // var emps = lstEmp.AsParallel().WithDegreeOfParallelism(5).Select(emp=>new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
          
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            stopwatch.Stop();
            Console.WriteLine("Elapsed Time is {0} ms", stopwatch.ElapsedMilliseconds);
            Console.ReadLine();
        }
        public static void AddRecs2()
        {
            for (int i = 0; i < 200; i++)
            {
                lstEmp.Add(new Employee { EmpNo = i, Name = "Amey", Basic = 10000, DeptNo = 10, Gender = "M" });
            }           
        }
        public static string LongRunningFunc(string s)
        {
            System.Threading.Thread.Sleep(10);
            return s.ToUpper();

        }
    }
        public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
        public override string ToString()
        {
            string s = DeptNo.ToString() + "," + DeptName.ToString();
            return s;
        }
        
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
}
