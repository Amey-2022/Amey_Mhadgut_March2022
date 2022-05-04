package miniproject;
class TourismParent{
	static String sel[]=new String[72];
	static int i=0;
	
	void TourismParent(){
		
		System.out.println("\n\n\n");
		String str1=String.format("%76s","YOUR WISHLIST");
		
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(str1);
		System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\n");
		
		
			for (int i=0;i<=72;i++)
			{
				System.out.println();
				if (sel[i]==null)
					break;
			System.out.print(String.format("%-55s","                    "+sel[i]));
			i++;
				if (sel[i]==null)
					break;
			System.out.print(String.format("%-40s",sel[i]));
			i++;
				if (sel[i]==null)
					break;
			System.out.print(String.format("%-30s",sel[i]));
			System.out.println("\n\n");
			}
			//visit again
	}
	
	
}