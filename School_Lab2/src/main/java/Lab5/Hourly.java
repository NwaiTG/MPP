package Lab5;

import standard_exam.Employee;

public class Hourly extends AEmployee {
    private double hourlyWage;
    private int hoursPerWeek;

    public Hourly(String empId, double wage, int hrsPerWeek){
        super(empId);
        this.hourlyWage = wage;
        this.hoursPerWeek = hrsPerWeek;
    }

    public double calcGrossPay(DateRange dRange){
        return (hoursPerWeek * hourlyWage) * 4;
    }
}
