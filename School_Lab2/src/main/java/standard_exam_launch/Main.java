package standard_exam_launch;

import standard_exam.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Account[] someCheckingAccounts = new CheckingAccount[2];
        someCheckingAccounts[0] = new CheckingAccount("231-471", 25.00, 100);
        someCheckingAccounts[1] = new CheckingAccount("446-973", 25.00, 200);

        Account[] someSavingAccounts = new SavingAccount[3];
        someSavingAccounts[0] = new SavingAccount("231-471", 0.03, 200);
        someSavingAccounts[1] = new SavingAccount("446-973", 0.03, 200);
        someSavingAccounts[2] = new SavingAccount("231-471", 0.04, 600);

        Employee e1 = new Employee("Joe");
        Employee e2 = new Employee("Ralph");
        Employee e3 = new Employee("Tom");

        e1.addAccount(someCheckingAccounts[0]);
        e1.addAccount(someSavingAccounts[0]);
        e2.addAccount(someCheckingAccounts[1]);
        e2.addAccount(someSavingAccounts[1]);
        e3.addAccount(someSavingAccounts[2]);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println(Admin.computeUpdatedBalanceSum(employees));
    }
}
