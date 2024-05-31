package Lesson24.Mentor;

import java.util.Arrays;
import java.util.List;

public class LambdaStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList( "Java","Language","Programming");
        double avgWords = words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println(avgWords);


        List<Integer> nums = Arrays.asList( 1,2,3,4,5);
        int number = nums.stream()
                .reduce(1,(a,b)-> a*b);
        System.out.println(number);
    }
}
