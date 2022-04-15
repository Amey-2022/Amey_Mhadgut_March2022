import java.util.LinkedHashSet;

class LinkedHashSetDemo{
			public static void main(String... args){
			LinkedHashSet<Integer> set=new LinkedHashSet<>();
			set.add(14);
			set.add(11);
			set.add(13);
			set.add(14);
			
			System.out.println(set.size());//3
			System.out.println(set); //[14, 11, 13] following order & uniqueness
			
			set.add(null);
			System.out.println(set.size()); //4
			System.out.println(set);   //[14, 11, 13, null]
			
			set.remove(14); //Set never works on index
			System.out.println(set); //[11, 13, null]
			
			System.out.println(set.contains(14));  //false
			System.out.println(set.contains(13));  //true
			
			}



}