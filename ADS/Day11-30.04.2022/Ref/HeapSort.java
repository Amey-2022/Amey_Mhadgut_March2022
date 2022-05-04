import java.util.Arrays;
public class HeapSort {
	public static void sort(int a1[])
	{
		int n = a1.length;

		
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(a1, n, i);
			System.out.println("MaxHeap is : "+Arrays.toString(a1));
		
		for (int i = n - 1; i > 0; i--) {
			
			int temp = a1[0];
			a1[0] = a1[i];
			a1[i] = temp;

			
			heapify(a1, i, 0);
			
		}
	}

	
	static void  heapify(int a1[], int n, int i)
	{
		int largest = i; 
		int l = 2 * i ; 
		int r = 2 * i + 1; 

		
		if (l < n && a1[l] > a1[largest])
		//if (l < n && a1[l] > a1[largest])//for descending order
			largest = l;

		
		if (r < n && a1[r] > a1[largest])
		//if (r < n && a1[r] < a1[largest])//for descending order
			largest = r;


		if (largest != i) {
			int temp = a1[i];
			a1[i] = a1[largest];
			a1[largest] = temp;

			heapify(a1, n, largest);
		}
	}

	public static void main(String args[])
	{
		//int a1[] = { 22, 11, 33, 55, 66, 77 ,99,5 };
		int a1[] = {6,3,2,1,5,4,6,3,5,5,55,6,3,6,5,5,6,8,9,8,8,99,99,966,332,1,554,2,1,1,5};
		int n = a1.length;

		
		sort(a1);

		System.out.println("Sorted heap is : "+Arrays.toString(a1));
	}
}

