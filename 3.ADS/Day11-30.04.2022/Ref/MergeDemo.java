import java.util.Scanner;
import java.util.Arrays;
class MergeDemo
{
	public static void mergeSort(int []arr,int lb, int ub)
	{
		int mid=0;
		if(lb<ub)
		{
			
			//1.divide array into two equal part
			mid=(lb+ub)/2;
			//2.sort lb partition [arr,lb,mid]
			mergeSort(arr,lb,mid);
			//3.sort ub partition [arr,mid+1,ub]
			mergeSort(arr,mid+1,ub);
			
			merge(arr,lb,mid,ub);
		}
		
	}
	
	public static void merge(int arr[],int lb,int mid,int ub)
	{
		int i,j,k;
		//4.create temp array to accomodate both partitions
		int []temp=new int[arr.length];
		//5.merge two sorted partitions into temp array
		i=lb;
		j=mid+1;
		k=lb;
	
		//5.1 compare elements from both partitions and copy the smaller one (until any one partiton done)
		while(i<=mid && j<=ub)
		{
			if(arr[i]<=arr[j])
			{
				temp[k]=arr[k];
				i++;
			}
			else{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		//copy remaining element from other partion
		if(i>mid)
		{
			while(j<=ub)
			{
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				temp[k]=arr[i];
				i++;
				k++;
			}
		}
		
		//6.overwrite temp array back to origial array
		for(k=lb;k<=ub;k++)
		{
			arr[k]=temp[k];
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

		mergeSort(arr,0,arr.length-1);

		System.out.println("After sorting : "+Arrays.toString(arr));


	}
}