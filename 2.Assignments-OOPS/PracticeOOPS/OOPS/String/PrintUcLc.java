//4. Print uppercase & lowercase letters

import java.util.*;

class PrintUcLc{
			public static void main(String... args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String: ");
			String s1=sc.nextLine();

			char[] ar=s1.toCharArray();
			
			System.out.print("Upper Case Letters: ");
			for(int i=0;i<ar.length;i++){
				if(ar[i]>=65 && ar[i]<=90)
				{
					System.out.print(" "+ar[i]);
				}
			}
			
			System.out.println();
			
			System.out.print("Lower Case Letters: ");
			for(int i=0;i<ar.length;i++){
				if(ar[i]>=97 && ar[i]<=122)
				{
					System.out.print(" "+ar[i]);
				}
			}
			
				
	}

}