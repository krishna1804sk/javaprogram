package doubt;

import java.util.Scanner;

public class Primenumberfinding {

	  public static void main(String[] args) {
		
		Primenumberfinding pnf = new Primenumberfinding();
		Primenumberfinding pd = new Primenumberfinding();
		pnf.prime_number();
		////pd.try_prime_number();
	}

	
	 private void prime_number() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("pls enter no and press enter");
		 int no = scanner.nextInt();
		  int div = 2;  long divisors = 0;
		
	 while((no/2)>div)
		{
		
		if(no%div==0)
		{
			//System.out.println("the is divided by"+div);
			System.out.println("the number divisor"+div );
			 System.out.println("prime number"+"  "+ no);
			 divisors = divisors+1;
			// break;
		}
		
		div = div+1;
}
		System.out.println("totall divisors"+"  "+divisors);
		if (divisors ==0)
		{
		System.out.println("the number is "+"  "+no+"  "+"prime number");
		}
		else {
			System.out.println("the number is "+"  "+no+"  "+"nonprime number");
}
}
}





