package doubt;



public class Choloate {
	
		
public static void main (String[] args)
{
	int box = 8;
	System.out.println("After Dinner "+ box); 
	//box = (box + box/2);
	System.out.println("Before Dinner "+ box); 
	box = (box + box/2); 	//12
	System.out.println("After Lunch "+ box); 
	box = (box + box/2); 
	System.out.println("Before Lunch " + box); //18
	System.out.println("After Breakfast " + box); 
	box = (box + box/2); 
	System.out.println("Before Breakfast " + box); 

}
	}
