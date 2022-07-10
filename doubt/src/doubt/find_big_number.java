package doubt;

import java.util.Scanner;

public class find_big_number{
	int num1 =0,num2=0,num3=0;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		find_big_number fbn = new find_big_number();
		//fbn.find_big_between_three_number();
	}

	public int find_big_between_three_number(int num1,int num2,int num3) {
		/*
		 * int num1 = sc.nextInt(); int num2 = sc.nextInt(); int num3 = sc.nextInt();
		 */
		int big = 0;
		if((num1>=num2)&&(num1>=num3))
		{
			big = num1;
			
		}
		if((num2>=num1)&&(num2>=num3))
		{
			big = num2;
			
		}
		if((num3>=num1)&&(num3>=num2))
		{
			big = num3;
			
		}
		
		return big;
		
}
}
