package Thread_Lab;

public class PrimeThread extends Thread {
    int startNum;
    int endNum;

    public PrimeThread(int startNum, int endNum){
        this.startNum = startNum;
        this.endNum = endNum;
    }

    public void run(){
        for(int i = startNum; i <= endNum; i++){
            if(isPrime(i)){
                System.out.println(i);
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
