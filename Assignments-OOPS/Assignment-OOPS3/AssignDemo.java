class Assign{
	int x;
	int y;

}
			class AssignDemo{
			public static void main(String[] args){
			
			Assign a1=new Assign();
			Assign a2=new Assign();
			Assign a3=new Assign();
			
			a2.x=90;
			a3.y=50;
			
			a1=a2;
			a2=a3;
			a3=a1;
			
			System.out.println(a1.x);
			System.out.println(a1.y);
			
			System.out.println(a2.x);
			System.out.println(a2.y);
			System.out.println(a3.x);
			System.out.println(a3.y);

			}
						
}

	