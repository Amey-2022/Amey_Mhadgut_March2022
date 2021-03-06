interface I1{
		void m2();
		void m3();
		void m4();
}

interface I2{
	void m5();
	void m6();
}

class Parent{
	void m1(){
	System.out.println("Parent:m1()");
	}

}

class Child extends Parent{
	@Override
	void m1(){
	System.out.println("Child:m1()");
	}
}

class XYZ implements I1{
	@Override
	public void m2(){
	
	}
	
	@Override
	public void m3(){
	
	}
	
	@Override
	public void m4(){
	
	}
}

class AnonymousICDemo{   //Purpose of annonymous class is to inherit class and interface
			public static void main(String[] args){
			
			Parent p=new Parent(){
				
				@Override
				void m1(){
				System.out.println("Child:m1()");
				}
			
			};
			
			
			I1 i=new I1(){
		    @Override
			public void m2(){
				System.out.println("IChild:m2()");
			}
				
			@Override
			public void m3(){
				System.out.println("IChild:m3()");
			}
			
			@Override
			public void m4(){
				System.out.println("IChild:m4()");
			}
				
				
			};
			
			p.m1();
			i.m2();
			i.m3();
			i.m4();
			
			
			I2 i2=new I2(){
			@Override
			public void m5(){
				System.out.println("Child:m5()");
			}
			
			@Override
			public void m6(){
				System.out.println("Child:m6()");
			}
			
		};
		
		i2.m5();
		i2.m6();	
				
			

} 
}

/*
Child:m1()
IChild:m2()
IChild:m3()
IChild:m4()
Child:m5()
Child:m6()
*/