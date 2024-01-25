package standard_exam;

public class SavingAccount extends Account {
    private double balance;
    private double interestRate;
    private String acctId;

    public SavingAccount(String acctId,  double interestRate, double bal){
        this.balance = bal;
        this.interestRate = interestRate;
        this.acctId = acctId;
    }

    public String getAccountID(){
        return acctId;
    }
    public double getBalance(){
        return balance;
    }
    public double computeUpdateBalance(){
        return balance + (balance * interestRate);
    }
}
