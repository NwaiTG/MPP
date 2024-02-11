package Stream_Program4;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingEmployees_OtherMethods
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

      // get
      list.stream()
              .peek(pro -> System.out.println("Before map: " + pro))
              .map(prod -> {
                 if(prod.getFirstName().startsWith("J"))
                 {prod.setFirstName(prod.getFirstName().toUpperCase());
                    return prod;}
                 else
                    return prod;
              })
              .peek(pro -> System.out.println("After map: " + pro))
              .forEach(System.out::println);

      System.out.println("Orginal List\n");
      list.stream().forEach(System.out::println);

      // Get employee list
      /*List<Employee> listProduct = list.stream()
              .filter(prod -> prod.getFirstName().equals("Jason") && prod.getSalary() > 4000)
              .toList();

      listProduct.stream().forEach(System.out::println);*/

      // Get total Salary
      /*Double totSal = list.stream()
              .mapToDouble(Employee::getSalary)
              .reduce(0, (a,b)-> a + b);
      System.out.println(totSal);*/

      // print firstname which start with J, remove duplicate & sorded
      /*list.stream()
              .filter(prod -> prod.getFirstName().startsWith("J"))
//              .peek(p -> System.out.println("After 1 filter: " + p))
              .map(Employee::getFirstName)
//              .peek(p -> System.out.println("After 2 filter: " + p))
              .distinct()
              .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
              .forEach(System.out::println);*/

      //Print AvgSalary
      /*Double avgPrice = list.stream()
              .mapToDouble(Employee::getSalary)
              .average()
              .getAsDouble();
      System.out.print(avgPrice);*/



   } // end main
} // end class ProcessingEmployees

