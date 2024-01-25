package standard_exam;

public class CheckingAccount extends Account{
    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String acctID, double fee, double startBalance){
        this.balance = startBalance;
        this.monthlyFee = fee;
        this.acctId = acctID;
    }

    public String getAccountID(){
        return acctId;
    }
    public double getBalance(){
        return balance;
    }
    public double computeUpdateBalance(){
        return  balance + (balance * monthlyFee);
    }
}
