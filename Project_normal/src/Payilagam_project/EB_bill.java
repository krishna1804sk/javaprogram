package Payilagam_project;

import java.util.Scanner;

public class EB_bill{
	float total = 0f;
public static void main(String[] args) {
	EB_bill calc = new EB_bill();
	//calc.find_Eb_bill();
	calc.find_Eb_bill6();
	//calc.find_average_persentage();
}

public float find_Eb_bill() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the units");
	
	int units = sc.nextInt();
	sc.close();
	if(units<=100)
	{
		
		System.out.println("used power less then 100units or 100units so power tarrif is free");
		
	}
	else if(units<=200){
		int fixed_charges = 20;
		float duty = units/10;
		units = units-100;
		float charges = 100*0.0f+units*1.5f;
		float total = charges+duty+fixed_charges;
		System.out.println("cost for power   :"+charges+"\n"+"duty chargess   :"+duty+"\n"+"fixed chargess   :"+fixed_charges+"\n"+"total chargess   :"+total    );
		
	}
	else if(units<=500)
	{	
		float duty = units/10;
		int fixed_charges = 30;
		units = units - 200;
		float charges = 100*0+200+units*3f;
		
		float total = charges+duty+fixed_charges ;
		System.out.println("cost for power  :"+charges+"\n"+"duty chargess :"+duty+"\n"+"fixed chargess :"+fixed_charges+"\n"+"total chargess  :"+total    );
		
	}
	else if(units>500)
	{
		int fixed_charges = 50;
		float duty = units/10;
		units = units-500;
		float charges = 100*0+350+1380+units*6.6f;
		float total = charges+duty+fixed_charges;
		float roundOff=Math.round(total*100)/100;
		         total =roundOff;
		System.out.println("cost for power   :"+charges+"\n"+"duty chargess   :"+duty+"\n"+"fixed chargess   :"+fixed_charges+"\n"+"total chargess   :"+roundOff    );	
	}
	return total;
	
}


public void find_Eb_bill6() {
	Scanner sc = new Scanner(System.in);
	System.out.println("if do you want to calculate power tarrif in one month once press 12");
	System.out.println("if do you want to calculate power tarrif in two month once press 6");
	int month =sc.nextInt();
	float total_month_12 = 0;float total_month_6 = 0;int count =1;
	sc.close();
	switch(month)
	{
case 6:
		
	      int num = 1; count = 1;
  		  while(num<month)
		{
			System.out.println("count:"+count);
		float total	=find_Eb_bill();
			total_month_6 = total+total_month_6;
			System.out.println("8"+total_month_6);
			num = num+1;
			count++;
		}
		float average = (total_month_6)*(1/6f);
		System.out.println("power tarrif average:   "+ average);
	
		     break;
case 12:	
	
		num = 1; count = 1;
		System.out.println("you entre tarrif charges january month to last month december"+"\n"+"totally you have to entre 12 times");
		
		while(num<month)
		{   System.out.println("count:"+count);
			float total = find_Eb_bill();
			total_month_12 = total+total_month_12;
			
			num = num+1;
			count++;
		}
		 average = (total_month_12)*(1/12f);
		System.out.println("power tarrif average:   "+ average);
	
		
		break;
	}
	find_average_persentage(total_month_12,total_month_6);	
	         

}

private void find_average_persentage(float total_no1,float total_no_2) {
	float total_big = total_no1 >total_no_2?total_no1:total_no_2;
	
	float total_small = total_no1 <total_no_2?total_no1:total_no_2;
	float save = total_big-total_small;
	System.out.println("save power tarrif ruppes after the scheme:"+save);
	float persentage = save*(total_big/100f);
	System.out.println(" save persentage:"+persentage);
}
	
}