package Lesson2;

import java.util.Scanner;

public class Inch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value in sm:");
        double inch = scanner.nextInt();
        double sm = inch / 2.54;
        System.out.println("Result: "+ sm);
    }
}


