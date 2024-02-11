package Lab3_2_Stream;

import java.util.ArrayList;

public class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void print() {
        System.out.println("Company Name: " + name);

        for (Department department : departments) {
            department.print();
            System.out.println();
        }
    }

    public void getSalary(){

        Double totalSalary = departments.stream()
                .mapToDouble(Department::getSalary)
                .sum();

//        double totalSalary = 0.0;
//
//        for(Department dep : departments){
//            totalSalary += dep.getSalary();
//        }

        System.out.println("Total Salary that company pays to all its employees: " + totalSalary);
    }

    public static void main(String[] args) {
        Company company = new Company("My Company");

        Department department1 = new Department("Department 1", "Location 1");
        department1.addPosition(new Position("Position 1", "Description 1", new Employee(1, "John", "D", "Doe", "01/01/1990", "123-45-6789", 100000.00)));
        department1.addPosition(new Position("Position 2", "Description 2", null));
        department1.addPosition(new Position("Position 3", "Description 3", new Employee(2, "Jane", "M", "Doe", "01/01/1995", "987-65-4321", 80000.00)));

        Department department2 = new Department("Department 2", "Location 2");
        department2.addPosition(new Position("Position 4", "Description 4", null));
        department2.addPosition(new Position("Position 5", "Description 5", new Employee(3, "Bob", "A", "Smith", "01/01/1985", "456-78-9012", 120000.00)));
        department2.addPosition(new Position("Position 6", "Description 6", new Employee(4, "Alice", "B", "Smith", "01/01/1992", "789-01-2345", 90000.00)));

        company.addDepartment(department1);
        company.addDepartment(department2);

        company.print();
        System.out.println();
        company.getSalary();
    }
}
