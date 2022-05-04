import java.util.*;

class ArraySwitch{
		public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int choice;
		int i=0;
		do{
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter array Elements : ");
					for ( i=0;i<arr.length;i++){
					System.out.print("Array["+i+"] = ");
					arr[i]=sc.nextInt();
					}
					System.out.println("\n");
					break;
					
				case 2:	
					System.out.println("Your Entries:");
					for( i=0;i<arr.length;i++){
						System.out.println("Array["+i+"] = "+arr[i]);
					}
					System.out.println("\n");
					break;
					
				case 3:
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
					System.out.println("\n");
					break;
					
				case 4:
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
					System.out.println("\n");
					break;
					
		
			}
		}
		while(choice!=5);
	}
}