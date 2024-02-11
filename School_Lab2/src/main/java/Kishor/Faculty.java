package Kishor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends Person {
	private double salary;
	List<Course> listOfCourse;

	public Faculty(String name, String phone, int age, double salary) {
		// TODO Auto-generated constructor stub
		super(name,phone,age);
		this.salary = salary;
		this.listOfCourse = new ArrayList<Course>();
	}
	
	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public List<Course> getListOfCourse() {
		return listOfCourse;
	}



	public void setListOfCourse(List<Course> listOfCourse) {
		this.listOfCourse = listOfCourse;
	}
	
	//add course to faculty
	public void addCourse(Course course) {
		if (course != null) {
			listOfCourse.add(course);
		}
	}



	public int getTotalUnits() {
		int totalUnits = 0;
		for (Course course : listOfCourse) {
			totalUnits += course.getUnits();
		}
		return totalUnits;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listOfCourse, salary);
	}

	
	public boolean equals(Faculty obj) {
		if (this == obj)
			return true;
		
		return this.getName().equals(obj.getName());
	}
	
}
