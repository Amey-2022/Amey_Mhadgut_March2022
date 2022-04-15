import java.util.Scanner;

class Fort{


			String fort[]=new String[10];
			//String sel[]=new String[25];
				
				
			void setFortNames(){
			this.fort[0]="1.VIJAYDURG";
			this.fort[1]="2.DEVGAD";
			this.fort[2]="3.SINDHUDURG";
			this.fort[3]="4.SARJEKOT";
			this.fort[4]="5.RANGANAGAD";
			this.fort[5]="6.RAMGAD";
			this.fort[6]="7.NIVATI";
			this.fort[7]="8.HANUMANTGAD";
			this.fort[8]="9.YASHWANTGAD";
			this.fort[9]="10.NOT INTERESTED";
			
		
			}
			
			void getFortNames(){
			String str1=String.format("%75s","HISTORICAL QUOTES");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-60s","                "+fort[0]));
		System.out.print(String.format("%-45s",fort[1]));
		System.out.print(String.format("%-30s",fort[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-60s","                "+fort[3]));
		System.out.print(String.format("%-45s",fort[4]));
		System.out.print(String.format("%-30s",fort[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-60s","                "+fort[6]));
		System.out.print(String.format("%-45s",fort[7]));
		System.out.print(String.format("%-30s",fort[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-60s","                "+fort[9]));
		System.out.println("\n\n\n");
		
			}
			

			void setSelectionFort(){
			
			Scanner sc=new Scanner(System.in);
			int n=1,i=0;
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
		
		void getSelectionFort(){
			for (int i=0;i<=25;i++)
			{
				if(sel[i]==null)
					break;
				//System.out.println(" "+sel[i]);
				
			}
		}



public static void main(String[] args)
			{
				Fort f=new Fort();
				f.setFortNames();
				f.getFortNames();
				f.setSelectionFort();
				f.getSelectionFort();
			}
}