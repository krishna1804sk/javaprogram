package Payilagam_project;

public class Patten_program {

	public static void main(String[] args) {
		Patten_program task =new Patten_program();
		//task.patten1();
		//task.patten1_1();
		//task.patten2();
		//task.patten2_1();
		 //task.patter3();
		//task.patten4();
		 //task.patter5();
		 // task.pattern6();
		 // task.pattern7();
		  //task.pattern7_1();
		  // task.pattern8();
		 //task.pattern9();
		   //task.pattern10();
		//task.pattern2_1();
		//task.pattern11();
		  //task.pattern_12();
		 //task.pattern_13();
		//int c =2;
		//System.out.print((char)());
		//task.pattern_14();
		task.pattern_15();
		
}

	 private void pattern_15() {
		 System.out.println("#pattern-15#");
		 for(int row =1;row<=5;row++)
		 {	 
		 for(int col =5;row<=col;col--)
		 {
			 System.out.print(row+" ");
		 }
		 System.out.println();
	}
		 
	 }
	private void pattern_14() {
		 System.out.println("#pattern-14#");
		for(int row =5;1<=row;row--)
		{	 
		for(int col =1;col<=row;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
	}
	 }
	public void pattern_13() {
		 char count ='E'; 
	 
		 for(char row ='A';row<='E';row++)
		 {
		for(int col='A';col<='E';col++)
		{
			if(col==count)
			{ for(int i='A';row>=i;i++)
			{
				System.out.print(row+" ");
				col++;
			}
			}
			else {
				System.out.print(" ");
				
			}
		}
		 count--;
		 System.out.println(); 
		} 
		
	}
		 
	private void pattern_12() {
		int i =1; int count =5;
	
		for(int row =1;row<=5;row++)
		{
		for(int col =1;col<=5;col++)
		{
			if(count==col)
			{for(i=1;i<=row;i++)
				System.out.print(row+" ");
			col++;
			}
			else {
				
				System.out.print(" ");
			}
			
		}
		count--;
		System.out.println();
		}
	}
	public void pattern11() {
		 
	     int i =1;
		  for(int row =1;row<=9;row+=2)
		{	
		
		{
			for(i =1;(9-row)>=i;i++)
			{
				System.out.print(" ");
			
			}
			
			for(i =1;i<=row;i++)
			{	
				System.out.print("*"+" ");
			         
			}
			}
		
		       System.out.println();
		}
		
	
	
	 }
	private void pattern10() {
		 int count =5;
	    
		for(int row =1;row<=5;row++)
		{
		for(int col=1;col<=5;col++)
		{
			if(count==col)
			{      int i =1;
				for(;5>=col;col++)
				{   i++;
					System.out.print(((char)(71-i))+" ");
				}
		
			}
			   else {
				
				System.out.print(" ");
			}
		}
		       System.out.println();
		       count--;
		}
	}

	private void pattern9() {
		 int count =5; int i =1;
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=5;col++)
		{   if(count==col)
		{
			 i =1;
			for(;col<=5;col++)
			{
				System.out.print((char)((64+i))+" ");
				i++;
			}
		
		}
		 else {
			
			System.out.print(" ");
		}
		}
	         System.out.println();
	          count--;
	}
	 }
	public void pattern8() {
		 
	    int count =5; 
	    for(int row =5;row >=1;row--)
	    {	
		for(int col =1; col<=5;col++)
		{
			if(count ==col)
			{
				for(;  5 >= col;col++)
				{
					System.out.print(row+" ");
				}
			}
			else {
				System.out.print(" ");
				
			}
		}
		     System.out.println();
		count--;
	}
	 }
	private void pattern7_1() {
		 int count =5;
		for(int row=1;row<=5;row++)
		{	int i=1;
		for(int col=1;col<=5;col++)
		{
			if(count==col)
			{   int add=1;
				for(;i<=row;i++)
				{
					System.out.print((add)+" ");
					col++;
					add++;
				}
			}
			   else {
				   System.out.print(" ");
			}
		
			} 
		count--;
		 System.out.println();
	}
		
		}
	 
	public void pattern7() {
		     int rows = 5;
			System.out.println("## Printing the pattern ##");
			for (int i = 1; i <= rows; i++) 
	                { 
	              for (int j = rows; j > i; j--)
				{
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++)
				{
					System.out.print(k +" ");
				}
				System.out.println();
			}
		
	}

	public void pattern6() {
		 int i=5;  int count =1;
		for(int row =1;row<=5;row=row+1)
		{	
		for(int col=1;col<=5;col=col+1)
		{        
			if(col==i)
			for(count =i;count<=5;count++)
			{
				System.out.print(" "+"*"+" ");
			
			     col++;
			}	
			else {
				
				System.out.print(" "+" "+" ");
			}
		
		}
		       System.out.println();
	          	i--;
	 }
	 }	
	public void patter5() {
		         int i =65;
		         for(int row =1;row<=5;row++)
		         {
		         for(int col =65;col<=i;col++)
		         {
		        	 System.out.print(" "+(char)i+" ");
		         }
		         System.out.println();
		         i=i+1;
		         }
	}

	public void patten4() {
		  int i =1;
		 for(int row = 1;row<=5;row++)
		{
		 for(int col = 1;col<=i;col=col+1)
		{
			System.out.print(" "+i+" " );
		}
		     System.out.println();
		     i++;
    	}
		 
	  }
	public void patter3() {
		  int i =1;
		for(int row =1;row<=5;row++)
		{	  
		for(int col =1;col<=i;col = col+1)
		{
			System.out.print(" "+"*"+" ");
			
		}
		System.out.println();
		i = i+1;
	}
	  }
	public void patten2_1() {
		  int i =1;
		  for(int row =1;row<=5;row++)
		  {
		  for(int col = 1;i>=col;col++)
		  {
			  
			  System.out.print(" "+(char)(64+col)+"  ");
		  }
		   System.out.println();
	     	i = i+1;
		  }
	}

	     public void patten2() {
		{
			int alphabet = 65;
			int rows = 5;
		    System.out.println("## Printing the pattern ##");
		        for (int i = 1; i <= rows; i++)
		        {
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print((char)(alphabet + j -1) + " ");
		            }
		                 System.out.println();
		        }
		}
		
	}

	private void patten1_1() {
		int i=1;
		for(int row = 1;row<=5;row++)
		{
		for(int col =1;i>=col;col++)
		{
			System.out.print(" "+col+" ");
			
		}
		System.out.println();
		    i++;
		   
	}
	}
	private void patten1() {
		for(int col = 1;col<=1;col=col+1) 
		{
			System.out.print(" "+col+" ");
		}
		   System.out.println();
		for(int col = 1;col<=2;col=col+1) 
		{
			System.out.print(" "+col+" ");
		}
		    System.out.println();
		for(int col = 1;col<=3;col=col+1) 
		{
			System.out.print(" "+col+" ");
		}
	    System.out.println();
		for(int col = 1;col<=4;col=col+1) 
			{
				System.out.print(" "+col+" ");
			}
					
	    System.out.println();
	      for(int col = 1;col<=5;col=col+1) 
	  {
		    System.out.print(" "+col+" ");
	  }
	
		
	}

}
