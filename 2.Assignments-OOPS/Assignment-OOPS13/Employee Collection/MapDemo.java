//Maps-> HashMap

import java.util.HashMap;


class MapDemo{
//<Key,Value>.... map maintains uniqueness on the basis of Key not Value
		public static void main(String[] args){
			
			
			Employee e1=new Employee(1,"A","M",10000.0);
			Employee e2=new Employee(2,"B","F",50000.0);
			Employee e3=new Employee(3,"C","M",20000.0);
			
			HashMap<Integer,Employee> map=new HashMap<>();	//as Key is Integer so .equals and HashCode will be called of Integer
			//put-> to add object
			map.put(1,e1);
			map.put(2,e2);
			map.put(3,e3);
			
			System.out.println(map.size());//3
			System.out.println(map);		
			
			System.out.println("Before: "+map.get(1));	//Before: 1, A, M, 10000.0
			Employee e=map.get(1);
			e.setSalary(30000.0);				//After: 1, A, M, 30000.0
			System.out.println("After: "+map.get(1)); //	toString against e1 wil be invoked
			
			map.remove(2);	
			System.out.println(map.size());	//2
			
			System.out.println(map.containsKey(3)); //true
			
			Employee e4=new Employee(1,"A","M",30000.0);
			System.out.println(map.containsValue(e4)); //false
			
			System.out.println(map.containsKey(2));//false
			
			
			System.out.println(map);
			map.put(3,null);
			System.out.println(map);
			System.out.println(map.size());
			
			
		
		
		
		}

}
					//HashMap<Employee,Employee> map=new HashMap<>();

				/*
					3
					{1=1, A, M, 10000.0, 2=2, B, F, 15000.0, 3=3, C, M, 20000.0}
					Before: 1, A, M, 10000.0
					After: 1, A, M, 30000.0
					2
					true
					equals invoked!!!!
					equals invoked!!!!
					false
					false
					{1=1, A, M, 30000.0, 3=3, C, M, 20000.0}
					{1=1, A, M, 30000.0, 3=null}
					2
				*/