package Payilagam_project;

import java.util.Scanner;

public class Armstrong_numbers {

	public static void main(String[] args) {
		Armstrong_numbers calc = new Armstrong_numbers();
		//calc.find_Armstrong_number_or_not();
		calc.Armstrong_numbers_range();
		//calc.Armstrong_numbers_count();

	}

	private void Armstrong_numbers_count() {
		// System.out.println("to find Armstrong number for between two numbers enter
		// the two number");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count");
		long counting = sc.nextLong();

		long user_given_count = 0;
		long no1 = 0;
		long count_number_one = 0;
		long no3 = 0;
		long remainder = 0;
		int roll = 1;
		while (true) {
			no1 = no3;
			double total = 0;
			count_number_one = no1;
			long count = 0;
			

			while (count_number_one > 0) {
				remainder = count_number_one % 10;
				count = count + 1;
				count_number_one = count_number_one / 10;
			}
			while (no1 > 0) {
				remainder = 0;
				remainder = no1 % 10;
				total = Math.pow(remainder, count) + total;
				no1 = no1 / 10;
			}
			if (no3 == total) {
				System.out.println(roll+")" + " " + no3 + " " + " is an Armstrong_number");
				roll = roll+1;
				user_given_count = user_given_count + 1;

			}
			if (user_given_count == counting) {
				System.out.println("counting:" + counting);
				break;
			} else {// System.out.println("given number"+number2+" "+" is not an Armstrong_number");
			}
			no1 = no1 + 1;
			no3 = no3 + 1;
		}
	}

	private void Armstrong_numbers_range() {
		System.out.println("to find Armstrong number for between two numbers enter the two number");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		long no1 = sc.nextLong();
		long copy = no1;
		long total1 = 0;
		System.out.println("enter number two");
		long no2 = sc.nextLong();
		long Armstrong_count = 0;
		while(no1>no2)
		{ 
			System.out.println("re enter number one and number two number two must be higher then number one");
		    System.out.println("reenter number one");
		   long no3 = sc.nextLong();
		    no1=no3;
		    System.out.println("reenter number two");
		    long no4 = sc.nextLong();
				no2 = no4;
		}
				
				
		while(no2>=no1)
		{long count_number_one= no1;
		int count = 0;
			

			while(count_number_one>0)
			{	
			long remainder = count_number_one%10;
			count = count+1;
			count_number_one = count_number_one/10;
			
		}
			 Armstrong_count = find_Armstrong_number1(no1,count);
			 total1 =  Armstrong_count+total1;
	              no1 = no1+1;
	}

	
	  if(total1==0) {
	  System.out.println("there is no Armstrong between"+copy+" "+"and"+no2);
	  System.out.println("try again with another three digits numbers");
	  }
	  
	  }
	 

	public void find_Armstrong_number_or_not() {
		System.out.println("enter the number for finding the is  Armstrong_number or not");
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		long Armstrong_count = 0;
		long number1 = number;
		int count = 0;
		while (number > 0) {
			long remainder = number % 10;
			count = count + 1;
			number = number / 10;

		}
		Armstrong_count = find_Armstrong_number1(number1, count);
		if (Armstrong_count == 0) {
			System.out.println("number" + number1 + "is a not Armstrong number");
			System.out.println("try again with another two or four digits numbers");

		}
	}

	public long find_Armstrong_number(long number1, int count) {
		int user_given_count = 0;
		int Armstrong_check_count = 0;

		long number2 = number1;
		double total = 0;
		while (number1 > 0) {
			long remainder = number1 % 10;
			total = Math.pow(remainder, count) + total;
			number1 = number1 / 10;
		}
		if (number2 == total) {
			System.out.println("given number" + number2 + " " + " is an Armstrong_number");
			// user_given_count = user_given_count+1;
			Armstrong_check_count++;
		} else {// System.out.println("given number"+number2+" "+" is not an Armstrong_number");
		}

		return user_given_count;
	}

	public long find_Armstrong_number1(long number1, int count) {
		int user_given_count = 0;
		int Armstrong_check_count = 0;

		long number2 = number1;
		double total = 0;
		while (number1 > 0) {
			long remainder = number1 % 10;
			total = Math.pow(remainder, count) + total;
			number1 = number1 / 10;
		}
		if (number2 == total) {
			System.out.println("given number" + number2 + " " + " is an Armstrong_number");
			// user_given_count = user_given_count+1;
			Armstrong_check_count++;
		} else {// System.out.println("given number"+number2+" "+" is not an Armstrong_number");
		}

		return Armstrong_check_count;
	}

}
