package Payilagam_project;

import java.util.Scanner;

public class Perfect_number_finding {

	public static void main(String[] args) {
		Perfect_number_finding PNF = new Perfect_number_finding();
	//	PNF.calculation();
		//PNF.given_number_perfect_or_not();
		//PNF.perfect_number_range();
		PNF.perfect_number_count();
		

	}

	public void perfect_number_count() {
		int perfect_number_count = 0; 
		System.out.println("enter the count");
		Scanner sc = new Scanner(System.in);
		perfect_number_count = sc.nextInt();
		int number=1;
		int count1=0;
		int count2=0;
		
		while(true)
		{
			
		 count1	= calculation(number);
		 count2 = count1+count2;
		 
			number++;
			if( count2==perfect_number_count)
			{
				System.out.println("perfect number count"+perfect_number_count);
				break;
			}
		}
		
				
	}

	private void perfect_number_range() {
		System.out.println("to find perfect number for between two numbers enter the two number");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int no1 = sc.nextInt();
		
		int total1 = 0;
		System.out.println("enter number two");
		int no2 = sc.nextInt();
		int perfect_count = 0;
		
		while(no1>no2)
		{ 
			System.out.println("re enter number one and number two number two must be higher then number one");
		    System.out.println("reenter number one");
		    int no3 = sc.nextInt();
		    no1=no3;
		    System.out.println("reenter number two");
		    int no4 = sc.nextInt();
		    no2=no4;
		    
		}
		while(no1<=no2)
		{
			
			int count = calculation(no1);
			
			perfect_count = count+perfect_count;
		    no1=no1+1;
		
		
		}	
		if(perfect_count==0)
		{
			
			System.out.println("there is no perfect number between"+no1+" and "+no2+" "+"try another range number");
		}
		
	}

	public int calculation(int no1) {
		
		      int div = 1; 
		     
		      int count =0;
		      int total_div=0;
              while((no1/2)>=div) {
            	  
             if((no1)%div==0)
    {       
             total_div = div+total_div;
		
    	
    }
             div = div+1;
	}
                    if(no1==total_div) {
                	 count++;
                	   
            	  div=1;total_div=0;
            	  System.out.println("the number is"+" "+no1);
            	  while((no1/2)>=div) {
                	  
                      if((no1)%div==0)
             {       
                      total_div = div+total_div;
                      System.out.println("divisor:"+div);
         		
             	
             }
                      div = div+1;
            	  
            	  }  
            	  System.out.println("sum"+total_div);
            	  
              
                  }	  
                  else {
                	  
                	  
                	//  System.out.println("given number"+ no1 + "is not a perfect number try with another number");
                  }
                  return count;
            	  
	}
	public void given_number_perfect_or_not() {
		
		System.out.println("enter number to find given number is perfect or not");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
				calculation(number);
		
	}

}
