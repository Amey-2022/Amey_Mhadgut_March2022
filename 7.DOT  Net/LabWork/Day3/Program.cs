using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// when employee class implements IDbFunctions


// Type1==> by using common method 
namespace AssignmentType1
{
    class Program
    {
        static void Main1()
        {



            Manager mng = new Manager("Manager", 25000, 10, "Production");

            //System.Console.WriteLine("EmpNo is : " + mng.EmpNo);
            //System.Console.WriteLine("Name is : " + mng.Name);
            //System.Console.WriteLine("DeptNo is : " + mng.DeptNo);
            //System.Console.WriteLine("Designation is : " + mng.Designation);
            //System.Console.WriteLine("Sal is : " + mng.CalcNetSalary());
            //System.Console.WriteLine();


            GeneralManager gm = new GeneralManager("General Manager", 50000, 20, "Production", "Bonus");

            //System.Console.WriteLine("EmpNo is : " + gm.EmpNo);
            //System.Console.WriteLine("Name is : " + gm.Name);
            //System.Console.WriteLine("DeptNo is : " + gm.DeptNo);
            //System.Console.WriteLine("Designation is : " + gm.Designation);
            //System.Console.WriteLine("Perks are : " + gm.Perks);
            //System.Console.WriteLine("Sal is : " + gm.CalcNetSalary());
            //System.Console.WriteLine();


            CEO ceo = new CEO("CEO", 150000, 10);

            //System.Console.WriteLine("EmpNo is : " + ceo.EmpNo);
            //System.Console.WriteLine("Name is : " + ceo.Name);
            //System.Console.WriteLine("DeptNo is : " + ceo.DeptNo);
            //System.Console.WriteLine("Sal is : " + ceo.CalcNetSalary());
            //System.Console.WriteLine();

            /*
                        mng.Delete();
                        gm.Delete();*/

            /*Employee e = mng;
            e.Delete();*/

            /*IDbFunctions id = gm ;
             id.Delete();*/

            Insert(mng);
            Update(mng);
            Delete(mng);

            Insert(gm);
            Update(gm);
            Delete(gm);

            Insert(ceo);
            Update(ceo);
            Delete(ceo);
            

            void Insert(IDbFunctions idb)
            {
                idb.Insert();
            }

            void Update(IDbFunctions idb)
            {
                idb.Update();
            }

            void Delete(IDbFunctions idb)
            {
                idb.Delete();
            }
            


        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }

    public abstract class Employee : IDbFunctions
    {
        private static int count;
        private int empNo;
        private string name;
        protected decimal basic;

        private short deptNo;

        public Employee(string Name = "", decimal Basic = 0, short DeptNo = 0)
        {
            count++;
            this.Basic = Basic;
            this.EmpNo = count;
            this.Name = Name;
            this.DeptNo = DeptNo;


        }

        public string Name
        {
            set
            {
                if (value != "")
                    name = value;
                else
                    System.Console.WriteLine("Cannot have empty name");

            }
            get
            {
                return name;
            }



        }

        public int EmpNo
        {
            private set
            {
                empNo = value;
            }
            get
            {
                return empNo;
            }
        }

        public abstract decimal Basic { set; get; }
        public short DeptNo
        {
            set
            {
                if (value > 0)
                    deptNo = value;
                else
                {
                    deptNo = 1;
                }
            }
            get
            {
                return deptNo;
            }
        }


        public abstract decimal CalcNetSalary();

        void IDbFunctions.Insert()
        {
            Console.WriteLine("Insert occured in Emp");

        }

        void IDbFunctions.Update()
        {
            Console.WriteLine("Update occured in Emp");
        }

        void IDbFunctions.Delete()
        {
            Console.WriteLine("Delete occured in Emp");
        }
    }

    public class Manager : Employee,IDbFunctions
    {
        private string designation;

        public Manager(string Name = "", decimal Basic = 0, short DeptNo = 0, string Designation = "") : base(Name, Basic, DeptNo)
        {

            this.Designation = Designation;
        }

        public string Designation
        {
            set
            {
                if (value != "")
                {
                    designation = value;
                }
                else
                {
                    System.Console.WriteLine("Cannot have empty name of designation");
                }
            }
            get
            {
                return designation;
            }
        }
        public override decimal Basic
        {
            set
            {
                if (value >= 20000 && value <= 40000)
                {
                    basic = value;
                }
                else
                {
                    System.Console.WriteLine("Cannot have basic less than 20000");

                }

            }
            get
            {
                return basic;
            }
        }

        public override decimal CalcNetSalary()
        {
            decimal ta = (Basic * 17) / 100;
            decimal sal = Basic + ta;

            return sal;
        }

         void IDbFunctions.Insert()
        {
            Console.WriteLine("Insert occured in Manager");
        }

        void IDbFunctions.Update()
        {
            Console.WriteLine("Update occured in Manager");
        }

          void IDbFunctions.Delete()
        {
            Console.WriteLine("Delete occured in Manager");
        }

      
    }


    public class GeneralManager : Manager,IDbFunctions
    {
        private string perks;

        public GeneralManager(string Name = "", decimal Basic = 0, short DeptNo = 0, string Designation = "", string Perks = "") : base(Name, Basic, DeptNo, Designation)
        {

            this.Perks = Perks;
        }

        public string Perks
        {
            set
            {

                perks = value;

            }
            get
            {
                return perks;
            }
        }

        public override decimal Basic
        {
            set
            {
                if (value > 40000 && value <= 80000)
                {
                    basic = value;
                }
                else
                {
                    System.Console.WriteLine("Cannot have basic less than 40000");

                }

            }
            get
            {
                return basic;
            }
        }

        public override decimal CalcNetSalary()
        {
            decimal ta = basic * 17 / 100;
            decimal sal = Basic + ta;

            return sal;
        }


           void IDbFunctions.Insert()
        {
            Console.WriteLine("Insert occured in GeneralManager");
        }

          void IDbFunctions.Update()
        {
            Console.WriteLine("Update occured in GeneralManager");
        }

          void IDbFunctions.Delete()
        {
            Console.WriteLine("Delete occured in GeneralManager");
        }
    }


    public class CEO : Employee,IDbFunctions 
    {
        public CEO(string Name = "", decimal Basic = 0, short DeptNo = 0) : base(Name, Basic, DeptNo)
        {

        }

        public override decimal Basic
        {
            set
            {
                if (value >= 100000 && value <= 200000)
                {
                    basic = value;
                }
                else
                {
                    System.Console.WriteLine("Cannot have basic less than 100000");

                }
            }

            get
            {
                return basic;
            }

        }

        public sealed override decimal CalcNetSalary()
        {
            decimal ta = (basic * 17) / 100;
            decimal sal = basic + ta;

            return sal;
        }

          void IDbFunctions.Insert()
        {
            Console.WriteLine("Insert occured in CEO");
        }

          void IDbFunctions.Update()
        {
            Console.WriteLine("Update occured in CEO");
        }

          void IDbFunctions.Delete()
        {
            Console.WriteLine("Delete occured in CEO");
        }
    }

   
}




// Type2==> by using abstract implementation in Employee class
namespace AssignmentType2
{
    class Program
    {
        static void Main()
        {



            Manager mng = new Manager("Manager", 25000, 10, "Production");

            //System.Console.WriteLine("EmpNo is : " + mng.EmpNo);
            //System.Console.WriteLine("Name is : " + mng.Name);
            //System.Console.WriteLine("DeptNo is : " + mng.DeptNo);
            //System.Console.WriteLine("Designation is : " + mng.Designation);
            //System.Console.WriteLine("Sal is : " + mng.CalcNetSalary());
            //System.Console.WriteLine();


            GeneralManager gm = new GeneralManager("General Manager", 50000, 20, "Production", "Bonus");

            //System.Console.WriteLine("EmpNo is : " + gm.EmpNo);
            //System.Console.WriteLine("Name is : " + gm.Name);
            //System.Console.WriteLine("DeptNo is : " + gm.DeptNo);
            //System.Console.WriteLine("Designation is : " + gm.Designation);
            //System.Console.WriteLine("Perks are : " + gm.Perks);
            //System.Console.WriteLine("Sal is : " + gm.CalcNetSalary());
            //System.Console.WriteLine();


            CEO ceo = new CEO("CEO", 150000, 10);

            //System.Console.WriteLine("EmpNo is : " + ceo.EmpNo);
            //System.Console.WriteLine("Name is : " + ceo.Name);
            //System.Console.WriteLine("DeptNo is : " + ceo.DeptNo);
            //System.Console.WriteLine("Sal is : " + ceo.CalcNetSalary());
            //System.Console.WriteLine();


            mng.Delete();
            gm.Delete();
            ceo.Delete();

            Employee e = mng;
            e.Delete();

            IDbFunctions id = gm;
            id.Delete();



        }
    }

    public interface IDbFunctions
{
    void Insert();
    void Update();
    void Delete();
}

public abstract class Employee : IDbFunctions
{
    private static int count;
    private int empNo;
    private string name;
    protected decimal basic;

    private short deptNo;

    public Employee(string Name = "", decimal Basic = 0, short DeptNo = 0)
    {
        count++;
        this.Basic = Basic;
        this.EmpNo = count;
        this.Name = Name;
        this.DeptNo = DeptNo;


    }

    public string Name
    {
        set
        {
            if (value != "")
                name = value;
            else
                System.Console.WriteLine("Cannot have empty name");

        }
        get
        {
            return name;
        }



    }

    public int EmpNo
    {
        private set
        {
            empNo = value;
        }
        get
        {
            return empNo;
        }
    }

    public abstract decimal Basic { set; get; }
    public short DeptNo
    {
        set
        {
            if (value > 0)
                deptNo = value;
            else
            {
                deptNo = 1;
            }
        }
        get
        {
            return deptNo;
        }
    }


    public abstract decimal CalcNetSalary();
        public abstract void Insert();
        public abstract void Update();
        public abstract void Delete();
    }

public class Manager : Employee, IDbFunctions
{
    private string designation;

    public Manager(string Name = "", decimal Basic = 0, short DeptNo = 0, string Designation = "") : base(Name, Basic, DeptNo)
    {

        this.Designation = Designation;
    }

    public string Designation
    {
        set
        {
            if (value != "")
            {
                designation = value;
            }
            else
            {
                System.Console.WriteLine("Cannot have empty name of designation");
            }
        }
        get
        {
            return designation;
        }
    }
    public override decimal Basic
    {
        set
        {
            if (value >= 20000 && value <= 40000)
            {
                basic = value;
            }
            else
            {
                System.Console.WriteLine("Cannot have basic less than 20000");

            }

        }
        get
        {
            return basic;
        }
    }

    public override decimal CalcNetSalary()
    {
        decimal ta = (Basic * 17) / 100;
        decimal sal = Basic + ta;

        return sal;
    }

    public override void Insert()
    {
        Console.WriteLine("Insert occured in Manager");
    }

    public override void Update()
    {
        Console.WriteLine("Update occured in Manager");
    }

    public override void Delete()
    {
        Console.WriteLine("Delete occured in Manager");
    }


}


public class GeneralManager : Manager
{
    private string perks;

    public GeneralManager(string Name = "", decimal Basic = 0, short DeptNo = 0, string Designation = "", string Perks = "") : base(Name, Basic, DeptNo, Designation)
    {

        this.Perks = Perks;
    }

    public string Perks
    {
        set
        {

            perks = value;

        }
        get
        {
            return perks;
        }
    }

    public override decimal Basic
    {
        set
        {
            if (value > 40000 && value <= 80000)
            {
                basic = value;
            }
            else
            {
                System.Console.WriteLine("Cannot have basic less than 40000");

            }

        }
        get
        {
            return basic;
        }
    }

    public override decimal CalcNetSalary()
    {
        decimal ta = basic * 17 / 100;
        decimal sal = Basic + ta;

        return sal;
    }


    public override void Insert()
    {
        Console.WriteLine("Insert occured in GeneralManager");
    }

    public override void Update()
    {
        Console.WriteLine("Update occured in GeneralManager");
    }

    public override void Delete()
    {
        Console.WriteLine("Delete occured in GeneralManager");
    }
}


public class CEO : Employee
{
    public CEO(string Name = "", decimal Basic = 0, short DeptNo = 0) : base(Name, Basic, DeptNo)
    {

    }

    public override decimal Basic
    {
        set
        {
            if (value >= 100000 && value <= 200000)
            {
                basic = value;
            }
            else
            {
                System.Console.WriteLine("Cannot have basic less than 100000");

            }
        }

        get
        {
            return basic;
        }

    }

    public sealed override decimal CalcNetSalary()
    {
        decimal ta = (basic * 17) / 100;
        decimal sal = basic + ta;

        return sal;
    }

    public override void Insert()
    {
        Console.WriteLine("Insert occured in CEO");
    }

    public override void Update()
    {
        Console.WriteLine("Update occured in CEO");
    }

    public override void Delete()
    {
        Console.WriteLine("Delete occured in CEO");
    }
}

   
}





