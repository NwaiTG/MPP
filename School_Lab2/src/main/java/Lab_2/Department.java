package Lab_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        double totSalary = 0.0;
//        for(Lab_2.Person p : persons){
//            if(p instanceof Lab_2.Staff){
//                totSalary += ((Lab_2.Staff)p).getSalary();
//            }
//            else if(p instanceof Lab_2.Faculty){
//                totSalary += ((Lab_2.Faculty) p).getSalary();
//            }
//        }

        for(Person p : persons){
            totSalary += p.getSalary();
        }
        return totSalary;
    }

    public void showAllMembers(){
        for(Person p : persons){
            System.out.println(p.toString() + ", Type: " + p.getClass().getName());
        }
    }

    public void unitsPerFaculty(){
//        for(Lab_2.Person p : persons){
//            if(p instanceof Lab_2.Faculty){
//                System.out.println("Lab_2.Faculty Name: " + ((Lab_2.Faculty)p).getName() + ", Total Units: " + ((Lab_2.Faculty) p).getTotalUnits());
//            }
//        }

        for(Person p : persons){
            if(p.getClass().getSimpleName().equals("Faculty")){
                System.out.println("Lab_2.Faculty Name: " + ((Faculty)p).getName() + ", Total Units: " + ((Faculty) p).getTotalUnits());
            }
        }
    }
}
