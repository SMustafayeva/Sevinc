package Lesson24.Lection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SkipReduceDistinct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,4,5,3,4);
        Optional<Integer> number = nums.stream()
                .skip(2)
                .distinct().
                reduce((x,y)-> x+y);
        System.out.println(number);
    }
}
