import java.util.*;

class FactorialRecusive{
		static int fact(int n){
			if(n<=1)
				return 1;
			else
			 return n*fact(n-1);
		}
		

	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to print factorial: ");
		int n=sc.nextInt();
	System.out.println("Factorial is "+fact(n));
	}


}

/*
Enter a number to print factorial: 5
Factorial is 120
*/