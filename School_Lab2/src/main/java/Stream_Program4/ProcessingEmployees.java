package Stream_Program4;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Imdigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // group Employees by department
      System.out.printf("%nEmployees by department: %n");
      Map<String, List<Employee>> groupedByDepartment =
              list.stream()
                      .collect(Collectors.groupingBy(Employee::getDepartment));

      groupedByDepartment.forEach((department, employeesInDepart) ->
      {
         System.out.println(department);
         employeesInDepart.forEach(
                 employee -> System.out.printf("%s%n", employee)
         );
         }
      );

      // count number of Employees in each department
      System.out.printf("%nCount of Employees by department:%n");
      Map<String, Long> employeeCountByDepartment =
              list.stream()
                      .collect(Collectors.groupingBy(Employee::getDepartment,
                              TreeMap::new, Collectors.counting()
                      ));
      employeeCountByDepartment.forEach(
              (depart, count) -> System.out.printf(
                      "%s has %d employee(s)%n", depart, count)
      );

      // Lab 7-a
      /*System.out.printf("%nAverage salary of department:%n");
      Map<String, Double> employeeSalByDepartment =
              list.stream()
                      .collect(Collectors.groupingBy(
                              Employee::getDepartment, TreeMap::new, Collectors.averagingDouble(Employee::getSalary)
                      ));
      employeeSalByDepartment.forEach((dept, sal)-> System.out.printf("%-10s%.2f%n", dept, sal));*/

      // Lab 7-b
      /*System.out.printf("%nMaximum salary of department:%n");
      Map<String, Optional<Employee>> employeeMaxSalByDepartment =
              list.stream()
                      .collect(Collectors.groupingBy(
                              Employee::getDepartment, TreeMap::new, Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                      ));
      employeeMaxSalByDepartment.forEach((dept, maxSal)-> System.out.printf("%-10s%.2f%n", dept, maxSal.map(Employee::getSalary).orElse(0.00)));*/

      // Lab 7-c
      System.out.printf("%nEmployees by department:%n");
      Map<String, List<Employee>> empByDepartment =
              list.stream()
                      .collect(Collectors.groupingBy(Employee::getDepartment));

      empByDepartment.forEach((dept,emp) -> {
                 System.out.printf("%s%n", dept);
                 emp.forEach(e -> System.out.printf("%s", e));
              });


      // Lab-(a-1)
      /*
      long count = list.stream()
              .filter(emp -> emp.getLastName().startsWith("B") || emp.getLastName().startsWith("b"))
              .count();
      System.out.println("Count No of Name which start with B: " + count);*/

      // Lab-(a-2)
       /*list.stream()
              .filter(emp -> emp.getLastName().startsWith("B"))
              .sorted(Comparator.comparing(Employee::getLastName))
        .forEach(System.out::println);*/

       // Lab-(a-3)
      /* Lab a-3 Start

      //Without orginal list
      list.stream()
              .filter(emp -> emp.getLastName().startsWith("B") || emp.getLastName().startsWith("b"))
              .map(employee -> employee.getFirstName().toUpperCase() + "\t" + employee.getLastName().toUpperCase())
              .forEach(System.out::println);

      System.out.println("Orginal list: " + "\n");
      for(Employee emp : employees){
         if(emp.getLastName().startsWith("B"))
            System.out.println(emp.getFirstName() + "\t" + emp.getLastName());
      }

      // By modifying orginal list
      list.stream()
              .filter(emp -> emp.getLastName().startsWith("B") || emp.getLastName().startsWith("b"))
              .forEach(e -> {
              e.setFirstName(e.getFirstName().toUpperCase());
              e.setLastName(e.getLastName().toUpperCase());
              });

      System.out.println("Modified list: " + "\n");
      for(Employee emp : employees){
         if(emp.getLastName().startsWith("B"))
            System.out.println(emp.getFirstName() + "\t" + emp.getLastName());
      }

      //Lab a-3 End */

      // Lab a-4
      /*
      Lab a-4 Start (Can also implement by foreach, but can't get with collect(Collectors.Joining(",") if use foreach)

      System.out.println("\nLab a-4 Result\n");
      String empString = list.stream()
              .map(emp -> {
                 if(emp.getLastName().startsWith("B") || emp.getLastName().startsWith("b")){
                    emp.setLastName(emp.getLastName().toUpperCase());
                    return emp;
                 }
                 else
                    return emp;
              })
              .map(Employee::toString)
              .collect(Collectors.joining("---\n---"));
//              .collect(Collectors.joining(","));

      System.out.println(empString);

      Lab a-4 End */

      /* Lab a-5 Start
      System.out.println("\nLab a-5 Testing");
      list.stream()
              .filter(emp -> emp.getLastName().startsWith("I") || emp.getLastName().startsWith("i"))
              .map(Employee::getLastName)
              .distinct()
              .sorted()
              .forEach(System.out::println);

       Lab a-5 End*/

      /* Lab a-6 Start

      Double avgSal = list.stream()
              .collect(Collectors.summarizingDouble(Employee::getSalary))
              .getAverage();
      System.out.println("Average Salary (via Collectors.summarizingDouble): " + String.format("$%.2f", avgSal));


      // Other way
      System.out.printf("Average Salary (via mapToDouble method): %.2f%n", list.stream()
              .mapToDouble(Employee::getSalary)
              .average()
              .getAsDouble());

       */

      /* Lab a-7 Start

      System.out.printf("Total Salary (via mapToDouble method) $%.2f%n",
         list.stream()
                 .mapToDouble(Employee::getSalary)
                 .sum()
              );

      System.out.printf("Total Salary (via reduce method) $%.2f%n",
              list.stream()
                      .mapToDouble(Employee::getSalary)
                      .reduce(0,(val1, val2) -> val1 + val2)
      );

      Lab a-7 End */

      /* Lab a-8 Start

      list.stream()
              .map(Employee::getFirstName)
              .forEach(System.out::println);

       Lab a-8 End */

      /* Lab a-9 Start
      Stream.iterate(2,N->N+2).limit(20)
              .forEach(System.out::println);

       Lab a-9 End*/

      /* Lab 3-a Test
      List<String> words = Arrays.asList("sunkist", "banana", "orange", "grape", "kiwicc", "cherry", "durain");
      OtherLabMethod otherMethod = new OtherLabMethod();
      System.out.println(otherMethod.countWords(words, 'c', 'd', 6));

       */







   } // end main
} // end class ProcessingEmployees

