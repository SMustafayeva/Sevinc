package Lesson19.Lection;

import java.util.Scanner;

public class ParseMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your age:");
        String age = scanner.nextLine();
        int years = Integer.parseInt(age);
        int yearsLeft = 18 - years;
        System.out.println(yearsLeft + " years left till 18");
    }
}
