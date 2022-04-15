class StaticInnerClass{
	static int x=100;

	static void m1(){
	System.out.println("m1()");
	}
		
	static class InnerClass{
	static int y=20;

	static void m2(){
	System.out.println("m2()");
	}
	
	void m3(){
	System.out.println("m3()");	
	}
	
	static void m4(){
	System.out.println("m4()");
	}
	
	void m5(){
	System.out.println("m5()");	
	}


	}
}

class StaticInnerClassDemo{
			public static void main(String[] args){
				
				StaticInnerClass.m1();
			
			StaticInnerClass.InnerClass i=new StaticInnerClass.InnerClass();
			System.out.println("y:"+i.y);
			i.m3();
			StaticInnerClass.InnerClass.m2();
			StaticInnerClass.InnerClass.m4();
			i.m5();
			
			
			
			}
}

