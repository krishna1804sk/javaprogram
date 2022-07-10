package Payilagam_project;

public class For_loop_task_three {

	public static void main(String[] args) {
		
		For_loop_task_three task = new For_loop_task_three();
		     //task.task1();
	         //task.task2();
	         //task.task3();
		       //task.task4();
		       
	}

	private void pattern() {
		for(int row =5;row>=1;row--)
		{
			for(int space =5;space>row;space--)
				
			{
				System.out.print(" ");
				
			}
			for(int col=row;col>=1;col--)
			{
				System.out.print(col+" ");
			}
			  System.out.println();
		}
		
	}

	public void task4() {
		int count =0; int i = 1;
		for(int col =1;col<=5;col = col+1)
		{      count = count+1;
			   System.out.print(" "+(col*i)+" ");
			   if(count == 5||count==10)
			{
				System.out.println();
				col=0;i++;
				if(count==10)
				{
				System.out.println();
				col=0;
					
				}
				
			}
				
			
		}
		
	}

	public void task3() {
		int count = 0;
		for(int col = 1;col<=5; col = col+1)
		{ 
		    count = count+1;
			System.out.print(" "+col*col+" ");
			if(count==5||count==10||count==15) {
			System.out.println();
			col=0;
				
				
				
			}
			
		}
		
	}

	public void task2() {
		     int count =0;
		     for(int col = 1;col<=9;col+=2)
		{    count =  count+1;
			 System.out.print(" "+col*col+" ");
			 if  (count==5||count==9||count==13)
			 {
			 System.out.println();
		     col = 1;
		     System.out.print(" "+col*col+" ");
			   
		}
		
	}
	}
	public void task1() {
		int count =0;
		
		      for(int col=1;col<=9;col=col+2)
		{     count = count+1;
			  System.out.print(" "+col+" ");
			  if(count ==5||count==9)
			{ System.out.println();
			  col =1;
			  System.out.print(" "+col+" ");
				
				
			}
			     
		
	}
	}
}
