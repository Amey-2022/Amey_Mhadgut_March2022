import java.util.*;

class MaxNumOfElement{
		static Scanner sc=new Scanner(System.in);
		static int count1=0;
		static int row=0;
		
		static void getArrayElements(int A[][],int n1,int n2){
			System.out.println("Enter Array Elements:");
			
			for(int i=0;i<n1;i++){
				for(int j=0;j<n2;j++){
					
					System.out.print("A["+i+"]["+j+"]= ");
					A[i][j]=sc.nextInt();
				}
			}	
		}
		
		static void countOne(int A[][],int n1,int n2){
			for(int i=0;i<n1;i++){
				int count2=0;
				for(int j=0;j<n2;j++){
					if(A[i][j]==1){
						count2++;
						if(count2>count1){
							count1=count2;
							row=i;
						}
					}		
				}	
			}
		}
		static void display(){
			System.out.println("Row : "+row);
			System.out.println("No of ones : "+count1);
		}
		
	public static void main(String args[]){
	
		System.out.println("Enter size of 2D-Array  :  ");
		System.out.println("No. of rows: ");
		int n1=sc.nextInt();
		System.out.println("No. of columns: ");
		int n2=sc.nextInt();
		
		int A[][]=new int[n1][n2];
		
		MaxNumOfElement m = new MaxNumOfElement();
		m.getArrayElements(A,n1,n2);
		m.countOne(A,n1,n2);
		m.display();
		
		
			
		
	}	
}