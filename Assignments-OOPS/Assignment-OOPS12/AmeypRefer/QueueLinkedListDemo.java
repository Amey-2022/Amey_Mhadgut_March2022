//to implement stack and queue using arraylist
import java.util.*;
class QueueLinkedListDemo{
	
	
	public static void main(String []args){
		LinkedList<Integer> list=new LinkedList<>();
		
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do{
			
			System.out.println();
			System.out.println("       ============================================");
			System.out.print("          1.Add\n          2.Remove\n          3.Peek\n          4.Display\n\n          Enter Number : ");
			choice=sc.nextInt();
			System.out.println();
			System.out.println("       ============================================");
		switch(choice){
			case 0:break;
			case 1: 
					System.out.print("          Add Element : ");
					int n=sc.nextInt();
					list.addLast(n);
					
					
				    break;
			case 2: if(list.isEmpty()){
						System.out.println("          Queue is Empty");
					}
					else{
					int x=list.pollFirst();
					
						System.out.println("          Removed Element is "+x);
					}
					break;
			case 3:if(list.isEmpty()){
						System.out.println("          Queue is Empty");
					}
					else{
						int x = list.getFirst();
						
						System.out.println("          Peek Element is "+x);
					}
						break;
			case 4:	if(list.isEmpty()){
						System.out.println("          Queue is Empty");
					}
					else{
					for(Integer i : list){
						
						System.out.print("        "+i);
						
						
						}
					}
					 break;
			default:System.out.println("          Entered Invalid Number");
					break;
		}
			
		}while (choice != 0);
	
	}
}

