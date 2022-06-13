import java.util.*;
class ArrayDemo2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int choice;
	
		do
		{
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
					System.out.println("Enter array Elements : ");
					//Insert
					for(int i = 0;i<arr.length;i++)
					{
						arr[i] = sc.nextInt();
					}
					break;
					
					
				case 2 :
					//Display
					System.out.print("Array Elements are : ");
					for(int j = 0;j<arr.length;j++)
					{
						System.out.print(arr[j]+"  ");
					}
					System.out.println("");
					break;
				
				
				case 3:
					//Search
					int k;
					System.out.print("Enter key Elements to search : ");
					int key = sc.nextInt();
					for(k = 0;k<arr.length-1;k++)
					{
						if(key == arr[k])
							break;
					}
					
					if(key == arr[k])
					{
						System.out.println("Element Found");
					}
					else
					{
						System.out.println("Element Not Found");
					}
					System.out.println("");
					break;
					
				case 4:
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
						System.out.println("Element Found");
						for(int m = l;m<arr.length-1;m++)
						{
							arr[m] = arr[m+1];
						}
					}
					else
					{
						System.out.println("Element Not Found");
					}
					System.out.println("");
					n--;
					break;
				
					
			}
			
			
		}
		while(choice!=5);
		
		
		
	}
}