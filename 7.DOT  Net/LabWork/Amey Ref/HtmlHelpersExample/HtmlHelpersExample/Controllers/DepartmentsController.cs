using HtmlHelpersExample.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace HtmlHelpersExample.Controllers
{
    public class DepartmentsController : Controller
    {
        // GET: Departments
        public ActionResult Index()
        {
            List<Department> Deps = Department.GetDepartments();
            return View(Deps);
        }

        // GET: Departments/Details/5
        public ActionResult Details(int id=0)
        {
            Department obj = Department.GetSingleDepartment(id);
            return View(obj);
        }

        // GET: Departments/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Departments/Create
        [HttpPost]
        public ActionResult Create(Department obj)
        {
            try
            {
                // TODO: Add insert logic here
                Department.InsertDepartment(obj);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // GET: Departments/Edit/5
        public ActionResult Edit(int id=0)
        {
            Department obj = Department.GetSingleDepartment(id);
            return View(obj);
        }

        // POST: Departments/Edit/5
        [HttpPost]
        public ActionResult Edit(int id=0, Department obj=null)
        {
            try
            {
                // TODO: Add update logic here
                Department.UpdateDepartment(obj);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // GET: Departments/Delete/5
        public ActionResult Delete(int id=0)
        {
            Department obj = Department.GetSingleDepartment(id);
            return View(obj);
        }

        // POST: Departments/Delete/5
        [HttpPost]
        public ActionResult Delete(int id=0, Department obj=null)
        {
            try
            {
                // TODO: Add delete logic here
                Department.DeleteDepartment(id);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }
    }
}
