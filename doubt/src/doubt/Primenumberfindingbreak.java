package doubt;

public class Primenumberfindingbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumberfindingbreak pnfb = new Primenumberfindingbreak();
		pnfb.primenumber();
	}

	private void primenumber() {
		int no = 1029; int div = 2;int divisor = 0;
		
		while((no)>div)
		{
		if(no%div==0)
		{
			
			System.out.println("the number"+"  "+no+"non prime number");
			
			divisor = divisor+1;
			 break;
		
}
			div = div+1;
			}
	System.out.println("total divisior for the "+no+"is"+divisor );
	if(div==no)
	{
	
	System.out.println("the number"+"  "+no+" prime number");
	
	
	
	}
}
}
