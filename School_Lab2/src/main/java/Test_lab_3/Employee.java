package Test_lab_3;

public class Employee {
    int employeeId;
    String firstName;
    String middleInitial;
    String lastName;
    String birthDate;
    String SSN;
    double salary;

    public Employee(int employeeId, String firstName, String middleInitial, String lastName, String birthDate, String SSN, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void print() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + firstName + " " + middleInitial + " " + lastName + ", Birth Date: " + birthDate + ", SSN: " + SSN + ", Salary: " + salary);
    }
}
