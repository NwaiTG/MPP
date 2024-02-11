package Final_Review;

public class Main {
    public static void main(String[] args){
        try{
            Customer cus1 = new Customer("Jhon", 30, 2000.00);
            Customer cus2 = new Customer("Meri", 30, 2000.00);
            Customer cus3 = new Customer("Erica", 30, 2000.00);

            BankAccount bk1 = new BankAccount("001", 5000.00, cus1);
            BankAccount bk2 = new BankAccount("001", 5000.00, cus2);
            BankAccount bk3 = new BankAccount("001", 5000.00, cus3);
            BankAccount bkClone = (BankAccount) bk1.clone();

            System.out.println("BK1 equal with BK2: ");
            System.out.println(bk1.equals(bk2));
            System.out.printf("%d   %d%n", bk1.hashCode(), bk2.hashCode());
            System.out.println("BK1 equal with Clone: ");
            System.out.println(bk1.equals(bkClone));
            System.out.printf("%d   %d%n", bk1.hashCode(), bkClone.hashCode());
            System.out.println();
            System.out.println(bkClone);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
