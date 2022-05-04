/*package miniproject;
import java.util.Scanner;
class Island extends TourismParent{
	static String island[]=new String[7];
	
	
	void setIslandNames(){
		this.island[0]="TSUNAMI ISLAND";
		this.island[1]="SEAGULL ISLAND";
		this.island[2]="JUVE ISLAND";
		this.island[3]="KHOT JUVA ISLAND";
		this.island[4]="PANKHOL JAVA ISLAND";
		this.island[5]="NIVATI ISLAND";
		this.island[6]="NOT INTERESTED";
		
	}
	
	void getIslandNames(){
		
			System.out.println("\n\n\n");
		String str1=String.format("%70s","ISLNAD");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+island[0]));
		System.out.print(String.format("%-40s","2."+island[1]));
		System.out.print(String.format("%-30s","3."+island[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+island[3]));
		System.out.print(String.format("%-40s","5."+island[4]));
		System.out.print(String.format("%-30s","6."+island[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    7."+island[6]));
		System.out.println("\n\n\n");
		
	}
	
	void setSelectionIsland(){
			
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add Island : ");
				int num=sc.nextInt();
				if(num==7||num>7)
					break;
				sel[i]=island[num-1];
				i++;
				System.out.print("\n               want to select more Island Y/N:1/0  ");
				 n=sc.nextInt();
			}
			
			
			
		}
		
		

}*/