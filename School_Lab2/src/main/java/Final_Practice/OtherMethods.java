package Final_Practice;

import java.util.List;

public class OtherMethods {
    public int countWords(List<String> words, char c, char d, int len){
        return (int)words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains("" + c) && !word.contains(""+d))
                .count();
    }
}
