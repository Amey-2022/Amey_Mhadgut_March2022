interface I1{
	void m1();
}

interface I2{
void m4();

}



class AnonymousDemo2{
		static void m2(I1 a){
			a.m1();
		}
		
		static void m3(I2 a){
			a.m4();
		}
		
		
		public static void main(String[] args){
			
			I1 i=new I1(){
			@Override
			public void m1(){
			System.out.println("Child:m1()");
			
			}
			
		};
		
		m2(new I1(){
			@Override
			public void m1(){
			System.out.println("Child:m1() 2nd version");
			
			}	
		});
		
		m3(new I2(){
			@Override
			public void m4(){
			System.out.println("Child:m4()");
			
			}	
		});



}
}