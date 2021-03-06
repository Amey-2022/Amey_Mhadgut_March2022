/*
3. Search an element in a sorted and rotated array.

		Example: 

		Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
			 key = 3
		Output : Found at index 8

		Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
			 key = 30
		Output : Not found

		Input : arr[] = {30, 40, 50, 10, 20}
			key = 10   
		Output : Found at index 3*/
		
		
import java.util.*;

class SortedRotetedArray{
	
		static void linearSearch(int []A,int key){
			int i=0;
			for( i=0;i<A.length-1;i++){
				
				if(A[i]==key)
					break;			
			}
				if(A[i]==key)
				System.out.println(key+" found at index "+i);
				if(A[i]!=key)
					System.out.println(key+" not found in array");	
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
				System.out.print(" "+val);
			}
			
			System.out.println();
			System.out.println("Enter key to search: ");
			int key=sc.nextInt();
			
			linearSearch(A,key);
		}
}
