package InClass_FunctionalProgramming;

import java.util.function.IntFunction;

public class Main implements MyIface {
    public Double apply(int miles){
        return 1.6 * miles;
    }

    public static void main(String[] args){
        MyIface mrg = new Main();
        System.out.println("Orginal way(Without API): " + mrg.apply(3));
        MyIface mrg2 = (m) -> 1.6 * m;
        System.out.println("Orginal way(Lambda): " + mrg2.apply(3));

        IntFunction intVal = (m) -> 1.6 * m;
        System.out.println("API: " + intVal.apply(3));
    }
}
