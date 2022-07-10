package kanchi_Linux;

public class Constructor_overloading {
	float a ,b;
	private Constructor_overloading(int number1,int number2)
	{
		
	        a=number1;b=number2;
		
	}
	

	public Constructor_overloading(float number1, float number2) {
		         a = number1; b=number2;
	}


	public Constructor_overloading() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		
		
		Constructor_overloading add = new Constructor_overloading(23,56);
		add.addition();
		Constructor_overloading add1 = new Constructor_overloading(2.5f,3f);
		add1.addition();
		Constructor_overloading divide = new Constructor_overloading();
	}


	public void addition() {
		
		System.out.println(a+b);
	}

}
