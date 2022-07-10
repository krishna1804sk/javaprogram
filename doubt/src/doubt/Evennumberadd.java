package doubt;

public class Evennumberadd {
	public static void main(String[] args) {
		int result = 0; int num = 1;
		while (num<=100)
		{
			result = num;
			System.out.println(result);
			num = num+2;
		}	
		Evennumberadd a = new Evennumberadd();
		a.div();
	}
		void div()	
		{
		int no1 = 45; int no2 =3;
		int big = no1>no2?no1:no2;
		int count = big;
		int small = no1<no2?no1:no2;
		while(true)
		{ 
			if(small == (count/big) )
			{
				 System.out.println(count);
			break;
			}
			count = count+1;
			
		}	// TODO Auto-generated method stub
		
	}
		
		
		
	
	

}
