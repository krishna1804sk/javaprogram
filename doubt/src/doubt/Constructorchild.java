package doubt;

public class Constructorchild extends Constructparent{
	
	

	int packet_money = 5; 
	public Constructorchild()
	{
		super(5);
		
	}
	
	
	
	//public Constructorchild(int i) {
	//	System.out.println();
	//	TODO Auto-generated constructor stub
	//}

   // public Constructorchild() {
		//System.out.println("i am in child con");
	// TODO Auto-generated constructor stub
 //  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructorchild cr = new   Constructorchild();
		Constructorchild cr1 = new  Constructorchild();
		//cr.work();
	}

	public void work()
	{     
		System.out.println("going to school");
		
	}
}

