package Lab5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class AEmployee {
    private String empId;
    private List<Paycheck> payChecks;

    public AEmployee(String id){
        this.empId = id;
        payChecks = new ArrayList<Paycheck>();
    }

    public void print(){
        System.out.println("EmployeeID: " + empId);
        for(Paycheck paycheck : payChecks) {
        	paycheck.print();
        }
    }

    public void addPaycheck(Paycheck pCheck){
        if(pCheck != null){
            payChecks.add(pCheck);
        }
    }

    public Paycheck calcCompensation(int month, int year){
        Calendar startDate = Calendar.getInstance();
        startDate.set(year, month - 1, 1);

        Calendar endDate = Calendar.getInstance();
        endDate.set(Calendar.MONTH, month - 1);
        endDate.set(Calendar.DATE, endDate.getActualMaximum(Calendar.DATE));
        endDate.set(Calendar.YEAR, year);

        DateRange dateRange = new DateRange(startDate, endDate);
        double grossPay = calcGrossPay(dateRange);

        return new Paycheck(grossPay, grossPay * 0.23,grossPay * 0.05,
                grossPay * 0.01, grossPay * 0.03, grossPay * 0.75,
                dateRange.toString());
    }

    public abstract double calcGrossPay(DateRange dRange);
}
