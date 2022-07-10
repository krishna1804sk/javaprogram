package Payilagam_project;

public class Bank {
	String customer; int accNo ; static String branch;
	public Bank(String customer, int accNo) {
		this.customer = customer; 
		this.accNo    =    accNo;
	}
	public static void main(String[] args) {
		
		Bank customer1 = new Bank("Kavin", 1234);
		Bank customer2 = new Bank("Kathir", 1456);
		System.out.println(" customer name"+customer1.customer);
		System.out.println("customer accNo :"+customer2.accNo);
		branch = "chennai";
		System.out.println("branch_name: "+ branch);
		
	}

}
