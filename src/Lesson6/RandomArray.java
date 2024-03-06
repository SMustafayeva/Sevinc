package Lesson6;

public class RandomArray {
    public static void main(String[] args) {

        int[] num = new int[10];
        num[0] = (int) (Math.random() * 1000);
        num[1] = (int) (Math.random() * 1000);
        num[2] = (int) (Math.random() * 1000);
        num[3] = (int) (Math.random() * 1000);
        num[4] = (int) (Math.random() * 1000);
        num[5] = (int) (Math.random() * 1000);
        num[6] = (int) (Math.random() * 1000);
        num[7] = (int) (Math.random() * 1000);
        num[8] = (int) (Math.random() * 1000);
        num[9] = (int) (Math.random() * 1000);

        int maxValue = num[0];

        for (int i = 0; i < num.length; i++) {
            maxValue = Math.max(maxValue, num[i]);
  System.out.println(num[i] + " ");
        }
        System.out.println("The largest number of the array is: " + maxValue);
    }
}