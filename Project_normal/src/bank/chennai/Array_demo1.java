package bank.chennai;

import java.util.Scanner;

public class Array_demo1 {
	int l ;
	 Scanner sc = new Scanner(System.in);
	private int[] length;
	public static void main(String[] krish) {
		Array_demo1 array = new Array_demo1();
		//array.practise();
		//array.check_even_and_add();
		//array.practice2();
		//array.practice3();
		//array.practice4();
		//array.practice5_combine_two_array();
		array.add_and_compine_numbers();
		/*
		 *   int[]mark = new
		 * int[5];
		 * 
		 * System.out.println(mark[4]); for(int i = 0; i<mark.length;i++) {
		 * System.out.println("entre the mark"); mark[i] = array. sc.nextInt();
		 * 
		 * 
		 * }
		 */
		 // System.out.println(mark[4]);
		//Linear Search Algorithm
		int[] no = {8,10,12,23,40};		
		Scanner sc = new Scanner(
		System.in
		); 
		System.out.println("Enter key to search"); 
		int key = sc.nextInt(); //100
		int i=0; 
		for(i=0; i<no.length;i++)	{
			if(no[i] == key)
			{
			System.out.println("The key you searched for is present at "+ i); 
			break; 
			}
		}			if(i==no.length)
		System.out.println("Key is not found"); 
		 
}private void add_and_compine_numbers() {
	Scanner sc = new Scanner(System.in);
	System.out.println("entre the array length of student mark");
	int len1 =sc.nextInt();
	System.out.println("entre the second array length");
	int len2 = sc.nextInt();
	int count = 1;
	int mark1[ ]= new int[len1];
	int mark2[]= new int[len2];
	for(int i =0;i<len1;i++)
	
	{
		System.out.println("entre the number for mark1:"+count);
		mark1[i]=sc.nextInt();
		count++;
	}
	count = 1;
	for(int i =0;i<len2;i++)
    {
		System.out.println("entre the number for mark2 :"+count);
		mark2[i]=sc.nextInt();
		count++;
	}
	
	
	
	int big = len1>len2?len1:len2;
	int small = len1<len2?len1:len2;
	int result[] = new int[big];
	int result1[] = new int [big+small];
	int total = 0;
	int j = 0;
	for(int i = 0;i<big;i++)
	{
		if(i<small)
		{
			
			result[i] = mark1[i]+mark2[i];
			System.out.println("index ;"+i+" " +result[i]);
		}
		 else if (len1>len2) {
			
			result[i]= mark1[i];
			System.out.println(result[i]);
			System.out.println("index ;"+i+" " +result[i]);
		}
		else if(len1<len2)
		{
			result[i]= mark2[i];
			System.out.println("index ;"+i+" " +result[i]);
			
		}
		for( i = 0;i<big+small;i++)
		{
		 if(len1<len2&&i<small)
		{
			result1[i] = mark1[i];
			System.out.print(result1[i]);
		}
		else if(len2<len1&&i<small)
		{
			result1[i] = mark2[i];
			System.out.print(result1[i]);
			
		}
		else if(len1>len2&&i<(small+big))
		{
			result1[i] = mark2[j];
			System.out.print(result1[i]);
			j++;
			
		}
		else if(len2<len1&&i<(small+big))
		{
			result1[i] = mark2[j];
			System.out.print(result1[i]);
			j++;
			
		}
		
		
		
		}
		 
		 }
	
}	
		
	
private void practice5_combine_two_array() {
		int mark [] = {46,84};
		int mark1[]= {65,857,98};
		int j = 0;
		int small = mark.length<mark1.length?mark.length:mark1.length;
		int big = mark.length>mark1.length?mark.length:mark1.length;
		int result [] = new int[big+small];
		for(int i=0;i<big+small;i++)
		{
			if(i<small)
			{
				result [i] = mark[i];
				System.out.println(result [i]);
			}
			else {
				
				result[i] = mark1[j];
				System.out.println(result [i]);
				j++;
			}
			
			
			
		}
		
	}
private void practice4() {
		int mark[] = {45,54,23,45,12,78,45,67};
		int mark1[] = {64,89,29,22,3,112,23,123,345,234,567,23,45,123,4};
		int i =0;
		int small = mark.length<mark1.length?mark.length:mark1.length;
		int big = mark.length>mark1.length?mark.length:mark1.length;
		int result[] = new int[big];
		for( i = 0;i<big;i++)
		{
			if(i<small)
			{	
			result[i] = mark[i]+mark1[i];
			System.out.println(result[i]);}
		
		  else {
			result[i] =mark1[i];
			System.out.println(result[i]);
			
		}
		}
	}
public void practice3()
	{
	
	int mark[ ]= {73,83};
	int total[]= {34,23,56};
	int big = mark.length>total.length?mark.length:total.length;
	
	int result[] = new int[big];
	int small = mark.length<total.length?mark.length:total.length;
	for(int i = 0;i<small;i++)
	{
		
		result[i]=mark[i]+total[i];
		System.out.println(result[i]);
	}
	for(int i = small;i<big;i++)
	
	{
	
	result[i]= total[i];
	System.out.println(result[i]);
	}
	
	}
	public void practice2()
	{
	
	int mark[] = {74,84,83};
	int price [] = {44,23,9};
	int total []= new int[mark.length];
	int result = 0;
	
	for(int i=0;i<mark.length;i++)
	{
		
		
		 total[i] = mark[i]+price[i]; 
		 result = result+total[i];
	}
	System.out.println(result);
	}
	
	
	private void practice() {
	int mark[] = {74,84,83};
	int price [] = {44,23,9};
	
	for(int i=0;i<mark.length;i++)
	{
		
		
		System.out.println(mark[i]+price[i]);
	}
	
		
	}
	private void check_even_and_add() {
		int total =0;
		int price [] = new int[-4];
		int mark []= {34,23,42,7,5,45,97,43,23,21,637,837,8377,623,9,3,3,2,};
		String[] name = new String[2147483647] ;
				name[0]= "krish";
		for(int i =0;i<mark.length ;i++)
		{
			if(mark[i]%2==0)
				
			total = total+mark[i];
			
			
		}
		System.out.println(total);
		total=0;
			for(int i =0;i<mark.length;i++)
			{
				if(mark[i]%2!=0)
				{
					
					total = total+mark[i];
					
				}
				
			}
			System.out.println(mark);
			
		
		
	}
	private void practise() {
		int []price = new int[4];
		System.out.println(price.length);
		int p[ ]= {12,32,45,13,78,78,384,847,234,23,56,24,68,24,1,3};
		//p[0]=4; p[1]=32;p[3]=45;p[4]=78;p[5]=87;
		System.out.println("even number");
		for(int i =0;i<p.length;i++)
		{
			
			if(p[i]%2==1)
			{
				System.out.println(p[i]);
			}
		}
		System.out.println("add number");
		for(int i =0;i<p.length;i++)
		{
			if(p[i]%2!=0)
			{
				
				System.out.println(p[i]);
			}
		}
		
	}
	
}