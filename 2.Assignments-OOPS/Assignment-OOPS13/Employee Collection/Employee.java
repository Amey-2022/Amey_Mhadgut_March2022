//Collection of Employee
import java.util.*;
class Employee implements Comparable<Employee>{	//<Employee> specify this compulsory if not then in override argument take (Object o)--instance of--downcasting... then use

	private Integer employeeId;
	private String name;
	private String gender;
	private Double salary;
	//private int age;
	
	public Employee(Integer employeeId, String name, String gender, double salary){
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	//System.out.println(this.employeeId+","+this.name+","+this.gender+","+this.salary);
	}
	//get and set methods
	public Integer getEmployeeID(){
		return this.employeeId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public Double getSalary(){
		return this.salary;
	}
	
	//set methods
	public void setEmployeeID(Integer emplyeeID){
		this.employeeId=employeeId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setGender(String gender){
		this.gender=gender;
	}
	
	public void setSalary(Double salary){
		this.salary=salary;
	}
	
	
	
	
	
	
	//toString()
	@Override
	public String toString(){
		return this.employeeId+", "+this.name+", "+this.gender+", "+this.salary;
	}
	
	//equals()
	@Override
	public boolean equals(Object o){
		System.out.println("equals invoked!!!!");
		if(o instanceof Employee){ //
			Employee temp = (Employee)o;  //
			
			if(this.employeeId.equals(temp.employeeId) &&
				this.name.equals(temp.name) &&
				this.gender.equals(temp.gender)&&
				this.salary == temp.salary
			){
				return true;
			}
		}
		return false;
	}
	
	
	//hashCode()
	@Override
	public int hashCode(){
		System.out.println("hashCode invoked!!!!");
		int prime = 17;
		prime = prime + prime*this.employeeId.hashCode();
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.gender.hashCode();
		prime = prime + prime*this.salary.hashCode();
		
		return prime;
	}
	
	@Override
	public int compareTo(Employee e){
		System.out.println("CompareTo method invoked!!");
		return this.employeeId.compareTo(e.employeeId);  //ascending order//1st object from 'this.' and 2nd from argument to compare is taken.
		//return e.employeeId.compareTo(this.employeeId);//descending order
		//return this.age - e.age; //line 9 if primitive is used instead of wrapper class
	}
	
}