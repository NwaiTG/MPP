package Lab5;

import standard_exam.Employee;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        AEmployee emp1 = new Hourly("Emp001", 40, 42);
        AEmployee emp2 = new Salaried("Emp002", 8000);
        Commissioned emp3 = new Commissioned("Emp003", 0.07, 2000);
        emp3.addOrder(new Order("001", Date.valueOf(LocalDate.of(2024,02,15)), 100));
        emp3.addOrder(new Order("002", Date.valueOf(LocalDate.of(2024,03,15)), 50));
        emp3.addOrder(new Order("003", Date.valueOf(LocalDate.of(2024,02,29)), 80));
        
        Paycheck emp1Paycheck = emp1.calcCompensation(2, 2024);
        Paycheck emp2Paycheck = emp2.calcCompensation(2, 2024);
        Paycheck emp3Paycheck = emp3.calcCompensation(2, 2024);
        
        emp1.addPaycheck(emp1Paycheck);
        emp2.addPaycheck(emp2Paycheck);
        emp3.addPaycheck(emp3Paycheck);

        emp1.print();
        emp2.print();
        emp3.print();
    }
}
