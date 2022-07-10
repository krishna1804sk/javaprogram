package Payilagam_project;

public class For_loop_examble {

	public static void main(String[] args) {
		for(int row =1; row<=6;row++)
		{
			
		for(int col =1;col<=5;col++)
		{
			if(row%2==0)
			{
				System.out.print(-1);
			}
			else {
			System.out.print("1");
			
		}
		}
		System.out.println();
	}
		
		
		For_loop_examble task = new For_loop_examble();
		//task.pattern1();
		//task.pattern2();
		  task.pattern3();
		
	}

	private void pattern3() {
		for(int row =1;row<=5;row++)
		{
		for(int col=row;col<=5;col++)
		{
			System.out.print(row);
		}
	     System.out.println();	
	}
	}
	private void pattern2() {
		for(char row ='E';row>='A';row--)
		{
		for(char col ='A';col<=row;col++)
		{
			System.out.print(" "+col+" ");
		}
		System.out.println();
	}
	}
	private void pattern1() {
		               System.out.println();
		for(int col =1;col<=10;col=col+2)
		{
			System.out.print(col);
			
			if(col==9)
			{
				col=0;
				System.out.println();
			}
	}
		
}
	}

