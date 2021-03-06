//Collection Assignment Question3

import java.util.*;

class Employee implements Comparable<Employee>{
	String empId;
	String name;
	
	
	Employee(){
		this.empId="101";
		this.name="Amey";	
	}
	Employee(String empId,String name){
		this.empId=empId;
		this.name=name;
	}
	
	public String toString(){
		return "empId: "+this.empId+" Employee name: "+this.name; 
	}
	
	public int compareTo(Employee e){
		return  this.empId.compareTo(e.empId);
	}
		
		
}

class CollectionQue3Demo{
				public static void main(String[] args){
				
				HashSet<Employee> set=new HashSet<Employee>();
				Employee e1=new Employee();
				Employee e2=new Employee("102","Akshay");
				Employee e3=new Employee("103","Rakesh");
				Employee e4=new Employee("103","Rakesh");
				
				set.add(e2);
				set.add(e1);
				set.add(e3);
				set.add(e4);
				
				System.out.println(set);
				System.out.println("Size of HashSet: "+set.size());
				
				
				System.out.println("==============================");
				//convert array
				Employee[] ar=new Employee[set.size()];
				int i=0;
				for(Employee var: set){
					ar[i++]=var;
				}
				
				for(Employee var: ar){
					System.out.println(" "+var);
				}
				
				System.out.println("==============================");
				//convert to TreeSet
				TreeSet<Employee> set2=new TreeSet<Employee>(set);
				System.out.println(set2);
	
				System.out.println("==============================");
				//convert to Arraylist
				ArrayList<Employee> set3=new ArrayList<Employee>(set);
				System.out.println(set3);
				
				
				System.out.println("==============================");
				//remove
				set.clear();
				System.out.println(set);
	
	
	
	
	
	
	
	}
}

/*
[empId: 103 Employee name: Rakesh, empId: 102 Employee name: Akshay, empId: 101 Employee name: Amey, empId: 103 Employee name: Rakesh]
Size of HashSet: 4
 empId: 103 Employee name: Rakesh
 empId: 102 Employee name: Akshay
 empId: 101 Employee name: Amey
 empId: 103 Employee name: Rakesh
[empId: 101 Employee name: Amey, empId: 102 Employee name: Akshay, empId: 103 Employee name: Rakesh]
[empId: 103 Employee name: Rakesh, empId: 102 Employee name: Akshay, empId: 101 Employee name: Amey, empId: 103 Employee name: Rakesh]
[]
*/