//Difference for uniqueness and update in set and maps


import java.util.HashSet;

class SetDemo2{
			public static void main(String[] args){
			
				Employee e1=new Employee(3,"A","M",10000.0);
				Employee e2=new Employee(2,"B","F",15000.0);
				Employee e3=new Employee(1,"C","M",20000.0);
				//Employee e4=new Employee(1,"A","M",10000.0);
				
				HashSet<Employee> set=new HashSet<>();
				set.add(e1);	//map.put(e1,e1) -> in background uses map with same key and value for uniqueness
				set.add(e2);	//map.put(e2,e2)
				set.add(e3);	//map.put(e2,e2)
				
				
				System.out.println(set);  //bydefault will sort on basis of comparable i.e ID k basisi pe
				//[1, C, M, 20000.0, 2, B, F, 15000.0, 3, A, M, 10000.0]
				
				
				
				
				//to  update any details in set
				
				//step 1: create duplicate object
				Employee e4=new Employee(3,"A","M",10000.0);
				//step 2:
				set.remove(e4);
				e4.setSalary(20000.0);
				set.add(e4);
				System.out.println(set);	//[2, B, F, 15000.0, 3, A, M, 10000.0, 3, A, M, 20000.0, 1, C, M, 20000.0]
				
				
				
				
			}
}