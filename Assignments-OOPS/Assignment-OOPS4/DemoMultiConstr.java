class MathOprns{
static int intResult;
static double doubleResult;
int n1;
int n2;

	MathOprns(int n1,int n2){
		this(12.5,13.78);
		this.n1=n1;
		this.n2=n2;	
		this.intAdd();
	}
	
	
	double d1;
	double d2;
	MathOprns(double d1,double d2){
		//this(12,56);
		this.d1=d1;
		this.d2=d2;	
		this.doubleAdd();		
	}
		
		
	void intAdd(){
		intResult=n1+n2;
	}
	
	void doubleAdd(){
		doubleResult=d1+d2;
	}

}

			class DemoMultiConstr{
				public static void main(String... args){
				MathOprns m1=new MathOprns(15,63);	
				//MathOprns m2=new MathOprns(17.56,14.57);	
					
				System.out.println("intResult: "+MathOprns.intResult);
				System.out.println("doubleResult: "+MathOprns.doubleResult);				
					
				}
				
				
}