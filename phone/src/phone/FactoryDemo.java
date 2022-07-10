package phone;

public abstract class FactoryDemo extends SmartPhone {
	
	
	static int price = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	abstract  void verifyFingerPrint();
	 abstract  void providePattern();
	public  void browse()
	 {System.out.println("Factory Demo browsing");
		 boolean orginal = false;
	 }
}

