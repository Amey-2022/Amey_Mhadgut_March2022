//WAP to access/invoke Static variable and static method.
import java.util.*;

class MathOperations{
		static int a=10;
		static int b=20;

}

	 public class MathOperationsDemo{
		//static a=10;
		//static b=20;
		
		
		static void add(int a, int b){
			System.out.println("Addition is: "+(a+b));
		}
		
		static void sub(int a, int b){
			System.out.println("Substraction is: "+(a-b));
		}
		
		static void mul(double a, double b){
			System.out.println("Multiplication is: "+(a*b));
		}
		
		static void div(double a, double b){
			double c=(a/b);
			String d = String.format("%.10f",c);
			System.out.println("Division is: "+d);
		
		}
		
		
		public static void main(String[] args){
		add(8,5);
		sub(20,5);
		mul(15.5,1.5);
		div(167.5,7);
		add(MathOperations.a,MathOperations.b);
		}
	}
	

