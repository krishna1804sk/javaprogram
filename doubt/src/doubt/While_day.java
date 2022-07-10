package doubt;

public class While_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int box = 0;
		int day = 1 ; 
		while(10>=day)
		{
			int cash = day;	 
			box = cash+box;
			day = day+1;
			System.out.println(box);
		}
		System.out.println(box);
	}

}
