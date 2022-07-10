package doubt;

public class Market extends wholesale_market {
	int potato;
	int tomato;
	int carrot;

	public Market(int tomato, int potato, int carrot)

	{
		super("calender");
		this.potato = potato;
		this.tomato = tomato;
		this.carrot = carrot;

	}

	public Market() {
		System.out.println("welcome");
	}

	
	  public static void main(String[] args) {
	  
	  Market account = new Market(40,35,40); account.add();
	 
	  //account.addtion(); }
	  }

	public void addtion() {

		// super.add();
		int total = tomato + potato + carrot;
		System.out.println("tomato" + tomato);
		System.out.println("potato" + potato);
		System.out.println("carrot" + carrot);
		System.out.println(total);

	}
	public void add() {
		int total = tomato+potato+carrot ;
		System.out.println("tomato"+tomato);
		System.out.println("potato"+potato);
		System.out.println("carrot"+carrot);
		System.out.println(total);
		
	}

}
