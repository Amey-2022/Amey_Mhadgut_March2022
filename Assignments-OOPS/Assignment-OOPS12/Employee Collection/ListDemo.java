import java.util.*;

class ListDemo{
			public static void main(String[] args){
			ArrayList<Employee> list=new ArrayList<Employee>();
				Employee e1=new Employee(1,"A","M",10000.0);
				Employee e2=new Employee(2,"B","F",15000.0);
				Employee e3=new Employee(3,"C","M",20000.0);
				Employee e4=new Employee(1,"A","M",10000.0);
				
				list.add(e1);
				list.add(e2);
				list.add(e3);		
				//list.add(e4); if added e4 -> //[1, A, M, 10000.0, 2, B, F, 15000.0, 3, C, M, 20000.0, 1, A, M, 10000.0]
				
				System.out.println(list);		//[1, A, M, 10000.0, 2, B, F, 15000.0, 3, C, M, 20000.0]
				
				System.out.println(list.contains(e4));		//true
				
				System.out.println(list.indexOf(e4));	//0
				
				
			
			}
}