package Lesson2;

import java.util.Scanner;

public class DateConvertation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days: ");
        int day = scanner.nextInt();
        int week = day/7;
        int day2 = day%7;
        double months = day%30;
        double years = day%365;
        System.out.println("Weeks: "+ week + " Days 1"+ day2);
        System.out.println("Months: " + months);
        System.out.println("Years: "+ years);
    }

}
