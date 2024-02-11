package Thread;

import Thread2.PrimeThread;

public class Main {
    public static void main(String[] args){
        PrimeThread primeThread = new PrimeThread(143);
        primeThread.start();
    }
}
