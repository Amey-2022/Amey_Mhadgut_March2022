using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace HTMLHelpersExample.Models
{
    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }


        public static List<Department> GetAllDepartments()
        {
            List<Department> listDeps = new List<Department>();

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from Departments ";

                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read())
                {
                    /*Department obj = new Department();
                    obj.DeptNo = (int)dr["DeptNo"];
                    obj.DeptName = (string)dr["DeptName"];              
                    listDeps.Add(obj);*/

                    listDeps.Add(new Department { DeptNo = (int)dr["DeptNo"], DeptName = (string)dr["DeptName"] });
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

            return listDeps;
        }

        public static Department GetSingleDepartment(int DeptNo)
        {

            Department obj = new Department();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = $"select * from Departments where DeptNo=@DeptNo";
                cmdSelect.Parameters.AddWithValue("@DeptNo", DeptNo);
                SqlDataReader dr = cmdSelect.ExecuteReader();

                if (dr.Read())
                {
                    obj.DeptNo = (int)dr["DeptNo"];
                    obj.DeptName = (string)dr["DeptName"];
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

        public static void InsertDepartment(Department obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = con;
                cmdInsert.CommandType = CommandType.Text;

                cmdInsert.CommandText = $"insert into Departments values(@DeptNo, @DeptName)";
                cmdInsert.Parameters.AddWithValue("@DeptNo", obj.DeptNo);
                cmdInsert.Parameters.AddWithValue("@DeptName", obj.DeptName);
               
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


        public static void UpdateDepartment(Department obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdUpdate = new SqlCommand();
                cmdUpdate.Connection = con;
                //changes
                cmdUpdate.CommandType = CommandType.Text;
                cmdUpdate.CommandText = "Update Departments set DeptNo=@DeptNo, DeptName=@DeptName  where DeptNo=@DeptNo";

                cmdUpdate.Parameters.AddWithValue("@DeptNo", obj.DeptNo);
                cmdUpdate.Parameters.AddWithValue("@DeptName", obj.DeptName);                
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

        public static void DeleteDepartment(int DeptNo)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdDelete = new SqlCommand();
                cmdDelete.Connection = con;
                //changes
                cmdDelete.CommandType = CommandType.Text;
                cmdDelete.CommandText = "Delete from Departments where DeptNo = @DeptNo";

                cmdDelete.Parameters.AddWithValue("@DeptNo", DeptNo);

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