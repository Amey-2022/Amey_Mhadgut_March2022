//2. Write a program to sum a series of numbers with Java recursion 
import java.util.Scanner;
class Question2{
	static int sum(int n){
		int s=0;
		if(n==1)
			return n;
		else
		
			s=n+sum(n-1);
			return s;
		
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		
		System.out.print("Sum of Numbers : ");
		int result = sum(num);
		System.out.print(result+" ");
	}
}