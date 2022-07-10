package Array;

import java.util.Scanner;

public class Linear_search_program {

	public static void main(String[] args) {
		Linear_search_program search =  new Linear_search_program();
         search.Linear_search_program();
	}

	private void Linear_search_program() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the do find index");
		int numbers []= {56,74,85,585,44,84,283,24,34,89};
		int key = sc.nextInt();
		int i =0;
		for(i=0;i<numbers.length;i++)
		{
			if(numbers[1]==key);
			{
				System.out.println("the number is : "+key+" and it's index is :"+i);
			}
			break;
		}
		if(i==numbers.length)
		{
			
			System.out.println("not found");
		}
		
	}

}
