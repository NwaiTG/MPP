package Final_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamOperations
{
    public static void main(String[] args)
    {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // display original values
        System.out.print("No1. Original values: ");  // Lambda expression below
        Arrays.stream(values).forEach(System.out::println);

        // count, min, max, sum and average of the values
        System.out.println("No2. count, min, max, sum and average of the values: ");  // Lambda expression below
        System.out.printf("Count %s%n", IntStream.of(values).count());
        System.out.printf("Min %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum %d%n", IntStream.of(values).sum());
        System.out.printf("Avg %.2f%n", IntStream.of(values).average().getAsDouble());

        // sum of values with reduce method
        System.out.printf("%nNo3. sum of values with reduce method: %d%n", IntStream.of(values).reduce(0,(x,y)->x+y));

        // sum of squares of values with reduce method
        System.out.printf("%nNo4. sum of squares of values with reduce method: %d%n", IntStream.of(values).reduce(1,(x,y)->x+(y*y)));

        // product of values with reduce method
        System.out.printf("%nNo5. product of values with reduce method: %d%n", IntStream.of(values).reduce(1,(x,y)->x*y));

        // even values displayed in sorted order
        System.out.println("\nNo6. even values displayed in sorted order: ");  // Lambda expression below
        IntStream.of(values)
                .filter(val -> val%2==0)
                .sorted()
                .forEach(System.out::println);

        // odd values multiplied by 10 and displayed in sorted order
        System.out.println("\nNo7. odd values multiplied by 10 and displayed in sorted order: ");  // Lambda expression below
        IntStream.of(values)
                .filter(val -> val%2!=0)
                .map(val -> val * 10)
                .sorted()
                .forEach(System.out::println);

        // sum range of integers from 1 to 10, exlusive
        System.out.printf("%nNo8. sum range of integers from 1 to 10, exlusive: %d%n", IntStream.range(1,10).sum());

        // sum range of integers from 1 to 10, inclusive
        System.out.printf("%nNo9. sum range of integers from 1 to 10, inclusive: %d%n", IntStream.rangeClosed(1,10).sum());
    }
}
