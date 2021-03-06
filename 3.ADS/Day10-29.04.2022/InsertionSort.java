import java.util.Scanner;
import java.util.Arrays;

class InsertionSort{
	
	public static void insertionSort(int arr[]){
		
		for(int i=1;i<arr.length;i++){
			int temp=arr[i];int j;
			for(j=i-1;j>=0 && arr[j]> temp;j--){
					arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
				System.out.println("After Each Pass : "+Arrays.toString(arr));
			}
		
		System.out.println("Insertion Sorted Array: "+Arrays.toString(arr));
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
		insertionSort(arr);
	}
}