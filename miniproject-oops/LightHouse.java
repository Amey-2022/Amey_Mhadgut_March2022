import java.util.Scanner;

class LightHouse{


			String lighthouse[]=new String[5];
			//String sel[]=new String[25];	
				
			void setLightHouseNames(){
			this.lighthouse[0]="1.DEVGAD LIGHTHOUSE";
			this.lighthouse[1]="2.ACHRA LIGHTHOUSE";
			this.lighthouse[2]="3.VENGURLA LIGHTHOUSE";
			this.lighthouse[3]="4.NIVATI LIGHTHOUSE";
			this.lighthouse[4]="5.NOT INTERESTED";
			
		
			}
			
			void getLightHouseNames(){
			String str1=String.format("%75s","Lighthouse QUOTES");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                "+lighthouse[0]));
		System.out.print(String.format("%-45s",lighthouse[1]));
		System.out.print(String.format("%-30s",lighthouse[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                "+lighthouse[3]));
		System.out.print(String.format("%-45s",lighthouse[4]));
		System.out.println("\n\n\n");
		
		
			}void setSelectionLightHouse(){
			
			Scanner sc=new Scanner(System.in);
			int n=1,i=0;
			while(n==1)
			{	
				System.out.print("               Select number to add Lighthouse : ");
				int num=sc.nextInt();
				if(num==5||num>5)
					break;
				sel[i]=lighthouse[num-1];
				i++;
				System.out.print("\n               want to select more Lake Y/N:1/0  ");
				 n=sc.nextInt();
			}
			
			
			
		}
		
		void getSelectionLightHouse(){
			for (int i=0;i<=25;i++)
			{
				if(sel[i]==null)
					break;
				//System.out.println(" "+sel[i]);
				
			}
		}
		
		
		
			
		
		

}