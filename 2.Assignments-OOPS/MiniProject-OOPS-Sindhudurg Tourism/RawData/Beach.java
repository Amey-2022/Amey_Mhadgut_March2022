package miniproject;
import java.util.Scanner;
class Beach extends TourismParent{
		
	 static String beach[]=new String[18];
	
	
	void setBeachNames(){
		this.beach[0]="DEVGAD BEACH";
		this.beach[1]="MITHMUMBARI BEACH";
		this.beach[2]="KUNKESHWAR BEACH";
		this.beach[3]="MITHBAV BEACH";
		this.beach[4]="AACHRA BEACH";
		this.beach[5]="TONDAVLI BEACH";
		this.beach[6]="DEVBAG BEACH";
		this.beach[7]="TARKARLI BEACH";
		this.beach[8]="BHOGAVE BEACH";
		this.beach[9]="KONDURA BEACH";
		this.beach[10]="KHAVANE BEACH";
		this.beach[11]="NIVATI BEACH";
		this.beach[12]="SAGARESHWAR BEACH";
		this.beach[13]="MOCHEMAD BEACH";
		this.beach[14]="VELAGAR BEACH";
		this.beach[15]="REDI BEACH";
		this.beach[16]="SHIRODA BEACH";
		this.beach[17]="GO TO NEXT CATEGORY";
		
	}
	
	void getBeachNames(){
		
			System.out.println("\n\n\n");
		String str1=String.format("%80s","WELCOME TO PARADISE...");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+beach[0]));
		System.out.print(String.format("%-40s","2."+beach[1]));
		System.out.print(String.format("%-30s","3."+beach[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+beach[3]));
		System.out.print(String.format("%-40s","5."+beach[4]));
		System.out.print(String.format("%-30s","6."+beach[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    7."+beach[6]));
		System.out.print(String.format("%-40s","8."+beach[7]));
		System.out.print(String.format("%-30s","9."+beach[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    10."+beach[9]));
		System.out.print(String.format("%-40s","11."+beach[10]));
		System.out.print(String.format("%-30s","12."+beach[11]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    13."+beach[12]));
		System.out.print(String.format("%-40s","14."+beach[13]));
		System.out.print(String.format("%-30s","15."+beach[14]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    16."+beach[15]));
		System.out.print(String.format("%-40s","17."+beach[16]));
		System.out.print(String.format("%-30s","18."+beach[17]));
		System.out.println("\n\n\n");
		
	}
	
		static void setSelectionBeach(){
			
			
			Scanner sc=new Scanner(System.in);
			int n=1;
			while(n==1)
			{	
				System.out.print("               Select number to add beach : ");
				int num=sc.nextInt();
				if(num==18||num>18)
					break;
				sel[i]=beach[num-1];
				i++;
				
				System.out.print("\n               want to select more beach Y/N:1/0  ");
				 n=sc.nextInt();
			}
			
			
			
		}
		
	
}

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
			this.fort[9]="GO TO NEXT CATEGORY";
			
		
			}
			
			void getFortNames(){
			String str1=String.format("%75s","HISTORICAL QUOTES");
		System.out.println("\n\n\n");
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+fort[0]));
		System.out.print(String.format("%-40s","2."+fort[1]));
		System.out.print(String.format("%-30s","3."+fort[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+fort[3]));
		System.out.print(String.format("%-40s","5."+fort[4]));
		System.out.print(String.format("%-30s","6."+fort[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    7."+fort[6]));
		System.out.print(String.format("%-40s","8."+fort[7]));
		System.out.print(String.format("%-30s","9."+fort[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    10."+fort[9]));
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
			
}

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
		this.waterfall[9]="GO TO NEXT CATEGORY";
		
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
		
		
}

class ReligiousPlace extends TourismParent{


			static String relplc[]=new String[15];
				
				
			void setReligiousPlaceNames(){
			this.relplc[0]="KUNKESHWAR TEMPLE";
			this.relplc[1]="BHALCHANDRA MAHARAJ SANSTHANAM";
			this.relplc[2]="ANGANEWADI TEMPLE";
			this.relplc[3]="MANGAON DATTATRAY TEMPLE";
			this.relplc[4]="JAITIR TEMPLE, TULAS";
			this.relplc[5]="VETOBA TEMPLE, ARAVLI";
			this.relplc[6]="REDI GANESH TEMPLE";
			this.relplc[7]="BANDESHWAR TEMPLE, BANDA";
			this.relplc[8]="SAWANTWADI CHURCH";
			this.relplc[9]="MALWAN CHURCH";
			this.relplc[10]="VENGURLA ROMAN CATHOLIC CHURCH";
			this.relplc[11]="SHIRODA CHURCH";
			this.relplc[12]="REDEGHUMAT,SAWANTWADI";
			this.relplc[13]="JAMA MASJID, DEVGAD";
			this.relplc[14]="GO TO NEXT CATEGORY";
			}
			
			void getReligiousPlaceNames(){
			String str1=String.format("%75s","DEVOTEES QUOTES");
		System.out.println("\n\n\n");
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+relplc[0]));
		System.out.print(String.format("%-40s","2."+relplc[1]));
		System.out.print(String.format("%-30s","3."+relplc[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+relplc[3]));
		System.out.print(String.format("%-40s","5."+relplc[4]));
		System.out.print(String.format("%-30s","6."+relplc[5]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    7."+relplc[6]));
		System.out.print(String.format("%-40s","8."+relplc[7]));
		System.out.print(String.format("%-30s","9."+relplc[8]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    10."+relplc[9]));
		System.out.print(String.format("%-40s","11."+relplc[10]));
		System.out.print(String.format("%-30s","12."+relplc[11]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    13."+relplc[12]));
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
		

}

class Lake extends TourismParent{


			static String lake[]=new String[5];
				
				
			void setLakeNames(){
			this.lake[0]="DHAMAPUR LAKE";
			this.lake[1]="MOTI LAKE";
			this.lake[2]="HARKUL LAKE";
			this.lake[3]="OSARGAON RESERVOIR";
			this.lake[4]="GO TO NEXT CATEGORY";
			
		
			}
			
			void getLakeNames(){
			String str1=String.format("%75s","LAKE QUOTES");
		System.out.println("\n\n\n");
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+lake[0]));
		System.out.print(String.format("%-40s","2."+lake[1]));
		System.out.print(String.format("%-30s","3."+lake[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+lake[3]));
		System.out.print(String.format("%-40s","5."+lake[4]));
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
}

class Island extends TourismParent{
	static String island[]=new String[7];
	
	
	void setIslandNames(){
		this.island[0]="TSUNAMI ISLAND";
		this.island[1]="SEAGULL ISLAND";
		this.island[2]="JUVE ISLAND";
		this.island[3]="KHOT JUVA ISLAND";
		this.island[4]="PANKHOL JAVA ISLAND";
		this.island[5]="NIVATI ISLAND";
		this.island[6]="GO TO NEXT CATEGORY";
		
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
		
		

}

class LightHouse extends TourismParent{


			static String lighthouse[]=new String[5];
			
				
			void setLightHouseNames(){
			this.lighthouse[0]="DEVGAD LIGHTHOUSE";
			this.lighthouse[1]="ACHRA LIGHTHOUSE";
			this.lighthouse[2]="VENGURLA LIGHTHOUSE";
			this.lighthouse[3]="NIVATI LIGHTHOUSE";
			this.lighthouse[4]="GO TO NEXT CATEGORY";
			
		
			}
			
			void getLightHouseNames(){
			String str1=String.format("%75s","Lighthouse QUOTES");
		System.out.println("\n\n\n");
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		System.out.print(String.format("%-55s","                    1."+lighthouse[0]));
		System.out.print(String.format("%-40s","2."+lighthouse[1]));
		System.out.print(String.format("%-30s","3."+lighthouse[2]));
		System.out.println("\n\n\n");
		System.out.print(String.format("%-55s","                    4."+lighthouse[3]));
		System.out.print(String.format("%-40s","5."+lighthouse[4]));
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

}

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
		
		
}



