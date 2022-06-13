
/*

				// Reverse the words in a string.................

class Demo1{           
	public static void main(String []args){
	 String s = "ab cd ef gh ij kl";
	 String arr[]=s.split(" ");
	
	for(int i=arr.length-1;i>=0;i--){
		System.out.print(arr[i]+" ");
	}
	
	}
 }
 */
 



                       // Reverse the string.................
class Demo1{                            
	public static void main(String []args){
	 String s = "ECNALUBMA";
	
	for(int i=s.length()-1;i>=0;i--){
		System.out.print(s.charAt(i));
	}
	
	}
}


			         // Palindrome .............................
/*
import java.util.Scanner;       
class Demo1{           
	public static void main(String []args){
		Scanner ss = new Scanner(System.in);
	 String s = ss.nextLine();
	 char []sc = new char[s.length()];
	 
	 
	for(int j =0;j<s.length()-1;){
		for(int i=sc.length-1;i>=0;i--){
			sc[i] = s.charAt(j);
			j++;
	
		}
	
	  }
	  int count =0;
	  for(int k = 0;k<s.length();k++){
		  if(s.charAt(k)==sc[k])
			  count++;
	  }
	  if(count==s.length())
	  System.out.println("Palindrome");
  else 
	  System.out.println("Not a Palindrome");
	}
  }


/*

	          // count "10" occurs how many times.........  


/*class Demo1{  
	public static void main(String []args){
	 String s = "1010101000100001";
	 int count =0;
	 
	for(int i = 0;i<s.length()-1;i++)
		{
			char a = ;
			char b = ;
			if(s.charAt(i)=='1' && s.charAt(i+1)=='0')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

*/

						// count "101" occurs how many times.........
/*  
class Demo1{       
	public static void main(String []args){
	 String s1 = "1010101000100001";
	 int count =0;
	 
		
		for(int i = 0;i<s1.length()-2;i++)
		{
			
			if(s1.charAt(i)=='1' &&s1.charAt(i+1)=='0' && s1.charAt(i+2) =='1')
			{
				count++;
			
			}
		}
		System.out.println(count);
		
	}
}
*/