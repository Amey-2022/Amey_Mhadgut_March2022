import java.util.*;
class Palindrome{
public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		char []csa = new char[s.length()];
	 
	 
	for(int j =0;j<s.length()-1;){
	    for(int i=csa.length-1;i>=0;i--){
			csa[i] = s.charAt(j);
			j++;
			
		}
	}
	
	  int count =0;
	  for(int k = 0;k<s.length();k++){
		  if(s.charAt(k)==csa[k])
			  count++;
	  }
	  
	  if(count==s.length())
	  System.out.println("Palindrome");
	  else 
	  System.out.println("Not a Palindrome");
	}
  }