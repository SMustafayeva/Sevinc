package Lesson5;

import java.util.Scanner;
import java.util.SortedMap;

public class DoWhileLoop {
    public static void main(String[] args) {
//        int num = -5;
//        do {System.out.println("Number is:" + num);
//            num--;
//        } while (num>=1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, guess the number:");
        int firstAttempt = scanner.nextInt();
        int num;
        if (firstAttempt == 42) {
            System.out.println("Congratulations, you guessed the number!");
        } else {
            do {
                System.out.println("Try again:");

                num = scanner.nextInt();
                if (num > 42) {
                    System.out.println("Your number is too high.");
                } else if (num < 42) {
                    System.out.println("Your number is too low.");
                } else {
                    System.out.println("Congratulations, you guessed the number!");
                    break;
                }
            }
            while (num != 42);
            ;

        }


    }
}


