import java.util.*;
class Table3{


	
	
				public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number: ");
				int n=sc.nextInt();

						for (int i=1;i<=10;i++)
					 {
						for(int j=1;j<=n;j++)
					{
						System.out.print(String.format("%03d",(j))+"x"+String.format("%03d",(i))+"="+String.format("%03d",(i*j))+" ");
							
					}
						System.out.println();
						
						
					 }
						
							
		
				}	
				}	