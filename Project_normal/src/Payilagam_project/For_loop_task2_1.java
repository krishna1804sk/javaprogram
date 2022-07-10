package Payilagam_project;

public class For_loop_task2_1 {

	public static void main(String[] args) {
		For_loop_task2_1 task = new For_loop_task2_1();
		task.task1();
		task.task2();
		task.task3();
		task.task4();

	}

	private void task1() {
		for(int count= 1;count<=3;count++)
		{
		for(int no =1;no<=9;no=no+2)
		{
			System.out.print(" "+no+" ");
			
		}
		    System.out.println();
		}
		
	}

	private void task2() {
		System.out.println();
		for(int count=1;count<=3;count++)
		{
		for(int no=1;no<=9;no=no+2)
		{
			System.out.print(" "+no*no+" " );
			
		}
			System.out.println();
		}
	}

	private void task3() {
		System.out.println();
		for(int count = 1;count<=5;count++)
		{
		for(int no=1;no<=5;no++)
		{
			System.out.print(" "+no*no+" ");
			
		}
		System.out.println();
		}
	}

	private void task4() {
		System.out.println();
		for(int count = 1;count<=3;count++)
		{
		for(int no =1;no<=5;no++)
		{
			System.out.print(" "+no*count+" ");
			
		}
		System.out.println();
		
	}}}


