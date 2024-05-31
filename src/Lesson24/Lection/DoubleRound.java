package Lesson24.Lection;

import java.util.Arrays;

public class DoubleRound {
    public static void main(String[] args) {
        double[] nums = {2.45, 4.82, 6.43, 8.93, 9.354};
       double[] roundNums = Arrays.stream(nums)
               .map(x -> Math.round(x))
               .toArray();
        System.out.println("Double numbers: " + Arrays.toString(nums));
        System.out.println("Rounded numbers: " + Arrays.toString(roundNums));
        }
    }
