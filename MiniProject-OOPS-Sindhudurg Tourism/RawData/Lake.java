/*package miniproject;
import java.util.Scanner;

class Lake extends TourismParent{


			static String lake[]=new String[5];
				
				
			void setLakeNames(){
			this.lake[0]="DHAMAPUR LAKE";
			this.lake[1]="MOTI LAKE";
			this.lake[2]="HARKUL LAKE";
			this.lake[3]="OSARGAON RESERVOIR";
			this.lake[4]="NOT INTERESTED";
			
		
			}
			
			void getLakeNames(){
			String str1=String.format("%75s","LAKE QUOTES");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-60s","                1."+lake[0]));
		System.out.print(String.format("%-45s","2."+lake[1]));
		System.out.print(String.format("%-30s","3."+lake[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-60s","                4."+lake[3]));
		System.out.print(String.format("%-45s","5."+lake[4]));
		System.out.println("\n\n\n");
		
		
			}
			
			static void setSelectionLake(){
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add Lake : ");
				int num=sc.nextInt();
				if(num==5||num>5)
					break;
				sel[i]=lake[num-1];
				i++;
				System.out.print("\n               want to select more Lake Y/N:1/0  ");
				 n=sc.nextInt();
			}
			}
}*/