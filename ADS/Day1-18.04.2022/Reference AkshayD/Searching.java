/*
1.Linear /Sequential Search
2.Binary Search
*/
class Searching{
	
	public static void LinearSearch(int a[],int key){
		int flag=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
			if(a[i]==key)
			{
				System.out.println("Key "+key+" is found at index "+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("Key "+key+" is not found in given Array ");
		System.out.println("Number of Steps : "+count);
	}
	
	public static int BinarySearch(int a[],int key){
		int mid=0,left=0,right=a.length-1;
		int count=0;
		while(left<=right)
		{
			count++;
			mid=(left+right)/2;
			if(key==a[mid])
			{	
				System.out.println("Number of Steps : "+count);
				return mid;
			}	
			else if(key<a[mid])
				right=mid-1;
			else
				left=mid+1;
				
		}
		return -1;
		
	}
	
	public static void main(String []args){
		int []arr={10,20,30,40,50,60,70,80,90,100};
		int key=80;     //Average case
		//int key=10;  //Best case for Linear Search
		//int key=50;  //Best case for Binary Search
		System.out.println("\n\nLinear Search : ");
		LinearSearch(arr,key);
		
		System.out.println("\nBinary Search : ");
		int result=BinarySearch(arr,key);
		if(result<arr.length && result>=0)
			System.out.println("Key "+key+" is found at index "+result);
		else
			System.out.println("Key "+key+" is not found in given Array ");
	}
}