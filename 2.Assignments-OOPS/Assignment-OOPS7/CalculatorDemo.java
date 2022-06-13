class Calculator{
		
		static double powerInt(int a,int b){
			
		double result1=Math.pow(a,b);
			return result1;
			
		}

		static double powerDouble(double n1,int n2){
			
		double result2=Math.pow(n1,n2);
			return result2;

		}
}

	class CalculatorDemo{
			public static void main(String[] args){
				
			double res=Calculator.powerInt(12,10);
			System.out.println(res);
			
			System.out.println("=============");
			
			double res1=Calculator.powerDouble(3.5,2);
			System.out.println(res1);
			
			}
}