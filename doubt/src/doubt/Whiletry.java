package doubt;

public class Whiletry {
	public static void main(String[] args) {
		int box_of_chocolate = 12; int no_of_time = 900;
		while(no_of_time>0)
		{
			
			box_of_chocolate = box_of_chocolate+box_of_chocolate/2;	
			no_of_time = no_of_time-1;
			
	}
		System.out.println(box_of_chocolate);

}
}
