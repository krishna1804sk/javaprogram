package payilagam.program;

public class SQLTrainer extends Trainer { 
	int price ;


		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SQLTrainer  ram = new SQLTrainer();
  //SQLTrainer  ra = new SQLTrainer(45);
  System.out.println(ram.dept);
  System.out.println(ram.institute);
ram.training();
int salary = ram.getSalary();
 System.out.println(salary);
}
}