package miniproject;
import java.util.Scanner;
class UserInfo{
	
	byte age,numOfPersons;
	String name,gender,village,district,state,country,Idproof,email;
	long mobileNum;
	
	
	void setUserInfo(){
	//user information form
		
		String str2=String.format("%79s","ENTER YOUR INFORMATION");
		Scanner sc=new Scanner(System.in);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str2);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n");
		System.out.print("               Enter Your Full Name : ");
		name=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Your Gender(M/F/T) : ");
		gender=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Age : ");
		age=sc.nextByte();
		sc.nextLine();
		System.out.println("\n");
		System.out.println("               Enter Your Address");
		System.out.println("\n");
		System.out.print("               Enter Your Village : ");
		village=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Your District : ");
		district=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Your State : ");
		state=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Your Country : ");
		country=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Your Aadhar ID/Passport Number : ");
		Idproof=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Your Mobile Number : ");
		mobileNum=sc.nextLong();
		sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Your email id : ");
		String email=sc.nextLine();
		System.out.println("\n");
		System.out.print("               Enter Number of visiting persons with you: ");
		numOfPersons=sc.nextByte();
		System.out.println("\n\n");
	}
}