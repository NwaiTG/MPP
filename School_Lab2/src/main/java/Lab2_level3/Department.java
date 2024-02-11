package Lab2_level3;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Person> persons;

    public Department(String name){
        this.name = name;
        persons = new ArrayList<Person>();
    }

    public void addPerson(Person per){
        persons.add(per);
    }

    public double getTotalSalary(){
        double totalSal = 0.0;
        for(Person person : persons){
            totalSal += person.getSalary();
        }
        return totalSal;
    }

    public void showAllMembers(){
        for(Person person : persons){
            System.out.println(person.toString());
        }
    }

    public void unitsPerFaculty(){
        for(Person p : persons){
            if(p.getClass().getSimpleName().equals("Faculty")){
                System.out.println("Faculty Name: " + ((Faculty)p).getName() + ", Total Units: " + ((Faculty) p).getTotalUnits());
            }
        }
    }

    public void printAllStudentsOfFaculty(String facultyName){
        List<Course> facultyCourses = new ArrayList<Course>();
        for(Person p : persons){
            if(p.getClass().getSimpleName().equals("Faculty") && p.getName().equals(facultyName)){
                facultyCourses = ((Faculty)p).getCourse();
            }

            if(p.getClass().getSimpleName().equals("Student") || p.getClass().getSimpleName().equals("StudentStaff")){
                List<Course> studCourses = ((Student)p).getCourses();

                for(Course facCour : facultyCourses){
                    for(Course studCour : studCourses){
                        if(studCour.getTitle().equals(facCour.getTitle())){
                            System.out.println(p.getName());
                        }
                    }
                }
            }
        }

    }
}
