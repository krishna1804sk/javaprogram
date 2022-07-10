package doubt;

public class Watch {
	public static void main(String[] args) {
		int box = 0; 
		int day = 1; 
		while(day<=15)
		{
		int cash = 2; 
		box = box+cash; 
		day = day+1; 
		}
		System.out.println(box); 
		box = box+box*2;
		System.out.println("father said that give to child double the amount" + box);
	}

}
