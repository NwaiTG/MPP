package Kishor;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private double GPA;
	protected List<Course> listOfCourse;

	public Student(String name, String phone, int age, double GPA) {
		super(name, phone, age);
		// TODO Auto-generated constructor stub
		this.GPA = GPA;
		this.listOfCourse = new ArrayList<Course>();
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public List<Course> getListOfCourse() {
		return listOfCourse;
	}

	public void setListOfCourse(List<Course> listOfCourse) {
		this.listOfCourse = listOfCourse;
	}
	
	public int getTotalUnits() {
		int totalUnits = 0;
		for (Course course : listOfCourse) {
			totalUnits += course.getUnits();
		}
		return totalUnits;
	}
	
	public void addCourse(Course course) {
		if (course != null) 
			listOfCourse.add(course);
	}
}
