class OuterClass{
		 int x=100;
		int a=300;
		
		public void m1(){
		
		System.out.println("Outer:m1()");
		//System.out.println(y);   //CTE
		//m2();      //CTE
		 
		}
		
		
		
		void m3(){
			InnerClass i=new InnerClass();  //created object to access var in inner from outer //no need to writr as line no.68
			System.out.println(i.y);//200
			i.m1();
		}
							//Regular inner class map with instance variables
		class InnerClass{	//regular inner class can access directly to outer class variales and methods but vicecersa not possible
				int y=200;
				int a=400;
		
				void m2(){
				
				System.out.println("Inner:m2()");
				System.out.println("Accessing X inside InnerClass: "+x);
				m1();
				System.out.println("a unknown: "+a);  //400
				System.out.println("a unknown: "+this.a);//400
				System.out.println("a unknown: "+OuterClass.this.a);
				
				OuterClass.this.m1();
				}
				
				
				public void m1(){
		
				System.out.println("Inner:m1()"); //inner m1 now
				
				}
		}
		
		
			class InnerClass2{
				int z=200;
				int a = 500;
				void m2(){
					
				}
		
				public void m1(){
					System.out.println("Inner2:m1()");
					System.out.println(z);
					System.out.println(a);
					System.out.println(OuterClass.this.a);
					OuterClass.this.m1();
				}
			}		

}



class RegularInnerClassDemo1{
				public static void main(String... args){
				OuterClass oc=new OuterClass();
				//System.out.println(oc.x);
				//oc.m1();				
				
				OuterClass.InnerClass inr=oc.new InnerClass();// write this when in static method
				//OuterClass.InnerClass inr=new OuterClass().new InnerClass();
				System.out.println(inr.y);
				inr.m2();
				
				OuterClass.InnerClass2 innerC2 = new OuterClass().new InnerClass2();
				innerC2.m1();
		
		
				oc.m3();
				
				
				
				
				
	}
}