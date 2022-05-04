/*
4. Move all negative numbers to beginning and positive to end with constant extra space. An array contains both positive and negative numbers in random order.    Rearrange the array elements so that all negative numbers appear before all positive numbers.
		Examples : 

		Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
		Output: -12 -13 -5 -7 -3 -6 11 6 5*/
import java.util.Scanner;
class QuestionA4{
	static void arrangePN(int []a){
		
		int j=0,temp;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				if(i!=j)
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				j++;
			}
			
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		arrangePN(arr);
		
	}
}