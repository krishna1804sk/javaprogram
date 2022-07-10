package doubt;

public class Constructparent {
      int salary = 400; 
     
	public Constructparent(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("i am in parent class");
	}
	
	public static void main(String[] args) {
		
		Constructparent cp = new  Constructparent(560);
		//Constructparent cg = new  Constructparent();
	}
	public void ambition()
	{
		
		System.out.println("child become good");
	}
	}


