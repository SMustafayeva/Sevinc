package Lesson5;

import java.util.Scanner;

public class Break_statement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, guess the number:");
        int firstAttempt = scanner.nextInt();
        int num;
        if (firstAttempt == 42) {
            System.out.println("Congratulations, you guessed the number!");
        } else {
            do {
                System.out.println("Try again or put exit to quit:");

                num = scanner.nextInt();

                if (num > 42) {
                    System.out.println("Your number is too high.");
                } else if (num < 42) {
                    System.out.println("Your number is too low.");
                } else {
                    System.out.println("Congratulations, you guessed the number!");
                    break;
                }
            } while (num != 42);
            String quit = scanner.nextLine();
            if (quit.equalsIgnoreCase("exit")) ;
            {
                System.out.println("End of the game");
            }

        }

    }
}





