//Collection of Employee
import java.util.*;
class Employee{

	private Integer employeeId;
	private String name;
	private String gender;
	private double salary;
	
	public Employee(Integer employeeId, String name, String gender, double salary){
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	//System.out.println(this.employeeId+","+this.name+","+this.gender+","+this.salary);
	}
	//get and set methods
	
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
		prime = prime + (int)(prime*salary);
		
		return prime;
	}
	
}