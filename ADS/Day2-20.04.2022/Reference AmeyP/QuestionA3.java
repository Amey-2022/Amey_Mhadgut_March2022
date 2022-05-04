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
import java.util.Scanner;
class QuestionA3{
	static void linearSearch(int []a,int key){
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Found at index "+i);
				System.out.println();
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Not found");
			System.out.println();
		}
	}
	
	
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Enter key :");
		int k=sc.nextInt();
		System.out.println();
		linearSearch(arr,k);
		}
	}
}