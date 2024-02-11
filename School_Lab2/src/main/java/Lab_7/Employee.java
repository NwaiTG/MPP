package Lab_7;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Cloneable{
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

    public String toString(){
        return "EmployeeID: " + this.employeeId + ", Name: " + this.firstName + " " +
                this.middleInitial + " " + this.lastName + ", Date Of Birth: " +
                this.birthDate + ", SSN: " + this.sSN + ", Salary: " + this.salary;
    }

    public int hashCode(){
//        Integer empID = employeeId;
//        Double sal = salary;
//        return empID.hashCode() + firstName.hashCode() + middleInitial.hashCode() + lastName.hashCode() +
//                birthDate.hashCode() + sSN.hashCode() + sal.hashCode();
        return Objects.hash(employeeId, firstName, middleInitial, lastName, birthDate, sSN, salary);
    }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Employee)) return false;
        Employee emp = (Employee)obj;
        return employeeId == emp.employeeId && firstName.equals(emp.firstName) &&
                middleInitial.equals(emp.middleInitial) && lastName.equals(emp.lastName) &&
                birthDate.equals(emp.birthDate) && sSN.equals(emp.sSN) &&
                salary == emp.salary;// && position.equals(emp.position);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
