package Lab_7;

import java.time.LocalDate;

public class CompanyApplication {
    public static void main(String[] args){
        try {
            // Company
            Company comp = new Company("New Challange");

            // Department
            Department dep1 = new Department("Admin", "1000 N, 4th Street");
            Department dep3 = new Department("Admin", "1000 N, 4th Street");
            Department dep2 = new Department("Development", "100 N, 2th Street");

            // Position
            Position pos1 = new Position("Manager", "Admin Manager");
            Position pos7 = new Position("Manager", "Admin Manager");

            Position pos2 = new Position("Deputy Manager", "Admin Manager");
            Position pos3 = new Position("Staff", "Admin Manager");
            Position pos4 = new Position("Developer", "Admin Staff");
            Position pos5 = new Position("Tester", "Admin Staff");
            Position pos6 = new Position("Developer Lead", "Admin Manager");

            comp.setDepartments(dep1);
            comp.setDepartments(dep2);
//            dep1.setPositions(pos1);

            dep1.setPositions(pos1);
//            dep1.setPositions(pos7);
            dep3.setPositions(pos1);
//            dep3.setPositions(pos7);
            dep2.setPositions(pos6);
            dep2.setPositions(pos4);
            dep2.setPositions(pos5);
            Employee emp1 = new Employee(1, "Erica", "", "1", LocalDate.of(2000, 8, 29), "234567890", 10000, pos1);
            Position clonePosition = (Position) pos1.clone();
//            dep1.setPositions(clonePosition);
            //clonePosition.getEmployees().setEmployeeId(15);
            Employee emp6 = new Employee(1, "Erica", "", "1", LocalDate.of(2000, 8, 29), "234567890", 10000, pos7); // Test for position equal
            Employee emp2 = new Employee(2, "Rechal", "", "2", LocalDate.of(2003, 8, 19), "234567890", 8000, pos3);
            Employee emp3 = new Employee(1, "Dame", "", "3", LocalDate.of(2000, 8, 29), "234567890", 10000, pos2);
            Employee emp4 = new Employee(2, "Smith", "", "4", LocalDate.of(2003, 8, 19), "234567890", 8000, pos4);
            Employee emp5 = new Employee(1, "John", "", "5", LocalDate.of(2000, 8, 29), "234567890", 10000, pos5);


//        System.out.println(emp6.getPosition().toString());

//        System.out.println(emp1.toString());
//        System.out.println(dep1.toString());

        /*
        Lab 7-8, Level3 Testing

        if(pos1.equals(clonePosition)){
            System.out.println("Pos1 And Pos7 are equal");
            System.out.println("Hash Code1: " + pos1.hashCode() + "\nHash Code2: " + clonePosition.hashCode());

            System.out.println("Position 1: " + pos1.getTitle() + pos1.getDescription() + pos1.getEmployees().toString());
            System.out.println("Position C: " + clonePosition.getTitle() + clonePosition.getDescription() + clonePosition.getEmployees().toString());
        }
        else{
            System.out.println("Pos1 And Pos2 are not equal");
            System.out.println("Hash Code1: " + pos1.hashCode() + "\nHash Code2: " + clonePosition.hashCode());
        }

         */

        /*
        Lab 7-7 Testing

        if(emp1.equals(emp6)){
            System.out.println("Emp1 And Emp2 are equal");
            System.out.println("Hash Code1: " + emp1.hashCode() + "\nHash Code2: " + emp6.hashCode());
        }
        else{
            System.out.println("Emp1 And Emp2 are not equal");
            System.out.println("Hash Code1: " + emp1.hashCode() + "\nHash Code2: " + emp6.hashCode());
        }

         */

            /*
             Lab 7-6 Testing

            System.out.println(dep1.toString());
            */

            // Lab 7-5 Testing
//        System.out.println(pos1.toString());

            // Lab 7-4 Testing
//        System.out.println(emp1.toString());

        /*
        Lab 7-3 Testing

        System.out.println("Employee: " + emp1.equals(emp6));
        System.out.println("Position: " + pos1.equals(pos7));
        if(dep1.equals(dep3)){
            System.out.println("Dept1 and Dept3 are equal");
        }
        else
        {
            System.out.println("Dept1 and Dept3 are not equal");
        }

         */

        /*
        Lab 7-2 Testing

        if(pos1.equals(pos7)){
            System.out.println("Pos1 and Pos2 are equal");
        }
        else
        {
            System.out.println("Pos1 and Pos2 are not equal");
        }

         */


        /*
        Lab 7-1 Testing

        if(emp1.equals(emp6))
//        if(emp1.equals(emp2))
            System.out.println("Emp1 And Emp2 are equal");
        else
            System.out.println("Emp1 And Emp2 are not equal");

         */


//        comp.print();
        }
        catch(Exception ex){
            System.out.println("Cannot clone: " + ex.getMessage());
        }
    }
}
