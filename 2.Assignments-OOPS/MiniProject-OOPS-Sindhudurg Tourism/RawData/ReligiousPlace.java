/*package miniproject;
import java.util.Scanner;

class ReligiousPlace extends TourismParent{


			static String relplc[]=new String[15];
				
				
			void setReligiousPlaceNames(){
			this.relplc[0]="KUNKESHWAR TEMPLE";
			this.relplc[1]="ANGANEWADI TEMPLE";
			this.relplc[2]="BHALCHANDRA MAHARAJ SANSTHANAM";
			this.relplc[3]="MANGAON DATTATRAY TEMPLE";
			this.relplc[4]="JAITIR TEMPLE, TULAS";
			this.relplc[5]="VETOBA TEMPLE, ARAVLI";
			this.relplc[6]="REDI GANESH TEMPLE";
			this.relplc[7]="BANDESHWAR TEMPLE, BANDA";
			this.relplc[8]="VENGURLA ROMAN CATHOLIC CHURCH";
			this.relplc[9]="MALWAN CHURCH";
			this.relplc[10]="SAWANTWADI CHURCH";
			this.relplc[11]="SHIRODA CHURCH";
			this.relplc[12]="REDEGHUMAT,SAWANTWADI";
			this.relplc[13]="JAMA MASJID, DEVGAD";
			this.relplc[14]="NOT INTERESTED";
			}
			
			void getReligiousPlaceNames(){
			String str1=String.format("%75s","DEVOTEES QUOTES");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-50s","                1."+relplc[0]));
		System.out.print(String.format("%-40s","2."+relplc[1]));
		System.out.print(String.format("%-30s","3."+relplc[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-50s","                4."+relplc[3]));
		System.out.print(String.format("%-40s","5."+relplc[4]));
		System.out.print(String.format("%-30s","6."+relplc[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-50s","                7."+relplc[6]));
		System.out.print(String.format("%-40s","8."+relplc[7]));
		System.out.print(String.format("%-30s","9."+relplc[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-50s","                10."+relplc[9]));
		System.out.print(String.format("%-40s","11."+relplc[10]));
		System.out.print(String.format("%-30s","12."+relplc[11]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-50s","                13."+relplc[12]));
		System.out.print(String.format("%-40s","14."+relplc[13]));
		System.out.print(String.format("%-30s","15."+relplc[14]));
		System.out.println("\n\n\n");
		
			}
		
			static void setSelectionReligiousPlace(){
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add ReligiousPlace : ");
				int num=sc.nextInt();
				if(num==15||num>15)
					break;
				sel[i]=relplc[num-1];
				i++;
				System.out.print("\n               want to select more ReligiousPlace Y/N:1/0  ");
				 n=sc.nextInt();
			}
		}
		

}*/