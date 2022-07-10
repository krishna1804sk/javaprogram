package doubt;

public class Fibonacci_serious {

	public static void main(String[] args) {
		
		Fibonacci_serious fs = new Fibonacci_serious();
		//fs.fibonacci_serious1();
		//fs.fibonacci_serious2();
		fs.fibonacci_serious3();
	}

	private void fibonacci_serious3() {
		int first = -1; 
		int second = 1; 
		while(first+second<=130000)
		{
		System.out.println(first+second); 
		second = first+second; 
		first = second - first; 
		} 
		
	}

	public void fibonacci_serious2() {
		int first = -1; int second = 1; int third = 0;
		
		{
			while(10000>third)
			{
			
			third = first+second;
			first = second; 
			second =third;
			System.out.println(third);
			
		}
		
		}
	}

	public void fibonacci_serious1() {
		int first = 0; int second = 1 ; int third = 0;
		while(1000>third)
		{
			first=second; second=third;
			third = first+second;
			//System.out.println(first);
			//System.out.println(second);
			System.out.println(third);
		}
		
	}

}
