/*
1. Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

		Examples :  

		Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}
			  x = 110;
		Output : 6
		Element x is present at index 6

		Input : arr[] = {10, 20, 80, 30, 60, 50, 
				     110, 100, 130, 170}
			   x = 175;
		Output : -1
		Element x is not present in arr[].
*/

import java.util.*;

class SearchArrayElement{
	
		static void linearSearch(int []A,int key){
			int flag=0;
			for(int i=0;i<A.length;i++){
				if(A[i]==key){
					System.out.println(key+" Element is present at index "+i);
					flag=1;
					break;
				}
			}
			
			if (flag==0){
				System.out.println(key+" Element  is not present in Array");
			}
		}
				
	public static void main(String []args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of Array:");
			int n=sc.nextInt();
			
			int A[]=new int[n];
			
			System.out.println("Enter elements of Array:");
			for(int i=0;i<n;i++){
				System.out.print("A["+i+"]= ");
				A[i]=sc.nextInt();
			}
			System.out.println("Array Elements:");
			for(int val: A){
				System.out.print(" "+val);
			}
			
			System.out.println();	
			System.out.println("Enter key Elements:");
			int key=sc.nextInt();
			
			linearSearch(A,key);
			
			
		
	}

}