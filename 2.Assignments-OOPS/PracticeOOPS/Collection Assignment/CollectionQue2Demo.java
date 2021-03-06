//Collection Assignment Question2

import java.util.*;

class CollectionQue2Demo{
				public static void main(String[] args){
				LinkedList<String> namelist=new LinkedList<>();
				LinkedList<String> namelist2=new LinkedList<>();
				LinkedList<String> namelist3=new LinkedList<>();
				namelist.add("Amey");
				namelist.add("Babloo");
				namelist.add("Raju");
				namelist.add("Mahesh");
				namelist.add("Ganesh");
				
				namelist2.add("Rohit");
				namelist2.add("Viru");
				namelist2.add("Sachin");
				namelist2.add("Chris");
				namelist2.add("David");
				
				namelist3.add("Rohit");
				namelist3.add("Viru");
				namelist3.add("Sachin");
				namelist3.add("Chris");
				namelist3.add("David");
				System.out.println(namelist);
				
				System.out.println("==============================");
				//1.itrate through start at specified position
				Iterator a=namelist.listIterator(2);
				while(a.hasNext())
				{
					System.out.print(a.next()+", ");
				}
				
				System.out.println();
				System.out.println("==============================");
				//2.Reverse list
				Collections.reverse(namelist);
				System.out.println(namelist);
				
				System.out.println("==============================");
				//3.to add specified element at specified position
				namelist.add(2,"Jitu");
				System.out.println(namelist);
				
				System.out.println("==============================");
				//4.to add at first and last position
				namelist.addFirst("Sanjay");
				namelist.addLast("Yash");
				System.out.println(namelist);
				
				
				System.out.println("==============================");
				//5.to add at front of linked list
				namelist.add(0,"Rakesh");
				System.out.println(namelist);
				
				System.out.println("==============================");
				//6.to add some elements at specified position
				namelist.add(3,"Gaurav");
				System.out.println(namelist);
				
				System.out.println("==============================");
				//7.Get  first and last occurance
				System.out.println(namelist.get(0));
				System.out.println(namelist.getLast());
				System.out.println(namelist.indexOf("Yash"));
				
				System.out.println("==============================");
				//8.Remove first & last element
				System.out.println(namelist.removeFirst());
				System.out.println(namelist.removeLast());
				System.out.println(namelist);
				
				System.out.println("==============================");
				//9.Swap 2 element
				Collections.swap(namelist,2,7);
				System.out.println(namelist);
				
				System.out.println("==============================");
				//10.join 2 linkedlist
				namelist.addAll(namelist2);
				System.out.println(namelist);
				
				System.out.println("==============================");
				//11.check particlar element exist
				System.out.println(namelist.contains("Mahesh"));
				System.out.println(namelist2.contains("Ganesh"));
				
				System.out.println("==============================");
				//12.convert linkedlist to arraylist
				ArrayList<String> con=new ArrayList<>(namelist);
				System.out.println(con);
				
				System.out.println("==============================");
				//13.Compare two linkedlist
				System.out.println(namelist.equals(namelist3));
				System.out.println(namelist2.equals(namelist2));
				
				System.out.println("==============================");
				//13.check list is empty or not
				namelist3.clear();
				System.out.println(namelist.isEmpty());
				System.out.println(namelist3.isEmpty());
				
				System.out.println("==============================");
				//14.Replace element
				System.out.println(namelist);
				namelist.set(4,"Jhon");
				namelist.set(6,"Hitesh");
				System.out.println(namelist);
				
				
	}
}				


/*

[Amey, Babloo, Raju, Mahesh, Ganesh]
==============================
Raju, Mahesh, Ganesh,
==============================
[Ganesh, Mahesh, Raju, Babloo, Amey]
==============================
[Ganesh, Mahesh, Jitu, Raju, Babloo, Amey]
==============================
[Sanjay, Ganesh, Mahesh, Jitu, Raju, Babloo, Amey, Yash]
==============================
[Rakesh, Sanjay, Ganesh, Mahesh, Jitu, Raju, Babloo, Amey, Yash]
==============================
[Rakesh, Sanjay, Ganesh, Gaurav, Mahesh, Jitu, Raju, Babloo, Amey, Yash]
==============================
Rakesh
Yash
9
==============================
Rakesh
Yash
[Sanjay, Ganesh, Gaurav, Mahesh, Jitu, Raju, Babloo, Amey]
==============================
[Sanjay, Ganesh, Amey, Mahesh, Jitu, Raju, Babloo, Gaurav]
==============================
[Sanjay, Ganesh, Amey, Mahesh, Jitu, Raju, Babloo, Gaurav, Rohit, Viru, Sachin, Chris, David]
==============================
true
false
==============================
[Sanjay, Ganesh, Amey, Mahesh, Jitu, Raju, Babloo, Gaurav, Rohit, Viru, Sachin, Chris, David]
==============================
false
true
==============================
false
true
==============================
[Sanjay, Ganesh, Amey, Mahesh, Jitu, Raju, Babloo, Gaurav, Rohit, Viru, Sachin, Chris, David]
[Sanjay, Ganesh, Amey, Mahesh, Jhon, Raju, Hitesh, Gaurav, Rohit, Viru, Sachin, Chris, David]

*/