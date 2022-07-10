package doubt;

public class Protectedclass {
	int i;

	public Protectedclass(int i) {
		this.i = i;
		System.out.println(i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protectedclass ptc = new Protectedclass(67);
	}

	public void wrk() {
		System.out.println("i am in protecded class 1");
		// TODO Auto-generated method stub
		
	}

}
