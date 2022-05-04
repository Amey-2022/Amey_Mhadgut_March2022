import java.util.*;
class ReverseArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int rev[] = new int[size];
		
		System.out.println("Enter the array elements : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int k = 0;
		for(int j = arr.length-1;j>=0;j--)
		{
			
			rev[k] = arr[j];
			k++;
		}
		
		System.out.print("");
		System.out.print("Reverse Array  : ");
		for(int l = 0;l<arr.length;l++)
		{
			System.out.print(rev[l]+" ");
		}
		
		
	}
}