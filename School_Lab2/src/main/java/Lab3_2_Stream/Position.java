package Lab3_2_Stream;

public class Position {
    String title;
    String description;
    Employee employee;

    public Position(String title, String description, Employee employee) {
        this.title = title;
        this.description = description;
        this.employee = employee;
    }

    public double getSalary(){
        if(employee == null) return 0.0;
        else
            return employee.getSalary();
    }

    public void print() {
        System.out.println("Position: " + title + ", Description: " + description);
        if (employee != null) {
            employee.print();
        } else {
            System.out.println("This position is vacant.");
        }
    }
}
