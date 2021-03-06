import java.util.*;



class Electricity implements Comparable<Electricity>{
			 String name,month,date;
			 Long customerNumber;
			 Integer amount;
			 
			 public Electricity(String name, Long customerNumber, Integer amount, String month, String date){
				 this.name=name;
				 this.customerNumber=customerNumber;
				 this.amount=amount;
				 this.month=month;
				 this.date=date;
			 }
		
		
		
		//toString method
	@Override
	public String toString(){
		return this.name+","+this.customerNumber+","+this.amount+","+this.month+","+this.date;
	}
	
	//equals method
	@Override
	public boolean equals(Object o){
				
		if(o instanceof Electricity){
		Electricity temp=(Electricity)o;
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
	public int compareTo(Electricity e){
		return this.customerNumber.compareTo(e.customerNumber);
	}
}
	
class ElectricityDemo{
	public static void main(String... args){
				TreeSet<Electricity> setElectricityBill=new TreeSet<Electricity>();
				
				Electricity e1=new Electricity("Amey Anil Mhadgut",11111111111L,1000,"April","05/05/2022");
				Electricity e2=new Electricity("Amey Ramesh Patekar",11111111112L,1501,"April","05/05/2022");
				Electricity e3=new Electricity("Chandrakant Shringarputale",11111111113L,1050,"April","05/05/2022");
				Electricity e4=new Electricity("Ajay Shivbans Yadav",11111111114L,600,"April","05/05/2022");
				Electricity e5=new Electricity("Ajinkya Vijay Chinchkar",11111111115L,900,"April","05/05/2022");
				Electricity e6=new Electricity("Akansha Agrawal",11111111116L,1005,"April","05/05/2022");
				Electricity e7=new Electricity("Akash Pravin Jadhao",11111111117L,1006,"April","05/05/2022");
				Electricity e8=new Electricity("Akash Shankar Chavan",11111111118L,788,"April","05/05/2022");
				Electricity e9=new Electricity("Akshay Balasaheb Jadhav",11111111119L,1008,"April","05/05/2022");
				Electricity e10=new Electricity("Akshay Meghashyam Dhande",11111111120L,1928,"April","05/05/2022");

				setElectricityBill.add(e1);
				setElectricityBill.add(e2);
				setElectricityBill.add(e3);
				setElectricityBill.add(e4);
				setElectricityBill.add(e5);
				setElectricityBill.add(e6);
				setElectricityBill.add(e7);
				setElectricityBill.add(e8);
				setElectricityBill.add(e9);
				setElectricityBill.add(e10);
				
				// System.out.println(setMoneyTransfer.size());   
				// //System.out.println(setMoneyTransfer);
				// //Collections.sort(setMoneyTransfer);
				// System.out.println(setMoneyTransfer);
	}
				

}