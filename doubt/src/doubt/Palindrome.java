package doubt;

import java.util.Scanner;

public class Palindrome {

	public static  void main(String[] args) {
		
		Palindrome palindrome = new Palindrome();
		//palindrome.splitnumber();
		palindrome.trying();
		palindrome.reversing_number_print();
		
	}

	private void reversing_number_print() {
		// TODO Auto-generated method stub
		
	}

	private void trying() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter the number");
				int given_number = sc.nextInt(); int count_of_digits = 0;
				int sum_of_the_digits = 0; 
				int given_number2 = given_number;
				int reverse = 0;
				while(given_number>0)
				{
				int remainder = given_number%10;
				reverse = reverse*10+remainder;
				System.out.println(remainder);
				sum_of_the_digits = given_number%10+sum_of_the_digits;
				count_of_digits = count_of_digits+1;
				
				given_number = given_number/10;
				}
				
				if(given_number2 ==reverse)
				{
					System.out.println("given number is palindrome");
				}
				else
				{
					System.out.println("given number not a palindrome");
				}
				
				System.out.println("sum of the number" +given_number2+" "+"is"+sum_of_the_digits);
				System.out.println("count of the digits is "+"  "+count_of_digits);
				System.out.println("reverse of the "+given_number2 +"is "+reverse);
	}

	private void splitnumber() {
		
		Scanner sc = new Scanner(System.in);

								 
	System.out.println("Enter any number");
		int given_number = sc.nextInt(); int given_number2 = given_number; int count_of_digit=0;int sum_of_remainder= 0; int reverse = 0;
						while(given_number>0)
						{
							int remainder = (given_number%10);
						//System.out.println(given_number%10); 	//4
							reverse = (reverse*10)+remainder;
							sum_of_remainder = remainder+sum_of_remainder;
							
					
					 count_of_digit	= count_of_digit+1;
					 given_number = given_number/10;	
	}
						if(reverse==given_number2)
						{
							
							System.out.println("givien number is polintro");
						}
						System.out.println(sum_of_remainder);
						System.out.println(reverse);
						System.out.println(" count_of_digit"+ count_of_digit);
}                        
}
