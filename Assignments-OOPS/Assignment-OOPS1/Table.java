//WAP  to print tables of 1-30 using 2 for loops and also try to print using single for loop.
import java.util.*;
class Table{

	
	
			public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number: ");
				int n=sc.nextInt();
				System.out.println("======================");
				for(int i=1;i<=n;i++){
				System.out.println("Table of "+i+":");
				for(int j=1;j<=10;j++){
				System.out.println(i+" x"+" "+j+"="+(i*j));
				}
				System.out.println("======================");
				}






}
}