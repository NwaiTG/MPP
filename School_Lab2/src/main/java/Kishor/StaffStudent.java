package Kishor;

import java.time.LocalDate;

public class StaffStudent extends Student{
	private Staff s1;
	private LocalDate startDate;
//	private List<Course> listOfCourse;
	
	public StaffStudent(String name, String phone, int age, double salary, double GPA) {
		super(name, phone, age, GPA);
		// TODO Auto-generated constructor stub
		s1 = new Staff(name, phone,age,salary);
		
		this.setStartDate(null);
//		this.s1.listOfCourse = new ArrayList<Course>();
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public int getTotalUnits() {
		int totalUnits = 0;
		for (Course course : listOfCourse) {
			totalUnits += course.getUnits();
		}
		return totalUnits;
	}
	
	//add course to StaffStudents
	@Override
	public void addCourse(Course course) {
		if (course != null) {
			listOfCourse.add(course);
		}
		if(listOfCourse.size() == 1) setStartDate(LocalDate.now()); // date when the first course is added.
	}

}
