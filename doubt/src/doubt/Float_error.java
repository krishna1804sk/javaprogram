package doubt;

public class Float_error {
double number = 5.57;
	public static void main(String[] args) {
	
		Float_error fe = new Float_error();
		fe.multiple();
	}
	private void multiple() {
		number = 456*7.3;
		System.out.println(number);
		
	}

}
