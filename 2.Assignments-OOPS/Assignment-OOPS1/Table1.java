import java.util.*;
class Table1{

	
	
			public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number: ");
				int n=sc.nextInt();
				System.out.println("======================");
				int i=1;
				while(i<=n){
				System.out.println("Table of "+i+":");
				for(int j=1;j<=10;j++){
				System.out.println(i+" x"+" "+j+"="+(i*j));
				}
				System.out.println("======================");
				i++;
				}






}
}