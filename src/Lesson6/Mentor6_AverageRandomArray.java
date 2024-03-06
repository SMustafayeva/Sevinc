package Lesson6;

import java.util.Random;

public class Mentor6_AverageRandomArray {
    public static void main(String[] args) {
        Random ran = new Random();
        int [] ranNumbers = new int[10];

        for (int i=0; i<ranNumbers.length; i++){
            ranNumbers[i]=ran.nextInt(1,101);
            System.out.print(ranNumbers[i] + " ");
        }
        int sum = 0;
        for (int r : ranNumbers){
            sum+=r;
        }
        System.out.println();
        System.out.println(sum/10.0);

    }
}
