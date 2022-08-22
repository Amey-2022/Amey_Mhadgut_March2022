package miniproject;
interface Services{
	
	void silverPackage();
	void goldenPackage();
	void platinumPackage();
	void diamondPackage();	

}


class ServicePackages implements Services{
	
	public void silverPackage(){
		System.out.print("silverPackage :2000/- pp           ");
		
	
	
	}
	
	public void goldenPackage(){
		System.out.print("goldenPackage :5000/- pp           ");
	
	}
	
	public void platinumPackage(){
		System.out.print("platinumPackage :10000/- pp           ");
	
	}
	
	public void diamondPackage(){
		System.out.print("diamondPackage :25000/- pp");
	
	
	}
} 

class packages {
	public static void main(String []args){
		
		
		
	}
} 
