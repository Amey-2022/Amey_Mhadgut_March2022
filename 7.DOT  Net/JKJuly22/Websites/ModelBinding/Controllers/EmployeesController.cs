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
        // GET: Employees
        public ActionResult Index()  //myyyyyyy
        {
            /* List<Employee> emps = new List<Employee>();
             emps.Add(new Employee { EmpNo = 1, Name = "Amey", Basic = 50000, DeptNo = 20 });
             emps.Add(new Employee { EmpNo = 2, Name = "Rajesh", Basic = 40000, DeptNo = 10 });
             emps.Add(new Employee { EmpNo = 3, Name = "Shrija", Basic = 30000, DeptNo = 30 });
             emps.Add(new Employee { EmpNo = 4, Name = "Rhuta", Basic = 25000, DeptNo = 20 });
             return View(emps);*/

            List<Employee> emps = Employee.GetAllEmployees();
            return View(emps);

        }

        // GET: Employees/Details/5
        public ActionResult Details(int id=0)
        {
            //create an object of model class and pass it to the View
            /*Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Amey";
            obj.Basic = 50000;
            obj.DeptNo = 10;
            return View(obj);*/

            Employee obj = Employee.GetSingleEmployee(id);
            //passing it to the view
            return View(obj);
            
        }

        // GET: Employees/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Employees/Create
        [HttpPost]
        public ActionResult Create(Employee obj)  //using model
         {
            //using model binding Employee obj obj is automatically populated from
            //values that are posted or values that are in QueryString

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

        //using form collection
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
            //create an object of model class and pass it to the View
            /*Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Amey";
            obj.Basic = 50000;
            obj.DeptNo = 10;
            return View(obj);*/
            Employee obj = Employee.GetSingleEmployee(id);
            return View(obj);
        }

        // POST: Employees/Edit/5
        [HttpPost]
        public ActionResult Edit(int id, Employee obj)  //using model binding as in create
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
            //create an object of model class and pass it to the View
            /*Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Amey";
            obj.Basic = 50000;
            obj.DeptNo = 10;
            return View(obj);*/

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
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }
    }
}
