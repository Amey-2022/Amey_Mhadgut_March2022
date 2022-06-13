import java.util.Scanner;
import java.util.Arrays;

class BubbleSort{


	public static void bubbleSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("After Each Pass: "+Arrays.toString(arr));
		}
		System.out.println("Bubble Sorted Array: "+Arrays.toString(arr));
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
		bubbleSort(arr);
		//System.out.println("Bubble Sorted Array: "+Arrays.toString(arr));
		
	}



}