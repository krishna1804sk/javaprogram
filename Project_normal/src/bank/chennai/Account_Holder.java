package bank.chennai;

 class Account_Holder {
	public static void main(String[] args) {
		SBI bank = new SBI();
		bank.empName="krishna moorthi";
		bank.empId = "abc123";
		System.out.println(SBI.branch_name);
		bank.get_loan(100000);
		bank.create_account();
	}

}
