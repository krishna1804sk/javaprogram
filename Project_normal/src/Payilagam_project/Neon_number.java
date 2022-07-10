package Payilagam_project;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
	
		Neon_number Nen = new Neon_number();
		// Nen.calculation();
		// Nen.find_the_given_number_neon();
		Nen.find_the_range_neon_number();
		//Nen.find_the_cound_of_neon_number();
	}

	public void find_the_cound_of_neon_number() {
		System.out.println("entre the count");
		Scanner sc = new Scanner(System.in);
		int user_count = sc.nextInt();
		int no1 = 0;
		int Copy_no1 = 0;
		int counting_totalling=0;
		while(true)
		{    no1 = Copy_no1; 
			
			int counting = calculation(no1);
			Copy_no1 = Copy_no1+1;
		   counting_totalling =counting+counting_totalling;
			if(counting_totalling==user_count)
			{
				System.out.println(user_count);
				break;
			}
		}
		
	}

	public void find_the_range_neon_number() {
		System.out.println("to find neon number for between two numbers enter the two numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int no1 = sc.nextInt();
		int copy_no1 = no1;
		int total1 = 0;
		System.out.println("enter number two");
		int no2 = sc.nextInt();
		
		while(no1>no2)
		{ 
			System.out.println("re enter number one and number two number two must be higher then number one");
		    System.out.println("reenter number one");
		   int no3 = sc.nextInt();
		    no1=no3;
		    System.out.println("reenter number two");
		    int no4 = sc.nextInt();
				no2 = no4;
		}
		while(copy_no1<no2)
		{    no1=copy_no1 ;
		
			 int count =  calculation(no1);
			 copy_no1 = copy_no1+1;
		
		
		
		}
		
	}

	public int calculation(int number) {
		
		int squ_number = (int) Math.pow(number,2);
		int copy_squ_number= squ_number;
		int remainder=0;
		int total =0;
		int   count = 0;
		while(copy_squ_number>0)
		{ remainder =  (copy_squ_number%10);
		  total = remainder+total;
		  copy_squ_number =copy_squ_number  / 10;
		
	}
		if(number==total)
		{
			
			System.out.println("the is neon"+" "+"square value ofthe number"+number+" is"+squ_number +"and sum of digits of square value is"+" "+total);
			count++;
			
		}	
		else
		{
			//System.out.println("given number"+" "+number+ " "+"is not a neon number");
			
		}
		return count;
	}

	public void find_the_given_number_neon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find given number is neon or not");
		int number = sc.nextInt();
		//int copy = number;
		calculation(number);
		
	}

}
