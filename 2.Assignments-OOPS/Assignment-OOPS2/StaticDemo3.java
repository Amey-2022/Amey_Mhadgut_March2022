
class StaticBlock{

}


class A{
		static int a=45;
		int b=89;
	
	static void print(){
		System.out.println("Print");
		}
		
		void print1(){
		System.out.println("Print1");
		}
}


class B{
static int a=63;
		int b=76;

	static void print(){
		System.out.println("Print");
		}
		
		void print1(){
		System.out.println("Print1");
		}


}


			class StaticDemo3{
					public static void main(String[] args){
					
					A a=new A();
					B b=new B();
					
				System.out.println("static"+A.a);
				System.out.println("static"+B.a);
				A.print();
				B.print();
				
				System.out.println("n-static"+a.b);
				System.out.println("n-static"+b.b);
				a.print1();
				b.print1();
				}

}