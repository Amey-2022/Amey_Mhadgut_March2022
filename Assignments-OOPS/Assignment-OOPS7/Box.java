import java.util.*;

class Box{
	double w,h,d;
	//static double vol;

double getdata(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Width: ");
			double a=sc.nextDouble();
			System.out.println("Enter Height: ");
			double f=sc.nextDouble();
			System.out.println("Enter Depth: ");
			double c=sc.nextDouble();
			
			return this.dimension(a,f,c);
}
		double dimension(double w,double h,double d){
		double vol=w*h*d;
		return vol;
}




		public static void main(String[] args){
			
			
			
			Box b=new Box();
			//double vol=b.getdata();
			//b.dimension(a,f,c);
			//double vol=b.dimension(a,f,c);
			System.out.println("Volume of a Box is: "+b.getdata());
		}
}