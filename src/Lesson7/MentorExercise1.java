package Lesson7;

import java.util.Arrays;

public class MentorExercise1 {
    public static void main(String[] args) {
        int[][] array= new int [3][8]; //{{1,2,3,4,5,6,7,8},{2,3,4,5,6,7,8,9},{3,4,5,6,7,8,9,1}};
        System.out.println(Arrays.deepToString(array));
        int x = 0;
        int random = (int) (Math.random() * 100);
        for (int i = 0; i < array.length; i++) {
            random = (int) (Math.random() * 100);
            for (int j = 0; j < array[i].length; j++) {
           random = (int) (Math.random() * 100);
                System.out.print(random + " ");
            }System.out.println();

        }
    }
}
