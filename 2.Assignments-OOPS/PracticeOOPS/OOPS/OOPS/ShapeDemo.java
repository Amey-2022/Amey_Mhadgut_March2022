//WAP with Parent class as Shape and derive a class Circle, Rectangle considering
//area() as function which can be overloaded and overrided.

import java.util.*;
class Shape{
		double res;
		final double pi=3.1428;
		double r;
		static double side1;
		static double side2;
		
	void area(){
			
	}

}

class Circle extends Shape{
	@Override
	protected void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius: ");
		r=sc.nextDouble();
		res=2*pi*r*r;
		System.out.println("Area of Circle is:	"+res);		
	} 	
}

class Rectangle extends Shape {
	//Overloading
	public void area(double side1,double side2){
		
		res=side1*side2;
		System.out.println("Area of Rectangle is:	"+res);	
	}	
}



class ShapeDemo{
		public static void main(String... args){
			Circle c=new Circle();
			//c.area();
			Rectangle r=new Rectangle();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Side1: ");
			Shape.side1=sc.nextDouble();
			System.out.println("Enter Side2: ");
			Shape.side2=sc.nextDouble();
			
			c.area();
			r.area(Shape.side1,Shape.side2);
			
		}
}


