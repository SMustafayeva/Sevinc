package Lesson21.Mentor;

import java.util.HashMap;

public class LetterFrequencyCounter {
    public static void main(String[] args) {
        String text = "Write a Java program that takes a paragraph of text as input and outputs the frequency of each letter in the paragraph.";
        HashMap<Character, Integer> count = new HashMap<>();
        for (Character c : text.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                count.put(c, count.getOrDefault(c, 0) + 1);
                //  for (int i = 0; i < text.length(); i++) {
                //     char c = text.charAt(i);
                //   System.out.println(c.charValue());
            }
        }
        System.out.println(count);
    }
}
