package Thread;

public class Test extends Thread{
    long minPrime;
    Test(long minPrime){
        this.minPrime = minPrime;
    }

    public void run(){
        for(long i = minPrime; i < minPrime; i++){
            if(isPrime(i)){
                System.out.println("Prime: " + i);
            }
        }
    }

    private boolean isPrime(long num){
        if(num < 2){
            return false;
        }
        for(long i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
