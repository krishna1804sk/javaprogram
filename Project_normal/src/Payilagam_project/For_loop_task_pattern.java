package Payilagam_project;

import java.util.Scanner;

public class For_loop_task_pattern {
	Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		For_loop_task_pattern task =new  For_loop_task_pattern();
		/*
		 * task.task1(); task.task2(); task.task3(); task.task4(); task.task5();
		 * task.task5();
		 */
		//task.task6();
		
		


	}
	
		
	
	private void pattern6() {
		for(int row=1; row<=5; row++)
		{
		for(int col=4; col>=row; col--)
			{
			System.out.print(1+" "); 
			}
		for(int no=1; no<=row;no++)
			{
			System.out.print(row+" "); 
			}

		System.out.println(); 
		} 
		
	}
	public void task5() {
		System.out.println();
		for(int count = 5;count>0;count--)
		{
		for(int no= 5;no>0;no--)
		{
			System.out.print(" * ");
			
		}
		System.out.println();
		}
	}

	public void task4() {
		System.out.println();
		for(int count = 5;count>=0;count--)
		{
		for(int no =3;no>=1;no--) {
			System.out.print(" "+no);
		}
		System.out.println();
	}
	}
	public void task3() {
		
		System.out.println();
		for(int count =0;count<5;count++) {
			
		
		for(int no = 1; no<=3;no++)
		{
			
			System.out.print(" "+no);
		}
		System.out.println();
		}	
	}

	public void task2() {
		System.out.println();
		for(int count = 0; count<3;count++)
		{
		for(int no =5;no>0;no--) {
			System.out.print(" "+no);
			
			
		}
		System.out.println();
	}
	}
	public void task1() {
		for (int count=1;count<=3;count++)
		{
		for(int no = 1;no<=5;no++) {
			
			System.out.print(" "+no);
		
	}
		     System.out.println();
	}
		
}
}
