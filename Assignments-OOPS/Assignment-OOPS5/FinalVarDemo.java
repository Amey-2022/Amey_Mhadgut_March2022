class FinalVar{
		final static int i;
		static{
			i=10;
		}
	final static boolean bool=false;	
		
	final int a;
	int b;
		FinalVar(int x,int y){
		this.a=x;
		this.b=y;
		}

}


					class FinalVarDemo{
					public static void main(String... args){
						final int i=10;
						final FinalVar fv=new FinalVar(15,20);
						
						System.out.println("FinalVar.i "+FinalVar.i);
						System.out.println("FinalVar.bool "+FinalVar.bool);
						System.out.println("fv.a "+fv.a);
						System.out.println("fv.b "+fv.b);
						
						//fv.a=14;
						fv.b=16;
						
						System.out.println("fv.a "+fv.a);
						System.out.println("fv.b "+fv.b);
					}
}