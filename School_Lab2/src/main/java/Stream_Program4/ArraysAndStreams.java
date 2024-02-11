package Stream_Program4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        // display original values
        System.out.printf("Original values: %s%n", Arrays.asList(values));

        // sort values in ascending order with streams
        System.out.printf("Sorted values: %s%n",
                Arrays.stream(values)
                        .sorted()
                        .toList()
                );

        // values greater than 4
        System.out.printf("Values greater than 4: %s%n", Arrays.stream(values)
                .filter(val -> val > 4)
                .toList());

        // filter values greater than 4 then sort the results
        System.out.printf("Sorted values greater than 4: %s%n",
                Arrays.stream(values)
                        .filter(val -> val > 4)
                        .sorted()
                        .toList()
                );

        // Can't use IntStream.of(), complile error
//        IntStream.of(values)
//                .forEach(System.out::println);

        // greaterThan4 List sorted with streams
        System.out.printf(
                "Values greater than 4 (ascending with streams): %s%n",
                Arrays.stream(values)
                        .filter(val -> val > 4)
                        .toList()
                        .stream()
                        .sorted()
                        .toList());
    }
}
