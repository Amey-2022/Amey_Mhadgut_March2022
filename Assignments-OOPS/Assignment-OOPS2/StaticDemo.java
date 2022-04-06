//Static method and  variable and static block


class StaticBlock{
				static byte b; //static variable/class variable.
				static int i;
				static short s;
				static long l;
				static float f;
				static double d;
				static char c;
				static boolean bool;
 
 static{
	b=10;
	i=100;
	c='a';
	s=45;
	l=34563;
	f=4.14578345f;
	d=1.12452552652262522630;
	bool=true;
	}
	
	 void print(){
	System.out.println(StaticBlock.b); 
	System.out.println(StaticBlock.i);
	b=12;
	i=52;
	
	}
}


class StaticDemo{
			public static void main(String[] args){
				System.out.println(StaticBlock.b); //10
				System.out.println(StaticBlock.i); //100
				System.out.println(StaticBlock.s);
				System.out.println(StaticBlock.l);
				System.out.println(StaticBlock.f);
				System.out.println(StaticBlock.d);
				System.out.println(StaticBlock.c);
				System.out.println(StaticBlock.bool);
				
				
				StaticBlock.b=15;
				StaticBlock.i=47;
				StaticBlock.c=68;
				StaticBlock.s=68;
				System.out.println(StaticBlock.b); 
				System.out.println(StaticBlock.i);
				System.out.println(StaticBlock.c);
				System.out.println(StaticBlock.s);
				
				StaticBlock.print();
				System.out.println(StaticBlock.b); 
				System.out.println(StaticBlock.i);
}


}