using Finalassignment.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Finalassignment.Controllers
{
    public class RegistrationsController : Controller
    {
        // GET: Registrations
        public ActionResult Index()
        {
            return View();
        }

        // GET: Registrations/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: Registrations/Create
        public ActionResult Create()
        {

            return View();
        }

        // POST: Registrations/Create
        [HttpPost]
        public ActionResult Create(Registration obj)
        {
            try
            {
                // TODO: Add insert logic here
               Registration.InsertRegistrationDetails(Registration obj);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // GET: Registrations/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: Registrations/Edit/5
        [HttpPost]
        public ActionResult Edit(int id, FormCollection collection)
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

        // GET: Registrations/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: Registrations/Delete/5
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
