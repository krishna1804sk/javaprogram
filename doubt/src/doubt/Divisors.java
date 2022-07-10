package doubt;

import java.util.Scanner;

public class Divisors {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Divisors cs = new Divisors();
		cs.divisior();
		//cs.common();
		//cs.lcm();
		//cs.lcm2();
	//cs.try_divisor();
		//cs.drive();
	//cs.lcm4();
	
		//cs.drive3();
	//cs.gcd();
	}
	
	private void gcd() {
		int a = 15;int b = 9; int i = 1;
		if(a!=b)
		{
			while(a/i==b/i)
			{
				int c = a/i;
				System.out.println("gcd is"+c);
			}
			i++;
		}
		// TODO Auto-generated method stub
		
	}

	private void lcm4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("pls enter no1");
		int no1 = scanner.nextInt();
		System.out.println("pls enter no2");
		int no2 = scanner.nextInt();
		
			 
			
			int lcm = no1>no2?no1:no2;
			while(true)
			{
			if(lcm%no1==0&&lcm%no2==0)
			{
			System.out.println("lcm of given number "+"  "+no1+" "+" and " + no2+" "+" is" +lcm);
			break;
			}
			lcm = lcm+1;
		}
		
		
		
		
	}

		
	
	private void drive2() {
		int no1 = 7; int no2 = 6;
		int big = no1>no2?no1:no2; 
		while(true)
		{
		if(big%no1==0&&big%no2==0)
		{
		System.out.println(big);
		break;
	}
		big = big+1;
		}
	}
	private void drive() {
		
		int no1 =42; int no2 =80;
		int big = no1>no2?no1:no2;
		int count = big;
		int small = no1<no2?no1:no2;
		if(small*small == big)
		{
			System.out.println(big);
		}
		else {
		while(true)
		{ 
			if(small == (count/big) )
			{
				 System.out.println(count);
			break;
			}
			count = count+1;
			
		}	// TODO Auto-generated method stub
		
	}
	}
	public void try_divisor() {
		int no1 = 80; int no2 = 42; int div = 2; int gcd = 0;
		/*
		 * if(no1>no2) { small = no1; } else { small = no2; }
		 */
		int  small = no1<no2?no1:no2;
		
		while(small>=div)
		{
		
		if(no1%div==0&&no2%div==0)
		{
			System.out.println(div);
			gcd = div;
		}
		div++;
	}
		System.out.println("higher commen factor"+"  "+gcd);
		}
		
	
	public void lcm2() {
		int no1 = 3, no2 = 1000; 
	int big = no1>no2? no1: no2; 
	while(true) {
	if(big%no1 ==0 && big%no2==0)
	{
	System.out.println(big); 
	break; 
	}
	big++; 
	}
		// TODO Auto-generated method stub
		
	}
	private void lcm() {int no1 = 3, no2 = 9; 
	int big = no1>no2? no1: no2; 
	if(big%no1 ==0 && big%no2==0)
	{
	System.out.println(big); 
	} 
	
		
	}
	private void common() {int no1=80, no2 = 42; int gcd = 0;
	int div=2; 
	//int small =0; 
	int small = no1<no2?no1:no2; 
	while(div<small)
	{
	if(no1%div==0 && no2%div==0)
	{
	System.out.println(div);
	gcd = div;
	}
	div = div+1; 
		// TODO Auto-generated method stub
		
	}
	
	}
	void divisior()
	{
		System.out.println("pls enter no1 and press enter");
		Scanner scanner = new Scanner(System.in);
		int no1 = scanner.nextInt();
		System.out.println("pls enter no2 and press enter");
		int no2 = scanner.nextInt();
	
	int div=2; 
	int gcd =0;
	//Ternary Operator
	int small = no1<no2?no1:no2; 
	/*
	 * if(no1<no2) small = no1; else small = no2;
	 */
	while(div<small)
	{
	if(no1%div==0 && no2%div==0)
	{	//2	4	5	10	20
	System.out.println(div); 
	gcd = div; //big = 20
	}
	div = div+1;
	}
	System.out.println("Greatest Common Divisor is "+ gcd);
	}
}
