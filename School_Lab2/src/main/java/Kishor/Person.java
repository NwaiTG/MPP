package Kishor;

public class Person {
	private String Name;
	private String Phone;
	private int Age;
	

	public Person(String name, String phone, int age) {
		super();
		Name = name;
		Phone = phone;
		Age = age;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	//get salary will be overridden in Faculty and Staff
	public double getSalary() {
		return 0;
	}
	
	//add course for Faculty and Student
	public void addCourse(Course course) {
		//TODO override in Class Faculty and Class Student
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("{" + "Name: " + this.Name + "," + " Phone: " + this.Phone + "," + " Age: " + Integer.toString(this.Age)+ "}" + "\n");
	}

	public int getTotalUnits() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
