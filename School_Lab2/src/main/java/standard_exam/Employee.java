package standard_exam;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name){
        this.name = name;
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account acct){
        //Account acc = new Account();
        accounts.add(acct);
    }

    public double computeUpdatedBalanceSum(){
        double sumBalance = 0;
        for(Account acc : accounts){
            sumBalance += acc.computeUpdateBalance();
        }
        return sumBalance;
    }
}
