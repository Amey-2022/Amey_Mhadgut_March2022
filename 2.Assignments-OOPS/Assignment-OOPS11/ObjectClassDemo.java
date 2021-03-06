import java.lang.Object;

class Employee{
		private Integer employeeId;
		private String name;
		private String gender;
		private double salary;
		
		public Employee(Integer employeeId,String name,String gender,Double salary){
		this.employeeId=employeeId;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
		}
		
		
		
	//toString   why??to give meaningfull msg. to our obj or ref var... its not compulsory		
	/*@Override			
	public String toString(){	//how javap Object class		
		return this.employeeId+". "+this.name+", "+this.gender+", "+this.salary;	
	}*/



	//equals  //if want to equate 2 obj based on their content
	@Override
		public boolean equals(Object o){ 			
			if(o instanceof Employee){ 			//compulsory need to do this
				Employee temp = (Employee)o;  //downcasting
				
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



	//hashCode why?// if 2 obj are using equals method then hashCode must be same... if  wanna maintain uniqness then override equals and hashcode. 
	@Override
	public int hashCode(){
		int prime=17;
		prime=prime+prime*this.employeeId.hashCode();
		prime=prime+prime*this.name.hashCode();
		prime=prime+prime*this.gender.hashCode();
		prime=prime+(int)(prime*salary);
		
		return prime;
		
	}

}

//get and set methods


class Person{
	
}
 





class ObjectClassDemo{
				public static void main(String[] args){
				
				Employee e1=new Employee(1,"A","M",10000.0);
				Employee e2=new Employee(2,"B","F",15000.0);
				Employee e3=new Employee(3,"C","M",20000.0);
				Employee e4=new Employee(1,"A","M",10000.0);
				
				
				//toString
				System.out.println(e1);		// internally invoked as e1.toString();
				System.out.println(e2);
				System.out.println(e3);
				System.out.println(e4);
				
				
				//equals
				System.out.println("e1==e4"+(e1==e4));			//false
				System.out.println("e1 equals e4:"+e1.equals(e4));	//false	//After overriding equals method-true
				
		
				String s1 = new String("A");
				String s2 = new String("A");
			
				System.out.println(s1 == s2);//false
				System.out.println(s1.equals(s2));// true
				
				
				//how to print hexadecimal into hashCode
				//hashCode
				/*Employee@4617c264
				Employee@36baf30c
				Employee@7a81197d
				Employee@5ca881b5*/
			
				int x = 0x4617c264;	
				System.out.println(x); //1175962212
				
				
				Person p = new Person();
				System.out.println(e1.equals(p));//ClassCastException // after overriding false

				System.out.println(s1.hashCode());		//65
				System.out.println(s2.hashCode());		//65
				
				System.out.println(e1.hashCode());		//1750495032
				System.out.println(e4.hashCode());		//1750495032
				/*
				b4 hashCode override
				1175962212
				1554547125
				*/



				
}
}