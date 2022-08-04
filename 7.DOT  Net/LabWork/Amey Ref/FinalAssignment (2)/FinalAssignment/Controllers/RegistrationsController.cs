using FinalAssignment.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace FinalAssignment.Controllers
{
    public class RegistrationsController : Controller
    {
       
        
        // GET: Registrations
        public ActionResult Index()
        {
            var list = City.GetCities();
            ViewBag.Cities = list;
            
            return View();
        }

        [HttpPost]
        public ActionResult Index(Registration obj)
        {
            try
            {
                // TODO: Add insert logic here
                Registration.InsertRegistrationDetails(obj);
                return RedirectToAction("Login");
            }
            catch
            {
                return View();
            }
        }

        // GET: Registrations/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: Registrations/Create
        public ActionResult Login()
        {
            string s=null, s2=null;
            HttpCookie reqCookie = Request.Cookies["LoginDetails"];
            if (reqCookie != null)
            {
                s = reqCookie.Values["UserLoginName"];
                s2 = reqCookie.Values["UserPassword"];
            }

            if (s != null && s2 != null)
                return RedirectToAction("Homepage");
            else
                return View();
        }
        [HttpPost]
        public ActionResult Login(Registration obj)
        {
            try
            {
                // TODO: Add insert logic here
                var list= Registration.verifyLogin(obj);
                
                if(obj.LoginName==list[0].LoginName&&obj.Password==list[0].Password)
                {
                    
                    if (obj.RememberMe == true)
                    {
                        HttpCookie objCookie = new HttpCookie("LoginDetails");
                        objCookie.Expires = DateTime.Now.AddDays(1);
                        objCookie.Values["UserLoginName"] = obj.LoginName;
                        objCookie.Values["UserPassword"] = obj.Password;
                        objCookie.Values["UserFullName"] = list[0].FullName;
                        Response.Cookies.Add(objCookie);
                    }

                    Session["LoginName"] = list[0].LoginName;
                    Session["FullName"] = list[0].FullName;
                    
                    return RedirectToAction("HomePage");
                }
                else
                {
                    
                    return RedirectToAction("Login");
                }
               
            }
            catch
            {
                return HttpNotFound();
            }
        }

        public ActionResult HomePage()
        {

            return View();
        }

        [HttpPost]
        public ActionResult HomePage(Registration obj)
        {
            HttpCookie objCookie = new HttpCookie("LoginDetails");
            objCookie.Expires = DateTime.Now.AddDays (-1);
            Response.Cookies.Add(objCookie);
            Session.Abandon();
            return RedirectToAction("Index","Home");
        }

        public ActionResult Welcome()
        {
            if (Session["LoginName"] != null)
                return View();
            else
                return HttpNotFound();
        }

        // GET: Registrations/Edit/5
        public ActionResult Edit(string id="")
        {
            var list = City.GetCities();
            ViewBag.Cities = list;
            Registration obj = Registration.getSingleUser(id);
            return View(obj);
        }

        // POST: Registrations/Edit/5
        [HttpPost]
        public ActionResult Edit(string id = "", Registration obj=null)
        {
            try
            {
                Registration.UpdateUser(obj);

                return RedirectToAction("HomePage");
            }
            catch
            {
                return View();
            }
        }

        // GET: Registrations/Delete/5
        
    }
}
