package Lab3_1_Stream;

public class Position {
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
        System.out.println("\nPosition: " + this.title);
        if(employee != null){
            employee.print();
        }
    }
}
