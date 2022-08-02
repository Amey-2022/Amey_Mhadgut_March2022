using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace ModelBinding.Models
{
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        public static List<Employee> GetAllEmployees()
        {
            List<Employee> emps = new List<Employee>();
            //emps.Add(new Employee { EmpNo = 1, Name = "V", Basic = 10000, DeptNo = 20 });
            //emps.Add(new Employee { EmpNo = 2, Name = "A", Basic = 10000, DeptNo = 20 });
            //emps.Add(new Employee { EmpNo = 3, Name = "H", Basic = 10000, DeptNo = 20 });
            //emps.Add(new Employee { EmpNo = 4, Name = "S", Basic = 10000, DeptNo = 20 });

            //while(dr.Read())
                //emps.Add(new Employee { EmpNo = ---, Name = ----, Basic = ---, DeptNo = --- });
            
            
            return emps;
        }
        public static Employee GetSingleEmployee(int EmpNo)
        {
            Employee obj = new Employee();
            //obj.EmpNo = EmpNo;
            //obj.Name = "Vikram";
            //obj.Basic = 12345;
            //obj.DeptNo = 10;
            SqlCommand cmd= new SqlCommand();
            SqlDataReader dr = cmd.ExecuteReader();
            if(dr.Read())
            {
                //obj.Name = ---;
            }
            else
            {

            }
            return obj;
        }
        public static void InsertEmployee(Employee obj)
        {

        }
        public static void UpdateEmployee(Employee obj)
        {

        }
        public static void DeleteEmployee(int EmpNo)
        {

        }
    }
}