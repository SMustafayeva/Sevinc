package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random ran = new Random();
        int [] ranNumbers = new int[10];

        for (int i=0; i<ranNumbers.length; i++){
            ranNumbers[i]=ran.nextInt(1,101);
            System.out.print(ranNumbers[i] + " ");
        }
        System.out.println();
        Arrays.sort(ranNumbers);
        System.out.println(Arrays.toString(ranNumbers));;

    }
    }

