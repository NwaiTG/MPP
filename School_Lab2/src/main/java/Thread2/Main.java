package Thread2;

public class Main {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            PrimeThread primeThread = new PrimeThread(143);
            primeThread.start();
        }
    }
}
