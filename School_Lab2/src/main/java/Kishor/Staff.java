package Kishor;

public class Staff extends Person {
	private double salary;

	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
