package Stream_Program4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args){
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        List<Integer> numbers = Arrays.asList(9,10,3,4,7,6,5);

        numbers.stream()
                .filter(num -> num%2==0)
                .map(x -> x * x)
                .forEach(System.out::println);

        // display original values
        System.out.println("Original values: ");
        IntStream.of(values)
                .forEach(val -> System.out.printf("%d", val));
        System.out.println();

        // count, min, max, sum and average of the values
        System.out.printf("Count:%d", IntStream.of(values)
                .count());
        System.out.printf("Min:%d%n", IntStream.of(values)
                .min().getAsInt());
        System.out.printf("Max:%d%n", IntStream.of(values)
                .max().getAsInt());
        System.out.printf("Sum:%d%n", IntStream.of(values)
                .sum());
        System.out.printf("Average:%.2f%n", IntStream.of(values)
                .average().getAsDouble());

        // sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, (x,y)-> x + y)
        );

        // sum of squares of values with reduce method
        System.out.printf("Sum of squares via reduce method: %d%n",
        IntStream.of(values)
                .reduce(1, (x, y) -> x + y * y));

        // product of values with reduce method
        System.out.printf("Product vai reduce method: %d%n",
                IntStream.of(values)
                        .reduce(1, (x,y)-> x * y)
        );

        // even values displayed in sorted order
        System.out.println("%nEven values displayed in sorted order: ");
            IntStream.of(values)
                    .filter(a -> a % 2 == 0)
                    .sorted()
                    .forEach(System.out::println);
        System.out.println();

        // odd values multiplied by 10 and displayed in sorted order
        System.out.println("%nOdd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
                .filter(val -> val % 2 != 0)
                .map(val -> val * 10)
                .sorted()
                .forEach(System.out::println);

        // sum range of integers from 1 to 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
                IntStream.range(1,10)
                        .sum()
        );

        System.out.println("Test with Arrays.stream()\n");
        Arrays.stream(values).forEach(System.out::println);
    }
}
