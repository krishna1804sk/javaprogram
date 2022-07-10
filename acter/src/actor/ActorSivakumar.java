package actor;

public class ActorSivakumar implements Actor {
	String address = "coimbatore";
	public ActorSivakumar(int i, String  name) {
		// TODO Auto-generated constructor stub
	}

	public ActorSivakumar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println(as.address);
		Actor ac =  new ActorSivakumar();
		ac.act();
		ac.dance();
		//ac.speaking();
		ac.sing();
		System.out.println(ac.address);
		
	}

	 public void speaking()
	 {System.out.println("sing is very good and well");
	 }

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("acting well");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("dance is wonderfull");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("sing is very good" );
	}
	 }


