/*WAP to implement an example that represent all in built exceptions
a)Arithmetic
b)Number Format
c)Array Index out of Bound
d)etc*/




import java.util.*;

class A{}
	class B extends A{}


class ExceptionDemo{
	public static void main(String[] args){
	
	//ArithmeticException
	int a=10; 
	try{a=10/0;}catch(ArithmeticException e){
		System.out.println("Number cant be divided by zero");
	}
	
	//ArrayIndexOutOfBoundsExceptions
	int array[]=new int[5];
	try{array[7]=45;}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array index should be in limit");
	}
	
	//NumberFormatException
	String s="Amey";
	try{int i=Integer.parseInt(s);}catch(NumberFormatException e){
		System.out.println("String cant be converted to int");
	}
	
	//NullPointerException
	String s1=null;
	try{System.out.println(s1.length());}catch(NullPointerException e){
		System.out.println("String has been assigned null"); 
	}
	
	int a1[]=null;
	try{System.out.println(a1.length);}catch(NullPointerException e){
		System.out.println("Array has been assigned null");
	}
	
	//StringIndexOutOfBoundsException
	try{System.out.println(s.charAt(5));}catch(StringIndexOutOfBoundsException e){
		System.out.println("Access string within limit");
	}
	
		//ClassCastException
		A aa=new A();
		try{B b=(B) aa;}catch(ClassCastException e){
			System.out.println("ClassCastException");
		}

	}

}