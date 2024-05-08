package Lesson20.Lection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTask {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(7);
        for (Integer x : numbers){
            System.out.println( x );
        }
    }
}
