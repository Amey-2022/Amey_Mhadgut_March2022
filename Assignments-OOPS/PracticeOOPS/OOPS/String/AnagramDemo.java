//2. Anagram string
import java.util.*;

class AnagramDemo{
			public static void main(String... args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first String: ");
			String s1=sc.nextLine();
			System.out.println("Enter second String: ");
			String s2=sc.nextLine();
			
			if(anagramCheck(s1,s2)){
			System.out.println(s1+" and "+s2+" are Anagrams");
			}
			else{
				System.out.println(s1+" and "+s2+" are Not Anagrams"); 
			}
		}



public static boolean anagramCheck(String s1,String s2){
	
			s1=s1.replaceAll("\\s","").toLowerCase();
			s2=s2.replaceAll("\\s","").toLowerCase();
			
			if(s1.length() != s2.length()){
				return false;
			}
				
			
			else{	
			ArrayList<Character> list1=new ArrayList<>();
			ArrayList<Character> list2=new ArrayList<>();
			
			
			for(int i=0;i<s1.length();i++){
				list1.add(s1.charAt(i));
			}
			
			for(int i=0;i<s2.length();i++){
				list2.add(s2.charAt(i));
			}
			
			Collections.sort(list1);
			Collections.sort(list2);
			
			if (list1.equals(list2))
				return true;
			else
				return false;
		}
	}
}