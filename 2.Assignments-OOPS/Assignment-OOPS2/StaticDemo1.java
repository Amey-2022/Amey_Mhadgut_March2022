//Stack overflow exception
class StaticBlock{

}

class StaticDemo1{
			static void m1(){
			System.out.println("method m1");
			m2();
			}
			
			static void m2(){
			System.out.println("method m1");
			m1();
			}
			
			public static void main(String[] args){
			m1();
			
			
			
			}
			

}