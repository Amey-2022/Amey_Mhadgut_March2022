class A{
		int x;
		int y;

}

class InstanceRefVariable{
		int i;
		int j;
		 A a;

}

			class InstanceRefVariableDemo{
			public static void main(String[] args){
			InstanceRefVariable irv=new InstanceRefVariable();
			irv.i=100;
			irv.j=200;
			irv.a=new A();
			
			
			irv.a.x=300;
			irv.a.y=400;
			
			
			System.out.println("irv.i "+irv.i);
			System.out.println("irv.j "+irv.j);
			System.out.println("irv.a.x "+irv.a.x);
			System.out.println("irv.a.y "+irv.a.y);
			}

}