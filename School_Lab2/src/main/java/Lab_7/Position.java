package Lab_7;

import java.util.Objects;

public class Position implements Cloneable{
    private String title;
    private String description;
    private Employee employee;

    public Position(String title, String description){
        this.title = title;
        this.description = description;
    }

    public Employee getEmployees() {
        return employee;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setEmployees(Employee employee) {
        this.employee = employee;
    }

    public void print(){
        System.out.println("Position: " + this.title);
        if(employee != null){
            employee.print();
        }
    }

    public String toString(){
        String emp = "";
        if(employee != null) emp = employee.toString();
        return "Position Title: " + title + ", Description: " + description + "\n" +
                "Employee: " + emp;
    }

    public int hashCode(){
//        return title.hashCode() + description.hashCode() + employee.hashCode();
//        return Objects.hash(title, description, employee);
        return Objects.hash(title, description);
    }


    public boolean equals(Object obj){
        if (obj == null) return false;
        if (!(obj instanceof Position)) return false;
        Position pos = (Position) obj;
        return title.equals(pos.title) && description.equals(pos.description) && employee.equals(pos.employee);
    }

    public Object clone() throws CloneNotSupportedException{
        Position copy = (Position) super.clone();
//        copy.employee = (Employee) employee.clone();
        return copy;
    }
}
