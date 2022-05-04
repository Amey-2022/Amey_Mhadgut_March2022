/*
4. Move all negative numbers to beginning and positive to end with constant extra space. An array contains both positive and negative numbers in random order.    Rearrange the array elements so that all negative numbers appear before all positive numbers.
		Examples : 

		Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
		Output: -12 -13 -5 -7 -3 -6 11 6 5*/
		
import java.util.*;
class NegPosSort{
		
		static void negPosSort(int A[]){
			int j=0,temp;
			for(int i=0;i<A.length;i++){
				if(A[i]<0)
				{
					if(i!=j)
					{
						temp=A[i];
						A[i]=A[j];
						A[j]=temp;
					}
					j++;	
				}
			}
			System.out.println();
			System.out.println("Sorted Negative to postive:");
			for(int k=0;k<A.length;k++){
				System.out.print(A[k]+" ");
			}
			
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
			negPosSort(A);
			
		}
			


}