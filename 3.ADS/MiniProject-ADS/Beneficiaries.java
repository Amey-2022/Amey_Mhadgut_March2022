import java.util.*;



class Beneficiaries implements Comparable<Beneficiaries>{
			 String name,ifscNumber;
			 Long mobileNumber,bankAccountNumber;
			 
			 public Beneficiaries(String name, Long mobileNumber, Long bankAccountNumber, String ifscNumber){
				 this.name=name;
				 this.mobileNumber=mobileNumber;
				 this.bankAccountNumber=bankAccountNumber;
				 this.ifscNumber=ifscNumber;
			 }
		
		
		
		//toString method
	@Override
	public String toString(){
		return this.name+","+this.mobileNumber+","+this.bankAccountNumber+","+this.ifscNumber;
	}
	
	//equals method
	@Override
	public boolean equals(Object o){
				
		if(o instanceof Beneficiaries){
		Beneficiaries temp=(Beneficiaries)o;
		if(this.name.equals(temp.name)&&
		this.mobileNumber.equals(temp.mobileNumber))
		return true;
		}
		return false;
	}
	
	//hashcode
	@Override
	public int hashCode(){
		int prime = 17;
		prime = prime + this.name.hashCode();
		prime = prime + this.mobileNumber.hashCode();
		return prime;
	}
	
	@Override
	public int compareTo(Beneficiaries b){
		return this.name.compareTo(b.name);
	}
}
	
class BeneficiariesDemo{
	public static void main(String... args){
				TreeSet<Beneficiaries> setMoneyTransfer=new TreeSet<Beneficiaries>();
				
				Beneficiaries b1=new Beneficiaries("Amey Anil Mhadgut",9476664269L,67543560098L,"SBIN00657");
				Beneficiaries b2=new Beneficiaries("Amey Ramesh Patekar",9978564356L,67894127868L,"SBIN00960");
				Beneficiaries b3=new Beneficiaries("Chandrakant Shringarputale",9674265679L,87563433567L,"SBIN00076");
				Beneficiaries b4=new Beneficiaries("Ajay Shivbans Yadav",9996325767L,76423567889L,"SBIN00660");
				Beneficiaries b5=new Beneficiaries("Ajinkya Vijay Chinchkar",9424788657L,64568987898L,"SBIN00786");
				Beneficiaries b6=new Beneficiaries("Akansha Agrawal",7546778354L,79865874236L,"SBIN00754");
				Beneficiaries b7=new Beneficiaries("Akash Pravin Jadhao",7523455676L,55869435237L,"SBIN00663");
				Beneficiaries b8=new Beneficiaries("Akash Shankar Chavan",7865256679L,74653542998L,"SBIN00654");
				Beneficiaries b9=new Beneficiaries("Akshay Balasaheb Jadhav",7324356789L,68576542878L,"SBIN00430");
				Beneficiaries b10=new Beneficiaries("Akshay Meghashyam Dhande",8975634568L,65680008435L,"SBIN00089");

				setMoneyTransfer.add(b1);
				setMoneyTransfer.add(b2);
				setMoneyTransfer.add(b3);
				setMoneyTransfer.add(b4);
				setMoneyTransfer.add(b5);
				setMoneyTransfer.add(b6);
				setMoneyTransfer.add(b7);
				setMoneyTransfer.add(b8);
				setMoneyTransfer.add(b9);
				setMoneyTransfer.add(b10);
				
				System.out.println(setMoneyTransfer.size());   
				//System.out.println(setMoneyTransfer);
				//Collections.sort(setMoneyTransfer);
				System.out.println(setMoneyTransfer);
	}
				

}