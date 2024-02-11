package Final_Practice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {

    public static void main(String[] args) {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};


        // get List view of the Employees
        System.out.println("No1. List view of the Employees");
        List<Employee> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("\nNo2. Display all Employees");
        list.forEach(System.out::println);

        // Predicate (boolean-valued function) that returns true for salaries in the range $4000-$6000
        System.out.println("\nNo3. Display all Employees");
        Predicate<Employee> empSalRange4000To6000 = e -> e.getSalary() >= 4000 && e.getSalary() <=6000;

        // Display Employees with salaries in the range $4000-$6000
        // sorted into ascending order by salary
        System.out.println("\nNo4. Display Employees with salaries in the range $4000-$6000: ");

        list.stream()
                .filter(empSalRange4000To6000)
                .forEach(System.out::println);

        list.stream()
                .filter(emp -> emp.getSalary() >= 4000 && emp.getSalary() <= 6000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

        // Display first Employee with salary in the range $4000-$6000
        System.out.printf("\nNo5. Display first Employee with salary in the range $4000-$6000: %s",
                list.stream()
                        .filter(empSalRange4000To6000)
                        .findFirst()
                        .get());

        // Functions for getting first and last names from an Employee
        // Employee is input parameter & String is return result
        Function<Employee, String> firstName = emp -> emp.getFirstName();
        Function<Employee, String> lstName = Employee::getLastName;
        System.out.println("\nNo6. Getting first and last names from an Employee: ");
        list.stream()
                .forEach(emp -> System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName()));

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> compareFirstThenLast =  Comparator.comparing(lstName).thenComparing(firstName);

        // sort employees by last name, then first name
        System.out.println("\nNo7. Sort employees by last name, then first name(Use Method Reference): ");
        list.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .forEach(System.out::println);

        System.out.println("\nNo7. Sort employees by last name, then first name(Use Function): ");
        list.stream()
                .sorted(Comparator.comparing(emp -> ((Employee)emp).getLastName()).thenComparing(emp -> ((Employee)emp).getFirstName()))
                .forEach(System.out::println);

        System.out.println("\nNo7. Sort employees by last name(Using own comparator), then first name: ");
        list.stream()
                .sorted(compareFirstThenLast)
                .forEach(System.out::println);

// sort employees in descending order by last name, then first name
        System.out.println("\nNo8. Sort employees in descending order by last name, then first name: ");
        list.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getLastName).reversed())
                .forEach(System.out::println);

// display unique employee last names sorted
        System.out.println("\nNo9. Display unique employee last names sorted: ");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

// display only first and last names
        System.out.println("\nNo10. Display only first and last names: ");
        list.stream()
                .forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));

// group Employees by department
        System.out.println("\nNo11. Group Employees by department: ");
        Map<String, List<Employee>> employeesByDept = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                        .forEach((dept,emp) -> {
                            System.out.println(dept);
                            emp.stream().forEach(System.out::println);
                        });

// count number of Employees in each department
        System.out.println("\nNo12. Count number of Employees in each department: ");
        employeesByDept.forEach((dept, emp) -> {
            System.out.printf("%s    %s%n", dept, emp.stream().count());
        });

// sum of Employee salaries with DoubleStream sum method
        System.out.printf("%nNo13. Sum of Employee salaries with DoubleStream sum method: %.2f%n",
        list.stream()
                .mapToDouble(Employee::getSalary)
                .sum());

// calculate sum of Employee salaries with Stream reduce method
        System.out.printf("%nNo14. Calculate sum of Employee salaries with Stream reduce method: %.2f%n",
        list.stream()
                .mapToDouble(Employee::getSalary)
                .reduce(0, (x,y) -> x + y));

// average of Employee salaries with DoubleStream average method
        System.out.printf("%nNo15. Average of Employee salaries with DoubleStream average method: %.2f%n",
        list.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble());
    }
}
