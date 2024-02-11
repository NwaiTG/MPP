package Lab3_1_Stream;

import java.time.LocalDate;

public class Employee {
    private int employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private LocalDate birthDate;
    private String sSN;
    private double salary;
    private Position position;

    public Employee(int employeeId, String firstName, String middleInitial, String lastName, LocalDate birthDate, String sSN, double salary, Position position){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.sSN = sSN;
        this.salary = salary;
        this.position = position;
        position.setEmployees(this);
    }

    public Position getPosition() {
        return position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getsSN() {
        return sSN;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void print(){
        System.out.println("EmployeeID: " + this.employeeId +
                ", Name: " + this.firstName + " " + this.middleInitial + " " + this.lastName +
                ", Date Of Birth: " + this.birthDate +
                ", SSN: " + this.sSN +
                ", Salary: " + this.salary);
    }
}
