package doubt;

public class Adding1to100evennumber {
	public static void main(String[] args) {
	
		int num = 1; int total = 0;int roll = 0;
		while(num<=100)
		{  
			num = num+num;
			total = num+total;
			System.out.println(roll+"    "+total);
			
			roll = roll+1;
		}
	
		System.out.println(total);
	}
		
		
	}
	
		


