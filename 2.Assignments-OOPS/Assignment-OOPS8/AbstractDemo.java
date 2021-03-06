abstract class Vehicle{
		abstract void noOFWheels();

		abstract void engineCapacity();

}

abstract class TwoWheeler extends Vehicle{
	void noOFWheels(){
	
		System.out.println("2 Wheels");
	}
}

abstract class FourWheeler extends Vehicle{
	void noOFWheels(){
		System.out.println("4 Wheels");
	}
}

class Activa125 extends TwoWheeler{
	void engineCapacity(){
	System.out.println("Activa:125CC");	
	}
}
class I20 extends FourWheeler{
	void engineCapacity(){
	System.out.println("I20:1200CC");	
	}
}

class AbstractDemo{
	public static void main(String... args){
		Vehicle v1=new Activa125();
		Vehicle v2=new I20();
		
		v1.engineCapacity();
		v2.engineCapacity();
		
		TwoWheeler twv = new Activa125();
		FourWheeler fwv = new I20();
		
		twv.noOFWheels();
		fwv.noOFWheels();
		
		twv.engineCapacity();
		fwv.engineCapacity();
	}
		
	}
	
	
/*OUTPUT

Activa:125CC
I20:1200CC
2 Wheels
4 Wheels
Activa:125CC
I20:1200CC

*/