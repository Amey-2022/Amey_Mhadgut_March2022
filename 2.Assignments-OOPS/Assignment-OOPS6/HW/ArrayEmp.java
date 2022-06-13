class Employee{
	String name;
	int age;
	double salary;



	Employee(String name,int age,double salary){
	this.name=name;
	this.age=age;
	this.salary=salary;
	
	}
	
	void getEmpDetails(){
		System.out.println(name+"  "+age+"  "+salary);	

	}
}

	class ArrayEmp{
		public static void main(String[] args){
			Employee eary[]= new Employee[5];
			eary[0]=new Employee("Amey",27,60000);
			eary[1]=new Employee("Amey",27,60000);
			eary[2]=new Employee("Amey",27,60000);
			eary[3]=new Employee("Amey",27,60000);
			eary[4]=new Employee("Amey",27,60000);
			
			for(int i=0;i<eary.length;i++){
				eary[i].getEmpDetails();
			}
			
		}
		
		
	}