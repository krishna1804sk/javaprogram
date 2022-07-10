package doubt;

public class While_choloate {
public static void main(String[] args) {
	int no_of_times = 3; 
	int box = 8; 
	while(no_of_times >0)
	{
	box = (box + box/2); 
	no_of_times = no_of_times -1;
	}	
	System.out.println(box); 
}
}
