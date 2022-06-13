import java.util.*;

class TowerOfHonai{
			static int count=0;
			
			static void toh(int n,char source,char intermidiate,char destination){
				
				if(n==1){
					count++;
					System.out.println("Disk from "+source+" to "+destination);
				}
				else{
					count++;
					toh(n-1,source,destination,intermidiate);
					System.out.println("Disk from "+source+" to "+destination);
					toh(n-1,intermidiate,source,destination);
				}
			}

	public static void main(String []args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number for TOH:");
			int n=sc.nextInt();
			System.out.println();
			
			toh(n,'A','B','C');
			System.out.println();
			System.out.println("Count: "+count);

}

}