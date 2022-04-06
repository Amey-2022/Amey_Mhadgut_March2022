//reference datatype or reference object.

class StaticBlock{

}

class Printer{
	static int g=789;
	int x=15;
	int y=89;
	
	
	 void print(){
		System.out.println("Print");
		System.out.println(x);
		System.out.println(y);
		
	 }
	
	
}



class StaticDemo2{
			int a=120;
			int b=160;
			
		void print(){
		System.out.println("Print");
		System.out.println(a);
		System.out.println(b);
		System.out.println(Printer.g);
		}	


			public static void main(String[] args){
			/*creating object of class StaticDemo2
			ClassName varName=new ClassName();
			LHS 				RHS 
			Reference			Object
			(stack memory) 		(heap memory)
			*/
			
			
			StaticDemo2 d=new StaticDemo2();
			StaticDemo2 d1=new StaticDemo2();
			Printer p=new Printer();
			
			
			System.out.println(d.a);
			System.out.println(d.b);
			
			d.print();
			
			d.a=400;
			d.b=500;
			
			d.print();
			
			d1.print();
			
			System.out.println(d.a);
			System.out.println(d.b);
			
			System.out.println(p.x);
			System.out.println(p.y);
			p.print();
			
			
			}


}