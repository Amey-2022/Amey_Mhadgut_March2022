//Finite Loop
class RecursionDemo1{
	static int i;
		public static void recursion(){
			++i;
			if(i<=5){
			System.out.println("Hello CDAC..!!!");
			recursion(); // recursive function call
			}
		}
		
		public static void main(String... args){
		recursion();//function call
		}
}

/*

Hello CDAC..!!!
Hello CDAC..!!!
Hello CDAC..!!!
Hello CDAC..!!!
Hello CDAC..!!!
*/