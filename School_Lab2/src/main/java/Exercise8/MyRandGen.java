package Exercise8;

import java.util.Random;

public class MyRandGen implements MyIface{
    public Integer produce(){
        Random ran = new Random();
        return ran.nextInt();
    }

    public static void main(String[] args){
        MyIface mrg = new MyRandGen();
        System.out.println(mrg.produce());

        // With lambda method, produce menthod doesn't take argument, so () no argument ->
        MyIface mrg2 = () -> (new Random()).nextInt();
        System.out.println(mrg2.produce());
    }
}
