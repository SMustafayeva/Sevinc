package Lesson6;

public class ArrayLesson {
    public static void main(String[] args) {
        int[] numbers = {1, 45, 78, 123, 237, 342, 4532};

        int [] num = new int [7];
        num [0] = 1;
        num [1] = 45;
        num [2] = 78;
        num [3] = 123;
        num [4] = 237;
        num [5] = 342;
        num [6] = 4532;

        for (int i= 0; i< num.length;i++) {
            System.out.print(num[i]+" ");
        }

        for (int quantity : num){
            System.out.println(quantity);
        }
    }
}
