package doubt;

public class Primenumberrange {

	public static void main(String[] args) {
		
		Primenumberrange pnr = new Primenumberrange();
		pnr.Primenumberrange1();
	}

	private void Primenumberrange1() {
		int no = 2; int given_number = 10000; int total_non_dividiable_number=0;
		while(no<given_number)
		{int divisible = 0; int div = 2;
			while(div<=no/2)
			{
		if(no%div==0)		
		{		
		//System.out.println("non prime");
		
		divisible++;
		break;
		}	
	div++;
			}
		if(divisible==0) {
      System.out.println( no + " ");
      total_non_dividiable_number++;
}
		 no++;
	}
	System.out.println("total non dividiable number between"+" "+" 2"+"  "+"and"+ "  "+ given_number+" "+"is "+"  "+total_non_dividiable_number);	
		
		 
}
}
