package packa;
import packb.C;
import static packb.C.k;
import static packb.C.p4;

class A{
			public static void main(String[] args){
			B b=new B();
			//System.out.println(b.r);//pvt not allowed   r has private access in B
			System.out.println(b.s);//within packa
			System.out.println(b.t);//within packa
			System.out.println(b.u);//public
			
			//b.m1();//pvt not allowed  m1() has private access in B
			b.m2();//within same packa
			b.m3();//within same packa
			b.m4();//public
			
			C c=new C();
			//System.out.println(c.g);//pvt not allowed   r has private access in B
			//System.out.println(c.h);//within packa
			//System.out.println(c.i);//within packa
			System.out.println(k);//public
			
			//c.p1();//pvt not allowed  m1() has private access in B
			//c.p2();//within same packa
			//c.p3();//within same packa
			p4();//public
			
}
}