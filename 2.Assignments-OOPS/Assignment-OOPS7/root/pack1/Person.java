package pack1;
import  pack1.Employee;
import  pack1.TestEmployee;

class Person{
	
String name,vil,dis,cont;
int pin;
long mob;

Person(String n,String v,String d,String c,int p,long m){
	this.name=n;
	this.vil=v;
	this.dis=d;
	this.cont=c;
	this.pin=p;
	this.mob=m;
	
	
}

				void getdata(){
					System.out.println();
					System.out.println("****************************************************");
					System.out.printf("* Your Name                :   %-20s*\n",name);
					System.out.printf("* Village                  :   %-20s*\n",vil);
					System.out.printf("* District                 :   %-20s*\n",dis);
					System.out.printf("* Pin                      :   %-20s*\n",pin);
					System.out.printf("* Country                  :   %-20s*\n",cont);
					System.out.printf("* Mobile number            :   %-20s*\n",mob);
					
					 
						
				}
}