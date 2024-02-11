package Lab2_level2_Stream;

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

        return persons.stream().collect(Collectors.summarizingDouble(Person::getSalary)).getSum();
    }

    public void showAllMembers(){
        persons.stream().forEach(per -> System.out.println(per));
    }

    public void unitsPerFaculty(){
          // NOTE: cannot use filter at the super class, if going to use method from subClass.
        persons.stream()
                .filter(per -> per.getClass().getSimpleName().equals("Faculty"))
                .forEach(fac -> System.out.println("Name: " + fac.getName() + "\tTotal Units: " + ((Faculty)fac).getTotalUnits()));

//        for(Person p : persons){
//            if(p.getClass().getSimpleName().equals("Faculty")){
//                System.out.println("Lab_2.Faculty Name: " + ((Faculty)p).getName() + ", Total Units: " + ((Faculty) p).getTotalUnits());
//            }
//        }
    }
}
