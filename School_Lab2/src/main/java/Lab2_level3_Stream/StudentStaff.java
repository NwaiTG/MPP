package Lab2_level3_Stream;

public class StudentStaff extends Student {
    private Staff staff;

    public StudentStaff(String name, String phone, int age, double gpa, double sal){
        super(name, phone, age, gpa);
        this.staff = new Staff(name, phone, age, sal);
    }

    public double getSalary(){
        return staff.getSalary();
    }
}
