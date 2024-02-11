package Stream_Program4;

import java.util.Arrays;

public class ArraysAndStreams2 {
    public static void main(String[] args){
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // strings in uppercase
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .toList()
        );

        // strings greater than "m" (case insensitive) sorted ascending
        System.out.printf("strings greater than m sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(str -> str.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .toList()
                );

        // strings greater than "m" (case insensitive) sorted descending
        System.out.printf("strings greater than m sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(str -> str.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .toList()
                );




    }
}
