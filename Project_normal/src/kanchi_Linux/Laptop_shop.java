package kanchi_Linux;

public class Laptop_shop {
	int price ;String laptop_name; 
	static String shop_name = "krish";

	public static void main(String[] args) {
		
		
		  
		Laptop_shop laptop1 =new Laptop_shop();
		System.out.println(laptop1.laptop_name);
		laptop1.laptop_name = "lenovo";
		System.out.println(laptop1.laptop_name );
		laptop1.price=50000;
		
		laptop1.sell();
		
		
	    
	    Laptop_shop laptop2 =new Laptop_shop();
	    laptop2.laptop_name = "Hp";
	    laptop2.price=55000;
	    laptop2.sell();
	    
	    Laptop_shop laptop3 =new Laptop_shop();
	    laptop3.laptop_name = "dell";
	    laptop3.price=56000;
	    laptop3.sell();
	    
	   
	    Laptop_shop laptop4 =new Laptop_shop();
	    laptop4.laptop_name = "apple";
	    laptop4.price=56000;
	    laptop4.sell();
	    
	  
	  
	 
	 
	}
	public void sell() {
		
		System.out.println();
		System.out.println("product name  :"+laptop_name);
	    System.out.println("product price :"+price);
	    
		
		
	}
	

}
