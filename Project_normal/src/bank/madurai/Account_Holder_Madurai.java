package bank.madurai;

import bank.chennai.SBI;

public class Account_Holder_Madurai {

	public static void main(String[] args) {
		SBI bank = new SBI();
		bank.empName = "moorthi";
		bank.empId = "krish123";
		bank.get_loan(15000);
		bank.create_account();
      System.out.println(SBI.branch_name);

	}

}
