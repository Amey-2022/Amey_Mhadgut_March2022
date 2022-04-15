//3. Count duplicate character

import java.util.*;

class DuplicateCharDemo{
			public static void main(String... args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String: ");
			String s1=sc.nextLine();
			
			
			HashMap<Character,Integer> charmap=new HashMap<>();
			char[] ar=s1.toCharArray();
			
			for(char value: ar){
				if(Character.isAlphabet(value)){
					if(charMap.containsKey(value)){
						charMap.put(value,charMap.get(value)+1);
					}else{
						charMap.put(value,1);
						
					}
				}
			}
				
			System.out.println(charMap);	
			
			
			
	}		
}