class VarArgument{

		static void add(int a,int b,int... arr){
			int result=a+b;
		for(int i=0;i<arr.length;i++){
			result=result+arr[i];
		}
		System.out.println(result);
		}
		
		static void m1(int... arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

		
			
		
		public static void main(String[] args){
			//VarArgument.add();
		    VarArgument.add(5,2);//7
			VarArgument.add(2,8,2,3,5,1);//21
			
			
			int ary[]=new int[5];
			m1(ary);//0 0 0 0 0 
			m1(1,4,7,5,5,6);//1 4 7 5 5 6
			
			
		}

}