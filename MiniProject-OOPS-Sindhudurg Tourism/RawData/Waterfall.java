/*package miniproject;
import java.util.Scanner;
class Waterfall extends TourismParent{
	static String waterfall[]=new String[10];
	
	
	void setWaterfallNames(){
		this.waterfall[0]="AMBOLI WATERFALL";
		this.waterfall[1]="NAPNE WATERFALL";
		this.waterfall[2]="SAVDAV WATERFALL";
		this.waterfall[3]="SHIVDAV WATERFALL";
		this.waterfall[4]="KUMBHAVDE WATERFALL";
		this.waterfall[5]="NATAL WATERFALL";
		this.waterfall[6]="CHANDER-MASURE WATERFALL";
		this.waterfall[7]="MANCHE WATERFALL";
		this.waterfall[8]="NHAVANKOND WATERFALL";
		this.waterfall[9]="NOT INTERESTED";
		
	}
	
	void getWaterfallNames(){
		
			System.out.println("\n\n\n");
		String str1=String.format("%80s","FEEL THE RAIN...");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+waterfall[0]));
		System.out.print(String.format("%-40s","2."+waterfall[1]));
		System.out.print(String.format("%-30s","3."+waterfall[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+waterfall[3]));
		System.out.print(String.format("%-40s","5."+waterfall[4]));
		System.out.print(String.format("%-30s","6."+waterfall[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    7."+waterfall[6]));
		System.out.print(String.format("%-40s","8."+waterfall[7]));
		System.out.print(String.format("%-30s","9."+waterfall[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    10."+waterfall[9]));
		System.out.println("\n\n\n");
		
	}
	
	void setSelectionWaterfall(){
			
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add Waterfall : ");
				int num=sc.nextInt();
				if(num==10||num>10)
					break;
				sel[i]=waterfall[num-1];
				i++;
				System.out.print("\n               want to select more Waterfall Y/N:1/0  ");
				 n=sc.nextInt();
			}
			
			
			
		}
		
		
}*/