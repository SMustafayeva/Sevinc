package Lesson23.Mentor;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Programming");
        words.add("Scientific");
        words.add("Synchronization");
        words.add("Development");
        words.add("Adverb");
        words.stream().filter(s -> s.length()>=10).sorted().forEach(System.out::println);
    }
}
