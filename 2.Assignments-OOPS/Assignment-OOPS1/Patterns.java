//WAP to print * patterns using for loop and while loop. (Right angle triangle, Equilateral triangle, K pattern, X pattern
import java.util.*;
class Patterns{

			
			
			
			static void ratriangle(){	
			System.out.println("Right Angle Trianlge");
			System.out.println();
			for(int i=1;i<=8;i++){
			for(int j=1;j<=i;j++){
			 System.out.print(" *");
			}
			 System.out.println();
			}
			}
			
			static void eqtriangle(){
			System.out.println("Equilateral Trianlge");
			System.out.println();
			for(int i=1;i<=9;i++){
				for(int space=8;space>=i;space--){
				System.out.print(" ");	
				}
			for(int j=1;j<=i;j++){
			 System.out.print(" *");
			}
			 System.out.println();
			}
			}

			static void kpattern(){
			System.out.println("K-Pattern");
			System.out.println();
			for(int i=1;i<=9;i++){
			for(int j=9;j>=i;j--){
			if(j==9 || j==i )	
			    System.out.print(" *");
			else
				System.out.print("  ");
			}
			 System.out.println();
			}
					
			for(int i=2;i<=9;i++){
			for(int j=1;j<=i;j++){
			if(j==1 || j==i )	
			    System.out.print(" *");
			else
				System.out.print("  ");
			}
			 System.out.println();
			}
			}
			
			static void xpattern(){
			System.out.println("X-Pattern");
			System.out.println();
			for(int i=1;i<=13;i++){
			for(int j=1;j<=13;j++){
				if(j==i || j==14-i)
				System.out.print("*");
			else
				System.out.print(" ");
			}
				System.out.println();
			}
			}
			
			public static void main(String[] args){
			ratriangle();
			eqtriangle();
			kpattern();
			xpattern();
			
}
}