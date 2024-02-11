package Lab2_level2;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
    private double Salary;
    private List<Course> courses;

    public Faculty(String name, String phone, int age, double sal){
        super(name, phone, age);
        this.Salary = sal;
        courses = new ArrayList<Course>();
    }

    public double getSalary() {
        return Salary;
    }

    public int getTotalUnits(){
        int totalUnits = 0;
        for(Course cou : courses){
            totalUnits += cou.getUnits();
        }
        return totalUnits;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}
