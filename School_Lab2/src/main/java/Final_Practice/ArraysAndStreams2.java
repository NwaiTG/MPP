package Final_Practice;

import java.util.Arrays;

public class ArraysAndStreams2
{
    public static void main(String[] args)
    {
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("%nNo1. display original strings: %s%n",
                Arrays.stream(strings).toList());

        // strings in uppercase
        System.out.printf("%nNo2. strings in uppercase: %s%n",
                Arrays.stream(strings).map(str -> str.toUpperCase()).toList());

        // strings greater than "m" (case insensitive) sorted ascending
        System.out.printf("%nNo3. strings greater than 'm' (case insensitive) sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(str -> str.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .toList());

        // strings greater than "m" (case insensitive) sorted descending
        System.out.printf("%nNo4. strings greater than 'm' (case insensitive) sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(str -> str.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .toList());
    }
}