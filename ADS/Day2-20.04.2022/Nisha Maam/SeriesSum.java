//2. Write a program to sum a series of numbers with Java recursion 
import java.util.*;

class SeriesSum{
	
	static int sum(int n){
		int s=0;
		if(n==1)
			return n;
		
		else		
			s=n+sum(n-1);
			return s;
		
	}
	
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to print sum of series: ");
		int n=sc.nextInt();
		int result=sum(n);
		System.out.print("Sum of series till "+n+" is: "+result);
		
	}
}


/*
Enter a number to print sum of series: 10
Sum of series till 10 is: 55
*/