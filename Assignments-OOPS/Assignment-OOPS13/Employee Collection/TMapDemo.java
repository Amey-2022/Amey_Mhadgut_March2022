import java.util.TreeMap;
import java.util.SortedMap;

class TMapDemo{
//<Key,Value>.... map maintains uniqueness on the basis of key not value
		public static void main(String[] args){
			
			
			Employee e1=new Employee(3,"A","M",10000.0);
			Employee e2=new Employee(2,"B","F",15000.0);
			Employee e3=new Employee(1,"C","M",20000.0);
			
			TreeMap<Integer,Employee> map=new TreeMap<>();
			//put to add object
			map.put(3,e1);
			map.put(2,e2);
			map.put(1,e3);
			
			System.out.println(map); //{1=1, C, M, 20000.0, 2=2, B, F, 15000.0, 3=3, A, M, 10000.0}




			//Sorted Maps
			SortedMap<Integer,Employee> map2= map.headMap(2);
			System.out.println(map2);	//{1=1, C, M, 20000.0}
			
			
			SortedMap<Integer,Employee> map3= map.tailMap(2);
			System.out.println(map3);	//{2=2, B, F, 15000.0, 3=3, A, M, 10000.0}
			
			SortedMap<Integer,Employee> map4= map.subMap(1,3);
			System.out.println(map4);	//{1=1, C, M, 20000.0, 2=2, B, F, 15000.0}
			
			//complete code
		}
}



			/*
			{1=1, C, M, 20000.0, 2=2, B, F, 15000.0, 3=3, A, M, 10000.0}
			{1=1, C, M, 20000.0}
			{2=2, B, F, 15000.0, 3=3, A, M, 10000.0}
			{1=1, C, M, 20000.0, 2=2, B, F, 15000.0}
			*/