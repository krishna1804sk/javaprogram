package doubt;

public class Childd extends Parent{
int salary =25000; int i ;
public Childd(int i)

{     
	this.i = i;
	System.out.println("value"+i );
	
	//  super(5);
        
	System.out.println("hello");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Childd ch = new Childd(56);
ch.study();
ch.work();
	}
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(salary);
		System.out.println(super.salary);
		super.work();
		
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
	

}
