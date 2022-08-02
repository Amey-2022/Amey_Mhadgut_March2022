using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WebApplication1.Controllers
{
    public class DefaultController : Controller
    {
        // GET: Default
        //public string Index()
        //{
        //    return "<b>Hello</b> World";
        //}

        //public ViewResult Index()
        //{
        //   // return HttpNotFound();

        //    return View();
        //}

        //witout layout
        public ActionResult Index()
        {
             //return HttpNotFound();

            return View();
        }

        //with default layout(_Viewstart.cshtml)
        public ActionResult Index2()
        {
            return View();
        }
        //with a  specific layout(which can be any layout)
        public ActionResult Index3()
        {
            return View();
        }

        public ActionResult Index4(int? id)
        {
            if (id == null)
            {
                return HttpNotFound();
            }
            else
            {
                return View(); 
            }
            
        }
    }
}