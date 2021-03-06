//WAP to represent a multiple inheritance by calculating salary of employee where
//there is a class employee which implements interface Attendance, interface
//salarydetail.
import java.util.*;
interface Attendance{
	void displayAttendance(String name,float attendance);

}

interface Salary{
		void displaySalary(float attendance,double salary);

}


class Employee implements Attendance,Salary{
		String name;
			double salary=0;
			float attendance=0;
			double totalsal=0;
			
			public void displayAttendance(String name,float attendance){
				this.name=name;
				this.attendance=attendance;
				System.out.println("Employee "+name+" was present for "+attendance+" days");
			}
			
			public void displaySalary(float attendance,double salary){
				this.attendance=attendance;
				this.salary=salary;
				totalsal=attendance*salary;
				System.out.println("Total salary for "+attendance+" days is Rs."+totalsal);
				
			}

}

class EmployeeDemo{
		public static void main(String[] args){
			Employee e=new Employee();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name of an employee: ");
			String name=sc.nextLine();
			System.out.println("Enter per day  salary of an employee: ");
			double salary=sc.nextDouble();
			System.out.println("Enter attendance in number of  days: ");
			float attendance=sc.nextFloat();
			
			
			e.displayAttendance(name,attendance);
			e.displaySalary(attendance,salary)	
		
	}
}
