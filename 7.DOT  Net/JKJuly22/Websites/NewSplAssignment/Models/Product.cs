using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace SplAssignment.Models
{
    public class Product
    {
        [Key]
        [Required(ErrorMessage = "Enter Product Id")]
        [Display(Name = "Product Id")]
        public int ProductId { get; set; }

        [Required(ErrorMessage = "Enter Product Name")]
        [Display(Name = "Product Name")]
        public string ProductName { get; set; }

        [Required(ErrorMessage = "Enter Product Rate")]
        [Display(Name = "Product Rate")]
        public decimal Rate { get; set; }

        [Required(ErrorMessage = "Enter Product Description")]
        [Display(Name = "Product Description")]
        public string Description { get; set; }
        public int CategoryId { get; set; }
        public string CategoryName { get; set; }

        public static List<Product> GetProducts()
        {
            List<Product> listProduct = new List<Product>();

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from Products,Categories where Products.CategoryId=Categories.CategoryId;";

                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read())
                {

                    listProduct.Add(new Product { ProductId = (int)dr["ProductId"], ProductName = (string)dr["ProductName"], Rate = (decimal)dr["Rate"], Description = (string)dr["Description"], CategoryName = (string)dr["CategoryName"] });
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

            return listProduct;
        }


        public static Product GetSingleProduct(int id)
        {
            Product obj = new Product();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from Products where ProductId=@ProductId ";
                cmdSelect.Parameters.AddWithValue("@ProductId", id);
                SqlDataReader dr = cmdSelect.ExecuteReader();
                if (dr.Read())
                {
                    obj.ProductId = (int)dr["ProductId"];
                    obj.ProductName = (string)dr["ProductName"];
                    obj.Rate = (decimal)dr["Rate"];
                    obj.Description = (string)dr["Description"];
                    obj.CategoryName = (string)dr["CategoryName"];

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


        public static void UpdateProduct(Product obj)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.StoredProcedure;
                cmdSelect.CommandText = "UpdateProducts";

                cmdSelect.Parameters.AddWithValue("@ProductName", obj.ProductName);
                cmdSelect.Parameters.AddWithValue("@Rate", obj.Rate);
                cmdSelect.Parameters.AddWithValue("@Description", obj.Description);
                cmdSelect.Parameters.AddWithValue("@CategoryId", obj.CategoryId);
                cmdSelect.Parameters.AddWithValue("@ProductId", obj.ProductId);

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
    }
}

/*
 ProductId int - Primary Key
ProductName varchar(50)
Rate Decimal(18,2)
Description varchar(200)
CategoryId int - Foreign Key REFERENCES Categories.CategoryId*/