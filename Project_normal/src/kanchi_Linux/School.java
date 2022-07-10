package kanchi_Linux;

public class School {
     static String class_name="9B"; int money ;
	public static void main(String[] args) {
		
		School krish = new School();
		System.out.println(krish.money);
		School guru = new School();
		School kumar =new School();
		
		   krish.money=10;
		 System.out.println(krish.money);
		   guru.money=5;
		   kumar.money=4;
		    krish.welcom();
		  int total_mark = krish.add(72,65,90,80,90);
		  System.out.println("krish total mark : "+total_mark);
		    
		
	}
	 private void welcom() {
		System.out.println("welcome the teacher");
		System.out.println(money);
		
	}
	private int add(int tamil,int english,int mathematics,int sci,int  social) {
		
		int result =  (tamil+ english+mathematics+sci+social);
		
		
		return result;
	}

}
