//Collection Assignment Question4

import java.util.*;

class CollectionQue4Demo{
				public static void main(String[] args){
				
				TreeSet<String> set=new TreeSet<>();
				
				set.add("Watermelon");
				set.add("Mango");
				set.add("Apple");
				set.add("Cherry");
				set.add("Grapes");
				
				System.out.println(set.size());
				System.out.println(set);
				
				System.out.println("==============================");
				//Iterate
				for(String s:set){
				System.out.print(s+" ");
				}
				
				System.out.println();
				System.out.println("==============================");
				//add all elements to other set
				TreeSet<String> set1=new TreeSet<>();
				set1.addAll(set);
				System.out.println(set1);
				
				System.out.println("==============================");
				//reverse treeset
				System.out.println(set.descendingSet());
				
				TreeSet<Integer> set2=new TreeSet<>();
				set2.add(5);
				set2.add(1);
				set2.add(9);
				set2.add(4);
				set2.add(12);
				set2.add(3);
				set2.add(6);
				set2.add(7);
				set2.add(8);
				set2.add(2);
				set2.add(11);
				System.out.println(set2.size());
				System.out.println(set2);
				
				//numbers less than 7
				System.out.println(set2.headSet(7));
				
	}
}

/*

5
[Apple, Cherry, Grapes, Mango, Watermelon]
==============================
Apple Cherry Grapes Mango Watermelon
==============================
[Apple, Cherry, Grapes, Mango, Watermelon]
==============================
[Watermelon, Mango, Grapes, Cherry, Apple]
11
[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12]
[1, 2, 3, 4, 5, 6]


*/