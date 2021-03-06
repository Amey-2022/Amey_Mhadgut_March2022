/*
1.Linear /Sequential Search
2.Binary Search
*/

class BSLSDemo{
		public static void linearSearch(int a[],int key){
			int flag=0; int count=0;
			for(int i=0;i<a.length;i++){
				count++;
				if(a[i]==key)
				{
					System.out.println("Key "+key+" is at index number "+i);
					System.out.println("Number of steps: "+count);
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("Key "+key+" NOT found");
				System.out.println("Number of steps: "+count);
			}
		}
		
		public static int binarySearch(int a[],int key){
			int mid=0,left=0,right=a.length-1,count=0;
			
			while(left<=right){
				
				count++;
				mid=(left+right)/2;
				if(key==a[mid]){
					System.out.println("Number of steps: "+count);
					return mid;
				}
				else if(key<a[mid])
					right=mid-1;
				else
					left=mid+1;	
				}
				System.out.println("Number of steps: "+count);
				return -1;		
			}
		
		
		public static void main(String []args){
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		//int key=50; //best case for BS
		//int key=10;	//best case for LS
		int key=80;	//Avg Case
		
		System.out.println("Linear Search : ");
		linearSearch(arr,key);
		
		System.out.println("\nBinary Search : ");
		int result=binarySearch(arr,key);
		if (result<arr.length && result>0)
			System.out.println("Key "+key+" is at index number "+result);
		else
			System.out.println("Key "+key+" NOT found");
		}
}
		
		
			

/*
Linear Search :
Key 10 is at index number 0
Number of steps: 1

Binary Search :
Number of steps: 3
Key 10 NOT found


Linear Search :
Key 50 is at index number 4
Number of steps: 5

Binary Search :
Number of steps: 1
Key 50 is at index number 4



Linear Search :
Key 80 is at index number 7
Number of steps: 8

Binary Search :
Number of steps: 2
Key 80 is at index number 7

*/
