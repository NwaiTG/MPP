package Stream_Standard_Exam2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "orange");
        List<String> list2 = List.of("banana", "grape", "kiwi");

        List<String> oneEle = Stream.concat(list1.stream(), list2.stream())
                .peek(a -> System.out.println("Concat: " + a))
                .distinct()
                .peek(a -> System.out.println("After distinct: " + a))
                .collect(Collectors.toList());

        System.out.println("Final List: " + oneEle);
    }
}
