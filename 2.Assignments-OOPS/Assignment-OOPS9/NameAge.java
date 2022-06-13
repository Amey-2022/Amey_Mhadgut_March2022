import java.io.*;
import java.util.*;


class AgeException extends Exception{
	AgeException(String es){
		super(es);
		
	}
	
	
	
}


class NameAge{
					public static void main(String[] args){
						String s1=args[0];
						String s2=args[1];
						
						int n=Integer.parseInt(s2);
						System.out.println(s1+" "+n);
						
						try{
							if(n>=18&&n<60){
								System.out.println("Valid Age");
							}else{
								throw new AgeException("Entered age is not in range");
							}
						}catch(Exception e){
							e.printStackTrace();
							System.out.println("Entered age is not in range");
						}
	
	
	
}
}



/*
output


C:\Users\Amey Mhadgut\Documents>java NameAge Amey 12
Amey 12
AgeException: Entered age is not in range
        at NameAge.main(NameAge.java:28)
Entered age is not in range



C:\Users\Amey Mhadgut\Documents>java NameAge Amey 35
Amey 35
Valid Age


*/