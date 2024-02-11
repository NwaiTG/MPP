package Thread;

public class PrimeThread extends Thread {
    long minPrime;

    public PrimeThread(long minPrime){
        this.minPrime = minPrime;
    }

    public void run(){
        for(long i = 0; i < minPrime; i++){
            if(isPrime(i)){
                System.out.println("prime: " + i);
            }
        }
//        System.out.println("Test");
    }

    private boolean isPrime(long num){
        if(num < 2){
            return false;
        }
        for(long i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return  false;
            }
        }
        return true;
    }
}
