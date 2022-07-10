package doubt.for_loop;

import java.util.Scanner;

import doubt.find_big_number;

public class Finding_divisors_of_user_given_number_gcd_lcm {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Finding_divisors_of_user_given_number_gcd_lcm Fdug = new Finding_divisors_of_user_given_number_gcd_lcm();
		//Fdug.divisors();
		//Fdug.gcd();
		//Fdug.lcm();
		Fdug.lcm_three_number();

	}

	public void lcm_three_number() {
		find_big_number fbn = new find_big_number();
		
		  int num1 = sc.nextInt(); int num2 = sc.nextInt(); int num3 = sc.nextInt();
		 
	int lcm	=  fbn.find_big_between_three_number(num1,num2,num3);
	System.out.println(lcm);
	for(;true;lcm++)
	{
		if(lcm%num1==0&&lcm%num2==0&&lcm%num3==0)
		{
			
			
			System.out.println("lcm of the number "+num1+num2+"and"+num3+"is"+  lcm);
			break;
		}
		
	}
	}
	public void lcm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two number for finding the lcm between the number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int big=num1>num2?num1:num2;
		int div = big;
		for(div=big;true;div++)
		{
			if(div%num1==0&&div%num2==0)
			{
				System.out.println("lcm of the number"+num1+"and"+num2+"is a"+div);
				break;
			}
			
		}
	}

	public void gcd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers for finding commondivisors");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int small = num1<=num2?num1:num2;
		int gcd =0;
		for(int div = 2;small>div;div++)
		{
		if((num1)%div==0&&(num2)%div==0)
		{
			gcd = div;
			System.out.println(gcd);
		}
		
		
	}
	}
	public void divisors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number do you want to find the divisors");
		long number = sc.nextLong();
		long div = 2; 
		for(div=2;(number/2)>=div;div++) {
			if(number%div==0)
			{
			System.out.println(div);
			
		}
		
	}

	}}
