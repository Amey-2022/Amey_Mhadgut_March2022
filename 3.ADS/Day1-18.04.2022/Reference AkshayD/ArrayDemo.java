import java.util.*;
class ArrayDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array Elements : ");
		
		//Insert
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Display
		System.out.print("Array Elements are : ");
		for(int j = 0;j<arr.length;j++)
		{
			System.out.print(arr[j]+"  ");
		}
		System.out.println("");
		
		//Search
		int k;
		System.out.print("Enter key Elements to search : ");
		int key = sc.nextInt();
		for(k = 0;k<arr.length-1;k++)
		{
			if(key == arr[k])
				break;
		}
		
		if(arr[k] == key )
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		System.out.println("");
		
		//delete element
		System.out.print("Enter Elements to delete : ");
		int r = sc.nextInt();
		int l;
		
		
		for(l = 0;l<arr.length-1;l++)
		{
			if(r == arr[l])
			break;
		}
		
		if(r == arr[l])
		{
			System.out.println("Found");
			for(int m = l;m<arr.length-1;m++)
			{
				arr[m] = arr[m+1];
			}
		}
		else
		{
			System.out.println("Not Found");
		}
		System.out.println("");
		n--;
		
		//Display
		System.out.print("Array Elements are: ");
		for(int o = 0;o<n;o++)
		{
			System.out.print(arr[o]+"  ");
		}
		
		
	}
}