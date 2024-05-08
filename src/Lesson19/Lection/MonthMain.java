package Lesson19.Lection;

import java.util.Scanner;

public class MonthMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        String inputMonth = scanner.nextLine().toUpperCase();

        MonthEnum month = MonthEnum.valueOf(inputMonth);
        String season = MonthEnum.getSeason(month);
        System.out.println(season);
    }
}

