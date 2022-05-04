import java.util.Scanner;

class ArrayReverse{
		public static void main(String... args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of Array: ");
			int size=sc.nextInt();
			int arr[]=new int[size];
			
			for (int i=0;i<arr.length;i++){
				System.out.print("Array["+i+"] = ");
				arr[i]=sc.nextInt();
			}
				
				
				System.out.println("\n");
				//reverse
				System.out.println("Reverse Array:");
				for(int i=arr.length-1;i>=0;i--){
					System.out.println("Array["+i+"] = "+arr[i]);
				}
	}
}