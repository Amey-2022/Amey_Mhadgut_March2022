import java.util.*;

class UniqueArrayList{
			public static void main(String[] args){
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(10);
			list.add(10);
			list.add(20);
			list.add(40);
			list.add(20);
			list.add(30);
			list.add(30);
			
			System.out.println(list);
			
			LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(list);
			System.out.println("LHS"+set);
			
			ArrayList<String> list1=new ArrayList<String>();
			list1.add("A");
			list1.add("B");
			list1.add("C");
			list1.add("A");
			list1.add("B");
			list1.add("A");
			list1.add("C");
			
			System.out.println(list1);
			
			HashSet<String> set1=new HashSet<String>(list1);
			System.out.println(set1);
			
		}
}