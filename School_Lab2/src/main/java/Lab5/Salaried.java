package Lab5;

import standard_exam.Employee;

public class Salaried extends AEmployee {
    private double salary;

    public Salaried(String empId, double salary){
        super(empId);
        this.salary = salary;
    }

    public double calcGrossPay(DateRange dRange){
        return salary;
    }
}
