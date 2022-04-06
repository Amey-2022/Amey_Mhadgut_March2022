import java.util.*;


class MathOperation{
	public static void main(String... args){
		
		
		double a[]=new double[args.length];
		double sum=0;double avg=0;
		try{
			
		for(int i=0;i<args.length;i++){
			a[i]=Double.parseDouble(args[i]);
			
			sum=sum+a[i];
			
			avg=sum/args.length;
		}
		System.out.println("Sum of numbers:"+sum);
		System.out.println("Avg:"+avg);
			
		}catch(NumberFormatException e){
			System.out.println("Invalid number input");
			e.printStackTrace();
		}finally{
			System.out.println("Resource released");
		}
		
		//System.out.println("After");
		
		
		
		
		
		
		
		
		
	}
}



/*output


C:\Users\Amey Mhadgut\Documents>java MathOperation 12 15 18
Sum of numbers:45.0
Avg:15.0
Resource released



C:\Users\Amey Mhadgut\Documents>java MathOperation 12 15 15.8 45.2 55.7 14.3
Sum of numbers:158.0
Avg:26.333333333333332
Resource released




C:\Users\Amey Mhadgut\Documents>java MathOperation 12 15 a 41 d
Invalid number input
java.lang.NumberFormatException: For input string: "a"
        at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        at java.base/java.lang.Double.parseDouble(Double.java:651)
        at MathOperation.main(MathOperation.java:13)
Resource released



*/