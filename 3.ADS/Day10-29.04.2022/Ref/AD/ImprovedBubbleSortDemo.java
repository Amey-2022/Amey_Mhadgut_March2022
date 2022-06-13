//optimize solution of Bubble sort
import java.util.Scanner;
import java.util.Arrays;
class ImprovedBubbleSortDemo
{
	public static void selectionSort(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean swapFlag = false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapFlag = true;
				}
			}
			System.out.println("After Each Pass : "+Arrays.toString(arr));
			if(!swapFlag)
				break;
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