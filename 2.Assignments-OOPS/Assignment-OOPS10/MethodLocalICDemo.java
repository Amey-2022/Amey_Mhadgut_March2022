class MethodLocalIC{

		void m1(){
			int x=10; // java 6,7 this was kept tobe final but in 8 no need to declare final
			System.out.println(x); 
		
		
		class MLIC{ //cant apply public pvt protected to method inner class //map with local variables properties	
			
			int y=20;
			
				void m2(){
				System.out.println("MLIC:m2()");
				System.out.println(x);//10
				//x=100; cant be modify in inner class
				}
			
		}
			
			MLIC mlic=new MLIC();
			mlic.m2();
			System.out.println("mlic.y: "+mlic.y);
			
			
			
		}

}

class MethodLocalICDemo{
				public static void main(String... args){
				MethodLocalIC mlic=new MethodLocalIC();
				mlic.m1();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}


}

		