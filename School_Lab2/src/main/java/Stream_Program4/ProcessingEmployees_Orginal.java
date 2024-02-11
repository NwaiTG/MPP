package Stream_Program4;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees_Orginal
{
   public static void main(String[] args)
   {
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
      List<Employee> list = Arrays.asList(employees);

      // Predicate (boolean-valued function) that returns true for salaries
      //in the range $4000-$6000
      Predicate<Employee> fourToSixThousand =
              emp -> emp.getSalary() >= 4000 && emp.getSalary() <= 6000;

      // Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary
      System.out.println(
              "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

      list.stream().filter(fourToSixThousand)
              .sorted(Comparator.comparing(Employee::getSalary))
              .forEach(System.out::println);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);   //A method reference.

      // To test Collectors.joining
      // Convert elements to strings and concatenate them, separated by commas
      String joined = list.stream()
              .map(Object::toString)  //  this DOES go to the overridden method  toString  inside Employee!!  Yes!!

                                     //  joining method needs Strings coming in.  

              //.map(Employee::toString)  //  this also DOES work!!  Yes!!
              .collect(Collectors.joining(", "));

      System.out.println("\n\n" + joined);

      // Display first Employee with salary in the range $4000-$6000
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
              list.stream()
                      .filter(fourToSixThousand)
                      .findFirst().get()
              );

      // Functions for getting first and last names from an Employee
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;

      // Comparator for comparing Employees by first name then last name
      Comparator<Employee> lastThenFist =
              Comparator.comparing(byLastName).thenComparing(byFirstName);

      // sort employees by last name, then first name
      System.out.println(
              "\nEmployees in ascending order by last name then first:\n");
              list.stream()
                      .sorted(lastThenFist)
                      .forEach(System.out::println);

      // sort employees in descending order by last name, then first name
      System.out.println(
              "\nEmployees in descending order by last name then first:\n");
      list.stream()
              .sorted(lastThenFist.reversed())
              .forEach(System.out::println);


      // display unique employee last names sorted
      System.out.printf("\nUnique employee last names:\n");
      list.stream()
              .map(Employee::getLastName)
              .distinct()
              .sorted()
              .forEach(System.out::println);

      // display only first and last names
      System.out.println(
              "\nEmployee names in order by last name then first name:\n");
      list.stream()
              .sorted(lastThenFist)
              .map(Employee::getName)
              .forEach(System.out::println);

      // group Employees by department
      System.out.printf("%nEmployees by department:%n");
      Map<String, List<Employee>> gpbyDept = list.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment));

      gpbyDept.forEach((dep, emp)->{
         System.out.println(dep);
         emp.forEach(emp1 -> System.out.printf("    %s%n", emp1));
      });

      // count number of Employees in each department
      System.out.println("\nCount of Employees by department:\n");
      gpbyDept.forEach((dep, emp)->
      {
         System.out.println(dep);
         System.out.printf("%d%n", emp.stream().count());
      });

      // count number of Employees in each department
      System.out.println("\nCount of Employees by department:\n");
      Map<String, Long> empCountBydept =
              list.stream()
                      .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));

      empCountBydept.forEach((dept, count)->{
         System.out.printf("%s has %d employee(s)%n", dept, count);
      });

      // sum of Employee salaries with DoubleStream sum method
      System.out.printf("%nSum of Employees' salaries (via sum method): %.2f%n",
              list.stream()
                      .mapToDouble(Employee::getSalary)
                      .sum()
              );

      // calculate sum of Employee salaries with Stream reduce method
      System.out.printf(
              "Sum of Employees' salaries (via reduce method): %.2f%n",
              list.stream()
                      .mapToDouble(Employee::getSalary)
                      .reduce(0,(x,y) -> x + y)
              );

      // average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
              list.stream()
                      .mapToDouble(Employee::getSalary)
                      .average()
                      .getAsDouble()
              );




   } // end main
} // end class ProcessingEmployees

