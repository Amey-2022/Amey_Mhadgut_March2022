using ModelBinding.Models;
using System;
using System.Collections.Generic;
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
            //List<Employee> emps = new List<Employee>();
            //emps.Add(new Employee { EmpNo = 1, Name = "V", Basic = 10000, DeptNo = 20 });
            //emps.Add(new Employee { EmpNo = 2, Name = "A", Basic = 10000, DeptNo = 20 });
            //emps.Add(new Employee { EmpNo = 3, Name = "H", Basic = 10000, DeptNo = 20 });
            //emps.Add(new Employee { EmpNo = 4, Name = "S", Basic = 10000, DeptNo = 20 });
            List<Employee> emps = Employee.GetAllEmployees();
            return View(emps);
        }

        // GET: Employees/Details/5
        public ActionResult Details(int id=0)
        {
            //create an object of the model class and pass it to the View
            //Employee obj = new Employee();
            //obj.EmpNo = id;
            //obj.Name = "Vikram";
            //obj.Basic = 12345;
            //obj.DeptNo = 10;
            Employee obj = Employee.GetSingleEmployee(id);
            return View(obj);
        }

        // GET: Employees/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Employees/Create
        [HttpPost]
        public ActionResult Create(Employee obj)
        {
         
            //using Model binding Employee obj is automatically populated from
            //                 values that are posted or values that are in QueryString

            try
            {
                // TODO: Add insert logic here
                Employee.InsertEmployee(obj);
                return RedirectToAction("Index");
                //ViewBag.message = "Succ...";
                //return View();
            }
            catch(Exception ex)
            {
                ViewBag.message = ex.Message;
                return View();
            }
        }

        //public ActionResult Create(FormCollection collection)
        //{
        //    string Name = collection["Name"];
        //    int EmpNo = int.Parse(collection["EmpNo"]);
        //    int DeptNo = int.Parse(collection["DeptNo"]);
        //    decimal Basic = decimal.Parse(collection["Basic"]);

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

            //Employee obj = new Employee();
            //obj.EmpNo = id;
            //obj.Name = "Vikram";
            //obj.Basic = 12345;
            //obj.DeptNo = 10;
            Employee obj = Employee.GetSingleEmployee(id);
            return View(obj);
        }

        // POST: Employees/Edit/5
        [HttpPost]
        public ActionResult Edit(int id=0, Employee obj=null)
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
            //Employee obj = new Employee();
            //obj.EmpNo = id;
            //obj.Name = "Vikram";
            //obj.Basic = 12345;
            //obj.DeptNo = 10;

            Employee obj = Employee.GetSingleEmployee(id);
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
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }
    }
}
