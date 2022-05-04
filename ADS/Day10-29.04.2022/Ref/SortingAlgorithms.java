//sorting algorithms
import java.util.Scanner;
class SortingAlgorithms{
	
	public void setArray(int []a){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\tArray Element["+i+"] : ");
			a[i]=sc.nextInt();
		}
	}
	
	public void getArray(int []a){
		System.out.println();
		System.out.print("\t");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
	
	public void bubbleSort(int []a){
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		getArray(a);
	}
	
	public void insertionSort(int []a){
		int j=0,temp=0;
		for(int i=1;i<a.length;i++)
		{
		  temp=a[i];
		  j=i-1;
			  while(j>=0 && a[j]>temp)
			  {
				  a[j+1]=a[j];
				  j--;
			  }
		  a[j+1]=temp;
		}
	getArray(a);
	}
	
	public void mergeSort(int []a,int lb, int ub){
		int mid=0;
		if(lb<ub)
		{
			mid=(lb+ub)/2;
			mergeSort(a,lb,mid);
			mergeSort(a,mid+1,ub);
			merge(a,lb,mid,ub);
		}
		
	}
	
	public void merge(int a[],int lb,int mid,int ub){
		int i,j,k;
		int []b=new int[a.length];
		i=lb;
		j=mid+1;
		k=lb;
		while(i<=mid && j<=ub)
		{
			if(a[i]<=a[j])
			{
				b[k]=a[k];
				i++;
			}
			else{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k]=a[i];
				i++;
				k++;
			}
		}
		for(k=lb;k<=ub;k++)
		{
			a[k]=b[k];
		}
		
	}
	
	public void quickSort(int []a){
		
	}
	
	public void selectionSort(int []a){
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					min=j;
				}
					temp=a[i];
					a[i]=a[min];
					a[min]=temp;
			}
					
		}
		getArray(a);
	}
	
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	
	SortingAlgorithms s=new SortingAlgorithms();
	System.out.print("\tEnter size of array : ");
	int n=sc.nextInt();
	int []arr=new int[n];
	
	s.setArray(arr);
	System.out.println();
	int ch=1;
		while(ch==1){
			System.out.println("\t==========================================================================================");
			System.out.print("\t0.Exit\n\t1.Display\t2.Bubble sort\t3.Insertion sort\t4.Merge sort\t5.Quick sort\n\t6.Selection sort\n\tEnter Choice : ");
			int choice=sc.nextInt();
			System.out.println("\t==========================================================================================");
			
			switch(choice){
				case 0 : ch=0;
						 break;
				case 1 : s.getArray(arr);
						 break;
				case 2 : s.bubbleSort(arr);
						 break;
				case 3 : s.insertionSort(arr);
						 break;
				case 4 : s.mergeSort(arr,0,arr.length-1);
						 s.getArray(arr);
						 break;
				case 5 : s.quickSort(arr);
						 break;
				case 6 : s.selectionSort(arr);
						 break;
				default :System.out.println("\tInvalid number");
			}
		}
	}
}