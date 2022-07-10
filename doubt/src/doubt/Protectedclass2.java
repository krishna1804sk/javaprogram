package doubt;

public class Protectedclass2 extends Protectedclass {
	int i ;
public Protectedclass2(int i) {
	super(56);
	this.i = i;
	System.out.println(i);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	Protectedclass ptc2 = new Protectedclass(98);
	ptc2.wrk();
	//ptc2.wrk2();
	
}

public void wrk2()
{ 
	
	System.out.println("i am in protectedclass2");
}
}
