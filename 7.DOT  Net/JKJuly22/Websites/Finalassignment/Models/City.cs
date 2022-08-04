using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace FinalAssignment.Models
{
    public class City
    {
        public int CityId { get; set; }
        public string CityName { get; set; }

        public static List<City> GetCities()
        {
            List<City> listCity = new List<City>();
            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJuly2022;Integrated Security=True;";

            try
            {
                con.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = con;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "select * from City ";

                SqlDataReader dr = cmdSelect.ExecuteReader();
                while (dr.Read())
                {

                    listCity.Add(new City { CityId = (int)dr["CityId"], CityName = (string)dr["City"] });
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

            return listCity;
        }
    }
}