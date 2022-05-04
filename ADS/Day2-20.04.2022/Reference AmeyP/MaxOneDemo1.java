import java.util.*;

class MaxOne
{
		Scanner sc = new Scanner(System.in);
	
		int count1 = 0;
		int row = 0;
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int A[][] = new int[n1][n2];
		
	
		void acceptRecord()
		{
			System.out.println("Enter array size: ");
			
			
			System.out.println("Enter array Elements A : ");
			//System.out.println("n1 : "+n1 + "n2 : "+n2);
			for(int i = 0;i<n1;i++)
			{
				for(int j = 0;j<n2;j++)
				{
					System.out.print("A["+i+"]["+j+"]= ");
						A[i][j] = sc.nextInt();
				}
			}
		}
		
		void countOne()
		{
			for(int i = 0;i<n1;i++)
			{
				int count2=0;
				for(int j = 0;j<n2;j++)
				{

					if(A[i][j] == 1)
					{
						count2++;
						
						if(count2>count1)
						{
							count1=count2;
							row = i;
						}
					}
				}
			}
		}
			
	
	void display()
	{
		System.out.println("Row : "+this.row);
		System.out.println("No of ones : "+this.count1);
	}
}
class MaxOneDemo1
{
	
	public static void main(String args[])
	{
		System.out.println("Enter size of 2Darray  :  ");
		
		MaxOne m = new MaxOne();
		m.acceptRecord();
		m.countOne();
		m.display();
		

	}
}