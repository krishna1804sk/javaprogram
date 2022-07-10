package Scenario4.India;

public abstract class India {
	static String capital = "New Delhi";
	public India(String primeMinister)
	{
	System.out.println("our Prime Minister is" + primeMinister);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public abstract void speakLanguage();
	public abstract void eat();
	public abstract void dress();
}
