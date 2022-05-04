import java.util.*;

class Permutation{
		static int count=0;

		public static void permutation(String str,String asf){
			
			if(str.length()==0){
				count++;
				System.out.println(asf);
				return;
			}
			
			for(int i=0;i<str.length();i++){
				
				char ch=str.charAt(i);
				String leftp=str.substring(0,i);
				String rightp=str.substring(i+1);
				String rop=leftp+rightp;
				permutation(rop,asf+ch);
			}
			
		}


	public static void main(String... args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String: ");
	String str=sc.next();
	
	System.out.println();
	permutation(str,"");
	System.out.println();
	System.out.println("Count: "+count);
	
	
	}

}