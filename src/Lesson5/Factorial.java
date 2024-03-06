package Lesson5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please, enter the factorial number:");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int x = 1; x <= number; x++) {
            factorial *= x;
            System.out.println(x);
        } System.out.println("Factorial " + number +" is: " + factorial );

    }
}

