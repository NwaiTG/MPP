package Lab2_level2;

public class Staff extends Person{
    private double salary;

    public Staff(String name, String phone, int age, double sal){
        super(name, phone, age);
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}
