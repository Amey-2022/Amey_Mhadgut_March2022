using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using TestPrep.Models;

namespace TestPrep.Controllers
{
    public class ProductssController : Controller
    {
        // GET: Productss
        public ActionResult Index()
        {
            List < Products > prods= Products.AllProducts();
            return View(prods);
        }

        // GET: Productss/Edit/5
        public ActionResult Edit(int id)
        {
            Products prod = Products.getproductDetails(id);
            return View(prod);
        }

        // POST: Productss/Edit/5
        [HttpPost]
        public ActionResult Edit(int id, Products obj)
        {
            bool update = Products.UpdateProduct(id, obj);
            if (update)
            {
                return RedirectToAction("Index");
            }
            else
            {
                ViewBag.Message = "Update not successful";
                return View();
            }
        }

        [ChildActionOnly]
        public ActionResult PartialView1()
        {
            return View();
        }


        // GET: Productss/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: Productss/Delete/5
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

        // GET: Productss/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: Productss/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Productss/Create
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
    }
}
