using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


/*1.Create a class called Bank with the following :

Properties
int Customer ID  ---> validation is must be >0 (autogenerate)
string Cust_Name ---> validation is no blank strings allowed
short Cust_age  ---> validation is must be between 0 and 100, both numbers included
decimal Balance ---> validation is must be >0*/

namespace BankExample
{
    class Program
    {
        static void Main(string[] args)
        {
            Bank b1 = new Bank();
            Bank b2 = new Bank();
            Console.WriteLine(b1.CustomerID + " " + b1.Cust_Name + " " + b1.Cust_Age + " " + b1.Balance);
            Console.WriteLine(b2.CustomerID + " " + b1.Cust_Name + " " + b1.Cust_Age + " " + b1.Balance);
        }
    }

    public class Bank
    {
        private static int count = 0;
        private int customerID;
        private string cust_Name;
        private short cust_Age;
        private decimal balance;

        public Bank(string Cust_Name = "Amey Mhadgut", short Cust_Age = 25, decimal Balance =(decimal) 51024.78)
        {
            ++count;
            this.CustomerID = count;
            this.Cust_Name= Cust_Name;
            this.Cust_Age = Cust_Age;
            this.Balance = Balance;
        }


        public int CustomerID
        {
            set
            {
                if (value > 0)
                    customerID = value;
                else
                    customerID = 1;
            }

            get
            {
                return customerID;
            }
        }

        public string Cust_Name
        {
            set
            {
                if (value != "")
                    cust_Name = value;
                else
                    Console.WriteLine("Invalid Name Input");
            }

            get
            {
                return cust_Name;
            }
        }


        public short Cust_Age
        {
            set
            {
                if (value >= 0 && value <= 100)
                    cust_Age = value;
                else
                    Console.WriteLine("Invalid age Input");
            }

            get
            {
                return cust_Age;
            }
        }

        public decimal Balance
        {
            set
            {
                if (value > 0 )
                    balance = value;
                else
                    Console.WriteLine("Invalid balance Input");
            }

            get
            {
                return balance;
            }
        }

    }

}
