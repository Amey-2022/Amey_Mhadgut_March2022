using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace SplAssignment.Models
{
    public class Category
    {
        public int CategoryId { get; set; }
        public string CategoryName { get; set; }

        public static List<Category> GetCategoryNames()
        {
            List<Category> listCategory = new List<Category>();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from Categories";

                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read())
                {

                    listCategory.Add(new Category { CategoryId = (int)dr["CategoryId"], CategoryName = (string)dr["CategoryName"] });
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

            return listCategory;
        }
    }
}