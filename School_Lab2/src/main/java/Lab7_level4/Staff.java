package Lab7_level4;

public class Staff extends Person implements IPerson {
    private double salary;

    public Staff(String name, String phone, int age, double salary){
        super(name, phone, age);
        this.salary = salary;
    }

    public void myAbstract(){
        System.out.println("From abstract method of Staff.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
