import java.util.*;
class Patient{
		String name;
		double ht,wt;


	void getdata(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Height in inches: ");
		double h=sc.nextDouble();
		System.out.println("Enter Weight in pounds: ");
		double w=sc.nextDouble();
		this.name=name;
		this.ht=h;
		this.wt=w;
			
	}
	
	double bmi(){
	double res=((wt/(ht*ht))*703);	
	
	return res;
	
	}

}

class PatientDemo{
	public static void main(String[] args){
		
		
		
		Patient p=new Patient();
		p.getdata();
		
		System.out.println(p.name+"'s BMI is: "+p.bmi());
		
	}
	
}