package Lesson24.Lection;

import java.util.ArrayList;
import java.util.List;

public class StrLength {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Map");
        words.add("Development");
        words.add("Java");
        words.add("Int");
        words.add("Inheritance");
        words.stream().filter(w->w.length()<=5)
                .sorted()
                .forEach(System.out::println);
    }

}
