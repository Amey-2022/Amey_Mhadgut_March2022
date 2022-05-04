//optimize solution of Bubble sort
import java.util.Scanner;
import java.util.Arrays;
class InsertionSortDemo
{
	public static void selectionSort(int arr[])
	{
		//6 4 2 8 3 1 
		for(int i=1;i<arr.length;i++)
		{
			
			int j,temp = arr[i];
			for(j=i-1;j>=0 && arr[j] > temp;j--)
			{
				arr[j+1] = arr[j];
				
			}
			
			arr[j+1] = temp;
			System.out.println("After Each Pass : "+Arrays.toString(arr));
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.print("Enter the elements : ");
		for(int i=0;i<6;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		
		selectionSort(arr);
		
		System.out.println("After sorting : "+Arrays.toString(arr));
		
		
	}
}