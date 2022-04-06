class PBV{
int a;
int b;

		PBV(int a,int b){
		this.a=a;
		this.b=b;
		}
		
		
		static void m1(PBV o1,PBV o2){
			o1.a=100;
			o1.b=200;
			o2.a=300;
			o2.b=400;
			
		}
		void m2(PBV o){
			this.a=1000;
			this.b=2000;
			o.a=3000;
			o.b=4000;
		 
		 
	 }
}


			class PBVDemo{
				public static void main(String[] args){
					PBV oa1=new PBV(15,12);
					PBV oa2=new PBV(14,45);
					
					System.out.println("oa1: "+oa1.a+", oa1.b :"+oa1.b );//15 12
					System.out.println("oa2: "+oa2.a+", oa2.b :"+oa2.b );// 14 45
					
					PBV.m1(oa1,oa2);
					System.out.println("oa1: "+oa1.a+", oa1.b :"+oa1.b );//100 200
					System.out.println("oa2: "+oa2.a+", oa2.b :"+oa2.b );//300 400
					
					
					oa1.m2(oa2);
					System.out.println("oa1: "+oa1.a+", oa1.b :"+oa1.b );//1000 2000 
					System.out.println("oa2: "+oa2.a+", oa2.b :"+oa2.b );//3000 4000
					
					oa2.m2(oa1);
					System.out.println("oa1: "+oa1.a+", oa1.b :"+oa1.b );//3000  4000
					System.out.println("oa2: "+oa2.a+", oa2.b :"+oa2.b );//1000 2000
					
					PBV.m1(oa2,oa1);
					System.out.println("oa1: "+oa1.a+", oa1.b :"+oa1.b );//300 400
					System.out.println("oa2: "+oa2.a+", oa2.b :"+oa2.b );//100 200
				}
				
				
			}