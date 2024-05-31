package Lesson25.Mentor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Alphabet {
    public static void main(String[] args) {
        LinkedList<Character> lowercaseLetters = generateLowercases();
        LinkedList<Character> uppercaseLetters = generateUppercases();
        LinkedList<String> mergedLetters = mergeLists(lowercaseLetters, uppercaseLetters);

        System.out.println("Merged List of English Letters:");
        for (String letter : mergedLetters) {
            System.out.print(letter + ", ");
        }
    }

    private static LinkedList<String> mergeLists(LinkedList<Character> lowercaseLetters, LinkedList<Character> uppercaseLetters) {
        LinkedList<String> merge = new LinkedList<>();
        for (char z = 0; z < lowercaseLetters.size(); z++ ) {
            merge.add(lowercaseLetters.get(z) + "" + uppercaseLetters.get(z));
        }
        return merge;
    }

    public static LinkedList<Character> generateLowercases() {
        LinkedList<Character> list = new LinkedList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            list.add(c);
        }
        return list;
    }
    public static LinkedList<Character> generateUppercases (){
        LinkedList<Character> list = new LinkedList<>();
        for (char x = 'A'; x<='Z'; x++){
            list.add(x);
        }
        return list;
    }

}
