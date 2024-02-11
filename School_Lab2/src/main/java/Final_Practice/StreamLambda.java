package Final_Practice;


import Stream_Program4.OtherLabMethod;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLambda {
    public static void main(String[] args) {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Imdigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        List<Employee> list = Arrays.asList(employees);

        System.out.println("\nNo.FT1: All Employee order by last name:");
        list.stream()
                .distinct()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getSalary))
                .forEach(System.out::println);

        // 7. a
        System.out.println("\nNo.7(a): Salary by department:");
        list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept, emp)->{
                    System.out.printf("%s    %.2f%n", dept, emp.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
                });

        // 7. b
        System.out.println("\nNo.7(b): Max Salary by department:");
        list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept, emp)->{
                    System.out.printf("%s    %.2f%n", dept, emp.stream().mapToDouble(Employee::getSalary).max().getAsDouble());
                });

        // 7. c
        System.out.println("\nNo.7(c): All employee by department:");
        list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept, emp)->{
                    System.out.println(dept);
                    emp.stream().forEach(System.out::println);
                });

        // 7.a Print out each department and the average salary for the department
        list.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept, emp) -> {
                    System.out.printf("%s		%.2f%n", dept, emp.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
                });

        // 7.b

        // printing each department and the average salary per department
        System.out.printf("%nSalaries by department:%n");
        Map<String, List<Employee>> empByDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        empByDept.forEach((dept,emp) -> {
            System.out.println(dept);
            System.out.println(emp.stream().mapToDouble(Employee::getSalary)
                    .sum());
        });

        System.out.printf("%nMaximum Salary by Department%n");
        empByDept.forEach((dept,emp)->{
            System.out.println(dept);
            System.out.println(emp.stream().mapToDouble(Employee::getSalary).max().getAsDouble());
        });

        // 1.
        System.out.printf("%nNo.1: Number of employees whose last name begins with 'B': %d%n",list.stream()
                .filter(emp -> emp.getLastName().startsWith("B"))
                .map(Employee::getLastName)
                .count());

        // 2. Print out all of the Employee objects whose last name begins with the letter  ‘B’  in sorted order.
        System.out.println("\nNo.2: Employees whose last name begis with 'B':   ");
        list.stream()
                .filter(emp -> emp.getLastName().startsWith("B"))
                .forEach(System.out::println);

        // 3. Print out all of the Employee objects whose last name begins with the letter  ‘B’  and change their first name and last name to be All capital letters.
        System.out.println("\nNo.3(a): Changing Orginal list:");
        list.stream()
                .filter(emp -> emp.getLastName().startsWith("B"))
                .map(emp -> {
                    emp.setFirstName(emp.getFirstName().toUpperCase());
                    emp.setLastName(emp.getLastName().toUpperCase());
                    return emp;
                })
                .forEach(System.out::println);

        System.out.println("\nNo.3(b): Without changing Orginal list:");
        list.stream()
                .filter(emp -> emp.getLastName().startsWith("B"))
                .map(emp ->
                        new Employee(emp.getFirstName().toUpperCase(), emp.getLastName().toUpperCase(), emp.getSalary(), emp.getDepartment()))
                .forEach(System.out::println);

        // 4.
        System.out.println("\nNo.4(1): Print all employees and capitalize the ones that starts with 'B':");
        String strEmp = list.stream()
                .map(emp -> {
                    if(emp.getLastName().startsWith("B"))
                        return new Employee(emp.getFirstName(), emp.getLastName().toUpperCase(), emp.getSalary(), emp.getDepartment());
                    else
                        return emp;
                })
                .map(Employee::toString)
                .collect(Collectors.joining(", "));
        System.out.println(strEmp);

        System.out.println("\nNo.4(2): Print all employees and capitalize the ones that starts with 'B':");
        String strEmp2 = list.stream()
                .map(emp -> {
                    if(emp.getLastName().startsWith("B"))
                        return new Employee(emp.getFirstName().toUpperCase(), emp.getLastName().toUpperCase(), emp.getSalary(), emp.getDepartment());
                    else
                        return emp;
                })
                .map(Employee::toString)
                .collect(Collectors.joining("---\n---"));
        System.out.println(strEmp2);

        // 5. System.out.println("\nLast Name start with I, distinct, sorted.\n")
        System.out.println("\nNo.5: Print out all the distinct last names whose last name starts with I:");
        list.stream()
                .filter(emp -> emp.getLastName().startsWith("I"))
                        .map(Employee::getLastName)
                        .distinct()
                        .sorted()
                        .forEach(System.out::println);

        // 6. System.out.println("\nLast Name start with I, distinct, sorted.\n")
        System.out.printf("%nNo.6: The averages of the salaries is $%.2f%n",
        list.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble());

        // 7. Salary with reduce method
        System.out.printf("%nNo.7: The total salary of the employees is $%.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, Double::sum));

        // 8. Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this
        System.out.println("\nNo.8: The first names of the employees are: ");
        list.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);

        // 9. Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream.
        System.out.println("\nNo.9: The first 20 even numbers are ");
        Stream.iterate(2, N -> N + 2).limit(20)
                .forEach(System.out::println);

        // 3.a
        OtherMethods meths = new OtherMethods();
        List<String> words = Arrays.asList("sunkist", "banana", "orange", "grape", "kiwicc", "cherry", "durain");
        System.out.printf("%nNo.3(a): Count of word: %s%n", meths.countWords(words, 'c', 'd', 6));

        // 3.b
        System.out.println("\nNo.3(b): Form a single, space-separated String:");
        Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        Optional<String> str = strings.reduce((x, y) -> String.join(" ", x.toString(), y.toString()));
        str.ifPresent(n -> System.out.println(n));

        // 3.b
        System.out.println("\nNo.3(b): Form a single, space-separated String:");
        Stream str1 = Stream.of("A", "good", "day", "to", "write", "some", "Java");
//        List<String> strList = Stream.of("A", "good", "day", "to", "write", "some", "Java").toList();
        Optional<String> str2 = str1.reduce((x, y) -> String.join(" ", x.toString(), y.toString()));
        str2.ifPresent(n -> System.out.println(n));

        Stream exam = Stream.of("A", "good", "day", "to", "write", "some", "Java");

        System.out.printf("%sFinal Exam: %s", exam.reduce((x, y) -> String.join(" ", x.toString(), y.toString())));

        System.out.println("\nTest reduce method without first argument:");
        Integer[] intArrays = {3,4,6};
        Integer sum = Arrays.stream(intArrays).reduce(0,(x, y)->x+y);
        Optional<Integer> arr = Arrays.stream(intArrays).reduce((x, y)->x+y);
        arr.ifPresent(a -> System.out.println(a));

    }
}
