import java.util.*;

class Arrayelements
{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		void insertElements()
		{
			//Insert
			
			System.out.println("Enter array Elements : ");	
			for(int i = 0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		}
		
		void displayElements()
		{
			//Display
			System.out.print("Array Elements are : ");
			for(int j = 0;j<n;j++)
			{
				System.out.print(arr[j]+"  ");
			}
			System.out.println("");
		}
		
		
		void searchElements()
		{
			//Search
			int k;
			System.out.print("Enter key Elements to search : ");
			int key = sc.nextInt();
			for(k = 0;k<n-1;k++)
			{
				if(key == arr[k])
					break;
			}
			
			if(key == arr[k])
			{
				System.out.println("Found");
			}
			else
			{
				System.out.println("Not Found");
			}
			System.out.println("");
		}
		
		void deleteElements()
		{
			//delete element
			System.out.print("Enter Elements to delete : ");
			int r = sc.nextInt();
			int l;
			
			
			for(l = 0;l<n-1;l++)
			{
				if(r == arr[l])
				break;
			}
			
			if(r == arr[l])
			{
				System.out.println("Found");
				for(int m = l;m<n-1;m++)
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
		}
		
		
		
		
}
class ArrayDemo1
{
	public static void main(String args[])
	{
		System.out.println("Enter size of array");
		Arrayelements a = new Arrayelements();
		a.insertElements();
		a.displayElements();
		a.searchElements();
		a.deleteElements();
		a.displayElements();
		
		
	}
}