//4. Write a program to print the Fibonacci series with Java and recursion
import java.util.Scanner;

class FibbonaciRecursive{
	static long n1=0,n2=1,n3=0;
	
	static void fibo(long n){
		
		if(n>0){      
             n3 = n1 + n2;      
             n1 = n2;      
             n2 = n3;      
             System.out.print(" "+n3);     
             fibo(n-1);      
         } 
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		long n=sc.nextInt();
		
		System.out.print(n1+" "+n2);
		fibo(n-2);
	}
}

/*

Enter Number : 10
0 1 1 2 3 5 8 13 21 34
*/