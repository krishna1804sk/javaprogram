package doubt;

public class FindingDivisior {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FindingDivisior fd = new FindingDivisior();
				fd.divisior();
		
	}

	private void divisior() {
		int div =2; int no = 3; int divisors = 0;
		
		while((no/2)>=div)
		{
		if(no%div==0)
		{
			System.out.println(div);
			divisors = divisors+1;
		}
		System.out.println("the number"+"  "+no+" "+"now divide by"+div);
	       div = div+1;	
		}
		System.out.println("no of divisors for the "+"  "+no+"  "+"is"+"  "+divisors);
			
	if(divisors==0) {
		
		System.out.println("given number"+"   "+ no+ "  "+ "is prime number");
	}
	else
	{
		System.out.println("given number"+"   "+ no+ "  "+ "is nonprime number");
		
	}
	}
	}
		//
	



