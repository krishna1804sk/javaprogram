package doubt;

public class finenumberdivideby2and6and8 {
	public static void main(String[] args)
	{  int num = 0;
		while(num<=1000)
		{
			if(((num%2==0)&&(num%6==0))&&((num%8==0)||(num%9==0)))
			{System.out.println(num);
			}
			num=num+1;
			}
	}

}
