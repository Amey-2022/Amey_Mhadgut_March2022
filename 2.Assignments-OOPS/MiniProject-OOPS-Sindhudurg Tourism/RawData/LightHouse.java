/*package miniproject;
import java.util.Scanner;

class LightHouse extends TourismParent{


			static String lighthouse[]=new String[5];
			
				
			void setLightHouseNames(){
			this.lighthouse[0]="DEVGAD LIGHTHOUSE";
			this.lighthouse[1]="ACHRA LIGHTHOUSE";
			this.lighthouse[2]="VENGURLA LIGHTHOUSE";
			this.lighthouse[3]="NIVATI LIGHTHOUSE";
			this.lighthouse[4]="NOT INTERESTED";
			
		
			}
			
			void getLightHouseNames(){
			String str1=String.format("%75s","Lighthouse QUOTES");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                1."+lighthouse[0]));
		System.out.print(String.format("%-45s","2."+lighthouse[1]));
		System.out.print(String.format("%-30s","3."+lighthouse[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                4."+lighthouse[3]));
		System.out.print(String.format("%-45s","5."+lighthouse[4]));
		System.out.println("\n\n\n");
		
		
			}
			
			static void setSelectionLightHouse(){
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add Lighthouse : ");
				int num=sc.nextInt();
				if(num==5||num>5)
					break;
				sel[i]=lighthouse[num-1];
				i++;
				System.out.print("\n               want to select more Lighthouse Y/N:1/0  ");
				 n=sc.nextInt();
			}
		}

}*/