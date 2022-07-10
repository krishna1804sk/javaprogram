package doubt;


	

	public class Mar extends Market   {
		public Mar(int tomoto, int potato, int caret)
		
		{     //super("calender");
			super.tomoto = tomoto;
			super.potato =potato; 
			super.caret = caret;
			
			
		}
		
	public static void main(String[] args) {
		Mar owner = new  Mar(8,10,5);	
		int total = owner.add();
		System.out.println(total);
	}
	}


