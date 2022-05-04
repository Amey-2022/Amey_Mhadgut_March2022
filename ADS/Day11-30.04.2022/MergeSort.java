import java.util.Scanner;
import java.util.Arrays;

class MergeSort{


		public static void mergeSort(int arr[]){
			if(arr.length<2) {
				return;
			}
			
			int mid=arr.length/2;
			
			int []left_half=new int[mid];
			int []right_half=new int[arr.length-mid];
			
			for(int i=0;i<mid;i++){
				left_half[i]=arr[i];
			}
			
			for(int i=mid;i<arr.length;i++){
				right_half[i-mid]=arr[i];
			}
			
			
			mergeSort(left_half);
			mergeSort(right_half);
			merge(arr,left_half,right_half);
		}
		
		public static void merge(int []arr,int []left_half,int []right_half){
			int i=0,j=0,k=0;
			
			while(i< left_half.length && j<right_half.length){
				if(left_half[i]< right_half[j]){
					arr[k]=left_half[i];
					i++;
				}else{
					arr[k]=right_half[j];
					j++;
				}
				k++;
			}
			while(i<left_half.length){
				arr[k]=left_half[i];
				k++;
				i++;
			}
			
			while(j<right_half.length){
				arr[k]=right_half[j];
				k++;
				j++;
			}
				
				
				
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
		mergeSort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
	
	}
}