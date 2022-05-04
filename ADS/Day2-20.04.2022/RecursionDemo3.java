//finite loop
class RecursionDemo3{
	
		static int recursion(int x){
		
			if(x==4)
				return x;
			else
				return 2*recursion(x-1);
		}
		
		public static void main(String args[]){
			System.out.println(recursion(3));
		}
}