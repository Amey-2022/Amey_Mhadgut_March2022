using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace DataAnnotations.Models
{
    public class Employee
    {
        [Key]
        public int EmpNo { get; set; }
        
        [DataType(DataType.Text)]
        [Required(ErrorMessage ="Please enter name")]
        [StringLength(50,ErrorMessage = "The {0} value cannot exceed {1} characters. ")]
        public string Name { get; set; }

        [Range(1000,500000,ErrorMessage = "Please enter values between 1000-500000")]
        [MaxLength(6),MinLength(4)]
        [Display(Name="Basic Salary")]
        [DataType(DataType.Currency)]
        public decimal Basic { get; set; }

        [Range(10, 50, ErrorMessage = "Please enter values between 10-50 in multiple of 10")]
        [MaxLength(2), MinLength(2)]
        public int DeptNo { get; set; }

        [ScaffoldColumn(true)]
        public string Dummy { get; set; }

        [Required(ErrorMessage ="Please enter phone number")]
        [DataType(DataType.PhoneNumber)]
        [RegularExpression(@"^[0-9]{10}$", ErrorMessage = "only enter numbers")]
        public string PhoneNumber { get; set; }

        [EmailAddress]
        public string EmailId { get; set; }

        [Required(ErrorMessage = "Please enter password")]
        [DataType(DataType.Password)]
        public string Password { get; set; }

        [Required(ErrorMessage = "Please enter confirm password")]
        [Compare("Password",ErrorMessage = "Password and confirm password should be the same")]
        [DataType(DataType.Password)]
        public string ConfirmPassword { get; set; }

        // Allow up to 40 uppercase and lowercase 
        // characters. Use custom error.
        [RegularExpression(@"^[a-zA-Z''-'\s]{1,40}$",ErrorMessage = "Characters are not allowed.")]
        public string FirstName { get; set; }

        // Allow up to 40 uppercase and lowercase 
        // characters. Use standard error.
        [RegularExpression(@"^[a-zA-Z''-'\s]{1,40}$",ErrorMessage = "Characters are not allowed.")]
        public string LastName { get; set; }
    }
}