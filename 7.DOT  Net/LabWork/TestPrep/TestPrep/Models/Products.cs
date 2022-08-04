using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace TestPrep.Models
{
    public class Products
    {
        [Key]
        public int ProductId { get; set; }
        
        [Required (ErrorMessage ="Enter product name")]
        [Display (Name ="Product Name")]
        public string ProductName { get; set; }

        [Required(ErrorMessage = "Enter product rate")]
        public decimal Rate { get; set; }

        [Required(ErrorMessage = "Enter product description")]
        public string Description { get; set; }

        [Required(ErrorMessage = "Enter Category name")]
        public string CategoryName { get; set; }

        public static List<Products> AllProducts()
        {
            List<Products> prods = new List<Products>();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=DotNetDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "Select * from Products";

                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read())
                {
                    prods.Add(new Products { ProductId = (int) dr["ProductId"], ProductName = (string) dr["ProductName"], Rate = (decimal) dr["Rate"], Description = (string) dr["Description"].ToString(), CategoryName =(string) dr["CategoryName"] });
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }
            return (prods);
        }

        public static bool UpdateProduct(int id, Products obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=DotNetDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False";

            try
            {
                con.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = con;
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.CommandText = "UpdateProduct";
                cmd.Parameters.AddWithValue("@ProductId", obj.ProductId);
                cmd.Parameters.AddWithValue("@ProductName", obj.ProductName);
                cmd.Parameters.AddWithValue("@Rate", obj.Rate);
                cmd.Parameters.AddWithValue("@Description", obj.Description);
                cmd.Parameters.AddWithValue("@CategoryName", obj.CategoryName);

                object ret=cmd.ExecuteScalar();
                if (ret == null)
                    return false;
                else
                    return true;
            }
            catch
            {
                return false;
            }
            finally
            {
                con.Close();
            }
        }

        public static Products getproductDetails(int id)
        {
            Products prod = null;
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=DotNetDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "Select * from Products where ProductId=@Productid";
                cmdSelect.Parameters.AddWithValue("@Productid", id);

                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read()){
                    prod = new Products { ProductId = (int)dr["ProductId"], ProductName = (string)dr["ProductName"], Rate = (decimal)dr["Rate"], Description = (string)dr["Description"], CategoryName = (string)dr["CategoryName"] };
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();
            }
            return prod;            
        }
    }
}