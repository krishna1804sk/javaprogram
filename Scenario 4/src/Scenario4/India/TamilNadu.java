package Scenario4.India;

public class TamilNadu extends SouthIndia {
	public TamilNadu(string name ) {
		
		// TODO Auto-generated constructor stub
	}
	
	
	static String capital = "Chennai";

	public static void main(String[] args) {
		//India.capital;
		// TODO Auto-generated method stub
System.out.println("India.capital");
      //TamilNadu.capital; 
System.out.println(TamilNadu.capital);
SouthIndia si = new TamilNadu();
si.cultivate();
si.dress();
si.livingStyle();
	}

	@Override
	public void speakLanguage() {
		// TODO Auto-generated method stub
		System.out.println(" speaking language is tamil");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat healthy food like  meals sambar");
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
	System.out.println("traditional vetti and shirt,pant");	
	}
	public void cultivate()
	{
		System.out.println("Rice and Sugar cane cultivation");
	}
	public void livingStyle()
	{System.out.println("Above Average development");
	}

}
