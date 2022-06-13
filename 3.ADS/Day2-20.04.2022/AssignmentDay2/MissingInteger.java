/*
2. You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
		Example: 


		Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
		Output: 5
		Explanation: The missing number from 1 to 8 is 5


		Input: arr[] = {1, 2, 3, 5}
		Output: 4
		Explanation: The missing number from 1 to 5 is 4*/

import java.util.*;
		
class MissingInteger{
	
	static void missingInteger(int A[]){
		int n1=A.length+1;
		int total1=(n1*(n1+1))/2;
		int total=0;
		
		for(int i=0;i<A.length;i++){
			total=total+A[i];
		}
		
		System.out.println(total1-total);
		
		System.out.println();
		System.out.println("The missing number from "+A[0]+" to "+A[A.length-1]+" is "+(total1-total));
		
	}
	
	


	public static void main(String []args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of Array:");
			int n=sc.nextInt();
			
			int A[]=new int[n];
			
			System.out.println();
			System.out.println("Enter elements of Array:");
			for(int i=0;i<n;i++){
				System.out.print("A["+i+"]= ");
				A[i]=sc.nextInt();
			}
			System.out.println();
			System.out.println("Array Elements:");
			for(int val: A){
				System.out.print(" "+val+" ");
			}
			
			missingInteger(A);
	}
			
}