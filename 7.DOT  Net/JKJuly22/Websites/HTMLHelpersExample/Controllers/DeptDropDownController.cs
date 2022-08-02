using HTMLHelpersExample.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace HTMLHelpersExample.Controllers
{
    public class DeptDropDownController : Controller
    {
        // GET: DeptDropDown
        public ActionResult Index()
        {
            List<Employee> emps = Employee.GetAllEmployees();

            return View(emps);

        }

        public ActionResult GetDeptNumber()
        {
            var list = Department.GetAllDepartments();
            ViewBag.list = list;
            return View();

        }

        [HttpPost]
        public ActionResult GetDeptNumber(Department obj)
        {
            try
            {
                // TODO: Add insert logic here
               // Employee.GetEmployeesById(obj.DeptNo);

                return RedirectToAction("Details", new { id = obj.DeptName });
            }
            catch
            {
                return View();
            }
        }

        //public ActionResult DepartmentFilter()
        //{         
        //        var list = Department.GetAllDepartments();
        //        ViewBag.list = list;
        //        return View();        
        //}

        //[HttpPost]
        //public ActionResult DepartmentFilter(Department obj)
        //{
        //    try
        //    {
        //        // TODO: Add insert logic here
        //        return RedirectToAction("Details",new { id=obj.DeptName});
                

        //    }
        //    catch
        //    {
        //        return View();
        //    }
        //}

        public ActionResult Details(int id=0)
        {
            List<Employee> emplist = Employee.GetEmployeesById(id);

            return View(emplist);

        }

    }
}