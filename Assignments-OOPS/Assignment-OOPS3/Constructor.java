class MathOprns{
		int n1;
		int n2;
		
		MathOprns(int n1, int n2){
			this.n1=n1;
			this.n2=n2;
			add();
		}
		static double result;
		
		void add(){
		result=n1+n2;
		System.out.println("Addtion: "+result);
		sub();
		}

		void sub(){
		result=n1-n2;
		System.out.println("Substraction: "+result);
		mul();
		}
		
		void mul(){
		result=n1*n2;
		System.out.println("Multiplication: "+result);
		div();
		}
		
		void div(){
		result=n1/n2;
		System.out.println("Division: "+result);
		}
}


				class ConstrDemo{
						public static void main(String[] args){
					MathOprns m1=new MathOprns(40,20);
					MathOprns m2=new MathOprns(10,20);
					
					
				
					
					
					
					
						
					
				}
	
	
	
}