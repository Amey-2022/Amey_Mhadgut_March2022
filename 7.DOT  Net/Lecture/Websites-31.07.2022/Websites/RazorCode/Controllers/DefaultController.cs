using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace RazorCode.Controllers
{
    public class DefaultController : Controller
    {
        // GET: Default
        //http://localhost:64205/Default/Index/10?a=21&b=Vikram&c=30
        public ActionResult Index(int id=0, int a=0, string b="", int c=0)
        {
            ViewBag.id = id;
            ViewBag.a = a;
            ViewBag.b = b;
            ViewBag.c = c;
            return View();
        }
    }
}