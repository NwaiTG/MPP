package Lab2_level2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private double gpa;
    private List<Course> courses;

    public Student(String name, String phone, int age, double gpa){
        super(name, phone, age);
        this.gpa = gpa;
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public int getTotalUnits(){
        int totalUnits = 0;
        for(Course course : courses){
            totalUnits += course.getUnits();
        }
        return  totalUnits;
    }
}
