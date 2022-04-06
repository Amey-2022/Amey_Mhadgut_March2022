import java.util.*;


class ArrayIndexOOB{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in Array: ");
		int n=sc.nextInt();
	
		int a[]=new int [n];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<a.length;i++){
			 a[i]=sc.nextInt();
		}
		
		System.out.println("Enter array element which you want to access: ");
		int k=sc.nextInt();
		try{
			System.out.println();
			System.out.println("You Accessed:"+a[k]);
			System.out.println("The Array element successfully accessed");
		}catch(IndexOutOfBoundsException e){
		e.printStackTrace();
		}finally{
			System.out.println("Resource released");
		}
		
	}
}	
		
	

/*
output	

Enter the number of elements in Array:
3
Enter Array Elements:
4
5
6
Enter array element which you want to access:
2

You Accessed:6
The Array element successfully accessed
Resource released






Enter the number of elements in Array:
3
Enter Array Elements:
4 5 6
Enter array element which you want to access:
6

java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 3
        at ArrayIndexOOB.main(ArrayIndexOOB.java:20)
Resource released
*/


