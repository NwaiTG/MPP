package Lab5;

import standard_exam.Employee;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends AEmployee {
    private double commission;
    private double baseSalary;

    private List<Order> orders;

    public Commissioned(String empId, double comm, double baseSal){
        super(empId);
        this.commission = comm;
        this.baseSalary = baseSal;
        orders = new ArrayList<Order>();
    }

    public void addOrder(Order ord){
        if(ord != null){
            orders.add(ord);
        }
    }

    /*
    Level 1 get all order without using DateRange parameter
     */
//    public double calcGrossPay(DateRange dRange){
//        double totalOrderAmount = 0.0;
//        for(Order ord : orders){
//            totalOrderAmount += ord.getOrderAmount();
//        }
//
//        return baseSalary + (totalOrderAmount * commission);
//    }

    /*
    Level 2 get order between DateRange parameter
     */
    public double calcGrossPay(DateRange dRange){
        double totalOrderAmount = 0.0;
        for(Order ord : orders){
            if(dRange.isInRange(ord.getOrderDate())) {
                totalOrderAmount += ord.getOrderAmount();
            }
        }

        return baseSalary + (totalOrderAmount * commission);
    }
}
