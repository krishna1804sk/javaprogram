package doubt;

import java.util.Scanner;

public class Reverse_the_number {
	public static void main(String[] args) {
	      Reverse_the_number  RTN = new Reverse_the_number ();
		//RTN.reverse_the_number_digits (); 
		//RTN.count_of_digits();
		//RTN.sum_of_digits();
		RTN.reverse_the_number();
		
		//RTN.count_of_digits_reverse_sum_palindrome();
	    // RTN.pefilno_serious();
	     
	}
	public void count_of_digits_reverse_sum_palindrome() {
		System.out.println("enter the number do you want to find the number is palindrome or not  ");;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverse = 0;
		int number1 = number;
		int count_of_number= 0;
		int sum_of_the_number=0;
		   while(number>0)
		   {	   
		int remainder = number%10;
		System.out.println(remainder);
		sum_of_the_number = sum_of_the_number+remainder;
		count_of_number = count_of_number+1;
		reverse = reverse*10+remainder;	
		number = number/10;
		   }
		   System.out.println(" sum of the"+ number1+" " +"is "+sum_of_the_number);
		   System.out.println(" count_of_number"+ number1+" " +"is "+count_of_number);
		   System.out.println(" reverse of the"+ number1+" " +"is "+reverse);
		if(reverse==number1)
		{
	      System.out.println("given number"+" "+number1+" "+"is a  palindrome");
	}
		else {
			System.out.println("given number"+" "+number1+" "+"is a  not palindrome");
		}
	}
	public void palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number do you want to reverse");
		int number=sc.nextInt();
		int number1 = number;
		int reverse = 0;
		while(number>0)
		{
		int remainder = number%10;
		reverse = reverse*10+remainder;
		number = number/10;
		}
		if(reverse==number1)
		
		{	
		System.out.println("given number"+" "+ number1+" "+"is a palindrome" );
	}
		else {
			System.out.println("given number"+" "+ number1+" "+"is a palindrome" );
		}
	}

	public void reverse_the_number() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number do you want to reverse ");
		int number =sc.nextInt();
		int reverse = 0;
		int number1 = number;
		
		while(number>0)
		{
		int remainder = number%10;//5
		reverse = reverse*10+remainder; //4*10+6=46 46*10+5=465
		number = number/10;
		}
		System.out.println("the reverse of given number"+number1+" "+reverse);
	}
	
		
	
	public void sum_of_digits() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum_of_number = 0;
		int number1 = number;
		while(number>0)
		{
		int remainder = number%10; 
		
		System.out.println(remainder);
		sum_of_number = remainder+sum_of_number;
		number = number/10;
		}
		System.out.println("sum of the given number"+ number1+" "+sum_of_number);
		
	}
		
		
		
	

	public void count_of_digits() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); int count_of_digits = 0;int number1 = number;
		while(number>0)
		{
		int remainder = number%10;
		System.out.println(remainder);
		number = number/10;
		count_of_digits = count_of_digits+1;
		
	}
		System.out.println(" count of the given number"+ " "+number1+" "+count_of_digits);
	}
	public void reverse_the_number_digits()
	{   System.out.println("enter the number do you want to reverse the digits ");
		Scanner sc = new Scanner(System.in);
		        
		int number = sc.nextInt();
		                               
		 while(number>0)
		 {       
		int remainder = number%10;
		System.out.println(remainder);
		number = number/10;
	}}

		 
			
	
}
