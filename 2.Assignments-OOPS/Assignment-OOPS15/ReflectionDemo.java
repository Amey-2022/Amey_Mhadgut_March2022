import java.lang.reflect.*;

class A{
	int x;
	int z;
	private int y;
	
	static{
		System.out.println("static block invoked");
	}
	A(){
		System.out.println("Constructor invoked");
	}
	
		
	void m1(){
	System.out.println("m1() invoked");
	}
	
	private void m2(){
	System.out.println("m2() invoked");
	}
	
	private void m3(int a){
	System.out.println("m3() invoked");
	}
}

class ReflectionDemo{
		public static void main(String[] args)throws ClassNotFoundException,InstantiationException,NoSuchMethodException,
		IllegalAccessException,InvocationTargetException
		
		{
		
			
			//traditional till now to load class A
	/*	A a=new A();
		a.m1();
		//a.m2();  //pvt method accessible within class only
		//a.m3(10);//CTE
	*/
	
		Class aClass=Class.forName("A"); //load A and return class<A> object (metadata)
		
		Field [] fields=aClass.getDeclaredFields();
		
		for(Field f: fields){
		System.out.println(f.getName());	
		}
		
		System.out.println();
		
		
		Method[] methods=aClass.getDeclaredMethods();
		for(Method m: methods){
		System.out.println(m.getName());	
		}
		
		Constructor[] constructors=aClass.getDeclaredConstructors();
		for(Constructor c: constructors){
		System.out.println(c.getName());	
		}
		
		
		//A a=new A(); //Regular way to create object
		//a.m1();
		
		
		
		A a=(A) aClass.newInstance(); //// Create new object without using new keyword
		
		
		Method m1=aClass.getDeclaredMethod("m1");
		m1.invoke(a);
		
		Method m2=aClass.getDeclaredMethod("m2");
		m2.setAccessible(true); //for private methods accessible = false by default so change it to true
		m2.invoke(a);
		
			
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
}

