

public void home(){
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println(String.format("%80s","=================================================="));
		System.out.print(String.format("%31s","|"));
		System.out.print(String.format("%37s","ONLINE PAYMENT APPLICATION"));
		System.out.print(String.format("%12s","|"));
		System.out.println();
		System.out.println(String.format("%80s","=================================================="));
		
		System.out.println();
		System.out.println(String.format("%-100s",String.format("%60s","MONEY TRANSFER")));
		System.out.println();
		System.out.print(String.format("%-50s",String.format("%70s","BANK                        MOBILE\n")));
		System.out.print(String.format("%-50s",String.format("%70s","TRANSFER                     TRANSFER\n")));
		System.out.print(String.format("%-50s",String.format("%70s"," WALLET                       CHECK\n")));
		System.out.print(String.format("%-50s",String.format("%70s","RECHARGE                     BALANCE\n")));
		System.out.print(String.format("%-50s",String.format("%70s","MOBILE NUMBER       : ")));
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(String.format("%-50s",String.format("%60s","1.HOME                       0.EXIT")));
		System.out.println(String.format("%80s","=================================================="));
		System.out.print(String.format("%46s","ENTER CHOICE : "));
		choice=sc.nextInt();
	
		
	}
	