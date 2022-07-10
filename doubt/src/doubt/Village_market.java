package doubt;

public class Village_market extends Market   {
	public Village_market(int tomato, int potato, int carrot)
	
	{     //super("calender");
		super.tomato = tomato;
		super.potato =potato; 
		super.carrot = carrot;
		
		
	}
	
public static void main(String[] args) {
	Village_market owner = new  Village_market(45,40,45);	
	 owner.add();
	
}
}
