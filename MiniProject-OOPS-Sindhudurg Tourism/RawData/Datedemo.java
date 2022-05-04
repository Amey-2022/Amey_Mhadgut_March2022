package miniproject;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;  
class Datedemo {

   void DateFunction() { 
   
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\n");
		String str1=String.format("%76s","SELECT YOUR DATE");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	
		LocalDate date=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		//printing LocalDate
		System.out.println("                    Today's Date : "+formatter.format(date));
		System.out.println("\n\n");
		for(int j=1;j<=91;j++)
		{
			System.out.print(String.format("%-48s","                    "+j+". "+formatter.format(date.plusDays(j))));
			j++;
			if(j==91)
			{break;}
			System.out.print(String.format("%-27s",j+". "+formatter.format(date.plusDays(j))));
			j++;
			if(j==91)
				{break;}
			System.out.print(String.format("%-27s",j+". "+formatter.format(date.plusDays(j))));
			j++;
			if(j==91)
				{break;}
			System.out.print(String.format("%-27s",j+". "+formatter.format(date.plusDays(j))));
			System.out.println("\n\n");
		}
		System.out.println("\n\n");
		
		System.out.print("                    Enter Number on which date you are visiting : ");
		int n=sc.nextInt();
		LocalDate visitDate = date.plusDays(n);
		System.out.println("\n\n");
		System.out.println("                    Your Visiting Date : "+formatter.format(visitDate));
	
		//converting LocalDate into String
		String vd=visitDate.format(DateTimeFormatter.ISO_DATE); 
		String month=vd.substring(5,7);
			//System.out.println(month);	
		int i=Integer.parseInt(month);
		
		
		/*if(i==6||i==7||i==8||i==9)
			System.out.println("Mansoon");
		else
			System.out.println("Waterfall category is not available");*/
}  
}


  
