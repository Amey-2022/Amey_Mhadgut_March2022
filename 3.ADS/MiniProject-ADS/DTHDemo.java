import java.util.*;



class DTH implements Comparable<DTH>{
			 String name,month,date;
			 Long customerNumber;
			
			 
			 public DTH(String name, Long customerNumber, String month, String date){
				 this.name=name;
				 this.customerNumber=customerNumber;
				 this.month=month;
				 this.date=date;
			 }
		
		
		
		//toString method
	@Override
	public String toString(){
		return this.name+","+this.customerNumber+","+this.month+","+this.date;
	}
	
	//equals method
	@Override
	public boolean equals(Object o){
				
		if(o instanceof DTH){
		DTH temp=(DTH)o;
		if(this.name.equals(temp.name)&&
		this.customerNumber.equals(temp.customerNumber))
		return true;
		}
		return false;
	}
	
	//hashcode
	@Override
	public int hashCode(){
		int prime = 17;
		prime = prime + this.name.hashCode();
		prime = prime + this.customerNumber.hashCode();
		return prime;
	}
	
	@Override
	public int compareTo(DTH d){
		return this.customerNumber.compareTo(d.customerNumber);
	}
}
	
class DTHDemo{
	public static void main(String... args){
				TreeSet<DTH> setDTHRecharge=new TreeSet<DTH>();
				
				DTH d1=new DTH("Amey Anil Mhadgut",11111111111L,1000,"May","05/05/2022");
				DTH d2=new DTH("Amey Ramesh Patekar",11111111112L,1501,"May","05/05/2022");
				DTH d3=new DTH("Chandrakant Shringarputale",11111111113L,1050,"May","05/05/2022");
				DTH d4=new DTH("Ajay Shivbans Yadav",11111111114L,600,"May","05/05/2022");
				DTH d5=new DTH("Ajinkya Vijay Chinchkar",11111111115L,900,"May","05/05/2022");
				DTH d6=new DTH("Akansha Agrawal",11111111116L,1005,"May","05/05/2022");
				DTH d7=new DTH("Akash Pravin Jadhao",11111111117L,1006,"May","05/05/2022");
				DTH d8=new DTH("Akash Shankar Chavan",11111111118L,788,"May","05/05/2022");
				DTH d9=new DTH("Akshay Balasaheb Jadhav",11111111119L,1008,"May","05/05/2022");
				DTH d10=new DTH("Akshay Meghashyam Dhande",11111111120L,1928,"May","05/05/2022");

				setDTHBill.add(d1);
				setDTHBill.add(d2);
				setDTHBill.add(d3);
				setDTHBill.add(d4);
				setDTHBill.add(d5);
				setDTHBill.add(d6);
				setDTHBill.add(d7);
				setDTHBill.add(d8);
				setDTHBill.add(d9);
				setDTHBill.add(d10);
				
				// System.out.println(setMoneyTransfer.size());   
				// //System.out.println(setMoneyTransfer);
				// //Collections.sort(setMoneyTransfer);
				// System.out.println(setMoneyTransfer);
	}
				

}