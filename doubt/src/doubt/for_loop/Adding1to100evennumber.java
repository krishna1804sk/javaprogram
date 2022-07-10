package doubt.for_loop;

import java.util.Scanner;

public class Adding1to100evennumber {

	public static void main(String[] args) {
		Adding1to100evennumber AEN =  new Adding1to100evennumber();
		//AEN.Adding1to_user_given_number_evennumber();
		AEN.Addition_of_numbers();
	}

	private void Addition_of_numbers() {
		System.out.println("enter untill you want to add");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num = 0; int total = 0;
		for(;num<=count;num++)
		{
			total = num+total;
			
		
	}
		System.out.println(total);
	}

	public void Adding1to_user_given_number_evennumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for find the even number");
		int no2 = sc.nextInt();
		
		int even = 0; int no1 = 1; int total = 0;
		for (;no1<no2;++no1)
		{
			if(no1%2==0)
			{
				System.out.println(no1);
				total = total+no2;
			
		}
			
	}
		System.out.println("total even number  of the given number"+no2+"is"+total);
	}
}
