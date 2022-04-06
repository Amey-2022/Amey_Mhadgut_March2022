import java.util.*;


class NumberFE{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		String s=sc.nextLine();
		int i=0;
		try{
			i=Integer.parseInt(s);
			
		}catch(NumberFormatException e){
			
			System.out.println("Entered input is not a valid format for an integer");
			e.printStackTrace();
		}finally{
			System.out.println("Resources released");
			
		}
		
		
		if(i>0)
		{
		int k=i*i;
		System.out.println("The square value is: "+k);
		System.out.println("The work has been done succesfully");
		}
		else{
			System.out.println("Invalid input");
		}
		
		
		
	}
	
	
}


/*
output


Enter an integer:
5
Resources released
The square value is: 25
The work has been done succesfully



Enter an integer:
asasd
Entered input is not a valid format for an integer
java.lang.NumberFormatException: For input string: "asasd"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at NumberFE.main(NumberFE.java:11)
Resources released
Invalid input






*/