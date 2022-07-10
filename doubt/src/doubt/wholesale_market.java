package doubt;

public class wholesale_market  {
	int tomato ; int potato ; int carrot ; String give ;
	public wholesale_market(String give)
	{
		this.give = give;
		System.out.println(give);
	}
	
	public wholesale_market() 
	{
	   System.out.println("welcome");
	}
	
	
	public wholesale_market(int tomato, int potato, int carrot) {
		this.tomato =  tomato ;  this.potato = potato ; this.carrot =  carrot;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wholesale_market account = new wholesale_market(30,25,30);
		//account .add();
	}

	public void add() {
		int total = tomato+potato+carrot ;
		System.out.println("tomato"+tomato);
		System.out.println("potato"+potato);
		System.out.println("carrot"+carrot);
		System.out.println(total);
		
	}

}
