//Collection Assignment Question1

import java.util.*;

class CollectionQue1Demo{
				public static void main(String[] args){
					
				ArrayList<String> movielist=new ArrayList<>(); 
				
				movielist.add("Humraz");
				movielist.add("Albela");
				movielist.add("Dhoom");
				movielist.add("Barood");
				movielist.add("Masti");
				
				System.out.println(movielist);
				System.out.println("==============================");
				//to add at specific position
				movielist.add(0,"RRR");
				System.out.println(movielist);
				
				System.out.println("==============================");
				//to get specific index number object
				System.out.println(movielist.get(2));
				
				System.out.println("==============================");
				//to replace 
				movielist.set(4,"KGF");
				System.out.println(movielist);
				
				System.out.println("==============================");
				//remove specific object
				movielist.remove("Dhoom");
				//movielist.remove(3);
				System.out.println(movielist);
				
				System.out.println("==============================");
				//search for object and display index
				System.out.println(movielist.contains("Masti"));
				System.out.println(movielist.indexOf("Masti"));
				
				System.out.println("==============================");
				//sort
				Collections.sort(movielist);
				System.out.println(movielist);
				
				System.out.println("==============================");
				//reverse
				Collections.reverse(movielist);
				System.out.println(movielist);
				
				System.out.println("==============================");
				//empty
				movielist.clear();
				System.out.println(movielist);


	}
}

/*

[Humraz, Albela, Dhoom, Barood, Masti]
==============================
[RRR, Humraz, Albela, Dhoom, Barood, Masti]
==============================
Albela
==============================
[RRR, Humraz, Albela, Dhoom, KGF, Masti]
==============================
[RRR, Humraz, Albela, KGF, Masti]
==============================
true
4
==============================
[Albela, Humraz, KGF, Masti, RRR]
==============================
[RRR, Masti, KGF, Humraz, Albela]
==============================
[]

*/