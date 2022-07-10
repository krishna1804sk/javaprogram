package kanchi_Linux;

public class Laptop_shop2 {
	   int price ;String laptop_name; float p;
	   public Laptop_shop2(String name,int price)
	   {
		  
		   laptop_name = name;
		   this.price = price;
		   
	   }
	
	   Laptop_shop2(String b,  float p ) 
	   {
		   
		   
	   }
	   

	public static void main(String[] args) {
		Laptop_shop2 laptop1 =new Laptop_shop2("lenovo",50000);
		laptop1.sell();
		
		 Laptop_shop2 laptop2 =new Laptop_shop2("HP",55000.00f);
		 laptop2.sell();
		
		Laptop_shop2 laptop3 =new Laptop_shop2("dell",57000);
		laptop3.sell();
		
		Laptop_shop2 laptop4 =new Laptop_shop2("Apple",75000);
		laptop4.sell();
		float discount = laptop4.discount();
		System.out.println(discount);
		
		

	}
public void sell() {
		
		System.out.println();
		System.out.println("product name  :"+laptop_name);
	    System.out.println("product price :"+price);
		System.out.println();
		
	}
public float discount() {
	int discout =5;
	float discount_price=(price)-((5/100f)*(price));
	
	
	return discount_price;
	
}

}
