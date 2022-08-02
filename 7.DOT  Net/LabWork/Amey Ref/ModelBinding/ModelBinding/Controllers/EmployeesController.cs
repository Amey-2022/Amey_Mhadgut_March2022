using ModelBinding.Models;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ModelBinding.Controllers
{
    public class EmployeesController : Controller
    {
        // GET: Employees/Index
        // GET: Employees
        public ActionResult Index()
        {
            /*List<Employee> emps = new List<Employee>();
            emps.Add(new Employee { EmpNo=1,Name="Amey",Basic=5000,DeptNo=20 });
            emps.Add(new Employee { EmpNo=2,Name="Akshay",Basic=6000,DeptNo=10 });
            emps.Add(new Employee { EmpNo=3,Name="Ajay",Basic=4000,DeptNo=30 });
            emps.Add(new Employee { EmpNo=4,Name="Akash",Basic=7000,DeptNo=10 });*/

            List<Employee> emps = Employee.GetEmployees();
            return View(emps);
        }

        // GET: Employees/Details/5
        public ActionResult Details(int id=0)
        {
            //create object of the model class and pass it to the View
            /*Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Amey";
            obj.Basic = 5000;
            obj.DeptNo = 10;*/

            Employee obj = Employee.GetSingleEmployee(id);
            //passing it to the view
            return View(obj);
            
        }

      

        // GET: Employees/Create
        public ActionResult Create()
        {

            return View();
        }

        [HttpPost]
        public ActionResult Create(Employee obj)
        {
            //using model binding Employee Obj is automatically populated from values that are posted
            //or values that are in query string
            try
            {
                // TODO: Add insert logic here
                Employee.InsertEmployee(obj);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // POST: Employees/Create
        //[HttpPost]
        //public ActionResult Create(FormCollection collection)
        //{
        //    string Name = collection["Name"];
        //    int EmpNo = int.Parse(collection["EmpNo"]);
        //    decimal Basic = decimal.Parse(collection["Basic"]);
        //    int DeptNo = int.Parse(collection["DeptNo"]);
        //    try
        //    {
        //        // TODO: Add insert logic here

        //        return RedirectToAction("Index");
        //    }
        //    catch
        //    {
        //        return View();
        //    }
        //}

        // GET: Employees/Edit/5
        public ActionResult Edit(int id=0)
        {
            /*Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Amey";
            obj.Basic = 5000;
            obj.DeptNo = 10;
            return View(obj);*/

            Employee obj = Employee.GetSingleEmployee(id);
            //passing it to the view
            return View(obj);
        }

        // POST: Employees/Edit/5
        [HttpPost]
        public ActionResult Edit(int id, Employee obj=null)
        {
            try
            {
                // TODO: Add update logic here

                Employee.UpdateEmployee(obj);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // GET: Employees/Delete/5
        public ActionResult Delete(int id=0)
        {
            /*Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Amey";
            obj.Basic = 5000;
            obj.DeptNo = 10;
            return View(obj); ;*/

            Employee obj = Employee.GetSingleEmployee(id);
            //passing it to the view
            return View(obj);
        }

        // POST: Employees/Delete/5
        [HttpPost]
        public ActionResult Delete(int id=0, Employee obj=null)
        {
            try
            {
                // TODO: Add delete logic here

                Employee.DeleteEmployee(id);
                //ViewBag.message = "successfuly deleted";
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }
    }
}
