package doubt;

import java.util.Scanner;

public class Prime_range {

	public static void main(String[] args) {
		
		Prime_range PR = new  Prime_range();
		//PR.prime_range();
		//PR.count_of_prime_number();
		//PR.count_of_prime_number1();
		PR.count_of_prime_number2();
		//PR.count_of_prime_number_try();
		
	}

	public void count_of_prime_number2() {
		int no = 2;int prime_count=0;int user_given_count=34;
	
		while(true)
		{
		 int div =2; int count=0;
		while(no>div)
		{
		if(no%div==0)
		{
		
		//System.out.println("not prime number"+no);
		count = count+1;
		break;
		}
		div = div+1;
		}
		if(count==0)
		{
			
			System.out.println("prime number"+no);
			prime_count = prime_count+1;
			
		}
		no = no+1;
		
		if(prime_count==user_given_count)
		{
	        System.out.println("prime number count"+" "+user_given_count);
			break;
			
		}	
	}
	}
	public void count_of_prime_number_try() {
		
		int no = 2;  int Max_count_user = 10;int count=0;
		while(Max_count_user>count)
		{int div = 2;
		while(no>div)
		{
		if(no%div==0)
		{
			//System.out.println("number is not prime"+no);
			break;
			
		}
		div = div+1;
		}
		
		if(div==no)
		{
		
		System.out.println("prime number"+no);
		count++;
		}
		no = no+1;
		if(Max_count_user==count)
		{
			System.out.println("prime counding"+Max_count_user);
			break;
			
		}
	}}

	public void count_of_prime_number1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter count of prime");
		int max_count =sc.nextInt();
		
		
		int no = 2; int div = 2; int prime_count = 0;
		while(true)
		
		{	 div = 2;
		while(no>div)
		{ 
		if(no%div==0)
		{
			//System.out.println("number "+no+" is not prime");
			
			break;
		}
		
		div=div+1;
		}
		if(div==no)
		{
			System.out.println("number"+no+"  "+"prime");
			
			prime_count++;
			
		}
		no = no+1;
		if(prime_count==max_count)
			
		{
			System.out.println("count of prime number"+" "+prime_count);
		    break;
		}
	}
	}
	

	public void count_of_prime_number() {
		
		
		
		 int user_number = 20 ;
		
		 int prime_count = 0;
		 int number = 2;
		
		
		while(user_number>prime_count)
		{ int div= 2; int count = 0; 
		  while(div<number)
		{ 
		     
		if(number%div==0)
		{
			
			System.out.println("number is prime"+number);
			count = count+1;
			break;
		}
		
		   div = div+1;
		}
		  if(count==0)
		
		  {
			  System.out.println("number is prime"+number);
			  prime_count =prime_count+1;
		  }
		
		if(prime_count==user_number)
		{
			break;
		}	
		number = number+1;
		}
}
	public void prime_range() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number starting number");
		int start_no = sc.nextInt();
		System.out.println("enter the number ending number");
	    int end_no = sc.nextInt();
	    int end_no1 = 0;int start_no1 = 0;
	    while(start_no>end_no)
	    {
	    	System.out.println("reentre the number1 and number2 number2 is must be higher to number1");
	    	System.out.println("enter the number starting number");
			 start_no1 = sc.nextInt();
			System.out.println("enter the number ending number");
		     end_no1 = sc.nextInt();
		     start_no= start_no1 ;end_no =end_no1;
		     
	    }
		while(end_no>=start_no)
		{
			int count = 0;
		
		int div = 2; 
		while(div<start_no/2)
		{
		if(start_no%div==0)
		{
		//System.out.println("the given number"+" "+start_no1+" "+"not prime");
		count = count+1;
		break;
		}
		div=div+1;
		
		}
		if(count==0)
		{
			System.out.println("the given number"+" "+start_no+"  "+" prime");
		}
		start_no = start_no+1;
		}
		
		
		
		
		
	
	
		
		
	}

}
