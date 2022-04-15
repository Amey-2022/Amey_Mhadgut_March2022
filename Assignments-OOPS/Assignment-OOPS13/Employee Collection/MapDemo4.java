import java.util.HashMap;
import java.util.TreeMap;


class MapDemo4{
//<Key,Value>.... map maintains uniqueness on the basis of Key not Value
		public static void main(String[] args){
			
			HashMap<Employee,Employee> map=new HashMap<>();	//as Key is Employee so .equals and HashCode will be called of Employee
			//put-> to add object
			
			Employee e1=new Employee(1,"A","M",10000.0);
			Employee e2=new Employee(2,"B","F",50000.0);
			Employee e3=new Employee(3,"C","M",20000.0);
			Employee e4=new Employee(1,"A","M",10000.0);
			
			
			map.put(e1,e1);
			map.put(e2,e2);
			map.put(e3,e3);
			
			System.out.println(map.size());//3
			map.put(e4,e4);
			System.out.println(map.size());//ask amey		//Assumption equals & hashCode Overridden in Employee class
			System.out.println("*******************************************************************");
			
			

			//NameSort ns=new NameSort();
			//TreeMap<Employee,Employee> map2=new TreeMap<>(ns);
			TreeMap<Employee,Employee> map2=new TreeMap<>();
			//put-> to add object
			
	
			
			map2.put(e3,e3);
			map2.put(e1,e1);
			map2.put(e2,e2);
			System.out.println(map2);
			
			System.out.println(map2.size());//3
			map2.put(e4,e4);
			System.out.println(map2.size());		//Assumption.equals & hashCode Overridden in Employee class
			
			
			
			
			
			
			
		}
}
			