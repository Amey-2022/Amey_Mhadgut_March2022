using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace EFCodeFirstExample.Models
{
    public class Employee
    {
        [Key]
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public virtual Department Department { get; set; }
    }

    public partial class Department
    {
        [Key]
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
        public virtual ICollection<Employee> Employees { get; set; }
    }

    public partial class JKMyDbContext : DbContext
    {
        //public JKMyDbContext() : base("name=cn")

        //    // database will be named as given in the connectionStrings section in web.config
        //{
        //}

        //public JKMyDbContext() : base("DatabaseName")
        //    // database will be called "DatabaseName"

        //{
        //}

        //public JKMyDbContext() : base()  
        //    //database will be called EFCodeFirstExample.Models.JKMyDbContext
        //    //same name if no cons given
        //{
        //}

        public virtual DbSet<Department> Departments { get; set; }
        public virtual DbSet<Employee> Employees { get; set; }
    }
}