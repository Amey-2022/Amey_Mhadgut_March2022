//sorting algorithms

import java.util.Scanner;
import java.util.Arrays;
class SortingAlgorithms{

	public void setArray(int arr[]){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
		System.out.print("Array Element["+i+"]: ");
		arr[i]=sc.nextInt();	
		}
	}
	
	
	public void getArray(int arr[]){
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public void bubbleSort(int arr[]){
		int temp=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		getArray(arr);
	}
	
	
	public void insertionSort(int arr[]){
		int j=0,temp=0;
		for(int i=0;i<arr.length;i++){
			temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		getArray(arr);
	}
	
	
	public void selectionSort(int arr[]){
		int temp=0;
		int i=0;
		for( i=0;i<arr.length-1;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			
			
			
		}
		getArray(arr);
	}
	
	
	public void quickSort(int arr[],int low,int high){
		if(low < high){
			int p=partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
		getArray(arr);
	}
	
	int partition(int arr[],int low,int high){
		int p=low,j;
		for(j=low+1;j<=high;j++)
			if(arr[j]<arr[low])
				swap(arr,++p,j);
			
			swap(arr,low,p);
			return p;	
	}
		
	public void swap(int []arr,int low,int pivot){
		int temp = arr[low];
		arr[low] = arr[pivot];
		arr[pivot] = temp;
	}	
		
	
	
	public  void mergeSort(int arr[]){
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
		
		public  void merge(int []arr,int []left_half,int []right_half){
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
	
	
	/*
	public void quickSort(int []arr, int low, int high){
		if(low < high){
        int p = partition(arr, low, high);
        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);
	}
	}
	
	int partition(int[]arr,int low,int high){
		int p = low, j;
		for(j=low+1; j <= high; j++)
			if(arr[j] < arr[low])
				swap(arr, ++p, j);

		swap(arr, low, p);
		return p;
	} 
	
	public void swap(int []arr,int low,int pivot){
		
		int tmp = arr[low];
		arr[low] = arr[pivot];
		arr[pivot] = tmp;
	}
	*/
	
	
	
	
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		SortingAlgorithms s=new SortingAlgorithms();
		
		System.out.println("Enter Size of Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		
		
		s.setArray(arr);
		System.out.println();
		int choice;
		
		
		do{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.print("0.Exit\t1.Display Array\t2.Bubble Sort\t3.Insertion Sort\t4.Selection Sort\t5.Quick Sort\t6.\t\t\t\n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.print("Enter choice: ");
			choice=sc.nextInt();
			
			switch(choice){
				case 1:	s.getArray(arr);
						break;
				case 2:	s.bubbleSort(arr);
						break;
				case 3:	s.insertionSort(arr);
						break;
				case 4:	s.selectionSort(arr);
						break;
				case 5:	s.quickSort(arr,0,arr.length-1);
						break;
				case 6:	s.mergeSort(arr);
						System.out.println(Arrays.toString(arr));
						break;
				
				
				
				
				
			}
			
			
			
			
		}while(choice!=0);
		
		
		
		
	}



}








/*
public class MergeSort {
    static void sort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;

        int[] left_half = new int[mid];
        int[] right_half = new int[arr.length - mid];

        // copying the elements of array into left_half
        for (int i = 0; i < mid; i++) {
            left_half[i] = arr[i];
        }
        
        // copying the elements of array into right_half
        for (int i = mid; i < arr.length; i++) {
            right_half[i - mid] = arr[i];
        }

        sort(left_half);
        sort(right_half);
        merge(arr, left_half, right_half);
    }
  
    static void merge(int[] arr, int[] left_half, int[] right_half) {
        int i = 0, j = 0, k = 0;

        while (i < left_half.length && j < right_half.length) {
            if (left_half[i] < right_half[j]) {
                arr[k++] = left_half[i++];
            }
            else {
                arr[k++] = right_half[j++];
            }
        }
        while (i < left_half.length) {
            arr[k++] = left_half[i++];
        }
        while (j < right_half.length) {
            arr[k++] = right_half[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 8, 0, 1, 5, 7, 2, 8, 9, -7, 4, -9, -3, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


*/