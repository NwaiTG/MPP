package Final_Review;

import java.util.Objects;

public class BankAccount implements Cloneable{
    String accountNumber;
    Double balance;
    Customer c1;

    public BankAccount(String accountNumber, Double balance, Customer c1) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.c1 = c1;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getC1() {
        return c1;
    }

    public void setC1(Customer c1) {
        this.c1 = c1;
    }

    public String toString(){
        return String.format("%s %.2f %s", accountNumber, balance, c1);
    }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof BankAccount)) return false;
        BankAccount bankAcc = (BankAccount)obj;
        return accountNumber.equals(bankAcc.accountNumber) && balance == bankAcc.balance && c1.equals(bankAcc.c1);
    }

    public int hashCode(){
//        return Objects.hash(accountNumber, balance, c1);
        return Objects.hash(accountNumber);
    }

    protected Object clone() throws CloneNotSupportedException{
        BankAccount copy = (BankAccount) super.clone();
        copy.c1 = (Customer) c1.clone();
        return  copy;
    }
}
