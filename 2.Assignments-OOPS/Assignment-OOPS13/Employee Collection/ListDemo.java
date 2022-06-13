import java.util.ArrayList;
import java.util.Collections;


class ListDemo{
			public static void main(String[] args){
			ArrayList<Employee> list=new ArrayList<Employee>();
				Employee e1=new Employee(3,"A","M",10000.0);
				Employee e2=new Employee(2,"B","F",50000.0);
				Employee e3=new Employee(1,"C","M",20000.0);
				Employee e4=new Employee(1,"A","M",10000.0);
				
				list.add(e1);
				list.add(e2);
				list.add(e3);	


				
				/*//list.add(e4); if added e4 -> //[1, A, M, 10000.0, 2, B, F, 15000.0, 3, C, M, 20000.0, 1, A, M, 10000.0]
				
				System.out.println(list);		//[1, A, M, 10000.0, 2, B, F, 15000.0, 3, C, M, 20000.0]
				
				System.out.println(list.contains(e4));		//true
				
				System.out.println(list.indexOf(e4));	//0 
				*/
				
				
				//Sorting
				
				//for sorting in lists Collection.sort is used and in SetCollection TreeSet is used in 
				Collections.sort(list);		//Take Comparable Bydefault
				System.out.println("Sorted List:"+list);    //Sorted List:[1, A, M, 10000.0, 2, B, F, 15000.0, 3, C, M, 20000.0]
				
				
				//Comparable id
				//NameSort
				//SalarySort
				NameSort ns=new NameSort();            
				Collections.sort(list,ns);		//list ko name(ns) k basis pe sort karo
				System.out.println("Name Sorted List:"+list); 
				
				SalarySort ss=new SalarySort();
				Collections.sort(list,ss);		//list ko salary(ss) k basis pe sort karo
				System.out.println("Salary Sorted List:"+list); 
				
				
			}
}



					/*
					
					CompareTo method invoked!!
					CompareTo method invoked!!
					Sorted List:[1, C, M, 20000.0, 2, B, F, 50000.0, 3, A, M, 10000.0]
					Compare method invoked!!
					Compare method invoked!!
					Name Sorted List:[3, A, M, 10000.0, 2, B, F, 50000.0, 1, C, M, 20000.0]
					Compare method invoked!!
					Compare method invoked!!
					Compare method invoked!!
					Compare method invoked!!
					Salary Sorted List:[3, A, M, 10000.0, 1, C, M, 20000.0, 2, B, F, 50000.0]
					*/