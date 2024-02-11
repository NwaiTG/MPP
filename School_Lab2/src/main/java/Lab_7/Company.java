package Lab_7;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name){
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public void setDepartments(Department department) {
        this.departments.add(department);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void print(){
        System.out.println("Company Name: " + this.name + "\n");
        for(Department dept : departments){
            dept.print();
            System.out.println();
        }
    }
}
