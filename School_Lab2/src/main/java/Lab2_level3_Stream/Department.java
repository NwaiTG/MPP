package Lab2_level3_Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Department {
    private String name;
    private List<Person> persons;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department(String dept){
        name = dept;
        persons = new ArrayList<Person>();
    }

    public void addPerson(Person p){
        if(p != null){
            persons.add(p);
        }
    }

    public double getTotalSalary(){

        return persons.stream().collect(Collectors.summarizingDouble(Person::getSalary)).getSum();

    }

    public void showAllMembers(){
        persons.stream().forEach(per -> System.out.println(per));
    }

    public void unitsPerFaculty(){
        persons.stream()
                .filter(per -> per.getClass().getSimpleName().equals("Faculty"))
                .forEach(fac -> System.out.println("Name: " + fac.getName() + "\tTotal Units: " + ((Faculty)fac).getTotalUnits()));

//        for(Person p : persons){
//            if(p.getClass().getSimpleName().equals("Faculty")){
//                System.out.println("Lab_2.Faculty Name: " + ((Faculty)p).getName() + ", Total Units: " + ((Faculty) p).getTotalUnits());
//            }
//        }
    }

    public void printAllStudentsOfFaculty(Faculty facultyName){
        List<Course> facultyCourses = new ArrayList<>();

        List<Course> courses = persons.stream()
                .filter(per -> per.getClass().getSimpleName().equals("Faculty") && per.equals(facultyName))
                .peek(a -> System.out.println(a))
                .map(per -> ((Faculty)per).getCourses())
                .flatMap(List::stream)
                .toList();

        courses.forEach(System.out::println);

        List<Student> stu = persons.stream()
                .filter(per -> per.getClass().getSimpleName().equals("Student") || per.getClass().getSimpleName().equals("StudentStaff"))
                .map(p -> (Student)p)
                .filter(s -> s.getCourses().stream().anyMatch(courses::contains))
                .peek(s -> System.out.println(s))
                .toList();

        stu.forEach(System.out::println);


//        courses.stream()
//                .forEach(cour -> {
//                    Map<String, List<Course>> stuCourse = persons.stream()
//                            .filter(per -> per.getClass().getSimpleName().equals("Student") || per.getClass().getSimpleName().equals("StudentStaff"))
//                            .collect(Collectors.groupingBy(Course::getTitle));
//                });

//        courses.stream().forEach(System.out::println);

//        List<Course> stuCourses = persons.stream()
//                .filter(per -> per.getClass().getSimpleName().equals("Student") || per.getClass().getSimpleName().equals("StudentStaff"));
//                .map(per -> ((Student)per).getCourses())
//                .flatMap(List::stream)
//                .toList();

//        courses.forEach();

//        persons.stream()
//                .filter(per -> per.getClass().getSimpleName().equals("Student") || per.getClass().getSimpleName().equals("StudentStaff"))
//                .peek(per -> System.out.println("1 filter: " + per))
//                .map(stu -> ((Student)stu).getCourses())
//                .flatMap(List::stream)
//                .map(Course::getTitle)
//                .collect(Collectors.toList())
//                .equals(courses.stream()
//                        .map(Course::getTitle)
//                        .collect(Collectors.toList()));


//                        .anyMatch(courses::contains))
//                .peek(stu -> System.out.println("2 filter:" + stu))
//                .forEach(System.out::println);

//        persons.stream()
//                .filter(per -> per instanceof Student || per instanceof StudentStaff)
//                .filter(per -> {
//                    if (per instanceof Student) {
//                        return ((Student) per).getCourses().;
//                    } else if (per instanceof StudentStaff) {
//                        return ((StudentStaff) per).getCourses().stream().anyMatch(courses::contains);
//                    }
//                    return false;
//                })
//                .forEach(System.out::println);


//        for(Person p : persons){
//            if(p.getClass().getSimpleName().equals("Faculty") && p.getName().equals(facultyName)){
//                facultyCourses = ((Faculty)p).getCourses();
//            }
//
//            if(p.getClass().getSimpleName().equals("Student") || p.getClass().getSimpleName().equals("StudentStaff")){
//                List<Course> studCourses = ((Student)p).getCourses();
//
//                for(Course facCour : facultyCourses){
//                    for(Course studCour : studCourses){
//                        if(studCour.getTitle().equals(facCour.getTitle())){
//                            System.out.println(p.getName());
//                        }
//                    }
//                }
//            }
//        }
    }
}
