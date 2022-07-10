package doubt;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapping Sw = new swapping();
		// Sw.swapping();
		// Sw.swapping_try();
		// Sw.swapping_try2();
		//Sw.swapping2();
		// Sw.swapping_try3();
		// Sw.swapping_three_number();
		   Sw.swapping_four_number();
	}

	public void swapping_four_number() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("entre four number for swapping");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		a=a+b+c+d;
		d=a-b-c-d;
		c=a-d-c-b;
		b=a-d-b-c;
		a=a-b-d-c;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public void swapping_three_number() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre three number for swapping");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a = a+b+c;
		c = a-c-b;
		b = a-c-b;
		a = a-b-c;
		
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public void swapping_try3() {
		int first = -1;int second = 1;
		while((first+second)<10000)
		{	
		System.out.println(first+second);
		second = second+first;
		first = second-first;
		
		
	}
	}
	public void swapping_try2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre a two number for swapping");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("before Swapping");
		System.out.println(a);
		System.out.println(b);
		a=a+b;//a=15,b=4; a= 19; b = 4;
		b = a-b;// b = 15; a= 19;
		a= a -b;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

	public void swapping_try() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre two number for swapping");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		
	}

	public void swapping2() {
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.println("Enter numbers"); 
		int no1 = sc.nextInt(); 
		int no2 = sc.nextInt(); 
		System.out.println("Before Swapping"); 
		System.out.println(no1);
		System.out.println(no2); 
		no1 = no1+no2; 
		no2 = no1-no2; 
		no1 = no1-no2; 
		System.out.println("After Swapping"); 
		System.out.println(no1);
		System.out.println(no2);
		
	}

	private void swapping() {
		
		Scanner sc = new Scanner(System.in);
				
				 
				System.out.println("Enter numbers"); 
				int no1 = sc.nextInt(); 
				int no2 = sc.nextInt(); 
				System.out.println("Before Swapping"); 
				System.out.println(no1);
				System.out.println(no2); 
				no1 = no2; no2=no1;
				/*
				 * int temp = no1; no1 = no2; no2 = temp;
				 */
				System.out.println("After Swapping"); 
				System.out.println(no1);
				System.out.println(no2);
	}

}
