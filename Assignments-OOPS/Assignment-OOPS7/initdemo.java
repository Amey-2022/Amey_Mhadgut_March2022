import java.util.*;


class A{
		
		{
			System.out.println("init block in Class A");
		}
		
		A(){
			System.out.println("default constructor in Class A");
		}



}
class B extends  A{
	
		{
		System.out.println("init block in Class B");
		}
		
		B(){
			System.out.println("default constructor in Class B");
		}

}
class C extends B{
	
		{
		System.out.println("init block in Class C");
		}
		
		C(){
			System.out.println("default constructor in Class C");
		}

}


			class Initdemo{
				public static void main(String[] args){
					A a=new B();
					System.out.println();
					B b=new B();
					System.out.println();
					C c=new C();
					System.out.println();
					
					
					
				}
			}
			
			/*OUTPUT
			init block in Class A
			default constructor in Class A
			init block in Class B
			default constructor in Class B

			init block in Class A
			default constructor in Class A
			init block in Class B
			default constructor in Class B

			init block in Class A
			default constructor in Class A
			init block in Class B
			default constructor in Class B
			init block in Class C
			default constructor in Class C
			*/