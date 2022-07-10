package doubt;

import java.util.Scanner;

public class Binary_to_decimal1 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Binary_to_decimal1 BD = new Binary_to_decimal1();
          //BD.find_power();
          BD.binary_to_decimal();
	}

	private void binary_to_decimal() {
		System.out.println("enter the binary number to convert into decimal");
		int number =sc.nextInt();
		int power=0;
		int total =0;
		int number1=number;
		while(number>0)//1
		{
			int rem = number%10;//1     4
			 total = rem*find_power(2,power)+total;//1+0+4+0+16=21
			power++;
			number = number/10;
		}
		System.out.println("decimal value of :"+number1+" is "+total);
			
			
		}

		
	

	private int find_power(int no ,int power) {
		
			int result=1; 
		while(power>0)	
		{
		result =result*no;//16
			power--;
		}
		return result;
		}
		
	
	}

