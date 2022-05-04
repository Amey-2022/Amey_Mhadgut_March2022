import java.util.Scanner;
import java.util.Arrays;

class SelectionSort{
	
	public static void selectionSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i] > arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				System.out.println("After Each Pass : "+Arrays.toString(arr));
			}
		}
		System.out.println("Selection Sorted Array: "+Arrays.toString(arr));
	}
	
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++){
			System.out.print("Array element"+"["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		selectionSort(arr);
	}
}