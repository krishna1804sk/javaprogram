package Payilagam_project;

import java.util.Scanner;

public class Emi_calculate {

	public static void main(String[] args) {
		Emi_calculate EMI = new Emi_calculate();
		EMI.chose();
		//EMI.EMI_finding();

	}

	private void chose() {
		System.out.println("press 1 for home loan calculate");
		System.out.println("press 2 for personal loan calculate");
		System.out.println("press 3 for car loan calculate");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		switch(number)
		{
		   case 1:
		          System.out.println("you chose home lone");
			      double emi =EMI_finding();
			       System.out.println("home loan EMI :      "+emi );
		           break;
	
		   case 2:
			   
		         System.out.println("you chose personal lone");
			      double emi1 =EMI_finding();
			     System.out.println("personal loan EMI :   "+emi1 );
		            break;
	
		   case 3:
		         System.out.println("you chose car lone");
			     double emi2 =EMI_finding();
			     System.out.println("car loan EMI :        "+emi2 );
		          break;
	
	
		}
		
	}
	public double EMI_finding() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lone amount ");
		long loan = sc.nextLong();
		System.out.println("enter the interest rate");
		float rate_of_interest = sc.nextFloat();
		System.out.println("enter the loan tenure in year");
		float year = sc.nextFloat();
		int year1 = (int) year;
		double EMI_amount = 0;
		rate_of_interest = (rate_of_interest)/(12*100f);
		year = 12*year;
		sc.close();
		
		
EMI_amount = (loan*rate_of_interest*Math.pow(1+rate_of_interest,year))/(Math.pow(1+ rate_of_interest,year)-1);          

		
               double roundOff=(Math.round(EMI_amount));

				// EMI_amount = roundOff;
				double total =EMI_amount*year;
				
				// System.out.println("EMI amount per month                       :"+(Math.round(EMI_amount)));
			 System.out.println("you pay at the of end "+year1+"year"+" will be         :"+(Math.round(total))  );
		        
		return Math.round(EMI_amount);
	}

}