interface I3{
	void m1();
}


interface I4{
void m4();
void m5();
}

interface I5{
	void m6(int a,float b);
}


class LambdaExpression{
	/*	static void m2(I3 i){
			i.m1();
		}
		
		static void m3(I2 i){
			i.m4();
		}      */
		
		
		public static void main(String[] args){
			
			//create child class
			//override m6
			//save object in x
			//can be written datatype of c,d as in parent... not writtenis also ok
			I5 x=(c,d)->{
				System.out.println("Child:m6()");
				System.out.println(c+" "+d);
			};
			
			
			I3 i=new I3(){
			@Override
			public void m1(){
			System.out.println("Child:m1()");
			
			}
			};
			x.m6(10,12.5f);
			
			
			I3 b=() -> {
			System.out.println("Lambda:m1()");	
			};
			b.m1();
			
			
			
}
}