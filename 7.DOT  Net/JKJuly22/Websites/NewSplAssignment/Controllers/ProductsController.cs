using SplAssignment.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace NewSplAssignment.Controllers
{
    public class ProductsController : Controller
    {
        // GET: Products
        public ActionResult Index()
        {
            List<Product> lstProduct = Product.GetProducts();

            return View(lstProduct);
        }

        // GET: Products/Details/5
        public ActionResult Details(int id)
        {
            Product obj=Product.GetSingleProduct(id);
            return View(obj);
        }

        // GET: Products/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Products/Create
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

        // GET: Products/Edit/5
        public ActionResult Edit(int id)
        {
            var list = Category.GetCategoryNames();
            ViewBag.list = list;
            Product obj = Product.GetSingleProduct(id);
            return View(obj);
        }

        // POST: Products/Edit/5
        [HttpPost]
        public ActionResult Edit( Product obj)
        {
            try
            {
                // TODO: Add update logic here
                Product.UpdateProduct(obj);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }



        // GET: Products/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: Products/Delete/5
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


        public ActionResult PartialDisplay()
        {
            return View();

        }
    }
}
