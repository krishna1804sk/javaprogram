package doubt;

import java.util.Scanner;

public class DEcimal_to_binary {
	 Scanner sc = new Scanner(System.in); int a =5;

	public static void main(String[] args) {
		DEcimal_to_binary  dtb = new DEcimal_to_binary ();
		//dtb.binary_to_decimal();
		//dtb.find_power(2, 3);
		// dtb.binary();
		//dtb.sc.nextInt();
		//dtb.binary_to_decimal1();
		//System.out.println(" " +(5+10+45)+8);
		//int result =dtb.find_powering(2,0);
		/*
		 * for(int power = 0;power<4;++power) { int result=dtb.find_powering(2,power);
		 * System.out.println(result);
		 * 
		 */
	
		
	long binary_number = dtb.sc.nextLong(); int power = 0;long result = 0;
	     while(binary_number>0)
	     { 	 
       long rem = binary_number%10;
        result = result+(rem*dtb.find_powering(2,power));
        binary_number =binary_number/10;
	       power++;
	       
	     }
	     System.out.println(result);
	
	
	
	
	}

	public static  int find_powering(int no, int power) {
		int result = 1;
		while(power>0)
		{
		result = result*no;
		power--;
		
	}
		//System.out.println(result);
		return result;
	}
	public void binary_to_decimal1() {
		System.out.println("enter the number to convert binary");
	    int number = sc.nextInt();
	    String binary = "";
	    for(;number>0;number=number/2)
	    {
	    	
	    	int rem = number%2;
	    	binary =rem+binary;//
	    	System.out.println(rem);
	 
	    	
	    }
	
		
	
	}

	private void binary_to_decimal() {
		int cake = 6; 
		String binary = "";
		while(cake>0)
		{
		int rem = cake%2; 
		binary = rem+binary ;
		
//System.out.println(rem);

		cake = cake/2; 
		}
		System.out.println(binary);
		
	}
	private int find_power(int no, int power) {
		// TODO Auto-generated method stub
		int result = 1; 
		while(power>0)
		{
		result = result * 2; 	//2
		power--; 
		}
		System.out.println(result);
		return result;  
		
	
	

	}
	public int binary() {
		
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter any binary number");
	int input = sc.nextInt(); 
	int result = 0; 
	int rem = input%10; 
	int po =0; 
	while(input>0)
	{
	result = result + (rem*find_power(2,po));
	input = input/10; 
	rem = input%10; 
	po++; 
	}		
	System.out.println(result);
	return 0; 
}

}