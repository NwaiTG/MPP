package Lab7_level4;

import java.util.ArrayList;
import java.util.List;
public class Student extends Person implements IPerson{
    private double gpa;
    private List<Course> courses;

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

    public void myAbstract(){
        System.out.println("From abstract method of Student.");
    }

    public void addCourse(String number, String title, int unit, CourseType type){
        courses.add(new Course(number, title, unit, type));
    }
}
