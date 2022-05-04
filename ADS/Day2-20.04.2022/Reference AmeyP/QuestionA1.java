/*
1. Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

		Examples :  

		Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}
			  x = 110;
		Output : 6
		Element x is present at index 6

		Input : arr[] = {10, 20, 80, 30, 60, 50, 
				     110, 100, 130, 170}
			   x = 175;
		Output : -1
		Element x is not present in arr[].
*/
class QuestionA1{
	static void linearSearch(int []a,int key){
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println(i+"\nElement x is present at index "+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("-1\nElement x is not present in arr[]");
		}
	}
	
	public static void main(String []args){
		
		int arr[]={10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int x1=110;
		int x2=-1;
		linearSearch(arr,x1);
		linearSearch(arr,x2);
		
		
	}
}