import java.util.Scanner;

public class Array_demo1 {

	public static void main(String[] args) {
		Array_demo1 array = new Array_demo1();
		int [] result = array.employee();
		     for(int i =0;i<2;i++)
		     {
		    	 
		    	 System.out.println(result[i]);
		     }

	}

	public int[] employee() {
		
		Scanner sc = new Scanner(System.in);
		int len  = sc.nextInt();
		int []mark = new int [len];
	System.out.println(mark[0]);
		int total =0;
		for(int i =0;i<mark.length;i++)
		{
			System.out.println("entre the mark");

		  mark[i]=sc.nextInt();
			
		}
		for(int i =0;i<len;i++)
		{
			System.out.println(mark[i]+" ");
			total = total+mark[i];
			
		}
		int [] result = new int[2];
		result[0] = total;
		result[1] =total;
		return result;  
	}
	int[] ar = {10,23,45,57,66,78,90,101};

	for(int i=0;  i<ar.length; i++)
	{
	if(ar[i]%2!=0){
		}
	else{
	System.out.println(ar[i]); 
	}
	} 
	

}
