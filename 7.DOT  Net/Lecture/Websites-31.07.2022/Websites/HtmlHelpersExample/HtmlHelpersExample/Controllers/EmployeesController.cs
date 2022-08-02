using HtmlHelpersExample.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace HtmlHelpersExample.Controllers
{
    public class EmployeesController : Controller
    {
        // GET: Employees
        public ActionResult Index()
        {
            return View();
        }

        // GET: Employees/Details/5
        public ActionResult Details(int EmpNo)
        {
            Employee o = new Employee();
            o.EmpNo = 1;
            o.Name = "Vik";
            o.Basic = 12345;
            o.DeptNo = 20;

            List<SelectListItem> objDepts = new List<SelectListItem>
            {
                new SelectListItem{Text= "SALES", Value= "10"},
                new SelectListItem{Text= "IT", Value= "20"},
                new SelectListItem{Text= "HR", Value= "30"},
            };
            o.Departments = objDepts;
            ViewBag.Departments = objDepts;

            return View(o);
        }

        // GET: Employees/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Employees/Create
        [HttpPost]
        public ActionResult Create(FormCollection collection)
        {
            try
            {
                // TODO: Add insert logic here

                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // GET: Employees/Edit/5
        public ActionResult Edit(int EmpNo=1)
        {

            Employee o = new Employee();
            o.EmpNo = 1;
            o.Name = "Vik";
            o.Basic = 12345;
            o.DeptNo = 20;

            List<SelectListItem> objDepts = new List<SelectListItem>
            {
                new SelectListItem{Text= "SALES", Value= "10"},
                new SelectListItem{Text= "IT", Value= "20"},
                new SelectListItem{Text= "HR", Value= "30"},
            };
            //o.Departments = objDepts;
            ViewBag.Departments = objDepts;
            return View(o);
        }

        // POST: Employees/Edit/5
        [HttpPost]
        public ActionResult Edit(int EmpNo, Employee objEmp)
        {
            try
            {
                // TODO: Add update logic here

                return RedirectToAction("Index"); 
            }
            catch
            {
                return View();
            }
        }

        // GET: Employees/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: Employees/Delete/5
        [HttpPost]
        public ActionResult Delete(int id, FormCollection collection)
        {
            try
            {
                // TODO: Add delete logic here

                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }
    }
}
