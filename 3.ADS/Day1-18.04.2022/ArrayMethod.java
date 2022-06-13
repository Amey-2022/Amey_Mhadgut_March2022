import java.util.*;


class ArrayMethod{
	
			Scanner sc=new Scanner(System.in);
		
			int size=sc.nextInt();
			int arr[]=new int[size];
	
			
			int i=0;
			void insertElements(){
				
				for ( i=0;i<arr.length;i++){
					System.out.print("Array["+i+"] = ");
					arr[i]=sc.nextInt();
				}
			}
			
			void displayElements(){
				System.out.println("\n");
				System.out.println("Your Entries:");
				for( i=0;i<arr.length;i++){
					System.out.println("Array["+i+"] = "+arr[i]);
				}
			}
			
			void searchElements(){
				System.out.println("\n");
				System.out.println("Enter your Search Value");
				int key=sc.nextInt();
				for( i=0;i<arr.length-1;i++){
					if(key==arr[i])
					break;
				}
				
				if(arr[i]==key){
				System.out.println("Found "+key+" at "+i+" number index");}
				else{
				System.out.println("Not Found "+key);}
			}
			
			void deleteElements(){
				System.out.println("\n");
				System.out.println("Enter Value to be deleted");
				int r=sc.nextInt();
				
				for( i=0;i<arr.length;i++){
					if(arr[i]==r)
					break;
				}
				
				if(arr[i]==r){
					for(int m=i;m<arr.length-1;m++){
						
						arr[m]=arr[m+1];
					}
				}
				System.out.println("\n");
				System.out.println("Array After Deleting "+r);
				for( i=0;i<arr.length-1;i++){
					System.out.println(arr[i]);
				}
						
			}
			
			
			public static void main(String... args){
				System.out.println("Enter size of Array: ");
				ArrayMethod am=new ArrayMethod();
				am.insertElements();
				am.displayElements();
				am.searchElements();
				am.deleteElements();
				
			}
			
			
		


}