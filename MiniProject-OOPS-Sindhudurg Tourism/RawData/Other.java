/*package miniproject;
import java.util.Scanner;
class Other extends TourismParent{
	static String other[]=new String[10];
	
	
	void setOtherNames(){
		this.other[0]="SAWANTWADI PALACE";
		this.other[1]="WAX MUSEUM";
		this.other[2]="WINDMILL GARDEN";
		this.other[3]="ROCK GARDEN";
		this.other[4]="ZIPLINE ADVENTURE";
		this.other[5]="PARAGLIDING";
		this.other[6]="WATER SPORTS";
		this.other[7]="DOLPHIN SAFARI";
		this.other[8]="SCUBA DIVING";
		this.other[9]="NOT INTERESTED";
		
	}
	
	void getOtherNames(){
		
			System.out.println("\n\n\n");
		String str1=String.format("%80s","OTHER PLACES...");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+other[0]));
		System.out.print(String.format("%-40s","2."+other[1]));
		System.out.print(String.format("%-30s","3."+other[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+other[3]));
		System.out.print(String.format("%-40s","5."+other[4]));
		System.out.print(String.format("%-30s","6."+other[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    7."+other[6]));
		System.out.print(String.format("%-40s","8."+other[7]));
		System.out.print(String.format("%-30s","9."+other[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    10."+other[9]));
		System.out.println("\n\n\n");
		
	}
	
	void setSelectionOther(){
			
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add Other Place : ");
				int num=sc.nextInt();
				if(num==10||num>10)
					break;
				sel[i]=other[num-1];
				i++;
				System.out.print("\n               want to select more Other Place Y/N:1/0  ");
				 n=sc.nextInt();
			}
			
			
			
		}
		
		
}*/