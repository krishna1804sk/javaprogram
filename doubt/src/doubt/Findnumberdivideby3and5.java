 package doubt;

public class Findnumberdivideby3and5 {
	public static void main(String[] args) {
		int num = 2; int result = 0;
		while(true)
		{
			if((num%3==0)&&(num%5==0)&&(num%2==0))
			{
				System.out.println(num);
				break;
			}
			
			num = num+1;
		}
		
			
	}
		
	

}
