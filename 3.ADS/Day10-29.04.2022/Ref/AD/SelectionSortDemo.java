import java.util.Scanner;
import java.util.Arrays;
class SelectionSortDemo
{
	public static void selectionSort(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
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