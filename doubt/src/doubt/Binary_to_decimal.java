package doubt;

import java.util.Scanner;

public class Binary_to_decimal {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Binary_to_decimal BD = new Binary_to_decimal();
		/*
		 * BD.binary_to_decimal1(); BD.binary_to_decimal2();
		 */
		BD.binary_to_decimal3();
		//BD.find_power3();
		// BD.decimal_to_binary();
		// BD.find_power(0,2);
		// BD.find_power1();
		/*
		 * System.out.println("enter the binary number to convert in to decimal number"
		 * ); int number =BD.sc.nextInt(); int total = 0; int power = 0; while(number>0)
		 * { int rem = number%10; total =total+( rem*( BD.find_power(2,power))); number
		 * = number/10; power++;
		 */
		/*
		 * } System.out.println(total);
		 */

	}

	private void binary_to_decimal3() {
	int number =sc.nextInt(); int power=0;int total =0;
	while(number>0)
	{
		int rem = number%10;
		 total = rem*find_power3(2,power)+total;
		power++;
		number = number/10;
	}
	System.out.println(total);
		
		
	}

	public int find_power3(int no,int power) {
		int result=1; 
	while(power>0)	
	{
	result =result*no;
		power--;
	}
	return result;
	}
	private void binary_to_decimal2() {
		
		
	}

	private void binary_to_decimal1() {
	System.out.println("enter the binary number to convert into decimal");
		int number = sc.nextInt();
		int total = 0;
		int power=0;
		int number1 =number;
		while(number>0)
		{
			int rem = number%10;
			total = rem*find_power1(2,power)+total;
			
			number = number/10;
			power++;
			
		}
		
		System.out.println("decimal value of :"+number1+" is "+total);
		
	}

	public int find_power1(int number, int power) {
		int result = 1;
		while(power>0) 
		{
		 result = result*number;
		 power--;
		}
		
		return result;
	}

	public int find_power(int no, int power) {
		int result = 1;
		for (; power > 0; power--) {
			result = result * no;

		}

		// System.out.println(result);

		return result;
	}

	public void decimal_to_binary() {
		int number = sc.nextInt();
		int rem = 0;
		String join = "";
		while (number > 0) {
			rem = number % 2;
			join = rem + join;// 1000010+""
			number = number / 2;

			System.out.println(join);
		}

	}

}
