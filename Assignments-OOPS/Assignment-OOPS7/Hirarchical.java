//Hirarchical inheritance
import java.util.*;
class A{
		int a=10;
		int b=20;
		
		void a1(){
		System.out.println("Class A: method a1");
		}
		void d1(){
		System.out.println("Class A: method d1");
		}
}

class B extends A{
		int a=30;
		int b=40;
		int c=45;
		void b1(){
		System.out.println("Class B:method b1");
		}
		
		void a1(){
		System.out.println("Class B: method a1");
		}



}

class C extends A{
		int a=50;
		int b=60;
		int c=78;
		int d=45;
		void c1(){
		System.out.println("Class C:method c1");
		}
		
		void a1(){
		System.out.println("Class C: method a1");
		}



}

	class Hirarchical{
	public static void main(String[] args){
	A a=new A();
	System.out.println(a.a);
	System.out.println(a.b);
	a.a1();
	A a1=new B();
	a1.a1();
	//System.out.println(a1.c); //error
	A a2=new C();
	//System.out.println(c.d);	//error
	a2.a1();
	
	B b=new B();
	
	C c=new C();
	System.out.println(c.b);
	c.d1();
	c.a1();
	
	
	
	
	
	
	}
	}