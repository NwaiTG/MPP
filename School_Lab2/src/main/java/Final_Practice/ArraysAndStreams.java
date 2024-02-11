package Final_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArraysAndStreams
{
    public static void main(String[] args)
    {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        // display original values
        System.out.printf("%nNo.1 orginal value: %s%n",
        Arrays.stream(values)
                .collect(Collectors.toList()));

        // sort values in ascending order with streams
        System.out.printf("%nNo.2 sort values in ascending order with streams: %s%n",
        Arrays.stream(values)
                .sorted()
                .collect(Collectors.toList()));

        // values greater than 4
        System.out.println("%nNo.3 values greater than 4: ");
        Predicate<Integer> greaterThan4 = i -> i > 4;

        List<Integer> greater4 = Arrays.stream(values).filter(val -> val > 4).toList();

        // filter values greater than 4 then sort the results
        System.out.printf("%nNo.4 filter values greater than 4 then sort the results: %s%n",
        Arrays.stream(values)
                .filter(greaterThan4)
                .sorted()
                .collect(Collectors.toList()));

        // greaterThan4 List sorted with streams
        System.out.printf("%nNo.5 filter values greater than 4 then sort the results: %s%n",
        greater4.stream()
                .sorted()
                .collect(Collectors.toList()));
    }
}

