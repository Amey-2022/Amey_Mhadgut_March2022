//5. Palindrome String


import java.util.*;

class PalindromeStringDemo{
			public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String to reverse:");
			String s1=sc.nextLine();
			String rev="";
			String t=s1;
			System.out.println();
			
			
			for(int i=s1.length()-1;i>=0;i--){
				 
				rev=rev+s1.charAt(i);
			}
	
			if(t.equals(rev))
			System.out.println("String is Plaindrome");
			else
			System.out.println("String is NOT a Plaindrome");
	}
}