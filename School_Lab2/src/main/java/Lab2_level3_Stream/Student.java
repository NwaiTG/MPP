package Lab2_level3_Stream;

import java.util.ArrayList;
import java.util.List;
public class Student extends Person {
    private double gpa;
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public Student(String name, String phone, int age, double gpa){
        super(name, phone, age);
        this.gpa = gpa;
        courses = new ArrayList<Course>();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public double getTotalUnits(){
        int totUnits = 0;
        for(Course c : courses){
            totUnits += c.getUnits();
        }
        return totUnits;
    }

//    public void addCourse(String number, String title, int unit){
//        courses.add(new Course(number, title, unit));
    public void addCourse(Course course){
        courses.add(course);
    }
}
