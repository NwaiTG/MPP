package Stream_Program4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OtherLabMethod {
    /*Lab 3-a
    public int countWords(List<String> words, char c, char d, int len){
        long count = words.stream()
                .filter(w -> w.length() == len)
                .filter(w -> w.contains(String.valueOf(c)))
                .filter(w -> !w.contains(String.valueOf(d)))
                .count();
        return (int)count;
    }
     */

    public static void main(String[] args) {
        /* Lab 3-b
        Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        Optional<String> res = strings.reduce((val1, val2) -> String.join(" ",val1.toString(), val2.toString()));
        res.ifPresent(n -> System.out.println(n));

         */
    }

}
