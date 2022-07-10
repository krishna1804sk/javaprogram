package doubt;

public class Looping_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping_demo ld = new Looping_demo();
		ld.get_divisior();
	}


private void get_divisior() {
		// TODO Auto-generated method stub
	int div = 2; int no = 100; int no_divisior = 0;
	while(div<=no/2)
	{
	if(no%div==0)
	{
	System.out.println(div);
	no_divisior =no_divisior+1;
	} 
	div = div+1;
	} 
	
if(no_divisior ==0) {
	System.out.println("Prime Number");
}
else
{
	System.out.println("Not Prime Number");
} 
}
}
