package Lab2_lvl1_Stream;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private double salary;
    private List<Course> courses;

    public Faculty(String name, String phone, int age, double salary){
        super(name, phone, age);
        this.salary = salary;
        courses = new ArrayList<Course>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTotalUnits(){
        int totUnits = 0;
        for(Course c : courses){
            totUnits += c.getUnits();
        }
        return totUnits;
    }

    public void addCourse(String number, String title, int unit){
        courses.add(new Course(number, title, unit));
    }
}
