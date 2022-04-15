/*WAP to implement user defined exception when
I )Incorrect password entered
II)number not found in a list , is not a palindrome*/

import java.util.*;

class IncorrectPasswordException extends Exception{
		IncorrectPasswordException(String str){
			super(str);
		}
}

class UserException{
			public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Set the Password: ");
			String s1=sc.nextLine();
			
			System.out.println("Verify the Password: ");
			String s2=sc.nextLine();
			
			try{
				if(s1.equals(s2))
					System.out.println("Password match successfully!!!");
				else
				throw new IncorrectPasswordException("Entered Incorrect Password");
			}
			catch(IncorrectPasswordException e){
				//e.printStackTrace();
				System.out.println(" "+e);
			}
				
	}

}