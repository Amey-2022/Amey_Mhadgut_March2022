class MethodLocalIC{

		void m1(){
			int x=10;
			System.out.println(x);
			
			class MLIC{ //cant apply public pvt protected to method inner class
			int y=20;
			
				void m2(){
				System.out.println("MLIC:m2()");
				}
			
			}
			
			MLIC mlic=new MLIC();
			mlic.m2();
			System.out.println("mlic.y: "+mlic.y);
			
			
			
		}

}

class MethodLocalICDemo{
				public static void main(String... args){
				MethodIC 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}


}

		