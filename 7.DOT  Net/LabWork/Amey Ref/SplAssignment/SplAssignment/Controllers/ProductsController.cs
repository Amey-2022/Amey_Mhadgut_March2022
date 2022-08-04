using SplAssignment.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace SplAssignment.Controllers
{
    public class ProductsController : Controller
    {
        // GET: Products
        public ActionResult Index()
        {
            List<Product> lstProduct = Product.GetProducts();
            return View(lstProduct);
        }
        
        // GET: Products/Edit/5
        public ActionResult Edit(int id=0)
        {
            var list = Category.GetCategoryNames();
            ViewBag.list = list;
            Product obj = Product.GetSingleProduct(id);
            return View(obj);
        }

        // POST: Products/Edit/5
        [HttpPost]
        public ActionResult Edit(int id=0, Product obj=null)
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

        public ActionResult PartialDisplay()
        {
            return View();
        }
        

    }
}
