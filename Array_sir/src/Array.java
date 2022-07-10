import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Array  a = new Array(); 
   //a.Linear_search_program();
   System.out.println(45/0);
	}

	private void Linear_search_program() {
		Scanner sc = new Scanner(System.in);
		
		int [] numbers  = {56,74,85,585,44,84,283,24,34,89};
		System.out.println("enter the do find index");
		int key = sc.nextInt();
		int i =0;
		for(i=0;i<10;i++)
		{
			System.out.println(numbers[i]);
			System.out.println(key);
			if(numbers[0]==key);
			{
				System.out.println("the number is : "+key+" and it's index is :"+i);
				break;
			}
			
		}
		if(i==numbers.length)
		{
			
			System.out.println("not found");
		}
		
	}
}
