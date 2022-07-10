
public class Sir_teaching_pattern {

	public static void main(String[] args) {
		
		Sir_teaching_pattern sir = new Sir_teaching_pattern();
		
	}
	private void pattern12() {
		for(int row=1; row<=5; row++)
		{
		for(int col = 1; col<=6-row; col++)
			{
			System.out.print(col+" ");
			}
		for(int star=1; star<=row; star++	)
			{
			System.out.print(" "+ "*" +" ");  
			}

		System.out.println(); 
		} 
		
	}
	public static void printStar(int row)
	{
	for(int col=1; col<=row; col++)
		{
		System.out.print("* "); 
		}
	} 

	private void task7() {
		for(int row=1; row<=7; row++)
		{
		if(row<=4)
		{
			printStar(row); 
		}
		else
		{
		printStar(8-row); 
		}
		System.out.println(); 
		} 
		
	}

	private void task6() {
		for(int row=1; row<=7; row++)
		{
		if(row<=4)
		{
		for(int col=1; col<=row; col++)
			{
			System.out.print("* "); 
			}
		}
		else
		{
		for(int col =1 ; col<= 8-row; col++)
			{
			System.out.print("* "); 
			}
		}
		System.out.println(); 
		} 
		
	}

}
