using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace HTMLHelpersExample.Models
{
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }

        public int DeptNo { get; set; }
        public bool IsActive { get; set; }
        public IEnumerable<SelectListItem> Departments { get; set; }

        public static List<Employee> GetAllEmployees()
        {
            List<Employee> listEmps = new List<Employee>();

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from Employees ";

                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read())
                {
                    /*Employee obj = new Employee();
                    obj.EmpNo = (int)dr["EmpNo"];
                    obj.Name = (string)dr["Name"];
                    obj.Basic = (decimal)dr["Basic"];
                    obj.DeptNo = (int)dr["DeptNo"];
                    listEmps.Add(obj);*/

                    listEmps.Add(new Employee { EmpNo = (int)dr["EmpNO"], Name = (string)dr["Name"], Basic = (decimal)dr["Basic"], DeptNo = (int)dr["DeptNo"] });
                }
                dr.Close();
            }
            catch (Exception ex)
            {

                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }

            return listEmps;
        }


        public static List<Employee> GetEmployeesById(int id)
        {
            List<Employee> listEmps = new List<Employee>();

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from Employees where DeptNo=@DeptNo";
                cmdSelect.Parameters.AddWithValue("@DeptNo", id);
                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read())
                {
                    listEmps.Add(new Employee { EmpNo = (int)dr["EmpNO"], Name = (string)dr["Name"], Basic = (decimal)dr["Basic"], DeptNo = (int)dr["DeptNo"] });
                }
                dr.Close();
            }
            catch (Exception ex)
            {

                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }

            return listEmps;
        }


        public static Employee GetSingleEmployee(int EmpNo)
        {

            Employee obj = new Employee();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = $"select * from Employees where EmpNo=@EmpNo";
                cmdSelect.Parameters.AddWithValue("@EmpNo", EmpNo);
                SqlDataReader dr = cmdSelect.ExecuteReader();

                if (dr.Read())
                {
                    obj.EmpNo = (int)dr["EmpNo"];
                    obj.Name = (string)dr["Name"];
                    obj.Basic = (decimal)dr["Basic"];
                    obj.DeptNo = (int)dr["DeptNo"];

                }

                dr.Close();
            }
            catch (Exception ex)
            {

                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }
            return obj;
        }

        public static void InsertEmployee(Employee obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = con;
                cmdInsert.CommandType = CommandType.StoredProcedure;

                cmdInsert.CommandText = "InsertEmployee";
                cmdInsert.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                cmdInsert.Parameters.AddWithValue("@Name", obj.Name);
                cmdInsert.Parameters.AddWithValue("@Basic", obj.Basic);
                cmdInsert.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                cmdInsert.ExecuteNonQuery();
                Console.WriteLine("Okay");
            }
            catch (Exception ex)
            {

                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }
        }


        public static void UpdateEmployee(Employee obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdUpdate = new SqlCommand();
                cmdUpdate.Connection = con;
                //changes
                cmdUpdate.CommandType = CommandType.StoredProcedure;
                cmdUpdate.CommandText = "UpdateEmployee";

                cmdUpdate.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                cmdUpdate.Parameters.AddWithValue("@Name", obj.Name);
                cmdUpdate.Parameters.AddWithValue("@Basic", obj.Basic);
                cmdUpdate.Parameters.AddWithValue("@DeptNo", obj.DeptNo);
                cmdUpdate.ExecuteNonQuery();
                Console.WriteLine("Okay");
            }
            catch (Exception ex)
            {

                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }
        }

        public static void DeleteEmployee(int EmpNo)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdDelete = new SqlCommand();
                cmdDelete.Connection = con;
                //changes
                cmdDelete.CommandType = CommandType.StoredProcedure;
                cmdDelete.CommandText = "DeleteEmployee";

                cmdDelete.Parameters.AddWithValue("@EmpNo", EmpNo);

                cmdDelete.ExecuteNonQuery();
                Console.WriteLine("Okay");
            }
            catch (Exception ex)
            {

                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }
        }
    }
}