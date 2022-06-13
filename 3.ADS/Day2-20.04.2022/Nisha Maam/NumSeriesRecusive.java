import java.util.*;

class NumSeriesRecusive{
		static void series(int n){
			if(n>=1){
				series(n-1);
			System.out.print(" "+n );
			}
		}
		
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to print number series: ");
		int n=sc.nextInt();
		System.out.print("Number Series till "+n+" :");
		series(n);
	}
}


/*
Number Series till 5 : 1 2 3 4 5
*/