/*
2. You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
		Example: 


		Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
		Output: 5
		Explanation: The missing number from 1 to 8 is 5


		Input: arr[] = {1, 2, 3, 5}
		Output: 4
		Explanation: The missing number from 1 to 5 is 4*/

class QuestionA2{
		static void missingInteger(int a[]){
			int n1=a.length+1;
			int total1=n1*(n1+1)/2;
			int total=0;
			for(int i=0;i<a.length;i++)
			{
				total+=a[i];
			}
			System.out.println(total1-total);
			System.out.println("The missing number from "+a[0]+" to "+a[a.length-1]+" is "+(total1-total));
			
			
		}
		public static void main(String []args){
			
			int arr[] = {1, 2, 4, 6, 3, 7, 8};
			int arr1[] = {1, 2, 3, 5};
			missingInteger(arr);
			missingInteger(arr1);
			
		}
}