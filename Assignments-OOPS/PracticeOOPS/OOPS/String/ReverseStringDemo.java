//1. Reverse the string
import java.util.*;

class ReverseStringDemo{
			public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String to reverse:");
			String s1=sc.nextLine();
			String rev="";
			System.out.println();
			
			
			for(int i=s1.length()-1;i>=0;i--){
				 
				rev=rev+s1.charAt(i);
			}
			System.out.println("Reverse String is: "+rev);
			}

}