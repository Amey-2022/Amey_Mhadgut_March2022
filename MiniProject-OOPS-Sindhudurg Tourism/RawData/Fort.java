/*package miniproject;
import java.util.Scanner;

class Fort extends TourismParent{


			static String fort[]=new String[10];
			
				
				
			void setFortNames(){
			this.fort[0]="VIJAYDURG";
			this.fort[1]="DEVGAD";
			this.fort[2]="SINDHUDURG";
			this.fort[3]="SARJEKOT";
			this.fort[4]="RANGANAGAD";
			this.fort[5]="RAMGAD";
			this.fort[6]="NIVATI";
			this.fort[7]="HANUMANTGAD";
			this.fort[8]="YASHWANTGAD";
			this.fort[9]="NOT INTERESTED";
			
		
			}
			
			void getFortNames(){
			String str1=String.format("%75s","HISTORICAL QUOTES");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-60s","                1."+fort[0]));
		System.out.print(String.format("%-45s","2."+fort[1]));
		System.out.print(String.format("%-30s","3."+fort[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-60s","                4."+fort[3]));
		System.out.print(String.format("%-45s","5."+fort[4]));
		System.out.print(String.format("%-30s","6."+fort[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-60s","                7."+fort[6]));
		System.out.print(String.format("%-45s","8."+fort[7]));
		System.out.print(String.format("%-30s","9."+fort[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-60s","                10."+fort[9]));
		System.out.println("\n\n\n");
		
			}
			

			static void setSelectionFort(){
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add Fort : ");
				int num=sc.nextInt();
				if(num==10||num>10)
					break;
				sel[i]=fort[num-1];
				i++;
				System.out.print("\n               want to select more Lake Y/N:1/0  ");
				 n=sc.nextInt();
			}
			
			
			
		}
			
}*/