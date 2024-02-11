package Lab5;

public class Paycheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;
    private String payPeriod;

    Paycheck(double grossPay, double fica, double state, double local, double medicare, double sSN, String payPeriod){
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = sSN;
        this.payPeriod = payPeriod;
    }

    public void print(){
        System.out.printf("Gross Pay: " + String.format("$%,.2f", this.grossPay) + ", " +
                "FICA: " + String.format("$%,.2f", fica) + ", " +
                "State: " + String.format("$%,.2f", state) + ", " +
                "Local: " + String.format("$%,.2f", local) + ", " +
                "Medicare: " + String.format("$%,.2f", medicare) + ", " +
                "SSN: " + String.format("$%,.2f", socialSecurity) + ", " +
                "Date Rage: " + payPeriod + "\n");
    }

    public double getNetPay(){
        return grossPay - fica - state - local - medicare - socialSecurity;
    }
}
