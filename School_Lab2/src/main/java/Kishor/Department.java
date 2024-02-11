package Kishor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {
	private String Name;
	private List<Person> listOfPerson;
	
	public Department(String string) {
		// TODO Auto-generated constructor stub
		this.Name = string;
		this.listOfPerson = new ArrayList<Person>();
	}

	public void addPerson(Person p) {
		if (p != null) {
			listOfPerson.add(p);
		}
	}
// Using instanceof to get Total Salary.
	
//	public double getTotalSalary() {
//		// TODO Auto-generated method stub
//		double totalSalary = 0;
//		for (Person p: listOfPerson) {
//			if (p instanceof Staff) {
//				Staff temp = (Staff)p;
//				totalSalary += temp.getSalary();
//			}
//			if (p instanceof Faculty) {
//				Faculty temp = (Faculty)p;
//				totalSalary += temp.getSalary();
//			}
//		}
//		return totalSalary;
//	}
	
/*****************************Using Polymorphism *************/
	public double getTotalSalary() {
	// TODO Auto-generated method stub
	double totalSalary = 0;
	for (Person p: listOfPerson) {
		totalSalary += p.getSalary();
	}
	return totalSalary;
}

	public void showAllMembers() {
		// TODO Auto-generated method stub
//		System.out.println(listOfPerson);
		for(Person x : listOfPerson) {
			System.out.println("Name: " + x.getName());
			System.out.println("Age: " + x.getAge());
			System.out.println("Phone: " + x.getPhone());
			System.out.println("Type: " + x.getClass().getSimpleName());
			System.out.println("______________");
		}
		
	}

//	public void unitsPerFaculty() {
//		// TODO Auto-generated method stub
//		for(Person p: listOfPerson) {
//			if(p instanceof Faculty) {
//				Faculty temp = (Faculty)p;
//				System.out.println(temp.getName() + " has " + temp.getTotalUnits() + " units");
//				System.out.println("_________________");
//			}
//		}
//	}

	/***************** Polymorphism **************/
	public void unitsPerFaculty() {
		// TODO Auto-generated method stub
		for(Person p: listOfPerson) {
			if(p.getClass().getSimpleName().equals("Faculty")) {
				System.out.println(p.getName() + " has " + p.getTotalUnits() + " units");
				System.out.println("_________________");
			}
		}
	}
	
	public void printStudents(Faculty faculty) {
		System.out.println("List of students with Faculty:" + faculty.getName());
//		for(Person p: listOfPerson) {
//			if(p instanceof Student || p instanceof StaffStudent) {
//				Student t = (Student)p;
////				System.out.println(t.getName());
////				System.out.println(t.getListOfCourse().toString());
//				for (Course c: t.getListOfCourse()) {
////					System.out.println(c.getNumber());
//				if(c.getFaculty().equals(faculty)) {
//						System.out.println(p);
//					}
//				}
//			}
//		}
//		listOfPerson.stream()
//		.filter(p -> p instanceof Student || p instanceof StaffStudent)
//		.filter(p -> {
//			Faculty[] arr=(Faculty[]) ((Student)p).getListOfCourse().stream().map(c ->c.getFaculty()).toArray();
//			return Arrays.stream(arr).anyMatch(f -> f.getName().equals(faculty.getName()));
//		})
//		.forEach(System.out::println);
		

	
		  /*  listOfPerson.stream()
		                .filter(p -> p instanceof Student || p instanceof StaffStudent)
		                .map(p -> (Student) p)
		                .filter(s -> s.getListOfCourse().stream().anyMatch(c -> c.getFaculty().equals(faculty)))
		                .forEach(System.out::println); */
		
		/*List<Course> courses = listOfPerson.stream()
				.filter(p -> p instanceof Faculty && p.equals(faculty))
				.map(p -> ((Faculty)p).getListOfCourse())
				.flatMap(List::stream)
				.toList();
		courses.forEach(System.out::println);
		
		List<Student> stdnts = listOfPerson.stream()
				.filter(p -> p instanceof Student || p instanceof StaffStudent)
                .map(p -> (Student) p)
                .filter(s -> s.getListOfCourse().stream().anyMatch(courses::contains))
                .toList();
		stdnts.forEach(System.out::println);*/

		List<Lab2_level3_Stream.Course> facultyCourses = new ArrayList<>();

		List<Course> courses = listOfPerson.stream()
				.filter(per -> per.getClass().getSimpleName().equals("Faculty") && per.equals(faculty))
				.map(per -> ((Faculty)per).getListOfCourse())
				.flatMap(List::stream)
				.toList();

		courses.forEach(System.out::println);

		List<Student> stu = listOfPerson.stream()
				.filter(per -> per.getClass().getSimpleName().equals("Student") || per.getClass().getSimpleName().equals("StudentStaff"))
				.map(p -> (Student)p)
				.filter(s -> s.getListOfCourse().stream().anyMatch(courses::contains))
				.peek(s -> System.out.println(s))
				.toList();

		stu.forEach(System.out::println);
		                
	}
}
