package Lab_3;

import java.time.LocalDate;

public class CompanyApplication {
    public static void main(String[] args){
        // Company
        Company comp = new Company("New Challange");

        // Department
        Department dep1 = new Department("Admin", "1000 N, 4th Street");
        Department dep2 = new Department("Development", "100 N, 2th Street");

        // Position
        Position pos1 = new Position("Manager", "Admin Manager");
        Position pos2 = new Position("Deputy Manager", "Admin Manager");
        Position pos3 = new Position("Staff", "Admin Manager");
        Position pos4 = new Position("Developer", "Admin Staff");
        Position pos5 = new Position("Tester", "Admin Staff");
        Position pos6 = new Position("Developer Lead", "Admin Manager");

        comp.setDepartments(dep1);
        comp.setDepartments(dep2);
        dep1.setPositions(pos1);
        dep1.setPositions(pos2);
        dep1.setPositions(pos3);
        dep2.setPositions(pos6);
        dep2.setPositions(pos4);
        dep2.setPositions(pos5);
        Employee emp1 = new Employee(1, "Erica", "", "1", LocalDate.of(2000, 8, 29), "234567890", 10000, pos1);
        Employee emp2 = new Employee(2, "Rechal", "", "2", LocalDate.of(2003, 8, 19), "234567890", 8000, pos3);
        Employee emp3 = new Employee(1, "Dame", "", "3", LocalDate.of(2000, 8, 29), "234567890", 10000, pos6);
        Employee emp4 = new Employee(2, "Smith", "", "4", LocalDate.of(2003, 8, 19), "234567890", 8000, pos4);
        Employee emp5 = new Employee(1, "John", "", "5", LocalDate.of(2000, 8, 29), "234567890", 10000, pos5);

        comp.print();
    }
}
