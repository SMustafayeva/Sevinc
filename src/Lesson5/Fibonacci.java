package Lesson5;

public class Fibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int fibonacci;
        System.out.println(number1);
        System.out.println(number2);
        for (int x = 0; x < 10; x++) {
            fibonacci = number1 + number2;
            number1 = number2;
            number2 = fibonacci;

            System.out.println(fibonacci);

        }
        System.out.println();

    }
}
