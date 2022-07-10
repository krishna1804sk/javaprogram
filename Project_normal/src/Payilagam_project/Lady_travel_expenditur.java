package Payilagam_project;

import java.util.Scanner;

public class Lady_travel_expenditur {
	
	
	

	public static void main(String[] args) {
		Lady_travel_expenditur find = new Lady_travel_expenditur();
		//find.before_travel_expenditure();
		//find.after_travel_expenditure();
		find.percentage_of_travel_expenditure_save();
		
	}

	public void percentage_of_travel_expenditure_save() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = sc.nextLine();
		float percentage_of_saving_money = 0f ;
		
		int before_scheme_expenditure; int after_scheme_expenditure;
		
		System.out.println("enter In per month how many days did you go to work ");
		int days =sc.nextInt();
		while(days>28)
		{
		System.out.println("enter the correct days did you go to work");
		int days1 =sc.nextInt();
		days = days1;
		}
		System.out.println("enter how much money did you spend per day go to work by auto");
		int auto_charge = sc.nextInt();
		System.out.println("enter how much money did you spend per day go to work by bus");
		int bus_charge = sc.nextInt();
		before_scheme_expenditure = days*(auto_charge+bus_charge);
		System.out.println(name);
		System.out.println("total expenditure per month for before scheme"+before_scheme_expenditure);
		
		System.out.println("after government scheme bus fees is free");
		bus_charge = 0;
		//int bus_charge = sc.nextInt();
		after_scheme_expenditure = days*(auto_charge+bus_charge);
		int after_scheme_expenditure1 = after_scheme_expenditure ;
		System.out.println("total expenditure per month for after scheme"+after_scheme_expenditure);
		int saving_money_after_scheme = ((before_scheme_expenditure)-(after_scheme_expenditure));
		
		System.out.println("saving of the money after government scheme  is"+" "+ saving_money_after_scheme);
		//System.out.println((100/(before_scheme_expenditure)));
		 percentage_of_saving_money = ((saving_money_after_scheme*100)/before_scheme_expenditure);
		
		 System.out.println("percentage_of_saving_money is :"+"  "+percentage_of_saving_money+"%");
	}

	public void after_travel_expenditure() {
		int after_scheme_permonth ; int bus_charge = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter In per month how many days did you go to work ");
		int days =sc.nextInt();
		while(days>28)
		{
		System.out.println("enter the correct days did you go to work");
		int days1 =sc.nextInt();
		days = days1;
		}
		System.out.println("enter how much money did you spend per day go to work by auto");
		int auto_charge = sc.nextInt();
		System.out.println("after government scheme bus fees is free");
		//int bus_charge = sc.nextInt();
		after_scheme_permonth = days*(auto_charge+bus_charge);
		System.out.println("total expenditure per month for after scheme"+after_scheme_permonth);
		 
	
		
		
	}

	public void before_travel_expenditure() {
		int before_scheme_permonth;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter In per month how many days did you go to work ");
		int days =sc.nextInt();
		while(days>28)
		{
		System.out.println("enter the correct days did you go to work");
		int days1 =sc.nextInt();
		days = days1;
		}
		System.out.println("enter how much money did you spend per day go to work by auto");
		int auto_charge = sc.nextInt();
		System.out.println("enter how much money did you spend per day go to work by bus");
		int bus_charge = sc.nextInt();
		before_scheme_permonth = days*(auto_charge+bus_charge);
		System.out.println("total expenditure per month for before scheme"+before_scheme_permonth);
		
	
		
}
		
}
