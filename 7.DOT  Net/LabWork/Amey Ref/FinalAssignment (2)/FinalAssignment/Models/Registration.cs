using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace FinalAssignment.Models
{
    public class Registration
    {
        [Key]
        [Required(ErrorMessage = "Please enter name")]
        public string LoginName { get; set; }

        [Required(ErrorMessage ="Please enter password")]
        [DataType(DataType.Password)]
        [MinLength(8)]
        public string Password { get; set; }

        [Required(ErrorMessage = "Please enter confirm password")]
        [Compare("Password",ErrorMessage ="Password and confirm password should be the same")]
        [DataType(DataType.Password)]
        [MinLength(8)]
        public string ConfirmPassword { get; set; }

        [DataType(DataType.Text)]
        [Required(ErrorMessage ="Please enter full name")]
        public string FullName { get; set; }

        [EmailAddress]
        [Required(ErrorMessage = "Please enter Email name")]
        public string Email { get; set; }

        [Required(ErrorMessage = "Please enter city name")]
        [DataType(DataType.Text)]
        public string City { get; set; }

        [Required]
        [DataType(DataType.PhoneNumber)]
        public long PhoneNumber { get; set; }

        [Required]
        public bool RememberMe { get; set; }

        public int CityId { get; set; }
        public static  void InsertRegistrationDetails(Registration obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = con;
                cmdInsert.CommandType = CommandType.Text;

                cmdInsert.CommandText = $"insert into Registration values" +
                    $"(@LoginName,@Password,@FullName,@Email,@CityId,@PhoneNumber)";
                cmdInsert.Parameters.AddWithValue("@LoginName", obj.LoginName);
                cmdInsert.Parameters.AddWithValue("@Password", obj.Password);
                cmdInsert.Parameters.AddWithValue("@FullName", obj.FullName);
                cmdInsert.Parameters.AddWithValue("@Email", obj.Email);
                cmdInsert.Parameters.AddWithValue("@CityId", obj.CityId);
                cmdInsert.Parameters.AddWithValue("@PhoneNumber", obj.PhoneNumber);
             

                cmdInsert.ExecuteNonQuery();
                
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

        public static List<Registration> verifyLogin(Registration obj)
        {
            List<Registration> listLogin = new List<Registration>();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select loginname,password,fullname from registration where LoginName=@LoginName";
                cmdSelect.Parameters.AddWithValue("@LoginName", obj.LoginName);
                SqlDataReader dr = cmdSelect.ExecuteReader();
                if (dr.Read())
                {

                    listLogin.Add(new Registration { LoginName = (string)dr["LoginName"],Password=(string)dr["Password"],FullName=(string)dr["FullName"] });
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

            return listLogin;
        }

        public static void UpdateUser(Registration obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "update Registration set FullName=@FullName, Email=@Email, CityId=@CityId, PhoneNumber=@PhoneNumber  where LoginName=@LoginName";
                cmdSelect.Parameters.AddWithValue("@FullName", obj.FullName);
                cmdSelect.Parameters.AddWithValue("@Email", obj.Email);
                cmdSelect.Parameters.AddWithValue("@CityId", obj.CityId);
                cmdSelect.Parameters.AddWithValue("@PhoneNumber", obj.PhoneNumber);
                cmdSelect.Parameters.AddWithValue("@LoginName", obj.LoginName);
                cmdSelect.ExecuteNonQuery();

                
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

        /*public static List<Registration> UserDetails()
        {
            List<Registration> listLogin = new List<Registration>();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from registration ";
                
                SqlDataReader dr = cmdSelect.ExecuteReader();
                if (dr.Read())
                {

                    listLogin.Add(new Registration { LoginName = (string)dr["LoginName"], Password = (string)dr["Password"], FullName = (string)dr["FullName"],Email= (string)dr["Email"],CityId= (int)dr["CityId"],PhoneNumber=(long)dr["PhoneNumber"] });
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

            return listLogin;
        }*/

        public static Registration getSingleUser(string str)
        {
            Registration obj = new Registration();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from registration where LoginName=@LoginName ";
                cmdSelect.Parameters.AddWithValue("@LoginName", str);
                SqlDataReader dr = cmdSelect.ExecuteReader();
                if (dr.Read())
                {

                    obj.LoginName = (string)dr["LoginName"];
                    obj.Password = (string)dr["Password"];
                    obj.FullName = (string)dr["FullName"];
                    obj.Email = (string)dr["Email"];
                    obj.CityId = (int)dr["CityId"];
                    obj.PhoneNumber = (long)dr["PhoneNumber"];
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
    }
}