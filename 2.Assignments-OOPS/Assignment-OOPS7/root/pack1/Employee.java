package pack1;
import  pack1.Person;
import  pack1.TestEmployee;

class Employee extends Person{
double asal;
int yr;
String nin;

	Employee(String n,String v,String dis,String c,int p,long m,double as,int y,String nin){
		super(n,v,dis,c,p,m);
		this.asal=as;
		this.yr=y;
		this.nin=nin;
	}
		
		
		
		
		void getdata(){
			super.getdata();
			System.out.printf("* Annual Salary            :   %-20s*\n",asal);
			System.out.printf("* Year of Joining          :   %-20s*\n",yr);
			System.out.printf("* National Insurance Number:   %-20s*\n",nin);
			System.out.println("****************************************************");
		
		}	
}		

