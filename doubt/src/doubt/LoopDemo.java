package doubt;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		
			
			LoopDemo ld = new LoopDemo(); 
		//int result	=ld.calculate_sum_of_digits2();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number do you want to count");
		   int   no =  sc.nextInt();
		      ld.recursion(no);
		//System.out.println(result);
		
		/*
		 * if(result>9) {
		 * 
		 * ld.calculate_sum_of_digits2(result);
		 * 
		 * }
		 */	//ld.calculate_sum_of_digits(345);
			//ld.find_fibonacci_series();
		
			/*int no = 9876; //
			int result = ld.calculate_sum_of_digits(no); 
			if(result>9)
			{
			ld.calculate_sum_of_digits(result); 
			}
		}*/
	}
		public void recursion(int no) {
	
			         int  sum_of_digits= 0;
			while(no>0)
			{
				
				sum_of_digits = no%10+sum_of_digits;
				
				no = no/10;
				
				
			}
			System.out.println("sum of digits of"+no+" "+"is"+sum_of_digits);
			if(sum_of_digits>9)
			{
				int result = sum_of_digits;
				
				recursion(result);
			
			}
			
			
			
		
	}
		private int calculate_sum_of_digits2() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number do you want to count");
			int number=sc.nextInt();
			int result	= calculate_sum_of_digits2(number);
			
		return result;
	}
		public int calculate_sum_of_digits2(int number) {
			int sum_of_digits = 0;
			 
			while(number>0)
			{
			sum_of_digits = sum_of_digits+(number%10);
			
			number = number/10;
			
			}
			System.out.println(sum_of_digits);
			return sum_of_digits;
			
			
		
		
	}
		private int calculate_sum_of_digits(int no)
		{
			int sum_of_digits = 0; 
			while(no>0)
			{
			sum_of_digits = sum_of_digits + (no%10); 
			no = no/10; 
			}
			System.out.println(sum_of_digits); return sum_of_digits; 
			} 
	
     void calculate_sum_of_digits1(int no)
   {
int sum_of_digits = 0; 
while(no>0)
{
sum_of_digits = sum_of_digits + (no%10); 
no = no/10; 
}
System.out.println(sum_of_digits); 
if(sum_of_digits>9)
	{
	int result =sum_of_digits;
    calculate_sum_of_digits1(result); 
	}
}
private void find_fibonacci_series() {
	// TODO Auto-generated method stub
	int first=-1, second = 1; 
	int third = 0; 
	while(third<13)
	{
	third = first+second; 
	System.out.println(third); 
	first = second; 
	second = third; 
	}
	
} 
}

