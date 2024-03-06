package Lesson5;

public class Mentor_Sum_of_odd_numbers_for_loop {
    public static void main(String[] args) {
        int sum = 0;

        for (int x = 1; x < 20;x+=2) {
            sum+=x;
            System.out.println(x);
        }
        System.out.println("Sum is:" + sum);

    }
}
