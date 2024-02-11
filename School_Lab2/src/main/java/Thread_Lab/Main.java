package Thread_Lab;

public class Main {
    public static void main(String[] args){
        PrimeThread primeThread1 = new PrimeThread(1, 100000);
        primeThread1.start();

        PrimeThread primeThread2 = new PrimeThread(100001, 200000);
        primeThread2.start();

        PrimeThread primeThread3 = new PrimeThread(200001, 300000);
        primeThread3.start();

        PrimeThread primeThread4 = new PrimeThread(300001, 400000);
        primeThread4.start();

        PrimeThread primeThread5 = new PrimeThread(400001, 5000000);
        primeThread5.start();

        PrimeThread primeThread6 = new PrimeThread(5000001, 600000);
        primeThread6.start();

        PrimeThread primeThread7 = new PrimeThread(600001, 700000);
        primeThread7.start();

        PrimeThread primeThread8 = new PrimeThread(700001, 800000);
        primeThread8.start();

        PrimeThread primeThread9 = new PrimeThread(800001, 900000);
        primeThread9.start();

        PrimeThread primeThread10 = new PrimeThread(900001, 1000000);
        primeThread10.start();
    }
}
