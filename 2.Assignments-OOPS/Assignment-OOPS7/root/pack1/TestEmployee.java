package pack1;
import  pack1.Person;
import  pack1.Employee;
import java.util.*;


		class TestEmployee{
				public static void main(String[] args){
					Scanner sc=new Scanner(System.in);
					
					System.out.println("Enter Your Name: ");
					String name=sc.nextLine();
					System.out.println("Enter Your Village: ");
					String vil=sc.nextLine();
					System.out.println("Enter Your District: ");
					String dis=sc.nextLine();
					System.out.println("Enter Your Pin: ");
					int pin=sc.nextInt();
					System.out.println("Enter Your Country: ");
					sc.nextLine();
					String cont=sc.nextLine();
					System.out.println("Enter Your Mobile number: ");
					long mob=sc.nextLong();
					System.out.println("Enter Your annual salary: ");
					int asal=sc.nextInt();
					System.out.println("Enter Your joining year: ");
					int yr=sc.nextInt();
					System.out.println("Enter Your national insurance number: ");
					sc.nextLine();
					String nin=sc.nextLine();
					
					Employee e=new Employee(name,vil,dis,cont,pin,mob,asal,yr,nin);
					e.getdata();
				
				}

}



/*OUTPUT


****************************************************
* Your Name                :   Amey Mhadgut        *
* Village                  :   Kankavli            *
* District                 :   Sindhudurg          *
* Pin                      :   416602              *
* Country                  :   India               *
* Mobile number            :   7977842072          *
* Annual Salary            :   800000.0            *
* Year of Joining          :   2018                *
* National Insurance Number:   SBIND4578           *
****************************************************

*/