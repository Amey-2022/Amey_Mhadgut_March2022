//for sorting in SetCollection TreeSet is used in lists Collection.sort is used


import java.util.TreeSet;

class SetDemo{
			public static void main(String[] args){
			
				Employee e1=new Employee(3,"A","M",10000.0);
				Employee e2=new Employee(2,"B","F",50000.0);
				Employee e3=new Employee(1,"C","M",20000.0);
				//Employee e4=new Employee(1,"A","M",10000.0);
				
				TreeSet<Employee> set=new TreeSet<>();
				set.add(e1);
				set.add(e2);
				set.add(e3);
				
				
				System.out.println(set);  //bydefault will sort on basis of comparable i.e ID k basisi pe
				//[1, C, M, 20000.0, 2, B, F, 15000.0, 3, A, M, 10000.0]
				
				
				NameSort ns=new NameSort();  
				TreeSet<Employee> set2=new TreeSet<>(ns);  
				set2.add(e1);
				set2.add(e2);
				set2.add(e3);
				System.out.println("NameSort: "+set2);		//NameSort: [3, A, M, 10000.0, 2, B, F, 50000.0, 1, C, M, 20000.0]
				
				
				
				SalarySort ss=new SalarySort();  
				TreeSet<Employee> set3=new TreeSet<>(ss);
				set3.add(e1);
				set3.add(e2);
				set3.add(e3);
				System.out.println("SalarySort: "+set3);		//SalarySort: [3, A, M, 10000.0, 1, C, M, 20000.0, 2, B, F, 50000.0]
			
			
			}
}
				
				
				/*
						CompareTo method invoked!!
						CompareTo method invoked!!
						CompareTo method invoked!!
						CompareTo method invoked!!
						[1, C, M, 20000.0, 2, B, F, 50000.0, 3, A, M, 10000.0]
						Compare method invoked!!
						Compare method invoked!!
						Compare method invoked!!
						Compare method invoked!!
						NameSort: [3, A, M, 10000.0, 2, B, F, 50000.0, 1, C, M, 20000.0]
						Compare method invoked!!
						Compare method invoked!!
						Compare method invoked!!
						Compare method invoked!!
						*/