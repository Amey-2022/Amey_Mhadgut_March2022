//WAP to print tables of 1-30 using a while loop.
import java.util.*;
class TableWhile{

	
	
			public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number: ");
				int n=sc.nextInt();
				System.out.println("======================");
				int i=1;
				while(i<=n){
				System.out.println("Table of "+i+":");
				int j=1;
				while(j<=10){
				System.out.println(String.format("%03d",(i))+" x "+String.format("%03d",(j))+"="+String.format("%03d",(i*j)));
				j++;
				}
				System.out.println("======================");
				i++;
				}






}
}