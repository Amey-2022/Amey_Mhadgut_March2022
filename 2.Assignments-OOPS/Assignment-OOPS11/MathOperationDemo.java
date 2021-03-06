import java.util.*;


interface MathOperation{
	double calculator(double a,double b);

}



class MathOperationDemo{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Addition 2.Substraction 3.Division 4.Multiplication 5.Modulus");
		System.out.println("Enter Your Choice Number To perform Operation");
		int n=sc.nextInt();
		
		switch(n){
		
		case 1: MathOperation ad=(c,d)->(c+d);
		
		        System.out.println("Sum: "+ad.calculator(10,20));break;
		
		case 2: MathOperation sb=(c,d)->(c-d);
		
				System.out.println("Substraction: "+sb.calculator(20,8));break;
		
		case 3:	MathOperation dv=(c,d)->{return c/d;};
		
				System.out.println("Division: "+dv.calculator(20,5));break;
		
		case 4:	MathOperation ml=(c,d)-> c*d;
		
				System.out.println("Multiplication: "+ml.calculator(14,7));break;
				
		case 5:	MathOperation mod=(c,d)-> c%d;
				
				System.out.println("Modulus: "+mod.calculator(104,5));break;
		}
		
	}
	
	
}