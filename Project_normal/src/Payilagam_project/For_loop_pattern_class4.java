package Payilagam_project;

public class For_loop_pattern_class4 {

	public static void main(String[] args) {
		
		For_loop_pattern_class4 task = new For_loop_pattern_class4();
		//task.pattern1();
		//task.pattern2();
		//task.pattern3();
		//task.pattern4();
		  //task.pattern5();
		  //task.pattern6();
		  //task.pattern7();
		    task.pattern8();
		    
	}

	private void pattern8() {
	         for(int row =5;row>=1;row--)
	         {
	         
	         for(int space=5;space>=row;space--) {
	        	 System.out.print(" ");
	         }
	        	 for(int col=row;col>=1;col--)
	        	 {
	        	 System.out.print(" "+col+" ");
	 
	        	 }
	        	 System.out.println();
	}
	}

	private void pattern7() {
		for(int row =1;row<=5;row++)
		{
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			for(int col =5;col>=row;col--) {
				System.out.print(" "+col+" ");
				
			}
		         System.out.println();	
		}
		
	}

	public void pattern6() {
		     for(int row =5;row>=1;row--)
		     {
		       for(int space =4;space>=row;space-- )
		{
			    System.out.print(" ");
		}
			    for(int col =1;col<=row;col++)
				{
				System.out.print(" "+row+" ");
					
				}
		
		        System.out.println();
	}}

	public void pattern5() {
		    for(int row =1;row<=4;row++)
		  {
		    for(int space =1;space<row;space++)
				{
					System.out.print(" ");
				}
				
			for(int col =4;col>=row;col--)
			{
				System.out.print(" "+row+" ");
				
			}
			     System.out.println();
		}
		
	}

	public void pattern4() {
		System.out.println("#pattern program 4#");
		for(int row =4;row>=1;row--)
		{
		{for(int space =4;space>=row;space--)
			System.out.print(" ");
		}
			
		for(int col =1;col<=row;col++)
		{
			System.out.print(" "+col+"");
		}
		     System.out.println();
		}
	}

	private void pattern3() {
		System.out.println("#pattern program 3#");
		for(int row =1;row<=5;row++)
		{for(int col =1;col<=row;col++)
		{
			System.out.print(col+" ");
		}
		for(int star =4;row<=star;star--)
		{
		System.out.print("  *");
		}
		System.out.println();
		}
	}

	public void pattern2() {
		System.out.println("#pattern program 2#");
		for(int row =1;row<=5;row++)
		{for(int col =1;col<=row;col++)
		{
			System.out.print(col+" ");
			
		}
		for(int star = 4;row<=star;star--)
		{	
			System.out.print("*"+" ");
		}
		System.out.println();
		}	
	}

	private void pattern1() {
		System.out.println("#pattern program 1#");
		    for(int row =1;row<=5;row++)
		{
		   for(int col =4;col>=row;col--)
		{
			System.out.print("    ");
		}
			for(int no =1;no<=row;no++)//number value is increase so put ++
			{
				
			System.out.print("    "+no+"    ");
		
			}
			 System.out.println();
	}
		   
	}
}
