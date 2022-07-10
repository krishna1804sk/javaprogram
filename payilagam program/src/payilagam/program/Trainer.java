package payilagam.program;

public class Trainer {
	 String dept = "CSE"; String institute = "payilagam";
	 private int salary = 10000;
	 public Trainer()
	 {
		 
		// System.out.println("hi moorthi");
	 }
	 public Trainer(String dept, String institute) {
		 this.dept = dept;
		 this.institute = institute;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		 Trainer trainerKumar = new Trainer("CSE","payilagam");
		
	}
	public int getSalary() {
		return this.salary;
	}
	public void training()
	{
		System.out.println("traing");
	}

}
