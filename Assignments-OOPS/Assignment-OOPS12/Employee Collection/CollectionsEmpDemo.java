//Collection of Employee

import java.util.*;

class Employee{
	private Integer employeeId;
	private String name,gender;
	private Double salary;
	
	public Employee(Integer employeeId, String name, String gender, Double salary){
	this.employeeId=employeeId;
	this.name=name;
	this.gender=gender;
	this.salary=salary;
	//System.out.println(this.employeeId+","+this.name+","+this.gender+","+this.salary);
	}
	
	//get and set methods
	
	//toString method
	@Override
	public String toString(){
		return this.employeeId+","+this.name+","+this.gender+","+this.salary;
	}
	
	
	//equals method
	@Override
	public boolean equals(Object o){
		
		//Employee e4=new Employee(1,"A","Male",10000.0);
		System.out.println("equals invoked...!!!!");
		
		if(o instanceof Employee){
		Employee temp=(Employee)o;
		if(this.employeeId.equals(temp.employeeId)&&
		this.name.equals(temp.name)&&
		this.gender.equals(temp.gender)&&
		this.salary.equals(temp.salary))
		return true;
		}
		
		return false;
	}
	
	//hashcode
	@Override
	public int hashCode(){
		System.out.println("hashcode invoked...!!!!");
		int prime = 17;
		prime = prime + prime*this.employeeId.hashCode();
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.gender.hashCode();
		prime = prime + (int)(prime*this.salary.hashCode());
		
		
		return prime;
	}
	
}

class CollectionsEmpDemo{
	public static void main(String...args){
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		HashSet<Employee> set = new HashSet<Employee>();
		
		Employee e1=new Employee(1,"A","Male",10000.0);
		Employee e2=new Employee(2,"B","FeMale",50000.0);
		Employee e3=new Employee(3,"C","Male",20000.0);
		Employee e4=new Employee(1,"A","Male",10000.0);
		
		/*list.add(e1);
		list.add(e2);
		list.add(e3);
		//list.add(e4);
		
		System.out.println(list);
		
		System.out.println(list.contains(e4));//true
		System.out.println();
		System.out.println();*/
		
		
		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e4);
	

	}
}

