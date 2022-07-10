package java_pattern;

public class Pattern {

	public static void main(String[] args) {
		Pattern task = new Pattern(); 
		      //task.pattern1();
		   /////task.pattern2();
	          //task.pattern3();
	          //task.pattern4();
		       //task.pattern5();
		      // task.pattern6();
		     // task.pattern7();
		     // task.pattern8();
		       //task.pattern9();
		      //task.pattern10();
		      //task.pattern11();
		     // task.pattern12();
		   //   task.pattern17();
		        task.pattern18();
		        task.pattern19();
		        task.pattern20();
		        task.pattern21();
		        task.pattern22();
		        task.pattern24();
		        task.pattern24usetwoforloop();
		        task.pattern25();
		        task.pattern25usetwoforloop();
		        task.pattern26();
		        task.pattern27();
		        task.pattern28();
		        task.pattern29();
		        task.pattern30();
		        task.pattern30_use_method();
		        task.pattern31();
		        task.pattern31_use_method();
		     // task.pattern32();
		     // task.pattern32_use_method();
		     // task.pattern33_fail();
		      //task.pattern33();
		      //task.pattern33_re();
		     // task.pattern34();
		     // task.pattern35();
		     // task.pattern36();
		      //task.pattern37();
		                    
	}
	
	
	  private void pattern38() {
		  int i =5; int count = 0;int j =1;
		for(int row = 1;row<=i;row++)
		{
			for(int space = row; space<i;space++)
			{
				System.out.print(" ");
			}
			for(int col =1;col<=row;col++)
			{
				System.out.print(col+" ");
				
			}
			System.out.println();
			count= count+1;
			if(count==i)
			{       
				 row =i-1;
				 
			}
			if(count>=i)
			{ row = row-j;
			j++;
				if(row==0)
				{
					break;
				}
			}
			
		}
		
	}


	private void pattern37() {
		  int i =26;
				  
	for(int row =1;row<=i;row++)
	{
		for(int col=row;col<i;col++)
		{
			
			System.out.print((char)65+" ");
		}
		for(int col =row;col>=1;col--)
		{
			
			System.out.print((char)(64+row)+" ");
		}
		
		System.out.println();
	}
		
	}


	private void pattern36() {
		int i =5; 
		for(int row =1;row<=i;row++)
		{
			for(int col =i;col>row;col--)
			{
			System.out.print(1+" ");
			}
		for(int col=1; col<=row;col++)
		{
			System.out.print(row+" ");
		
		}	
			System.out.println();
		}	
	}
	private void pattern35() {
		int i =20;
		for(int row=1;row<=i;row++)
		{
			
			for(int col=1;col<=i;col++)
			{
		
			if(row==col)
			{	
			System.out.print(" "+col+" ");
			
		}
		
		else  
		{	
			   System.out.print(" "+"0"+" ");
		
		
		}
			}
		System.out.println();
		
		}
	}
	private void pattern34() {
		int i =4;
		for(int row=1;row<=i;row++)
		{
		for(int space=row;space<=i;space++)
		{
			System.out.print(" ");
		}
		for(int col=1;col<=row-1;col++)
		{
			System.out.print((char)(64+col)+" ");
		}
		for(int col =row;col>=1;col--)
		{
			System.out.print((char)(64+col)+" ");
		}
		System.out.println();
		}
			
			
		}
	
	
	private void pattern33_re() {
		int i = 4;
		for(int row=1;row<=i;row++)
		{                
			for(int col=row;col<i;col++)
			{
				System.out.print("  ");
			}
			for(int col=1;col<=row-1;col++)
			{
				System.out.print(col+" ");
			}
			for(int col=row;col>=1;col--)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	private void pattern33() {
		for(int row=1;row<=4;row++)
			
		{
			for(int space =5;space>row;space=space-1)
			{
				
				System.out.print("  ");
			}
			
			
			for(int col=1;col<=row;col++)
				
			{
				
			    System.out.print(""+col+" ");
			}
			
			  for(int col=row-1;col>=1;col--) {
			  
			  System.out.print(""+col+" "); }
			 
			System.out.println();
		}
		           
	}
	private void pattern33_fail() {
		int i = 5;
		System.out.println("## Printing the pattern ##");
		for (int row = 1; row <= i; row++) 
                { 
                        for (int space = i; space > row; space--)
			{
				System.out.print("  ");
			}
			for (int col = 1; col <= row; col++) 
                        { 
                                System.out.print(col + " "); 
                        } 
                        for (int l = row - 1; l >= 1; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
		
	
	public void pattern32_use_method_sub_code(int row){
		for(int col =row;col>=1;col--)
		{
			System.out.print(" "+"*"+" ");
			
		}
		
	}
	
	private void pattern32_use_method() {
		          for(int row=1;row<=9;row++)
		          {
		        	  if(row<=5)
		        	  {
		        		  pattern32_use_method_sub_code(6-row);
		        	  }
		        	  else {
		        		  
		        		  pattern32_use_method_sub_code(row-4);
		        	  }
		        	  
		        	  System.out.println();
		          }
		
	}
	private void pattern32() {
		for(int row=1;row<=9;row++)
		{
			if(row<=5)
			{
			for(int col=6-row;col>=1;col--)
			{
				System.out.print(" "+"*"+" ");
				
			}
			}
			else {
				for(int col =(row-4);col>=1;col--)
				{
					System.out.print(" "+"*"+" ");
				
			}
			}
		System.out.println();	
		}
		
	}
	public void pattern31_sub_code(int row)
	{
		for(int col =row;col>=1;col--)
		{
			System.out.print(" "+col+" ");
		}
		
	}
	
	
	private void pattern31_use_method() {
		for(int row =1;row<=9;row++)
		{
			if(row<=5)
			{
				
				pattern31_sub_code(6-row);
			}
			else {
				pattern31_sub_code(row-4);
				
			}
			System.out.println();
		}
		
	}

	private void pattern31() {
		for(int row=1;row<=9;row++)
		{
			if(row<=5)
			{
				for(int col =(6-row);col>=1;col--)
				{
					
					System.out.print(" "+col+" ");
				}
				
			}
			else {
				
				for(int col =row-4;col>=1;col--)
				{
					
					System.out.print(" "+col+" ");
				}
			}
			System.out.println();
		}
		
	}

	public void pattern30_sub(int row)
	{
		for(int col =1;col<=row;col++)
		{
			
			System.out.print(" "+(char)(col+64)+" ");
		}
		
		
		
	}
	
	
	
	
	private void pattern30_use_method() {
		for(int row =1;row<=9;row++)
			
		{if(row<=5)
		{
			
			pattern30_sub((6-row))	;
		}
		else {
			
			
			pattern30_sub((row-4))	;
		}
		System.out.println();
		}
		
	}

	private void pattern30() {
		System.out.println("## Printing the pattern 30##");
		for(int row=1;row<=9;row++)
		{if(row<=5)
		{for(int col=1;col<=(6-row);col++)
		{
			System.out.print(" "+(char)(col+64)+" ");
		}
		}
		
		else {
			for(int col =1;col<=(row-4);col++)
			{
				
				System.out.print(" "+(char)(col+64)+" ");
			}
			
			
		}
			System.out.println();
		}
	}
	

	public void pattern29() {
		System.out.println("## Printing the pattern 29##");
		for(int row =1;row<=9;row++)
		{if(row<=5)
		{
			for(int col = (6-row);col>=1;col-- )
			{
				System.out.print(" "+col+" ");
			}
		}else {
			for(int col =row-4;col>=1;col--)
			{
				System.out.print(" "+col+" ");
			}
			
			
		}
		System.out.println();	
		}
		
	}

	private void pattern28() {
		System.out.println("## Printing the pattern 28##");
		for(int row =9;row>=1;row--)
		{
			if(row>=5)
			{
				for(int col=1;col<=(row-4);col++)
				{
					System.out.print(" "+col+" ");
				}
			}
			else {
				
				for(int col=1;col<=(6-row);col++)
				{
					System.out.print(" "+col+" ");
					
				}
			}
			System.out.println();
		}
		
	}

	public void pattern27() {
		for(int row = 1;row<=9;row++)
		{
			if(row<=5)
			{
				for(int space=row;space<=4;space++)
				{
					System.out.print(" ");
				}
				for(int col =1;row>=col;col++)
				{
					System.out.print(""+"*"+"");
				}
				
				
			}
			else {
				
					for(int space =1;space<=(row-5);space++)
					{
						System.out.print(" "); }
						
						for(int col =1;col<=(10-row);col++)
						{
							
							System.out.print(""+"*"+"");
						}
							
					}
				
			System.out.println();
				
			}
			
			}
		
	

	public void pattern26() {
		System.out.println("## Printing the pattern 26##");
		for(int row =1;row<=9;row++)
		{
			if(row<=5)
			{
				for(int col=1;col<=row;col++)
				{
					System.out.print("*"+" ");
				}
			}
			else {
				
				for(int col=1;col<=(10-row);col++)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		
	}

	public void pattern25usetwoforloopsub_code(int row) {
		System.out.println("## Printing the pattern 25##");
		for(int col=1;col<=row;col++)
		{
			System.out.print((char)(64+col)+" ");
		}
		
	}

	public void pattern25usetwoforloop() {
		for(int row =1;row<=9;row++)
		{	
		if(row<=5)
		{
			pattern25usetwoforloopsub_code(row);
		}
		else {
			pattern25usetwoforloopsub_code(10-row);
		     }
		System.out.println();
		}
		
	}



	private void pattern25() {
		System.out.println("## Printing the pattern 25##");
		for(int row =1;row<=9;row++)
		{  
			if(row<=5)
			{
				for(int col =1;col<=row;col++)
				{
					System.out.print((char)(col+64)+" ");
				}
				
			}
			else {
				for(int col =1;col<=(10-row);col++)
				{
					System.out.print((char)(col+64)+" ");
				}
				
			    }
		
		
			
			System.out.println();
		}
		
	}



	public void pattern24usetwoforloop() {
		System.out.println("## Printing the pattern 24##");
		for(int row =1;row<=9;row++)
		{
			if(row<=4)
			{
				pattern24sup_program(row);
			}
			else {
				pattern24sup_program(10-row);
				
			}
			System.out.println();
			
		}
		
	}
public void pattern24sup_program(int row)
{
	for(int col =1;col<=row;col++)
	{
		System.out.print(col+" ");
	}
}


	public void pattern24() {
		System.out.println("## Printing the pattern 24##");
		for(int row=1;row<=9;row++)
			
		{
			if(row<=5)
			{
			for(int col=1;col<=row;col++ )
		    {
			
			System.out.print(col+" ");
		     }
			}
			
			else {
				for(int col =1;col<=(10-row);col++)
				 {
					System.out.print(""+col+" ");
				  }
				
			 }
			
			
			System.out.println();
		    }
		
	  }



	private void pattern22() {
		int rows = 5;
		System.out.println("## Printing the pattern 22##");
		for (int i = 1; i <= rows; i++) 
               { 
                  for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			int temp = 1;
			for (int k = 1; k <= i; k++)
			{
				System.out.print(temp + " ");
				temp = temp * (i - k) / (k);
			}
			System.out.println();
		}
		
	}



	public void pattern21() {
		System.out.println("#pattern#"+21);
		int i =1;
		for(char row =5;row>=1;row--)
		{                
		for(int col =5;col>=row;col--)
		{
			System.out.print(" "+(char)(i+64)+" ");//1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
			i =i+1;//2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
		}
		System.out.println();
		}
	}



	private void pattern20() {
		System.out.println("#pattern#"+20);
		for(int row=5;row>=1;row--)
		{
		for(int col=5;col>=row;col--)
		{
			System.out.print(" "+col+" ");
			
		}
		System.out.println();
		}
	}



	public void pattern19() {
		System.out.println("#pattern#"+19);
		for(char row ='E';row>='A';row--)
		{
		for(char col='E';col>=row;col--)
		{
			System.out.print(" "+col+" ");
			
		}
		System.out.println();
		}
		
		
	}
	



	public void pattern18() {
		System.out.println("#pattern#18");
		for(char row='E';row>='A';row--)
		{
		for(char col ='A';col<=row;col++)
		{
			System.out.print(" "+col+" ");
		}
		System.out.println();
	}

	}

	public void pattern17() {
		System.out.println("#pattern#17");
		int i =1;
		for(int row = 1;row<=5;row++)
		{                  
		for(int col=1;row>=col;col++)
		{
			System.out.print(" "+i+" ");  //2 3
			i = i+1;//3
		}
		System.out.println();
		
	}

	}

	private void pattern11() {
		System.out.println("#pattern#11");
		
		for(int row=5; row>=1; row--)
		{
		for(int col = 1; col<=row; col++)
			{
			System.out.print(col+ " "); 
			}
		System.out.println(); 
		} 
		
	}

	private void pattern10() {
		for(int row=1; row<=5; row++)
		{
		for(int col = 1; col<=6-row; col++)
			{
			System.out.print(col+ " "); 
			}
		System.out.println(); 
		} 
		
	}

	public void pattern9() {
		System.out.println("#task-9#");
		for(int row =5;row>=1;row--)
		{
		for(int col =1;col<=row;col++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}
	public void pattern8() {
		System.out.println("#task-8#");
		for(char row = 'A';row<='E';row++)
		{
		for(char col ='E';col>=row;col--)
		{
			System.out.print(col+" ");
			
		}
		    System.out.println();
	}
		
	}
	public void pattern7() {
		System.out.println("#task-7#");
		for(char row ='E';'A'<=row;row--)
		{
		for(char col ='A';col<=row;col++)
		{
			System.out.print(row+" ");
			
		}
		System.out.println();
	}
	}
	public void pattern6() {
		System.out.println("#task-6#");
		  for(int row=5;row>=1;row--)
		{
		for(int col=1;col<=row;col++)
		{
			
			System.out.print(row+" ");
		}
		System.out.println();
	}
		  
	}
	public void pattern5() {
		System.out.println("#task-5#");
		for(int row =1;row<=5;row++)
		{
		for(int col=5;row<=col;col--)
		{
			
			System.out.print(col+" ");
		}
		System.out.println();
	}
	}
	public void pattern4() {
		System.out.println("#task-4#");
		for(char row='A';row<='E';row++)
		{
		for(int col ='E';col>=row;col--)
		{
			System.out.print(row+" ");
		}
		System.out.println();
	}
	}
	private void pattern3() {
		System.out.println("#task-3#");
		for(int row =1;row<=5;row++)
		{	
		for(int col =5;col>=row;col--)
		{
			
			System.out.print(row+" ");
		}
		     System.out.println();	
	}
		
	}
	public void pattern2() {
		System.out.println("#task-2#");
		   for(char row ='E';row>='A';row--)
		{
			for(char col ='A';col<=row;col++)
			{
				
				System.out.print(col+" ");
			}
			    System.out.println();
		}
		       
	}

	public void pattern1() {
		System.out.println("#task-1#");
		for(int row =5;row>=1;row--)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col+" ");
			
		}
		    System.out.println();
	}

}}



