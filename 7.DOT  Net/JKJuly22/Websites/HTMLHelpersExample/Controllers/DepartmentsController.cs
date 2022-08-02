using HTMLHelpersExample.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace HTMLHelpersExample.Controllers
{
    public class DepartmentsController : Controller
    {
        // GET: Department
        public ActionResult Index()
        {
            List<Department> deps = Department.GetAllDepartments();
            return View(deps);
        }

        // GET: Department/Details/5
        public ActionResult Details(int id)
        {
            Department obj = Department.GetSingleDepartment(id);
            return View(obj);
        }

        // GET: Department/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Department/Create
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

        // GET: Department/Edit/5
        public ActionResult Edit(int id=0)
        {
            Department obj = Department.GetSingleDepartment(id);
            return View(obj);
        }

        // POST: Department/Edit/5
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

        // GET: Department/Delete/5
        public ActionResult Delete(int id=0)
        {
            Department obj = Department.GetSingleDepartment(id);
            return View(obj);
        }

        // POST: Department/Delete/5
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
