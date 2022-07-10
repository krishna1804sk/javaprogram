package Payilagam_project;

public class For_loop_task_two {

	public static void main(String[] args) {
		For_loop_task_two task = new For_loop_task_two();
		/*
		 * task.task1(); task.task2(); task.task3(); task.task4();
		 */  
		//task.task5();
		//task.column_row();
		//task.one_and_mines_one();	
	    //task.one_and_mines_one1();
	       task.if_use();
	}
	public void if_use() {
		
		   for(int col = 1;col<=10;col=col+2)
		    {
			System.out.print(" "+col+" ");
			    if(col==9)
			{
			    	col =0;
			    	System.out.println();
				
			}
			  
		}
		
	}
	private void one_and_mines_one1() {
		for(int row = 1;row<=6;row++)
		{
        for(int col =1;col<=5;col++)
        {
        	if(row%2!=0)
        	{System.out.print(" "+ 1+" ");	
        		
        	}
        	else
        	{
        		System.out.print("  "+-1+" ");
        	}
        	}
        System.out.println();
        }
              
		}
	

	public void one_and_mines_one() {
		for(int row =1;row<=3;row++)
		{
		for(int col = 1;col<=5;col++)
		
		{
		System.out.print("  "+ 1+" ");
			
		}
		System.out.println();
		for(int col =1;col<=5;col++)
		{
		System.out.print(" "+ -1 +" ");
		
	}
		System.out.println();
	}
	}
	public void column_row() {
		for(int row =1;row<=7;row+=2)
		{
		for(int col = 1;col<=3;col++)
		{
		System.out.print(row+"  ");
			
		}
			System.out.println();
		}
		
	
	}
	private void task5() {
		for(int col=1;col<=10; col+=2)
		{
		System.out.print(col+" "); 
		if(col==9)
		{
		col = 0;
		System.out.println(); 
		}
		} 
		
	}

	public void task4() {
		System.out.println();
		int multi=1;
		for(int count =1;count<=3;count++)
		{
		int result = 1;
		for(int no = 1;no<=5;no++)
		{
			result = no*multi;
			System.out.print(" "+result+" ");
			
			
		}
		System.out.println();
		System.out.println();
		multi++;
		}
	}
	public void task3() {
		System.out.println();
		
		for(int count =0;count<5;count++)
		{
		int multi =1;int result =0;// 
		for(int no =1 ; no<=5;no++)
		{
		result = 1*(multi)+result;//
		multi = multi+2;
		System.out.print(result+" ");
		}
		System.out.println();
		}
		
	}

	public void task2() {
		System.out.println();
		for(int count = 1;count<=3;count++)
		{
		int multi = 0; int result = 1;
		for(int no = 1;no<=5;no++)
		{
		    result = result+(8*multi); 
			multi++;
			System.out.print(result+" ");
		}
		    System.out.println();
		}
	}

	public void task1() {
		  
	      for(int count = 0;count<3;count++ )
	  {
		   for(int no =1;no<=5;no++)
		 {
		   int multi = no*2;
		   int result = multi-1;
		   System.out.print(result+"  ");
		 }
			
		    System.out.println();
	     }

}
}