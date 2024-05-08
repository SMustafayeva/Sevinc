package Lesson18.Lection;

public class StrString {
    public static void main(String[] args) {
        String sentence1 = "Java provides three classes to represent a sequence of characters: ";
        String sentence2 = "String, StringBuffer, and StringBuilder. ";
        String sentence3 = "The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable. ";
        String text = sentence1 + sentence2 + sentence3;
        System.out.println("Full sentence:");
        System.out.println(text);
        System.out.println("Substring:");
        System.out.println(text.substring(0,27));


        System.out.println("Text length: " + text.length());


    }
}
