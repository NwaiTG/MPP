package Thread2;

public class PrimeThread extends Thread {
    long minPrime;
    int count = 0;

    public PrimeThread(long minPrime){
        this.minPrime = minPrime;
    }

    public void run(){
        count++;
        System.out.println("Inside run" + count);
    }
}
